package com.robinhood.android.transfers.lib.threedsecure;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.transfers.contracts.ThreeDSecureFragmentKey;
import com.robinhood.android.transfers.lib.C30383R;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: ThreeDSWebViewFragment.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u000bH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R+\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/transfers/lib/threedsecure/ThreeDSecureFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/transfers/contracts/ThreeDSecureFragmentKey$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/transfers/contracts/ThreeDSecureFragmentKey$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "<set-?>", "", "isThreeDSecureCompleted", "()Z", "setThreeDSecureCompleted", "(Z)V", "isThreeDSecureCompleted$delegate", "Lkotlin/properties/ReadWriteProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onBackPressed", "Companion", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SuppressLint({"SetJavaScriptEnabled"})
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.lib.threedsecure.ThreeDSecureFragment, reason: use source file name */
/* loaded from: classes9.dex */
public final class ThreeDSWebViewFragment2 extends BaseFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ThreeDSWebViewFragment2.class, "callbacks", "getCallbacks()Lcom/robinhood/android/transfers/contracts/ThreeDSecureFragmentKey$Callbacks;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ThreeDSWebViewFragment2.class, "isThreeDSecureCompleted", "isThreeDSecureCompleted()Z", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: isThreeDSecureCompleted$delegate, reason: from kotlin metadata */
    private final Interfaces3 isThreeDSecureCompleted;

    public ThreeDSWebViewFragment2() {
        super(C30383R.layout.fragment_three_d_secure);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(ThreeDSecureFragmentKey.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.transfers.lib.threedsecure.ThreeDSecureFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof ThreeDSecureFragmentKey.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.isThreeDSecureCompleted = BindSavedState2.savedBoolean(this, false).provideDelegate(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ThreeDSecureFragmentKey.Callbacks getCallbacks() {
        return (ThreeDSecureFragmentKey.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isThreeDSecureCompleted() {
        return ((Boolean) this.isThreeDSecureCompleted.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setThreeDSecureCompleted(boolean z) {
        this.isThreeDSecureCompleted.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        WebView webView = (WebView) view.findViewById(C30383R.id.web_view);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(((ThreeDSecureFragmentKey) INSTANCE.getArgs((Fragment) this)).getRedirectUrl());
        webView.setWebViewClient(new WebViewClient() { // from class: com.robinhood.android.transfers.lib.threedsecure.ThreeDSecureFragment$onViewCreated$1$1
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view2, String url) {
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(url, "url");
                if (!IsReturnUrlBackToRobinhood.isReturnUrlBackToRobinhood(url)) {
                    return false;
                }
                if (this.this$0.isAdded() && !this.this$0.isThreeDSecureCompleted()) {
                    this.this$0.setThreeDSecureCompleted(true);
                    this.this$0.getCallbacks().onThreeDSecureCompleted();
                }
                return true;
            }
        });
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        getCallbacks().onThreeDSecureCanceled();
        return true;
    }

    /* compiled from: ThreeDSWebViewFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/lib/threedsecure/ThreeDSecureFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/transfers/lib/threedsecure/ThreeDSecureFragment;", "Lcom/robinhood/android/transfers/contracts/ThreeDSecureFragmentKey;", "<init>", "()V", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.lib.threedsecure.ThreeDSecureFragment$Companion, reason: from kotlin metadata */
    public static final class Companion implements FragmentResolverWithArgsCompanion<ThreeDSWebViewFragment2, ThreeDSecureFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(ThreeDSecureFragmentKey threeDSecureFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, threeDSecureFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public ThreeDSecureFragmentKey getArgs(ThreeDSWebViewFragment2 threeDSWebViewFragment2) {
            return (ThreeDSecureFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, threeDSWebViewFragment2);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ThreeDSWebViewFragment2 newInstance(ThreeDSecureFragmentKey threeDSecureFragmentKey) {
            return (ThreeDSWebViewFragment2) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, threeDSecureFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ThreeDSWebViewFragment2 threeDSWebViewFragment2, ThreeDSecureFragmentKey threeDSecureFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, threeDSWebViewFragment2, threeDSecureFragmentKey);
        }
    }
}
