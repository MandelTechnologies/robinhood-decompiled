package com.robinhood.android.gold.downgrade;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.gold.contracts.GoldDowngradeIntentKey;
import com.robinhood.android.gold.downgrade.GoldDowngradeConfirmationFragment;
import com.robinhood.android.gold.downgrade.GoldDowngradeLoadingFragment;
import com.robinhood.android.gold.downgrade.GoldDowngradeSubmissionFragment;
import com.robinhood.android.gold.downgrade.GoldDowngradeValuePropsFragment;
import com.robinhood.android.gold.subscription.api.ApiGoldDowngradeConfirmation;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: GoldDowngradeActivity.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0007\u0018\u0000 (2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001(B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u001b\u001a\u00020\u0017H\u0016J\b\u0010\u001c\u001a\u00020\u0017H\u0016J\u0010\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0012\u0010 \u001a\u00020\u00172\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0010\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u0017H\u0016J\b\u0010'\u001a\u00020\u0017H\u0016R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR/\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/gold/downgrade/GoldDowngradeActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/gold/downgrade/GoldDowngradeLoadingFragment$Callbacks;", "Lcom/robinhood/android/gold/downgrade/GoldDowngradeValuePropsFragment$Callbacks;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "Lcom/robinhood/android/gold/downgrade/GoldDowngradeSubmissionFragment$Callbacks;", "Lcom/robinhood/android/gold/downgrade/GoldDowngradeConfirmationFragment$Callbacks;", "<init>", "()V", "screenName", "", "getScreenName", "()Ljava/lang/String;", "<set-?>", "Lcom/robinhood/android/gold/downgrade/GoldDowngradeContext;", "context", "getContext", "()Lcom/robinhood/android/gold/downgrade/GoldDowngradeContext;", "setContext", "(Lcom/robinhood/android/gold/downgrade/GoldDowngradeContext;)V", "context$delegate", "Lkotlin/properties/ReadWriteProperty;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStateLoaded", "onProceedWithDowngrade", "onAbortDowngrade", "onDialogDismissed", "id", "", "onDowngradeSuccess", "goldDowngradeConfirmation", "Lcom/robinhood/android/gold/subscription/api/ApiGoldDowngradeConfirmation;", "onDowngradeFailed", "throwable", "", "onDowngradeCompleted", "onBackPressed", "Companion", "feature-gold-downgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GoldDowngradeActivity extends BaseActivity implements GoldDowngradeLoadingFragment.Callbacks, GoldDowngradeValuePropsFragment.Callbacks, RhDialogFragment.OnDismissListener, GoldDowngradeSubmissionFragment.Callbacks, GoldDowngradeConfirmationFragment.Callbacks {

    /* renamed from: context$delegate, reason: from kotlin metadata */
    private final Interfaces3 context;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(GoldDowngradeActivity.class, "context", "getContext()Lcom/robinhood/android/gold/downgrade/GoldDowngradeContext;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public GoldDowngradeActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.context = (Interfaces3) BindSavedState2.savedParcelable(this).provideDelegate(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return "MarginDowngradeActivity";
    }

    private final GoldDowngradeContext getContext() {
        return (GoldDowngradeContext) this.context.getValue(this, $$delegatedProperties[0]);
    }

    private final void setContext(GoldDowngradeContext goldDowngradeContext) {
        this.context.setValue(this, $$delegatedProperties[0], goldDowngradeContext);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, GoldDowngradeLoadingFragment.INSTANCE.newInstance());
        }
    }

    @Override // com.robinhood.android.gold.downgrade.GoldDowngradeLoadingFragment.Callbacks
    public void onStateLoaded(GoldDowngradeContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        setContext(context);
        if (((GoldDowngradeIntentKey) INSTANCE.getExtras((Activity) this)).getAutoProceed()) {
            onProceedWithDowngrade();
        } else {
            replaceFragmentWithoutAnimationAndBackStack(GoldDowngradeValuePropsFragment.INSTANCE.newInstance((Parcelable) new GoldDowngradeValuePropsFragment.Args(context)));
        }
    }

    @Override // com.robinhood.android.gold.downgrade.GoldDowngradeValuePropsFragment.Callbacks
    public void onProceedWithDowngrade() {
        popEntireFragmentBackstack();
        GoldDowngradeSubmissionFragment.Companion companion = GoldDowngradeSubmissionFragment.INSTANCE;
        GoldDowngradeContext context = getContext();
        Intrinsics.checkNotNull(context);
        replaceFragmentWithoutBackStack(companion.newInstance((Parcelable) context));
    }

    @Override // com.robinhood.android.gold.downgrade.GoldDowngradeLoadingFragment.Callbacks, com.robinhood.android.gold.downgrade.GoldDowngradeValuePropsFragment.Callbacks
    public void onAbortDowngrade() {
        setResult(0);
        finish();
    }

    @Override // com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error) {
            finish();
        }
    }

    @Override // com.robinhood.android.gold.downgrade.GoldDowngradeSubmissionFragment.Callbacks
    public void onDowngradeSuccess(ApiGoldDowngradeConfirmation goldDowngradeConfirmation) {
        setResult(-1);
        popEntireFragmentBackstack();
        GoldDowngradeConfirmationFragment.Companion companion = GoldDowngradeConfirmationFragment.INSTANCE;
        GoldDowngradeContext context = getContext();
        if (context != null) {
            replaceFragmentWithoutAnimationAndBackStack(companion.newInstance((Parcelable) new GoldDowngradeConfirmationFragment.Args(context, goldDowngradeConfirmation)));
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // com.robinhood.android.gold.downgrade.GoldDowngradeSubmissionFragment.Callbacks
    public void onDowngradeFailed(Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, this, throwable, true, false, 0, null, 56, null);
        popEntireFragmentBackstack();
        GoldDowngradeContext context = getContext();
        if (context == null) {
            throw new IllegalStateException("Required value was null.");
        }
        onStateLoaded(context);
    }

    @Override // com.robinhood.android.gold.downgrade.GoldDowngradeConfirmationFragment.Callbacks
    public void onDowngradeCompleted() {
        finish();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (getCurrentFragment() instanceof GoldDowngradeSubmissionFragment) {
            return;
        }
        super.onBackPressed();
    }

    /* compiled from: GoldDowngradeActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/gold/downgrade/GoldDowngradeActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/gold/downgrade/GoldDowngradeActivity;", "Lcom/robinhood/android/gold/contracts/GoldDowngradeIntentKey;", "<init>", "()V", "feature-gold-downgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<GoldDowngradeActivity, GoldDowngradeIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public GoldDowngradeIntentKey getExtras(GoldDowngradeActivity goldDowngradeActivity) {
            return (GoldDowngradeIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, goldDowngradeActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, GoldDowngradeIntentKey goldDowngradeIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, goldDowngradeIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, GoldDowngradeIntentKey goldDowngradeIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, goldDowngradeIntentKey);
        }
    }
}
