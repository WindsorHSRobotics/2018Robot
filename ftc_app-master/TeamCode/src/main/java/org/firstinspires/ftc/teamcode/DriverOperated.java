package teamcode1819;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "DriverOperated", group = "linear Opmode")
//@Disabled
public class DriverOperated extends LinearOpMode {
    //OpMode Members
    DcMotor left,right;
    double power;

    @Override
    public void runOpMode(){
        left = hardwareMap.get(DcMotor.class, "left");
        right = hardwareMap.get(DcMotor.class, "right");

        waitForStart();

        while(opModeIsActive()){
            left.setPower(gamepad1.left_stick_y*power);
            right.setPower(gamepad1.right_stick_y*power);

        }
    }
}
