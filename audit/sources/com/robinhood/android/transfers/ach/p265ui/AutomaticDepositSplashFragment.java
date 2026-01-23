package com.robinhood.android.transfers.ach.p265ui;

import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.banking.lib.C9631R;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.onboarding.p085ui.BaseFullscreenInfoFragment;
import com.robinhood.android.common.onboarding.p085ui.SplashPage;
import com.robinhood.android.transfers.ach.C30082R;
import com.robinhood.android.transfers.ach.p265ui.AutomaticDepositSplashFragment;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: AutomaticDepositSplashFragment.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0002\u0014\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/AutomaticDepositSplashFragment;", "Lcom/robinhood/android/common/onboarding/ui/BaseFullscreenInfoFragment;", "<init>", "()V", "splashPage", "Lcom/robinhood/android/common/onboarding/ui/SplashPage;", "getSplashPage", "()Lcom/robinhood/android/common/onboarding/ui/SplashPage;", "primaryButtonLabelRes", "", "getPrimaryButtonLabelRes", "()Ljava/lang/Integer;", "callbacks", "Lcom/robinhood/android/transfers/ach/ui/AutomaticDepositSplashFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/transfers/ach/ui/AutomaticDepositSplashFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onPrimaryButtonClicked", "", "Callbacks", "Companion", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class AutomaticDepositSplashFragment extends BaseFullscreenInfoFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AutomaticDepositSplashFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/transfers/ach/ui/AutomaticDepositSplashFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final int primaryButtonLabelRes = C11048R.string.general_label_continue;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.transfers.ach.ui.AutomaticDepositSplashFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof AutomaticDepositSplashFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* compiled from: AutomaticDepositSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/AutomaticDepositSplashFragment$Callbacks;", "", "onStartAutomaticDepositFlow", "", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onStartAutomaticDepositFlow();
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseFullscreenInfoFragment
    public SplashPage getSplashPage() throws Resources.NotFoundException {
        SplashPage.Creative.Drawable drawable = new SplashPage.Creative.Drawable(C30082R.drawable.ic_automatic_deposit);
        String string2 = getResources().getString(C9631R.string.ach_transfer_recurring_deposit_title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = getResources().getString(C30082R.string.ach_transfer_automatic_deposit_summary);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return new SplashPage(drawable, null, string2, string3, null, null, 50, null);
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseFullscreenInfoFragment
    public Integer getPrimaryButtonLabelRes() {
        return Integer.valueOf(this.primaryButtonLabelRes);
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseFullscreenInfoFragment
    public void onPrimaryButtonClicked() {
        getCallbacks().onStartAutomaticDepositFlow();
    }

    /* compiled from: AutomaticDepositSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/AutomaticDepositSplashFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/robinhood/android/transfers/ach/ui/AutomaticDepositSplashFragment;", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AutomaticDepositSplashFragment newInstance() {
            return new AutomaticDepositSplashFragment();
        }
    }
}
