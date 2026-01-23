package com.robinhood.android.settings.p254ui.notification;

import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NotificationSettings4ComposeFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposeFragment$ComposeContent$2$1, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class NotificationSettings4ComposeFragment3 extends FunctionReferenceImpl implements Function1<NotificationSettings4FragmentKey4.BottomSheetEntryPointRow, Unit> {
    NotificationSettings4ComposeFragment3(Object obj) {
        super(1, obj, NotificationSettings4ComposeFragment.class, "onBottomSheetEntryPointRowClick", "onBottomSheetEntryPointRowClick(Lcom/robinhood/shared/settings/contracts/ViewType$BottomSheetEntryPointRow;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(NotificationSettings4FragmentKey4.BottomSheetEntryPointRow bottomSheetEntryPointRow) {
        invoke2(bottomSheetEntryPointRow);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(NotificationSettings4FragmentKey4.BottomSheetEntryPointRow p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((NotificationSettings4ComposeFragment) this.receiver).onBottomSheetEntryPointRowClick(p0);
    }
}
