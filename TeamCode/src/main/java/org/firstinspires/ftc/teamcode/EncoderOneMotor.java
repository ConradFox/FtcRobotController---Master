package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous
public class EncoderOneMotor extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {
        DcMotor testMotor = hardwareMap.dcMotor.get("testMotor");
        waitForStart();

        testMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        testMotor.setTargetPosition(5000);

        testMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        testMotor.setPower(.5);
        while (testMotor.isBusy());
    }
}
