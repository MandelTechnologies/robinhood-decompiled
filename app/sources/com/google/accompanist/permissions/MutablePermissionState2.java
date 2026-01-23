package com.google.accompanist.permissions;

import android.content.Context;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.view.compose.ActivityResultRegistry3;
import androidx.view.compose.ActivityResultRegistry8;
import androidx.view.result.contract.ActivityResultContracts$RequestPermission;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MutablePermissionState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"rememberMutablePermissionState", "Lcom/google/accompanist/permissions/MutablePermissionState;", "permission", "", "onPermissionResult", "Lkotlin/Function1;", "", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lcom/google/accompanist/permissions/MutablePermissionState;", "permissions_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.google.accompanist.permissions.MutablePermissionStateKt, reason: use source file name */
/* loaded from: classes16.dex */
public final class MutablePermissionState2 {
    public static final MutablePermissionState rememberMutablePermissionState(String permission, final Function1<? super Boolean, Unit> function1, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        composer.startReplaceableGroup(1424240517);
        if ((i2 & 2) != 0) {
            function1 = new Function1<Boolean, Unit>() { // from class: com.google.accompanist.permissions.MutablePermissionStateKt.rememberMutablePermissionState.1
                public final void invoke(boolean z) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }
            };
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1424240517, i, -1, "com.google.accompanist.permissions.rememberMutablePermissionState (MutablePermissionState.kt:47)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composer.startReplaceableGroup(-1903070007);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && composer.changed(permission)) || (i & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new MutablePermissionState(permission, context, PermissionsUtil2.findActivity(context));
            composer.updateRememberedValue(objRememberedValue);
        }
        final MutablePermissionState mutablePermissionState = (MutablePermissionState) objRememberedValue;
        composer.endReplaceableGroup();
        PermissionsUtil2.PermissionLifecycleCheckerEffect(mutablePermissionState, null, composer, 0, 2);
        ActivityResultContracts$RequestPermission activityResultContracts$RequestPermission = new ActivityResultContracts$RequestPermission();
        composer.startReplaceableGroup(-1903069605);
        boolean zChanged = composer.changed(mutablePermissionState);
        if ((((i & 112) ^ 48) <= 32 || !composer.changedInstance(function1)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = zChanged | z;
        Object objRememberedValue2 = composer.rememberedValue();
        if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function1<Boolean, Unit>() { // from class: com.google.accompanist.permissions.MutablePermissionStateKt$rememberMutablePermissionState$launcher$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z4) {
                    mutablePermissionState.refreshPermissionStatus$permissions_release();
                    function1.invoke(Boolean.valueOf(z4));
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        final ActivityResultRegistry8 activityResultRegistry8RememberLauncherForActivityResult = ActivityResultRegistry3.rememberLauncherForActivityResult(activityResultContracts$RequestPermission, (Function1) objRememberedValue2, composer, 8);
        EffectsKt.DisposableEffect(mutablePermissionState, activityResultRegistry8RememberLauncherForActivityResult, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.google.accompanist.permissions.MutablePermissionStateKt.rememberMutablePermissionState.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                mutablePermissionState.setLauncher$permissions_release(activityResultRegistry8RememberLauncherForActivityResult);
                final MutablePermissionState mutablePermissionState2 = mutablePermissionState;
                return new DisposableEffectResult() { // from class: com.google.accompanist.permissions.MutablePermissionStateKt$rememberMutablePermissionState$2$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        mutablePermissionState2.setLauncher$permissions_release(null);
                    }
                };
            }
        }, composer, ActivityResultRegistry8.$stable << 3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutablePermissionState;
    }
}
