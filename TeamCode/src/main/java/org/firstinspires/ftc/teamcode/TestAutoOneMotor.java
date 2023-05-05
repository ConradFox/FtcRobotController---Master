package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous
public class TestAutoOneMotor extends LinearOpMode {
    @Override

    public void runOpMode() throws InterruptedException {
       waitForStart();

        DcMotor testMotor = hardwareMap.dcMotor.get("testMotor");

       testMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        testMotor.setTargetPosition(5000);

    }
}
