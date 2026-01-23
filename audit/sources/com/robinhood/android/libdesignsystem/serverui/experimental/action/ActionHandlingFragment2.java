package com.robinhood.android.libdesignsystem.serverui.experimental.action;

import android.content.Context;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.models.serverdriven.experimental.api.DeeplinkAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: ActionHandlingFragment.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a1\u0010\u0006\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a%\u0010\r\u001a\u00020\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Landroid/os/Parcelable;", "ActionT", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/ActionHandlingFragment;", "Lkotlin/Function0;", "", "content", "ContentWithDialog", "(Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/ActionHandlingFragment;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/models/serverdriven/experimental/api/DeeplinkAction;", "action", "", "shouldClearTop", "handleDeeplink", "(Lcom/robinhood/android/common/ui/BaseFragment;Lcom/robinhood/models/serverdriven/experimental/api/DeeplinkAction;Ljava/lang/Boolean;)Z", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragmentKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class ActionHandlingFragment2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContentWithDialog$lambda$5(ActionHandlingFragment actionHandlingFragment, Function2 function2, int i, Composer composer, int i2) {
        ContentWithDialog(actionHandlingFragment, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final <ActionT extends Parcelable> void ContentWithDialog(final ActionHandlingFragment<ActionT> actionHandlingFragment, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(actionHandlingFragment, "<this>");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-810789123);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(actionHandlingFragment) : composerStartRestartGroup.changedInstance(actionHandlingFragment) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-810789123, i2, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.action.ContentWithDialog (ActionHandlingFragment.kt:79)");
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            int i3 = i2 & 14;
            boolean z = false;
            boolean z2 = i3 == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(actionHandlingFragment));
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ActionHandlingFragment3(actionHandlingFragment);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            SduiActionHandler3.ProvideActionHandler(new ActionHandlingFragment5((Function1) ((KFunction) objRememberedValue)), content, composerStartRestartGroup, i2 & 112);
            GenericAlertContent<ActionT> genericAlertContent = actionHandlingFragment.getGenericAlertContent();
            if (genericAlertContent != null) {
                SduiAlert sduiAlert = SduiAlert.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean z3 = i3 == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(actionHandlingFragment));
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new ActionHandlingFragment4(actionHandlingFragment);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                ActionHandlingFragment5 actionHandlingFragment5 = new ActionHandlingFragment5((Function1) ((KFunction) objRememberedValue2));
                composerStartRestartGroup.startReplaceGroup(5004770);
                if (i3 == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(actionHandlingFragment))) {
                    z = true;
                }
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragmentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ActionHandlingFragment2.ContentWithDialog$lambda$4$lambda$3$lambda$2(actionHandlingFragment);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                sduiAlert.Dialog(genericAlertContent, actionHandlingFragment5, null, (Function0) objRememberedValue3, composerStartRestartGroup, 0, 4);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragmentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ActionHandlingFragment2.ContentWithDialog$lambda$5(actionHandlingFragment, content, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContentWithDialog$lambda$4$lambda$3$lambda$2(ActionHandlingFragment actionHandlingFragment) {
        actionHandlingFragment.setGenericAlertContent(null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ boolean handleDeeplink$default(BaseFragment baseFragment, DeeplinkAction deeplinkAction, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        return handleDeeplink(baseFragment, deeplinkAction, bool);
    }

    public static final boolean handleDeeplink(BaseFragment baseFragment, DeeplinkAction action, Boolean bool) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        Navigator navigator = baseFragment.getNavigator();
        Context contextRequireContext = baseFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return GenericActionHandlerKt.handleDeeplinkAction(navigator, contextRequireContext, action, bool);
    }
}
