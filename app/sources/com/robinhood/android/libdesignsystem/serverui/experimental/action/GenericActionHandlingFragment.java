package com.robinhood.android.libdesignsystem.serverui.experimental.action;

import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GenericActionHandlingFragment.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J@\u0010\u0012\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00162\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u00020\u000b8\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/GenericActionHandlingFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/ActionHandlingFragment;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "()V", "shouldClearTop", "", "getShouldClearTop", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "handle", "action", "handleInfoAlert", "infoAlert", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction$InfoAlert;", "onPrimaryButtonClick", "Lkotlin/Function1;", "", "", "onSecondaryButtonClick", "lib-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public abstract class GenericActionHandlingFragment extends ActionHandlingFragment<GenericAction> {
    public static final int $stable = 8;
    public Markwon markwon;
    private final Boolean shouldClearTop;

    public Boolean getShouldClearTop() {
        return this.shouldClearTop;
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment
    public Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
    /* renamed from: handle */
    public boolean mo15941handle(GenericAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof GenericAction.Deeplink) {
            return ActionHandlingFragment2.handleDeeplink(this, ((GenericAction.Deeplink) action).getValue2(), getShouldClearTop());
        }
        if (action instanceof GenericAction.Dismiss) {
            return dismissAlert();
        }
        if (action instanceof GenericAction.InfoAlert) {
            return handleInfoAlert$default(this, (GenericAction.InfoAlert) action, null, null, 6, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean handleInfoAlert$default(GenericActionHandlingFragment genericActionHandlingFragment, GenericAction.InfoAlert infoAlert, Function1 function1, Function1 function12, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleInfoAlert");
        }
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlingFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return GenericActionHandlingFragment.handleInfoAlert$lambda$0((String) obj2);
                }
            };
        }
        if ((i & 4) != 0) {
            function12 = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlingFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return GenericActionHandlingFragment.handleInfoAlert$lambda$1((String) obj2);
                }
            };
        }
        return genericActionHandlingFragment.handleInfoAlert(infoAlert, function1, function12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleInfoAlert$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleInfoAlert$lambda$1(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final boolean handleInfoAlert(GenericAction.InfoAlert<? extends GenericAction> infoAlert, Function1<? super String, Unit> onPrimaryButtonClick, Function1<? super String, Unit> onSecondaryButtonClick) {
        Intrinsics.checkNotNullParameter(infoAlert, "infoAlert");
        Intrinsics.checkNotNullParameter(onPrimaryButtonClick, "onPrimaryButtonClick");
        Intrinsics.checkNotNullParameter(onSecondaryButtonClick, "onSecondaryButtonClick");
        return ActionHandlingFragment.handleAlert$default(this, infoAlert.getValue2(), onPrimaryButtonClick, onSecondaryButtonClick, null, false, false, false, 120, null);
    }
}
