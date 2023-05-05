package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;
import com.qualcomm.robotcore.robot.Robot;

@Autonomous
public class TestAutoOneMotor extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
       waitForStart();
       DcMotor testMotor = hardwareMap.dcMotor.get("testMotor");
       while (opModeIsActive()) {
           testMotor.setPower(1);
       }
    }
}


