package com.robinhood.android.lib.stepupverification;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.fragment.app.Fragment;
import androidx.view.ComponentActivity;
import androidx.view.compose.ActivityResultRegistry3;
import androidx.view.compose.ActivityResultRegistry8;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultCaller;
import androidx.view.result.ActivityResultLauncher;
import com.robinhood.android.models.stepupverification.VerificationWorkflowResult;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.models.workflow.p358ui.UiWorkflowStatus;
import com.robinhood.shared.security.contracts.WorkflowIntentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SuvLauncher.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aE\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0007¢\u0006\u0002\u0010\n\u001aH\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001*\u00020\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u001aH\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001*\u00020\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u001aL\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0002¨\u0006\u0010"}, m3636d2 = {"rememberSuvLauncher", "Lkotlin/Function2;", "Ljava/util/UUID;", "", "", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "onSuvCompleted", "Lkotlin/Function0;", "onSuvFailed", "(Lcom/robinhood/android/navigation/Navigator;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;", "registerSuvLauncher", "Landroidx/activity/ComponentActivity;", "Landroidx/fragment/app/Fragment;", "host", "Landroidx/activity/result/ActivityResultCaller;", "lib-step-up-verification_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.stepupverification.SuvLauncherKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SuvLauncher {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Navigator rememberSuvLauncher$lambda$3$lambda$2(Navigator navigator) {
        return navigator;
    }

    public static final Function2<UUID, Boolean, Unit> rememberSuvLauncher(final Navigator navigator, final Function0<Unit> onSuvCompleted, final Function0<Unit> function0, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(onSuvCompleted, "onSuvCompleted");
        composer.startReplaceGroup(-660279421);
        if ((i2 & 4) != 0) {
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.lib.stepupverification.SuvLauncherKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-660279421, i, -1, "com.robinhood.android.lib.stepupverification.rememberSuvLauncher (SuvLauncher.kt:19)");
        }
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(navigator);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.lib.stepupverification.SuvLauncherKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SuvLauncher.rememberSuvLauncher$lambda$3$lambda$2(navigator);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        SuvResultContract suvResultContract = new SuvResultContract((Function0) objRememberedValue2);
        composer.startReplaceGroup(-1633490746);
        int i3 = (i & 112) ^ 48;
        boolean z = true;
        int i4 = (i & 896) ^ 384;
        boolean z2 = ((i3 > 32 && composer.changed(onSuvCompleted)) || (i & 48) == 32) | ((i4 > 256 && composer.changed(function0)) || (i & 384) == 256);
        Object objRememberedValue3 = composer.rememberedValue();
        if (z2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.lib.stepupverification.SuvLauncherKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SuvLauncher.rememberSuvLauncher$lambda$5$lambda$4(onSuvCompleted, function0, (UiWorkflowStatus) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        final ActivityResultRegistry8 activityResultRegistry8RememberLauncherForActivityResult = ActivityResultRegistry3.rememberLauncherForActivityResult(suvResultContract, (Function1) objRememberedValue3, composer, NavigationActivityResultContract.$stable);
        VerificationWorkflowResultContract verificationWorkflowResultContract = new VerificationWorkflowResultContract();
        composer.startReplaceGroup(-1633490746);
        boolean z3 = (i3 > 32 && composer.changed(onSuvCompleted)) || (i & 48) == 32;
        if ((i4 <= 256 || !composer.changed(function0)) && (i & 384) != 256) {
            z = false;
        }
        boolean z4 = z3 | z;
        Object objRememberedValue4 = composer.rememberedValue();
        if (z4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue4 = new Function1() { // from class: com.robinhood.android.lib.stepupverification.SuvLauncherKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SuvLauncher.rememberSuvLauncher$lambda$7$lambda$6(onSuvCompleted, function0, (VerificationWorkflowResult) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        final ActivityResultRegistry8 activityResultRegistry8RememberLauncherForActivityResult2 = ActivityResultRegistry3.rememberLauncherForActivityResult(verificationWorkflowResultContract, (Function1) objRememberedValue4, composer, 0);
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance2 = composer.changedInstance(activityResultRegistry8RememberLauncherForActivityResult) | composer.changedInstance(activityResultRegistry8RememberLauncherForActivityResult2);
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue5 = new Function2() { // from class: com.robinhood.android.lib.stepupverification.SuvLauncherKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SuvLauncher.rememberSuvLauncher$lambda$9$lambda$8(activityResultRegistry8RememberLauncherForActivityResult, activityResultRegistry8RememberLauncherForActivityResult2, (UUID) obj, ((Boolean) obj2).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue5);
        }
        Function2<UUID, Boolean, Unit> function2 = (Function2) objRememberedValue5;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return function2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rememberSuvLauncher$lambda$5$lambda$4(Function0 function0, Function0 function02, UiWorkflowStatus uiWorkflowStatus) {
        if (uiWorkflowStatus == UiWorkflowStatus.APPROVED) {
            function0.invoke();
        } else {
            function02.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rememberSuvLauncher$lambda$7$lambda$6(Function0 function0, Function0 function02, VerificationWorkflowResult verificationWorkflowResult) {
        if (verificationWorkflowResult == VerificationWorkflowResult.APPROVED) {
            function0.invoke();
        } else {
            function02.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rememberSuvLauncher$lambda$9$lambda$8(ActivityResultRegistry8 activityResultRegistry8, ActivityResultRegistry8 activityResultRegistry82, UUID workflowId, boolean z) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        if (z) {
            NavigationActivityResultContract3.launch$default(activityResultRegistry8, new WorkflowIntentKey(workflowId), null, false, 6, null);
        } else {
            activityResultRegistry82.launch(new VerificationWorkflow(workflowId, null, null, 6, null));
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Function2 registerSuvLauncher$default(ComponentActivity componentActivity, Function0 function0, Function0 function02, Function0 function03, int i, Object obj) {
        if ((i & 4) != 0) {
            function03 = new Function0() { // from class: com.robinhood.android.lib.stepupverification.SuvLauncherKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
        }
        return registerSuvLauncher(componentActivity, (Function0<? extends Navigator>) function0, (Function0<Unit>) function02, (Function0<Unit>) function03);
    }

    public static final Function2<UUID, Boolean, Unit> registerSuvLauncher(ComponentActivity componentActivity, Function0<? extends Navigator> navigator, Function0<Unit> onSuvCompleted, Function0<Unit> onSuvFailed) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(onSuvCompleted, "onSuvCompleted");
        Intrinsics.checkNotNullParameter(onSuvFailed, "onSuvFailed");
        return registerSuvLauncher((ActivityResultCaller) componentActivity, navigator, onSuvCompleted, onSuvFailed);
    }

    public static /* synthetic */ Function2 registerSuvLauncher$default(Fragment fragment, Function0 function0, Function0 function02, Function0 function03, int i, Object obj) {
        if ((i & 4) != 0) {
            function03 = new Function0() { // from class: com.robinhood.android.lib.stepupverification.SuvLauncherKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
        }
        return registerSuvLauncher(fragment, (Function0<? extends Navigator>) function0, (Function0<Unit>) function02, (Function0<Unit>) function03);
    }

    public static final Function2<UUID, Boolean, Unit> registerSuvLauncher(Fragment fragment, Function0<? extends Navigator> navigator, Function0<Unit> onSuvCompleted, Function0<Unit> onSuvFailed) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(onSuvCompleted, "onSuvCompleted");
        Intrinsics.checkNotNullParameter(onSuvFailed, "onSuvFailed");
        return registerSuvLauncher((ActivityResultCaller) fragment, navigator, onSuvCompleted, onSuvFailed);
    }

    private static final Function2<UUID, Boolean, Unit> registerSuvLauncher(ActivityResultCaller activityResultCaller, Function0<? extends Navigator> function0, final Function0<Unit> function02, final Function0<Unit> function03) {
        final ActivityResultLauncher activityResultLauncherRegisterForActivityResult = activityResultCaller.registerForActivityResult(new SuvResultContract(function0), new ActivityResultCallback() { // from class: com.robinhood.android.lib.stepupverification.SuvLauncherKt$registerSuvLauncher$workflowLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(UiWorkflowStatus uiWorkflowStatus) {
                if (uiWorkflowStatus == UiWorkflowStatus.APPROVED) {
                    function02.invoke();
                } else {
                    function03.invoke();
                }
            }
        });
        final ActivityResultLauncher activityResultLauncherRegisterForActivityResult2 = activityResultCaller.registerForActivityResult(new VerificationWorkflowResultContract(), new ActivityResultCallback() { // from class: com.robinhood.android.lib.stepupverification.SuvLauncherKt$registerSuvLauncher$sassyLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(VerificationWorkflowResult verificationWorkflowResult) {
                if (verificationWorkflowResult == VerificationWorkflowResult.APPROVED) {
                    function02.invoke();
                } else {
                    function03.invoke();
                }
            }
        });
        return new Function2() { // from class: com.robinhood.android.lib.stepupverification.SuvLauncherKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SuvLauncher.registerSuvLauncher$lambda$12(activityResultLauncherRegisterForActivityResult, activityResultLauncherRegisterForActivityResult2, (UUID) obj, ((Boolean) obj2).booleanValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerSuvLauncher$lambda$12(ActivityResultLauncher activityResultLauncher, ActivityResultLauncher activityResultLauncher2, UUID workflowId, boolean z) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        if (z) {
            NavigationActivityResultContract3.launch$default(activityResultLauncher, new WorkflowIntentKey(workflowId), null, false, 6, null);
        } else {
            activityResultLauncher2.launch(new VerificationWorkflow(workflowId, null, null, 6, null));
        }
        return Unit.INSTANCE;
    }
}
