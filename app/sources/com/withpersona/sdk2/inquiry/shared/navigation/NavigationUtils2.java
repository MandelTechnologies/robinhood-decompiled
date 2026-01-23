package com.withpersona.sdk2.inquiry.shared.navigation;

import android.view.View;
import com.squareup.workflow1.p415ui.BackPressHandler;
import com.truelayer.payments.p419ui.utils.TestTags;
import com.withpersona.sdk2.inquiry.shared.R$id;
import com.withpersona.sdk2.inquiry.shared.p422ui.Pi2NavigationBar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NavigationUtils.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a:\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, m3636d2 = {"applyNavigationState", "", "navigationState", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", TestTags.BACK, "Lkotlin/Function0;", "cancel", "navigationBar", "Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;", "backPressHandler", "Landroid/view/View;", "shared_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.shared.navigation.NavigationUtilsKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class NavigationUtils2 {
    public static final void applyNavigationState(final NavigationState navigationState, final Function0<Unit> back, final Function0<Unit> cancel, Pi2NavigationBar navigationBar, View backPressHandler) {
        Intrinsics.checkNotNullParameter(navigationState, "navigationState");
        Intrinsics.checkNotNullParameter(back, "back");
        Intrinsics.checkNotNullParameter(cancel, "cancel");
        Intrinsics.checkNotNullParameter(navigationBar, "navigationBar");
        Intrinsics.checkNotNullParameter(backPressHandler, "backPressHandler");
        navigationBar.setState$shared_release(navigationState, back, cancel);
        final Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.shared.navigation.NavigationUtilsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NavigationUtils2.applyNavigationState$lambda$0(navigationState, back, cancel);
            }
        };
        backPressHandler.setTag(R$id.pi2_back_press_handler, new Object() { // from class: com.withpersona.sdk2.inquiry.shared.navigation.NavigationUtilsKt.applyNavigationState.1
        });
        if (navigationState.getHandleBackPress()) {
            BackPressHandler.setBackPressedHandler(backPressHandler, function0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit applyNavigationState$lambda$0(NavigationState navigationState, Function0 function0, Function0 function02) {
        if (navigationState.getShowBackButton()) {
            function0.invoke();
        } else {
            function02.invoke();
        }
        return Unit.INSTANCE;
    }
}
