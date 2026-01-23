package com.stripe.android.view;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewStub;
import android.widget.ProgressBar;
import androidx.appcompat.R$attr;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.stripe.android.R$drawable;
import com.stripe.android.R$id;
import com.stripe.android.R$menu;
import com.stripe.android.databinding.StripeActivityBinding;
import com.stripe.android.view.AlertDisplayer;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: StripeActivity.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u0006H$¢\u0006\u0004\b\u0013\u0010\u0003J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0004¢\u0006\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010)R*\u0010,\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u000b8\u0004@DX\u0084\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.\"\u0004\b/\u0010\u0016R\u001b\u00104\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u001d\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u001d\u001a\u0004\b7\u00108¨\u0006:"}, m3636d2 = {"Lcom/stripe/android/view/StripeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "Landroid/view/MenuItem;", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "onPrepareOptionsMenu", "onActionSave", "visible", "onProgressBarVisibilityChanged", "(Z)V", "", "error", "showError", "(Ljava/lang/String;)V", "Lcom/stripe/android/databinding/StripeActivityBinding;", "viewBinding$delegate", "Lkotlin/Lazy;", "getViewBinding", "()Lcom/stripe/android/databinding/StripeActivityBinding;", "viewBinding", "Landroid/widget/ProgressBar;", "progressBar$delegate", "getProgressBar$payments_core_release", "()Landroid/widget/ProgressBar;", "progressBar", "Landroid/view/ViewStub;", "viewStub$delegate", "getViewStub$payments_core_release", "()Landroid/view/ViewStub;", "viewStub", "value", "isProgressBarVisible", "Z", "()Z", "setProgressBarVisible", "Lcom/stripe/android/view/AlertDisplayer;", "alertDisplayer$delegate", "getAlertDisplayer", "()Lcom/stripe/android/view/AlertDisplayer;", "alertDisplayer", "Lcom/stripe/android/view/StripeColorUtils;", "stripeColorUtils$delegate", "getStripeColorUtils", "()Lcom/stripe/android/view/StripeColorUtils;", "stripeColorUtils", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public abstract class StripeActivity extends AppCompatActivity {
    private boolean isProgressBarVisible;

    /* renamed from: viewBinding$delegate, reason: from kotlin metadata */
    private final Lazy viewBinding = LazyKt.lazy(new Function0<StripeActivityBinding>() { // from class: com.stripe.android.view.StripeActivity$viewBinding$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final StripeActivityBinding invoke() {
            StripeActivityBinding stripeActivityBindingInflate = StripeActivityBinding.inflate(this.this$0.getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue(stripeActivityBindingInflate, "inflate(...)");
            return stripeActivityBindingInflate;
        }
    });

    /* renamed from: progressBar$delegate, reason: from kotlin metadata */
    private final Lazy progressBar = LazyKt.lazy(new Function0<LinearProgressIndicator>() { // from class: com.stripe.android.view.StripeActivity$progressBar$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final LinearProgressIndicator invoke() {
            return this.this$0.getViewBinding().progressBar;
        }
    });

    /* renamed from: viewStub$delegate, reason: from kotlin metadata */
    private final Lazy viewStub = LazyKt.lazy(new Function0<ViewStub>() { // from class: com.stripe.android.view.StripeActivity$viewStub$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ViewStub invoke() {
            ViewStub viewStub = this.this$0.getViewBinding().viewStub;
            Intrinsics.checkNotNullExpressionValue(viewStub, "viewStub");
            return viewStub;
        }
    });

    /* renamed from: alertDisplayer$delegate, reason: from kotlin metadata */
    private final Lazy alertDisplayer = LazyKt.lazy(new Function0<AlertDisplayer.DefaultAlertDisplayer>() { // from class: com.stripe.android.view.StripeActivity$alertDisplayer$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final AlertDisplayer.DefaultAlertDisplayer invoke() {
            return new AlertDisplayer.DefaultAlertDisplayer(this.this$0);
        }
    });

    /* renamed from: stripeColorUtils$delegate, reason: from kotlin metadata */
    private final Lazy stripeColorUtils = LazyKt.lazy(new Function0<StripeColorUtils>() { // from class: com.stripe.android.view.StripeActivity$stripeColorUtils$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final StripeColorUtils invoke() {
            return new StripeColorUtils(this.this$0);
        }
    });

    protected abstract void onActionSave();

    protected void onProgressBarVisibilityChanged(boolean visible) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StripeActivityBinding getViewBinding() {
        return (StripeActivityBinding) this.viewBinding.getValue();
    }

    public final ProgressBar getProgressBar$payments_core_release() {
        Object value = this.progressBar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ProgressBar) value;
    }

    public final ViewStub getViewStub$payments_core_release() {
        return (ViewStub) this.viewStub.getValue();
    }

    protected final void setProgressBarVisible(boolean z) {
        getProgressBar$payments_core_release().setVisibility(z ? 0 : 8);
        invalidateOptionsMenu();
        onProgressBarVisibilityChanged(z);
        this.isProgressBarVisible = z;
    }

    private final AlertDisplayer getAlertDisplayer() {
        return (AlertDisplayer) this.alertDisplayer.getValue();
    }

    private final StripeColorUtils getStripeColorUtils() {
        return (StripeColorUtils) this.stripeColorUtils.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getViewBinding().getRoot());
        setSupportActionBar(getViewBinding().toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        getMenuInflater().inflate(R$menu.stripe_add_payment_method, menu);
        menu.findItem(R$id.action_save).setEnabled(!this.isProgressBarVisible);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == R$id.action_save) {
            onActionSave();
            return true;
        }
        boolean zOnOptionsItemSelected = super.onOptionsItemSelected(item);
        if (!zOnOptionsItemSelected) {
            getOnBackPressedDispatcher().onBackPressed();
        }
        return zOnOptionsItemSelected;
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        MenuItem menuItemFindItem = menu.findItem(R$id.action_save);
        StripeColorUtils stripeColorUtils = getStripeColorUtils();
        Resources.Theme theme = getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
        menuItemFindItem.setIcon(stripeColorUtils.getTintedIconWithAttribute(theme, R$attr.titleTextColor, R$drawable.stripe_ic_checkmark));
        return super.onPrepareOptionsMenu(menu);
    }

    protected final void showError(String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        getAlertDisplayer().show(error);
    }
}
