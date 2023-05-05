package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous
public class FancyEncoder extends LinearOpMode {
    public  int curPos = 0;
    public double kp = 0.001;
    public int target = 5000;
    public  int error = 1;
    @Override
    public void runOpMode() throws InterruptedException {
        DcMotor testMotor = hardwareMap.dcMotor.get("testMotor");
        waitForStart();

        testMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        testMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        testMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        while (error != 0 && opModeIsActive()){
            curPos = testMotor.getCurrentPosition();
            error = target-curPos;
            testMotor.setPower(kp*error);
        }
    }
}
