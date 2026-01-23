package com.robinhood.android.optionschain.strategybuilder;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.options.contracts.OptionStrategyBuilderNuxIntentKey;
import com.robinhood.utils.extensions.ViewsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionStrategyBuilderNuxActivity.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/optionschain/strategybuilder/OptionStrategyBuilderNuxActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionStrategyBuilderNuxActivity extends BaseActivity {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = BaseActivity.$stable;

    public OptionStrategyBuilderNuxActivity() {
        super(C11048R.layout.activity_fragment_container);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().getDecorView().setSystemUiVisibility(1280);
        super.onCreate(savedInstanceState);
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null) {
            rhToolbar.setUseDesignSystemTheme(true);
        }
        RhToolbar rhToolbar2 = getRhToolbar();
        if (rhToolbar2 != null) {
            rhToolbar2.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.robinhood.android.optionschain.strategybuilder.OptionStrategyBuilderNuxActivity.onCreate.1
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View v, WindowInsets insets) {
                    Intrinsics.checkNotNullParameter(v, "v");
                    Intrinsics.checkNotNullParameter(insets, "insets");
                    ViewsKt.setMarginTop(v, insets.getSystemWindowInsetTop());
                    return insets.consumeSystemWindowInsets();
                }
            });
        }
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, OptionStrategyBuilderNuxFragment.INSTANCE.newInstance(INSTANCE.getExtras((Activity) this)));
        }
    }

    /* compiled from: OptionStrategyBuilderNuxActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionschain/strategybuilder/OptionStrategyBuilderNuxActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/optionschain/strategybuilder/OptionStrategyBuilderNuxActivity;", "Lcom/robinhood/android/options/contracts/OptionStrategyBuilderNuxIntentKey;", "<init>", "()V", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<OptionStrategyBuilderNuxActivity, OptionStrategyBuilderNuxIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public OptionStrategyBuilderNuxIntentKey getExtras(OptionStrategyBuilderNuxActivity optionStrategyBuilderNuxActivity) {
            return (OptionStrategyBuilderNuxIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, optionStrategyBuilderNuxActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, OptionStrategyBuilderNuxIntentKey optionStrategyBuilderNuxIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, optionStrategyBuilderNuxIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, OptionStrategyBuilderNuxIntentKey optionStrategyBuilderNuxIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, optionStrategyBuilderNuxIntentKey);
        }
    }
}
