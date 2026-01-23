package com.google.accompanist.permissions;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.google.accompanist.permissions.PermissionsUtil;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PermissionsUtil.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0012\u001a\u00020\u0011*\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0014\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\"\u001e\u0010\u0017\u001a\u00020\u0011*\u00020\u00168FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018\"\u001e\u0010\u0014\u001a\u00020\u0011*\u00020\u00168FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001b\u0010\u0018¨\u0006\u001d"}, m3636d2 = {"Lcom/google/accompanist/permissions/MutablePermissionState;", "permissionState", "Landroidx/lifecycle/Lifecycle$Event;", "lifecycleEvent", "", "PermissionLifecycleCheckerEffect", "(Lcom/google/accompanist/permissions/MutablePermissionState;Landroidx/lifecycle/Lifecycle$Event;Landroidx/compose/runtime/Composer;II)V", "", "permissions", "PermissionsLifecycleCheckerEffect", "(Ljava/util/List;Landroidx/lifecycle/Lifecycle$Event;Landroidx/compose/runtime/Composer;II)V", "Landroid/content/Context;", "Landroid/app/Activity;", "findActivity", "(Landroid/content/Context;)Landroid/app/Activity;", "", "permission", "", "checkPermission", "(Landroid/content/Context;Ljava/lang/String;)Z", "shouldShowRationale", "(Landroid/app/Activity;Ljava/lang/String;)Z", "Lcom/google/accompanist/permissions/PermissionStatus;", "isGranted", "(Lcom/google/accompanist/permissions/PermissionStatus;)Z", "isGranted$annotations", "(Lcom/google/accompanist/permissions/PermissionStatus;)V", "getShouldShowRationale", "getShouldShowRationale$annotations", "permissions_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.google.accompanist.permissions.PermissionsUtilKt, reason: use source file name */
/* loaded from: classes16.dex */
public final class PermissionsUtil2 {
    public static final boolean isGranted(PermissionsUtil permissionsUtil) {
        Intrinsics.checkNotNullParameter(permissionsUtil, "<this>");
        return Intrinsics.areEqual(permissionsUtil, PermissionsUtil.Granted.INSTANCE);
    }

    public static final boolean getShouldShowRationale(PermissionsUtil permissionsUtil) {
        Intrinsics.checkNotNullParameter(permissionsUtil, "<this>");
        if (Intrinsics.areEqual(permissionsUtil, PermissionsUtil.Granted.INSTANCE)) {
            return false;
        }
        if (permissionsUtil instanceof PermissionsUtil.Denied) {
            return ((PermissionsUtil.Denied) permissionsUtil).getShouldShowRationale();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void PermissionLifecycleCheckerEffect(final MutablePermissionState permissionState, final Lifecycle.Event event, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(permissionState, "permissionState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1770945943);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(permissionState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(event) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                event = Lifecycle.Event.ON_RESUME;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1770945943, i3, -1, "com.google.accompanist.permissions.PermissionLifecycleCheckerEffect (PermissionsUtil.kt:75)");
            }
            composerStartRestartGroup.startReplaceableGroup(-899069773);
            boolean z = (i3 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new LifecycleEventObserver() { // from class: com.google.accompanist.permissions.PermissionsUtilKt$$ExternalSyntheticLambda0
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event2) {
                        PermissionsUtil2.PermissionLifecycleCheckerEffect$lambda$1$lambda$0(event, permissionState, lifecycleOwner, event2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final LifecycleEventObserver lifecycleEventObserver = (LifecycleEventObserver) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle();
            EffectsKt.DisposableEffect(lifecycle, lifecycleEventObserver, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.google.accompanist.permissions.PermissionsUtilKt.PermissionLifecycleCheckerEffect.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                    lifecycle.addObserver(lifecycleEventObserver);
                    final Lifecycle lifecycle2 = lifecycle;
                    final LifecycleEventObserver lifecycleEventObserver2 = lifecycleEventObserver;
                    return new DisposableEffectResult() { // from class: com.google.accompanist.permissions.PermissionsUtilKt$PermissionLifecycleCheckerEffect$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            lifecycle2.removeObserver(lifecycleEventObserver2);
                        }
                    };
                }
            }, composerStartRestartGroup, 72);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.google.accompanist.permissions.PermissionsUtilKt.PermissionLifecycleCheckerEffect.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    PermissionsUtil2.PermissionLifecycleCheckerEffect(permissionState, event, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PermissionLifecycleCheckerEffect$lambda$1$lambda$0(Lifecycle.Event event, MutablePermissionState permissionState, LifecycleOwner lifecycleOwner, Lifecycle.Event event2) {
        Intrinsics.checkNotNullParameter(permissionState, "$permissionState");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event2, "event");
        if (event2 != event || Intrinsics.areEqual(permissionState.getStatus(), PermissionsUtil.Granted.INSTANCE)) {
            return;
        }
        permissionState.refreshPermissionStatus$permissions_release();
    }

    public static final void PermissionsLifecycleCheckerEffect(final List<MutablePermissionState> permissions, final Lifecycle.Event event, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Composer composerStartRestartGroup = composer.startRestartGroup(1533427666);
        if ((i2 & 2) != 0) {
            event = Lifecycle.Event.ON_RESUME;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1533427666, i, -1, "com.google.accompanist.permissions.PermissionsLifecycleCheckerEffect (PermissionsUtil.kt:105)");
        }
        composerStartRestartGroup.startReplaceableGroup(-1664752182);
        boolean zChanged = composerStartRestartGroup.changed(permissions);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new LifecycleEventObserver() { // from class: com.google.accompanist.permissions.PermissionsUtilKt$$ExternalSyntheticLambda1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event2) {
                    PermissionsUtil2.PermissionsLifecycleCheckerEffect$lambda$3$lambda$2(event, permissions, lifecycleOwner, event2);
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final LifecycleEventObserver lifecycleEventObserver = (LifecycleEventObserver) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle();
        EffectsKt.DisposableEffect(lifecycle, lifecycleEventObserver, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.google.accompanist.permissions.PermissionsUtilKt.PermissionsLifecycleCheckerEffect.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                lifecycle.addObserver(lifecycleEventObserver);
                final Lifecycle lifecycle2 = lifecycle;
                final LifecycleEventObserver lifecycleEventObserver2 = lifecycleEventObserver;
                return new DisposableEffectResult() { // from class: com.google.accompanist.permissions.PermissionsUtilKt$PermissionsLifecycleCheckerEffect$1$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        lifecycle2.removeObserver(lifecycleEventObserver2);
                    }
                };
            }
        }, composerStartRestartGroup, 72);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.google.accompanist.permissions.PermissionsUtilKt.PermissionsLifecycleCheckerEffect.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    PermissionsUtil2.PermissionsLifecycleCheckerEffect(permissions, event, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PermissionsLifecycleCheckerEffect$lambda$3$lambda$2(Lifecycle.Event event, List permissions, LifecycleOwner lifecycleOwner, Lifecycle.Event event2) {
        Intrinsics.checkNotNullParameter(permissions, "$permissions");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event2, "event");
        if (event2 == event) {
            Iterator it = permissions.iterator();
            while (it.hasNext()) {
                MutablePermissionState mutablePermissionState = (MutablePermissionState) it.next();
                if (!Intrinsics.areEqual(mutablePermissionState.getStatus(), PermissionsUtil.Granted.INSTANCE)) {
                    mutablePermissionState.refreshPermissionStatus$permissions_release();
                }
            }
        }
    }

    public static final Activity findActivity(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(context, "getBaseContext(...)");
        }
        throw new IllegalStateException("Permissions should be called in the context of an Activity");
    }

    public static final boolean checkPermission(Context context, String permission) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(permission, "permission");
        return ContextCompat.checkSelfPermission(context, permission) == 0;
    }

    public static final boolean shouldShowRationale(Activity activity, String permission) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(permission, "permission");
        return ActivityCompat.shouldShowRequestPermissionRationale(activity, permission);
    }
}
