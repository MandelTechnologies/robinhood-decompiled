package com.robinhood.android.settings.p254ui.notification;

import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NotificationSettings4Composable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposableKt$NotificationSettings4Composable$2$2$2$1$1$3$1, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class NotificationSettings4Composable5 extends FunctionReferenceImpl implements Function1<NotificationSettings4FragmentKey4.Toggle, Unit> {
    NotificationSettings4Composable5(Object obj) {
        super(1, obj, NotificationSettings4ComposeDuxo.class, "onToggleAppeared", "onToggleAppeared(Lcom/robinhood/shared/settings/contracts/ViewType$Toggle;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(NotificationSettings4FragmentKey4.Toggle toggle) {
        invoke2(toggle);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(NotificationSettings4FragmentKey4.Toggle p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((NotificationSettings4ComposeDuxo) this.receiver).onToggleAppeared(p0);
    }
}
