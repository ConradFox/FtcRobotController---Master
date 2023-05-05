package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
@TeleOp
public class OneMotorTeleOp extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        DcMotor testMotor = hardwareMap.dcMotor.get("testMotor");

        telemetry.addData("Status", "Initialized");
        telemetry.update();
        waitForStart();

        double tgtPower = 0;
        while (opModeIsActive()); {


            tgtPower = -this.gamepad1.left_stick_y;
            testMotor.setPower(tgtPower);
        }
    }
}
