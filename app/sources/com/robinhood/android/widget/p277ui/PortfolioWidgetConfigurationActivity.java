package com.robinhood.android.widget.p277ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.widget.C31480R;
import com.robinhood.android.widget.databinding.ActivityPortfolioWidgetConfigurationBinding;
import com.robinhood.android.widget.p277ui.PortfolioWidgetConfigurationFragment;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: PortfolioWidgetConfigurationActivity.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u001bH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/widget/ui/PortfolioWidgetConfigurationActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/widget/ui/PortfolioWidgetConfigurationFragment$Callbacks;", "<init>", "()V", "binding", "Lcom/robinhood/android/widget/databinding/ActivityPortfolioWidgetConfigurationBinding;", "getBinding", "()Lcom/robinhood/android/widget/databinding/ActivityPortfolioWidgetConfigurationBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "_appWidgetId", "", "get_appWidgetId", "()Ljava/lang/Integer;", "_appWidgetId$delegate", "Lkotlin/Lazy;", "appWidgetId", "getAppWidgetId", "()I", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "getAuthManager", "()Lcom/robinhood/shared/security/auth/AuthManager;", "setAuthManager", "(Lcom/robinhood/shared/security/auth/AuthManager;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onAddWidget", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class PortfolioWidgetConfigurationActivity extends BaseActivity implements PortfolioWidgetConfigurationFragment.Callbacks {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PortfolioWidgetConfigurationActivity.class, "binding", "getBinding()Lcom/robinhood/android/widget/databinding/ActivityPortfolioWidgetConfigurationBinding;", 0))};

    /* renamed from: _appWidgetId$delegate, reason: from kotlin metadata */
    private final Lazy _appWidgetId;
    public AuthManager authManager;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    public PortfolioWidgetConfigurationActivity() {
        super(C31480R.layout.activity_portfolio_widget_configuration);
        this.binding = ViewBinding5.viewBinding(this, PortfolioWidgetConfigurationActivity2.INSTANCE);
        this._appWidgetId = Activity.intentExtra(this, "appWidgetId");
    }

    private final ActivityPortfolioWidgetConfigurationBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ActivityPortfolioWidgetConfigurationBinding) value;
    }

    private final Integer get_appWidgetId() {
        return (Integer) this._appWidgetId.getValue();
    }

    private final int getAppWidgetId() {
        Integer num = get_appWidgetId();
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final AuthManager getAuthManager() {
        AuthManager authManager = this.authManager;
        if (authManager != null) {
            return authManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("authManager");
        return null;
    }

    public final void setAuthManager(AuthManager authManager) {
        Intrinsics.checkNotNullParameter(authManager, "<set-?>");
        this.authManager = authManager;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(root, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        RdsButton addWidgetBtn = getBinding().addWidgetBtn;
        Intrinsics.checkNotNullExpressionValue(addWidgetBtn, "addWidgetBtn");
        OnClickListeners.onClick(addWidgetBtn, new C314811(this));
        setResult(0, new Intent().putExtra("appWidgetId", getAppWidgetId()));
        if (!getAuthManager().isLoggedIn()) {
            Toast.makeText(this, C31480R.string.widget_portfolio_error_unauthenticated, 0).show();
            finish();
        }
        if (savedInstanceState == null) {
            setFragment(C31480R.id.fragment_container, PortfolioWidgetConfigurationFragment.INSTANCE.newInstance(getAppWidgetId()));
        }
    }

    /* compiled from: PortfolioWidgetConfigurationActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.widget.ui.PortfolioWidgetConfigurationActivity$onCreate$1 */
    /* synthetic */ class C314811 extends FunctionReferenceImpl implements Function0<Unit> {
        C314811(Object obj) {
            super(0, obj, PortfolioWidgetConfigurationActivity.class, "onAddWidget", "onAddWidget()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((PortfolioWidgetConfigurationActivity) this.receiver).onAddWidget();
        }
    }

    @Override // com.robinhood.android.widget.ui.PortfolioWidgetConfigurationFragment.Callbacks
    public void onAddWidget() {
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", getAppWidgetId());
        Unit unit = Unit.INSTANCE;
        setResult(-1, intent);
        finish();
    }
}
