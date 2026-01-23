package com.robinhood.android.acatsin.failedtransferbottomsheet;

import com.robinhood.android.navigation.Navigation;
import com.robinhood.android.navigation.NavigationResolver;
import com.robinhood.hammer.core.internal.RhGenerated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: Hammer_FailedTransferBottomSheet_Companion_NavigationResolverModule.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/acatsin/failedtransferbottomsheet/Hammer_FailedTransferBottomSheet_Companion_NavigationResolverModule;", "", "<init>", "()V", "getter", "Lkotlin/Function0;", "Lcom/robinhood/android/navigation/NavigationResolver;", "provide_FailedTransferBottomSheetKey", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.failedtransferbottomsheet.Hammer_FailedTransferBottomSheet_Companion_NavigationResolverModule */
/* loaded from: classes24.dex */
public final class C7939xc72951c5 {
    public static final int $stable = 0;
    public static final C7939xc72951c5 INSTANCE = new C7939xc72951c5();
    private static final Function0<NavigationResolver> getter = NavigationResolver.INSTANCE.lazyGetter("com.robinhood.android.acatsin.failedtransferbottomsheet.FailedTransferBottomSheet", "Companion");

    private C7939xc72951c5() {
    }

    @Navigation
    public final Function0<NavigationResolver> provide_FailedTransferBottomSheetKey() {
        return getter;
    }
}
