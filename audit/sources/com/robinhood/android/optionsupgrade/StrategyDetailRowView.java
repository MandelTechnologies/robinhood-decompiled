package com.robinhood.android.optionsupgrade;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.airbnb.lottie.FontAssetDelegate;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.brokeragecontent.BrokerageResource2;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.LearnMoresKt;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.font.C16915R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.util.extensions.LottieAnimationViewsKt;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.shared.education.order.OrderTypeEducationFragment;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.extensions.ViewGroups;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: StrategyDetailRowView.kt */
@Metadata(m3635d1 = {"\u0000a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u001d\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+J\b\u0010,\u001a\u00020'H\u0002R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001eR$\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020 @FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/StrategyDetailRowView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "titleTxt", "Landroid/widget/TextView;", "descriptionTxt", "visualizationLottie", "Lcom/airbnb/lottie/LottieAnimationView;", "dayLottieUrl", "Lcom/robinhood/shared/remote/assets/LottieUrl;", "nightLottieUrl", "fontAssetDelegate", "com/robinhood/android/optionsupgrade/StrategyDetailRowView$fontAssetDelegate$1", "Lcom/robinhood/android/optionsupgrade/StrategyDetailRowView$fontAssetDelegate$1;", "value", "", "useNightLottie", "getUseNightLottie", "()Z", "setUseNightLottie", "(Z)V", "bind", "", "resource", "Lcom/robinhood/android/optionsupgrade/StrategyDetailResource;", "locality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "bindLottie", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class StrategyDetailRowView extends Hammer_StrategyDetailRowView {
    public static final int $stable = 8;
    public AnalyticsLogger analytics;
    private LottieUrl dayLottieUrl;
    private final TextView descriptionTxt;
    private final StrategyDetailRowView2 fontAssetDelegate;
    public Navigator navigator;
    private LottieUrl nightLottieUrl;
    private final TextView titleTxt;
    private boolean useNightLottie;
    private final LottieAnimationView visualizationLottie;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v11, types: [com.robinhood.android.optionsupgrade.StrategyDetailRowView$fontAssetDelegate$1] */
    public StrategyDetailRowView(final Context context, AttributeSet attrs) {
        super(context, attrs, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        setOrientation(1);
        ViewGroups.inflate(this, C25121R.layout.merge_strategy_detail_row_view, true);
        View viewFindViewById = findViewById(C25121R.id.strategy_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.titleTxt = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(C25121R.id.strategy_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.descriptionTxt = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(C25121R.id.strategy_visualization_lottie);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.visualizationLottie = (LottieAnimationView) viewFindViewById3;
        this.fontAssetDelegate = new FontAssetDelegate() { // from class: com.robinhood.android.optionsupgrade.StrategyDetailRowView$fontAssetDelegate$1
            @Override // com.airbnb.lottie.FontAssetDelegate
            public Typeface fetchFont(String fontFamily) {
                if (!Intrinsics.areEqual(fontFamily, OrderTypeEducationFragment.FONT_REGULAR)) {
                    Preconditions.INSTANCE.failUnexpectedItemKotlin(fontFamily);
                    throw new ExceptionsH();
                }
                return ContextsUiExtensions.requireFont(context, C16915R.font.capsule_sans_text_book);
            }
        };
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    public final Navigator getNavigator() {
        Navigator navigator = this.navigator;
        if (navigator != null) {
            return navigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void setNavigator(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "<set-?>");
        this.navigator = navigator;
    }

    public final boolean getUseNightLottie() {
        return this.useNightLottie;
    }

    public final void setUseNightLottie(boolean z) {
        if (this.useNightLottie != z) {
            this.useNightLottie = z;
            bindLottie();
        }
    }

    public final void bind(final StrategyDetailResource resource, CountryCode.Supported locality) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(locality, "locality");
        this.titleTxt.setText(resource.getTitleStringRes());
        final LegacyIntentKey.ReferenceManual.NewOptionTypes newOptionTypes = new LegacyIntentKey.ReferenceManual.NewOptionTypes(BrokerageResource2.getContentfulId(resource.getReferenceManualTopic(), locality));
        TextView textView = this.descriptionTxt;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        CharSequence text = resources.getText(resource.getSummaryStringRes());
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        textView.setText(LearnMoresKt.buildTextWithLearnMore$default(resources, text, true, null, false, null, new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.optionsupgrade.StrategyDetailRowView$bind$lambda$1$$inlined$buildTextWithLearnMore$default$1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Navigator navigator = this.this$0.getNavigator();
                Context context = this.this$0.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                Navigator.DefaultImpls.startActivity$default(navigator, context, newOptionTypes, null, false, null, null, 60, null);
                AnalyticsLogger.DefaultImpls.logUserAction$default(this.this$0.getAnalytics(), AnalyticsStrings.USER_ACTION_OPTION_UPGRADE_STRATEGY_LEARN_MORE, resource.name(), null, null, 12, null);
            }
        }, 1, (DefaultConstructorMarker) null), 4, null));
        this.dayLottieUrl = resource.getDayLottieUrl();
        this.nightLottieUrl = resource.getNightLottieUrl();
        bindLottie();
    }

    private final void bindLottie() {
        this.visualizationLottie.setFontAssetDelegate(this.fontAssetDelegate);
        LottieUrl lottieUrl = this.useNightLottie ? this.nightLottieUrl : this.dayLottieUrl;
        if (lottieUrl != null) {
            LottieAnimationViewsKt.setRemoteUrl(this.visualizationLottie, lottieUrl);
        }
    }
}
