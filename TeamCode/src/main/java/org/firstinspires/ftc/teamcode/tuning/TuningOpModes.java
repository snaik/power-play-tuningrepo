package org.firstinspires.ftc.teamcode.tuning;

import com.acmerobotics.roadrunner.drive.MecanumDrive;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpModeManager;
import com.qualcomm.robotcore.eventloop.opmode.OpModeRegistrar;

import org.firstinspires.ftc.robotcore.internal.opmode.OpModeMeta;
import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;
import org.firstinspires.ftc.teamcode.drive.opmode.ManualFeedforwardTuner;
import org.firstinspires.ftc.teamcode.drive.opmode.SplineTest;

import java.util.Arrays;
import java.util.List;

public final class TuningOpModes {
    public static final Class<?> DRIVE_CLASS = SampleMecanumDrive.class;

    public static final String GROUP = "quickstart";
    public static final boolean DISABLED = false;

    private TuningOpModes() {

    }

    @OpModeRegistrar
    public static void register(OpModeManager manager) {
        if (DISABLED) return;

//        List<Class<? extends OpMode>> opModes = Arrays.asList(
//                AngularRampLogger.class,
//                ForwardPushTest.class,
//                ForwardRampLogger.class,
//                LateralPushTest.class,
//                LateralRampLogger.class,
//                ManualFeedbackTuner.class,
//                ManualFeedforwardTuner.class,
//                SplineTest.class,
//                MecanumMotorDirectionDebugger.class
//        );
//
//        for (Class<? extends OpMode> o : opModes) {
//            manager.register(new OpModeMeta.Builder()
//                    .setName(o.getSimpleName())
//                    .setGroup(GROUP)
//                    .setFlavor(OpModeMeta.Flavor.TELEOP)
//                    .build(), o);
//        }
    }
}
