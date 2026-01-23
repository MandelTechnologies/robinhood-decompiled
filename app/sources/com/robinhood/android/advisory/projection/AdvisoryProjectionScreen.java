package com.robinhood.android.advisory.projection;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotDoubleState2;
import androidx.compose.runtime.SnapshotDoubleState3;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotFloatState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.advisory.contracts.AdvisoryProjectionDisclosureFragmentKey;
import com.robinhood.android.advisory.contracts.SimulateDepositFrequency;
import com.robinhood.android.advisory.projection.AdvisoryProjectionScreen;
import com.robinhood.android.advisory.projection.AdvisoryProjectionViewState;
import com.robinhood.android.advisory.projection.chart.AdvisoryChartColorPalette;
import com.robinhood.android.advisory.projection.chart.AdvisoryProjectionChart;
import com.robinhood.android.advisory.projection.chart.ChartModels;
import com.robinhood.android.advisory.projection.chart.ChartModels3;
import com.robinhood.android.advisory.projection.chart.EndOfYearProjectionValue;
import com.robinhood.android.advisory.projection.frequency.FrequencySelector3;
import com.robinhood.android.advisory.projection.frequency.SimulateDepositFrequency2;
import com.robinhood.android.advisory.projection.slider.AdvisoryAmountSliderKt;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.directdeposit.p101ui.prefilled.partial.EditDepositAmountActivity;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.responsive.WindowSize;
import com.robinhood.android.ticker.TickerTextState;
import com.robinhood.android.ticker.WrappedTickerKt;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.advisory.p304db.projection.ProjectedValues;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.converters.brokerage.BrokerageAccountTypes3;
import com.robinhood.rosetta.eventlogging.BrokerageAccountContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AdvisoryProjectionScreen.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001a/\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u000e\u001ak\u0010\u000f\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00112\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00070\u00192\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\u001c\u001au\u0010\u001d\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00112\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00070\u00192\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010 \u001a/\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010&\u001a'\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00172\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010)\u001a'\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010,\u001a\u001f\u0010-\u001a\u00020\u00072\u0006\u0010(\u001a\u00020#2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010.\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006/²\u0006\n\u00100\u001a\u000201X\u008a\u0084\u0002²\u0006\n\u00102\u001a\u00020\u001bX\u008a\u008e\u0002²\u0006\n\u00103\u001a\u000204X\u008a\u008e\u0002²\u0006\n\u00105\u001a\u000206X\u008a\u008e\u0002²\u0006\n\u0010\"\u001a\u00020#X\u008a\u008e\u0002²\u0006\n\u00107\u001a\u000208X\u008a\u008e\u0002²\u0006\n\u00109\u001a\u00020:X\u008a\u008e\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\u0010\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120;X\u008a\u008e\u0002"}, m3636d2 = {"TagProjectionHeader", "", "TagProjectionChart", "TagProjectionFrequency", "TagProjectionAmountSlider", "TagProjectionCtaButton", "AdvisoryProjectionScreen", "", "onBackClicked", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "projectionDuxo", "Lcom/robinhood/android/advisory/projection/AdvisoryProjectionDuxo;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/advisory/projection/AdvisoryProjectionDuxo;Landroidx/compose/runtime/Composer;II)V", "FrequencyAndAmountSlider", "depositAmountList", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/util/Money;", "frequency", "Lcom/robinhood/android/advisory/contracts/SimulateDepositFrequency;", "currentSupportedFrequency", "isRetirementAccount", "", "onFrequencySelected", "Lkotlin/Function1;", "onAmountChanged", "", "(Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/advisory/contracts/SimulateDepositFrequency;Lkotlinx/collections/immutable/ImmutableList;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ProjectionFooter", "depositCtaData", "Lcom/robinhood/android/advisory/projection/DepositCtaData;", "(Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/advisory/contracts/SimulateDepositFrequency;Lkotlinx/collections/immutable/ImmutableList;ZLcom/robinhood/android/advisory/projection/DepositCtaData;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ProjectionHeader", "headerTexts", "Lcom/robinhood/android/advisory/projection/HeaderContent;", "isLoading", "accountNumber", "(Lcom/robinhood/android/advisory/projection/HeaderContent;ZLjava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LikelyPortfolioValue", "content", "(Lcom/robinhood/android/advisory/projection/HeaderContent;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ProjectionHeaderTopValues", "text", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ProjectionChartCursorData", "(Lcom/robinhood/android/advisory/projection/HeaderContent;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-projected-returns_externalDebug", "viewState", "Lcom/robinhood/android/advisory/projection/AdvisoryProjectionViewState;", EditDepositAmountActivity.EXTRA_DEPOSIT_AMOUNT, "currentPortfolioValue", "Ljava/math/BigDecimal;", "currency", "Ljava/util/Currency;", "alphaValue", "", "projectedValues", "Lcom/robinhood/models/advisory/db/projection/ProjectedValues;", "Lkotlinx/collections/immutable/PersistentList;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.projection.AdvisoryProjectionScreenKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AdvisoryProjectionScreen {
    public static final String TagProjectionAmountSlider = "advisory-projection-amount-slider";
    public static final String TagProjectionChart = "advisory-projection-chart";
    public static final String TagProjectionCtaButton = "advisory-projection-cta-button";
    public static final String TagProjectionFrequency = "advisory-projection-frequency";
    public static final String TagProjectionHeader = "advisory-projection-header";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvisoryProjectionScreen$lambda$26(Function0 function0, Modifier modifier, AdvisoryProjectionDuxo advisoryProjectionDuxo, int i, int i2, Composer composer, int i3) {
        AdvisoryProjectionScreen(function0, modifier, advisoryProjectionDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FrequencyAndAmountSlider$lambda$32(ImmutableList immutableList, SimulateDepositFrequency simulateDepositFrequency, ImmutableList immutableList2, boolean z, Function1 function1, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FrequencyAndAmountSlider(immutableList, simulateDepositFrequency, immutableList2, z, function1, function12, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LikelyPortfolioValue$lambda$41(HeaderContent headerContent, boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LikelyPortfolioValue(headerContent, z, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProjectionChartCursorData$lambda$54(HeaderContent headerContent, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ProjectionChartCursorData(headerContent, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProjectionFooter$lambda$35(ImmutableList immutableList, SimulateDepositFrequency simulateDepositFrequency, ImmutableList immutableList2, boolean z, DepositCtaData depositCta, Function1 function1, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ProjectionFooter(immutableList, simulateDepositFrequency, immutableList2, z, depositCta, function1, function12, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProjectionHeader$lambda$38(HeaderContent headerContent, boolean z, String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ProjectionHeader(headerContent, z, str, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProjectionHeaderTopValues$lambda$46(String str, String str2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ProjectionHeaderTopValues(str, str2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float AdvisoryProjectionScreen$lambda$14(SnapshotFloatState2 snapshotFloatState2) {
        return snapshotFloatState2.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double AdvisoryProjectionScreen$lambda$2(SnapshotDoubleState2 snapshotDoubleState2) {
        return snapshotDoubleState2.getDoubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdvisoryProjectionViewState AdvisoryProjectionScreen$lambda$0(SnapshotState4<? extends AdvisoryProjectionViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HeaderContent AdvisoryProjectionScreen$lambda$11(SnapshotState<HeaderContent> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProjectedValues AdvisoryProjectionScreen$lambda$17(SnapshotState<ProjectedValues> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimulateDepositFrequency AdvisoryProjectionScreen$lambda$20(SnapshotState<SimulateDepositFrequency> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImmutableList3<Money> AdvisoryProjectionScreen$lambda$23(SnapshotState<ImmutableList3<Money>> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BigDecimal AdvisoryProjectionScreen$lambda$5(SnapshotState<BigDecimal> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Currency AdvisoryProjectionScreen$lambda$8(SnapshotState<Currency> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0443  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AdvisoryProjectionScreen(final Function0<Unit> onBackClicked, Modifier modifier, AdvisoryProjectionDuxo advisoryProjectionDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        AdvisoryProjectionDuxo advisoryProjectionDuxo2;
        int i4;
        Modifier modifier3;
        AdvisoryProjectionDuxo advisoryProjectionDuxo3;
        SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        AdvisoryProjectionViewState advisoryProjectionViewStateAdvisoryProjectionScreen$lambda$0;
        UserInteractionEventDescriptor userInteractionEventDescriptor;
        Object objRememberedValue;
        Composer.Companion companion;
        SnapshotDoubleState2 snapshotDoubleState2;
        Object objRememberedValue2;
        final SnapshotState snapshotState;
        Object objRememberedValue3;
        final SnapshotState snapshotState2;
        Object objRememberedValue4;
        final SnapshotState snapshotState3;
        Object objRememberedValue5;
        final SnapshotFloatState2 snapshotFloatState2;
        Object objRememberedValue6;
        final SnapshotState snapshotState4;
        Object objRememberedValue7;
        final SnapshotState snapshotState5;
        Object objRememberedValue8;
        final SnapshotState snapshotState6;
        boolean zChanged;
        Object objRememberedValue9;
        SnapshotState4 snapshotState42;
        SnapshotDoubleState2 snapshotDoubleState22;
        Composer composer2;
        final Modifier modifier4;
        final AdvisoryProjectionDuxo advisoryProjectionDuxo4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1300942719);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onBackClicked) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    advisoryProjectionDuxo2 = advisoryProjectionDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(advisoryProjectionDuxo2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    advisoryProjectionDuxo2 = advisoryProjectionDuxo;
                }
                i3 |= i6;
            } else {
                advisoryProjectionDuxo2 = advisoryProjectionDuxo;
            }
            i4 = i3;
            if ((i4 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(AdvisoryProjectionDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue10 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.advisory.projection.AdvisoryProjectionScreenKt$AdvisoryProjectionScreen$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.advisory.projection.AdvisoryProjectionScreenKt$AdvisoryProjectionScreen$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue10, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        i4 &= -897;
                        advisoryProjectionDuxo3 = (AdvisoryProjectionDuxo) baseDuxo;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1300942719, i4, -1, "com.robinhood.android.advisory.projection.AdvisoryProjectionScreen (AdvisoryProjectionScreen.kt:96)");
                    }
                    snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(advisoryProjectionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    advisoryProjectionViewStateAdvisoryProjectionScreen$lambda$0 = AdvisoryProjectionScreen$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                    if (advisoryProjectionViewStateAdvisoryProjectionScreen$lambda$0 instanceof AdvisoryProjectionViewState.Loading) {
                        userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, null, null, null, null, null, 63, null);
                    } else {
                        if (!(advisoryProjectionViewStateAdvisoryProjectionScreen$lambda$0 instanceof AdvisoryProjectionViewState.Loaded)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        String str = null;
                        String str2 = null;
                        Object[] objArr = null == true ? 1 : 0;
                        userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, new Screen(Screen.Name.ADVISORY_FUTURE_RETURNS, null, null, null, 14, null), null, new Context(0, 0, 0, null == true ? 1 : 0, str, null, null, null == true ? 1 : 0, 0, str2, null == true ? 1 : 0, null, objArr, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new BrokerageAccountContext(BrokerageAccountTypes3.toProtobuf(((AdvisoryProjectionViewState.Loaded) advisoryProjectionViewStateAdvisoryProjectionScreen$lambda$0).getProjectionAccountInfo().getBrokerageAccountType()), null, null, str, false, false, null, null, str2, null, 1022, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -257, -1, -1, 16383, null), null, null, 53, null);
                    }
                    UserInteractionEventDescriptor userInteractionEventDescriptorUpdateWith = UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor2, userInteractionEventDescriptor);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotDoubleState3.mutableDoubleStateOf(0.0d);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    snapshotDoubleState2 = (SnapshotDoubleState2) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotState3.mutableStateOf$default(new BigDecimal(0), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    snapshotState = (SnapshotState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = SnapshotState3.mutableStateOf$default(Currencies.USD, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    snapshotState2 = (SnapshotState) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = SnapshotState3.mutableStateOf$default(new HeaderContent(null, 0, null, null, Money.format$default(new Money(Currencies.USD, AdvisoryProjectionScreen$lambda$5(snapshotState)), null, false, null, false, 0, 0, false, null, false, false, 991, null), 0, 47, null), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    snapshotState3 = (SnapshotState) objRememberedValue4;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = SnapshotFloatState3.mutableFloatStateOf(0.0f);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue5;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == companion.getEmpty()) {
                        objRememberedValue6 = SnapshotState3.mutableStateOf$default(ChartModels.generateEmptyData(), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    snapshotState4 = (SnapshotState) objRememberedValue6;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = SnapshotState3.mutableStateOf$default(AdvisoryProjectionScreen$lambda$0(snapshotState4CollectAsStateWithLifecycle).getDefaultFrequency(), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    snapshotState5 = (SnapshotState) objRememberedValue7;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue8 == companion.getEmpty()) {
                        objRememberedValue8 = SnapshotState3.mutableStateOf$default(extensions2.persistentListOf(new Money(Currencies.USD, new BigDecimal(0))), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    snapshotState6 = (SnapshotState) objRememberedValue8;
                    composerStartRestartGroup.endReplaceGroup();
                    AdvisoryProjectionViewState advisoryProjectionViewStateAdvisoryProjectionScreen$lambda$02 = AdvisoryProjectionScreen$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                    SimulateDepositFrequency simulateDepositFrequencyAdvisoryProjectionScreen$lambda$20 = AdvisoryProjectionScreen$lambda$20(snapshotState5);
                    Double dValueOf = Double.valueOf(snapshotDoubleState2.getDoubleValue());
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChanged = composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle);
                    objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue9 == companion.getEmpty()) {
                        snapshotState42 = snapshotState4CollectAsStateWithLifecycle;
                        snapshotDoubleState22 = snapshotDoubleState2;
                        objRememberedValue9 = new AdvisoryProjectionScreen2(snapshotState42, snapshotState3, snapshotFloatState2, snapshotState5, snapshotState6, snapshotState, snapshotState2, snapshotDoubleState22, snapshotState4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    } else {
                        snapshotState42 = snapshotState4CollectAsStateWithLifecycle;
                        snapshotDoubleState22 = snapshotDoubleState2;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(advisoryProjectionViewStateAdvisoryProjectionScreen$lambda$02, simulateDepositFrequencyAdvisoryProjectionScreen$lambda$20, dValueOf, (Function2) objRememberedValue9, composerStartRestartGroup, 0);
                    composer2 = composerStartRestartGroup;
                    final Modifier modifier5 = modifier3;
                    final SnapshotState4 snapshotState43 = snapshotState42;
                    final SnapshotDoubleState2 snapshotDoubleState23 = snapshotDoubleState22;
                    AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptorUpdateWith, ComposableLambda3.rememberComposableLambda(654241332, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.projection.AdvisoryProjectionScreenKt.AdvisoryProjectionScreen.2

                        /* compiled from: AdvisoryProjectionScreen.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.advisory.projection.AdvisoryProjectionScreenKt$AdvisoryProjectionScreen$2$2, reason: invalid class name */
                        static final class AnonymousClass2 implements Function3<PaddingValues, Composer, Integer, Unit> {
                            final /* synthetic */ SnapshotFloatState2 $alphaValue$delegate;
                            final /* synthetic */ SnapshotState<Currency> $currency$delegate;
                            final /* synthetic */ SnapshotState<BigDecimal> $currentPortfolioValue$delegate;
                            final /* synthetic */ SnapshotDoubleState2 $depositAmount$delegate;
                            final /* synthetic */ SnapshotState<ImmutableList3<Money>> $depositAmountList$delegate;
                            final /* synthetic */ SnapshotState<SimulateDepositFrequency> $frequency$delegate;
                            final /* synthetic */ SnapshotState<HeaderContent> $headerTexts$delegate;
                            final /* synthetic */ SnapshotState<ProjectedValues> $projectedValues$delegate;
                            final /* synthetic */ SnapshotState4<AdvisoryProjectionViewState> $viewState$delegate;

                            /* JADX WARN: Multi-variable type inference failed */
                            AnonymousClass2(SnapshotState4<? extends AdvisoryProjectionViewState> snapshotState4, SnapshotState<HeaderContent> snapshotState, SnapshotState<ProjectedValues> snapshotState2, SnapshotState<BigDecimal> snapshotState3, SnapshotDoubleState2 snapshotDoubleState2, SnapshotState<SimulateDepositFrequency> snapshotState5, SnapshotState<Currency> snapshotState6, SnapshotState<ImmutableList3<Money>> snapshotState7, SnapshotFloatState2 snapshotFloatState2) {
                                this.$viewState$delegate = snapshotState4;
                                this.$headerTexts$delegate = snapshotState;
                                this.$projectedValues$delegate = snapshotState2;
                                this.$currentPortfolioValue$delegate = snapshotState3;
                                this.$depositAmount$delegate = snapshotDoubleState2;
                                this.$frequency$delegate = snapshotState5;
                                this.$currency$delegate = snapshotState6;
                                this.$depositAmountList$delegate = snapshotState7;
                                this.$alphaValue$delegate = snapshotFloatState2;
                            }

                            public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                                int i2;
                                String accountNumber;
                                ImmutableList3<SimulateDepositFrequency> immutableList3PersistentListOf;
                                ProjectionAccountInfo projectionAccountInfo;
                                Integer userEndOfYearAge;
                                ProjectionAccountInfo projectionAccountInfo2;
                                ProjectionAccountInfo projectionAccountInfo3;
                                BrokerageAccountType brokerageAccountType;
                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                if ((i & 6) == 0) {
                                    i2 = i | (composer.changed(paddingValues) ? 4 : 2);
                                } else {
                                    i2 = i;
                                }
                                if ((i2 & 19) == 18 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(207563459, i2, -1, "com.robinhood.android.advisory.projection.AdvisoryProjectionScreen.<anonymous>.<anonymous> (AdvisoryProjectionScreen.kt:211)");
                                }
                                AdvisoryProjectionViewState advisoryProjectionViewStateAdvisoryProjectionScreen$lambda$0 = AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$0(this.$viewState$delegate);
                                AdvisoryProjectionViewState.Loaded loaded = advisoryProjectionViewStateAdvisoryProjectionScreen$lambda$0 instanceof AdvisoryProjectionViewState.Loaded ? (AdvisoryProjectionViewState.Loaded) advisoryProjectionViewStateAdvisoryProjectionScreen$lambda$0 : null;
                                boolean z = (loaded == null || (projectionAccountInfo3 = loaded.getProjectionAccountInfo()) == null || (brokerageAccountType = projectionAccountInfo3.getBrokerageAccountType()) == null || !brokerageAccountType.isRetirement()) ? false : true;
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), paddingValues);
                                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                final SnapshotState<HeaderContent> snapshotState = this.$headerTexts$delegate;
                                SnapshotState4<AdvisoryProjectionViewState> snapshotState4 = this.$viewState$delegate;
                                SnapshotState<ProjectedValues> snapshotState2 = this.$projectedValues$delegate;
                                SnapshotState<BigDecimal> snapshotState3 = this.$currentPortfolioValue$delegate;
                                final SnapshotDoubleState2 snapshotDoubleState2 = this.$depositAmount$delegate;
                                final SnapshotState<SimulateDepositFrequency> snapshotState5 = this.$frequency$delegate;
                                final SnapshotState<Currency> snapshotState6 = this.$currency$delegate;
                                SnapshotState<ImmutableList3<Money>> snapshotState7 = this.$depositAmountList$delegate;
                                SnapshotFloatState2 snapshotFloatState2 = this.$alphaValue$delegate;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, Alignment.INSTANCE.getStart(), composer, 6);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPadding);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                if (composer.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer.startReusableNode();
                                if (composer.getInserting()) {
                                    composer.createNode(constructor);
                                } else {
                                    composer.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                HeaderContent headerContentAdvisoryProjectionScreen$lambda$11 = AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$11(snapshotState);
                                boolean z2 = AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$0(snapshotState4) instanceof AdvisoryProjectionViewState.Loading;
                                if (loaded == null || (projectionAccountInfo2 = loaded.getProjectionAccountInfo()) == null || (accountNumber = projectionAccountInfo2.getAccountNumber()) == null) {
                                    accountNumber = "";
                                }
                                AdvisoryProjectionScreen.ProjectionHeader(headerContentAdvisoryProjectionScreen$lambda$11, z2, accountNumber, null, composer, 0, 8);
                                Modifier modifierTestTag = TestTag3.testTag(Column5.weight$default(column6, PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null), 1.0f, false, 2, null), AdvisoryProjectionScreen.TagProjectionChart);
                                ProjectedValues projectedValuesAdvisoryProjectionScreen$lambda$17 = AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$17(snapshotState2);
                                int size = AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$17(snapshotState2).getMedians().size();
                                BigDecimal bigDecimalAdvisoryProjectionScreen$lambda$5 = AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$5(snapshotState3);
                                double dAdvisoryProjectionScreen$lambda$2 = AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$2(snapshotDoubleState2);
                                SimulateDepositFrequency simulateDepositFrequencyAdvisoryProjectionScreen$lambda$20 = AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$20(snapshotState5);
                                boolean z3 = !SimulateDepositFrequency2.isRecurring(AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$20(snapshotState5)) && (AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$0(snapshotState4) instanceof AdvisoryProjectionViewState.Loaded);
                                int currentYear = loaded != null ? loaded.getCurrentYear() : 0;
                                int initialSelectedYearIndex = (loaded != null ? loaded.getInitialSelectedYearIndex() : 0) + 1;
                                Currency currencyAdvisoryProjectionScreen$lambda$8 = AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$8(snapshotState6);
                                boolean z4 = AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$0(snapshotState4) instanceof AdvisoryProjectionViewState.Loading;
                                ChartModels3 chartModels3 = (!z || loaded.getProjectionAccountInfo().getUserEndOfYearAge() == null) ? ChartModels3.YEAR : ChartModels3.AGE;
                                int iIntValue = (loaded == null || (projectionAccountInfo = loaded.getProjectionAccountInfo()) == null || (userEndOfYearAge = projectionAccountInfo.getUserEndOfYearAge()) == null) ? 0 : userEndOfYearAge.intValue();
                                composer.startReplaceGroup(-1633490746);
                                Object objRememberedValue = composer.rememberedValue();
                                Composer.Companion companion3 = Composer.INSTANCE;
                                if (objRememberedValue == companion3.getEmpty()) {
                                    objRememberedValue = new Function2() { // from class: com.robinhood.android.advisory.projection.AdvisoryProjectionScreenKt$AdvisoryProjectionScreen$2$2$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return AdvisoryProjectionScreen.C92602.AnonymousClass2.invoke$lambda$6$lambda$1$lambda$0(snapshotState, snapshotState6, ((Integer) obj).intValue(), (EndOfYearProjectionValue) obj2);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                AdvisoryProjectionChart.AdvisoryProjectionChart(projectedValuesAdvisoryProjectionScreen$lambda$17, bigDecimalAdvisoryProjectionScreen$lambda$5, dAdvisoryProjectionScreen$lambda$2, simulateDepositFrequencyAdvisoryProjectionScreen$lambda$20, currencyAdvisoryProjectionScreen$lambda$8, z3, currentYear, (Function2) objRememberedValue, modifierTestTag, size, z4, initialSelectedYearIndex, chartModels3, iIntValue, composer, 12582912, 0, 0);
                                ImmutableList3 immutableList3AdvisoryProjectionScreen$lambda$23 = AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$23(snapshotState7);
                                SimulateDepositFrequency simulateDepositFrequencyAdvisoryProjectionScreen$lambda$202 = AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$20(snapshotState5);
                                if (loaded == null || (immutableList3PersistentListOf = loaded.getSupportedFrequencies()) == null) {
                                    immutableList3PersistentListOf = extensions2.persistentListOf();
                                }
                                DepositCtaData depositCtaData = loaded != null ? loaded.getDepositCtaData() : null;
                                Modifier modifierAlpha = Alpha.alpha(companion, AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$14(snapshotFloatState2));
                                composer.startReplaceGroup(5004770);
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (objRememberedValue2 == companion3.getEmpty()) {
                                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.advisory.projection.AdvisoryProjectionScreenKt$AdvisoryProjectionScreen$2$2$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return AdvisoryProjectionScreen.C92602.AnonymousClass2.invoke$lambda$6$lambda$3$lambda$2(snapshotState5, (SimulateDepositFrequency) obj);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                Function1 function1 = (Function1) objRememberedValue2;
                                composer.endReplaceGroup();
                                composer.startReplaceGroup(5004770);
                                Object objRememberedValue3 = composer.rememberedValue();
                                if (objRememberedValue3 == companion3.getEmpty()) {
                                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.advisory.projection.AdvisoryProjectionScreenKt$AdvisoryProjectionScreen$2$2$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return AdvisoryProjectionScreen.C92602.AnonymousClass2.invoke$lambda$6$lambda$5$lambda$4(snapshotDoubleState2, ((Double) obj).doubleValue());
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue3);
                                }
                                composer.endReplaceGroup();
                                AdvisoryProjectionScreen.ProjectionFooter(immutableList3AdvisoryProjectionScreen$lambda$23, simulateDepositFrequencyAdvisoryProjectionScreen$lambda$202, immutableList3PersistentListOf, z, depositCtaData, function1, (Function1) objRememberedValue3, modifierAlpha, composer, 1769472, 0);
                                composer.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                                invoke(paddingValues, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$6$lambda$1$lambda$0(SnapshotState snapshotState, SnapshotState snapshotState2, int i, EndOfYearProjectionValue projectionChartValue) {
                                Intrinsics.checkNotNullParameter(projectionChartValue, "projectionChartValue");
                                AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$12(snapshotState, HeaderContent.copy$default(AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$11(snapshotState), Money.format$default(new Money(Currencies.USD, new BigDecimal(String.valueOf(projectionChartValue.getMedian()))), null, false, null, false, 0, 0, false, null, false, false, 991, null), i, Money.formatCompact$default(new Money(AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$8(snapshotState2), new BigDecimal(String.valueOf(projectionChartValue.getPercentile5()))), null, null, 0, 3, null), Money.formatCompact$default(new Money(AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$8(snapshotState2), new BigDecimal(String.valueOf(projectionChartValue.getPercentile95()))), null, null, 0, 3, null), null, 0, 48, null));
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$6$lambda$3$lambda$2(SnapshotState snapshotState, SimulateDepositFrequency newFrequency) {
                                Intrinsics.checkNotNullParameter(newFrequency, "newFrequency");
                                AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$21(snapshotState, newFrequency);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$6$lambda$5$lambda$4(SnapshotDoubleState2 snapshotDoubleState2, double d) {
                                AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$3(snapshotDoubleState2, d);
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i7) {
                            if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(654241332, i7, -1, "com.robinhood.android.advisory.projection.AdvisoryProjectionScreen.<anonymous> (AdvisoryProjectionScreen.kt:196)");
                            }
                            Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(modifier5, null, 1, null);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i8 = BentoTheme.$stable;
                            long jM21371getBg0d7_KjU = bentoTheme.getColors(composer3, i8).m21371getBg0d7_KjU();
                            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i8).m21425getFg0d7_KjU();
                            final Function0<Unit> function0 = onBackClicked;
                            ScaffoldKt.m5939ScaffoldTvnljyQ(modifierLogScreenTransitions$default, ComposableLambda3.rememberComposableLambda(1494359800, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.projection.AdvisoryProjectionScreenKt.AdvisoryProjectionScreen.2.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i9) {
                                    if ((i9 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1494359800, i9, -1, "com.robinhood.android.advisory.projection.AdvisoryProjectionScreen.<anonymous>.<anonymous> (AdvisoryProjectionScreen.kt:201)");
                                    }
                                    Function2<Composer, Integer, Unit> function2M11193getLambda$896990363$feature_projected_returns_externalDebug = AdvisoryProjectionScreen3.INSTANCE.m11193getLambda$896990363$feature_projected_returns_externalDebug();
                                    final Function0<Unit> function02 = function0;
                                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M11193getLambda$896990363$feature_projected_returns_externalDebug, null, ComposableLambda3.rememberComposableLambda(1799062713, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.projection.AdvisoryProjectionScreenKt.AdvisoryProjectionScreen.2.1.1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer5, Integer num) {
                                            invoke(bentoAppBarScope, composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer5, int i10) {
                                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                            if ((i10 & 6) == 0) {
                                                i10 |= (i10 & 8) == 0 ? composer5.changed(BentoAppBar) : composer5.changedInstance(BentoAppBar) ? 4 : 2;
                                            }
                                            if ((i10 & 19) == 18 && composer5.getSkipping()) {
                                                composer5.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1799062713, i10, -1, "com.robinhood.android.advisory.projection.AdvisoryProjectionScreen.<anonymous>.<anonymous>.<anonymous> (AdvisoryProjectionScreen.kt:204)");
                                            }
                                            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function02, composer5, (BentoAppBarScope.$stable << 12) | ((i10 << 12) & 57344), 7);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer4, 54), null, null, false, false, null, null, 0L, null, composer4, 390, 0, 2042);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), null, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(207563459, true, new AnonymousClass2(snapshotState43, snapshotState3, snapshotState4, snapshotState, snapshotDoubleState23, snapshotState5, snapshotState2, snapshotState6, snapshotFloatState2), composer3, 54), composer3, 805306416, 316);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier5;
                    advisoryProjectionDuxo4 = advisoryProjectionDuxo3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i4 &= -897;
                    }
                    modifier3 = modifier2;
                }
                advisoryProjectionDuxo3 = advisoryProjectionDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(advisoryProjectionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                UserInteractionEventDescriptor userInteractionEventDescriptor22 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                advisoryProjectionViewStateAdvisoryProjectionScreen$lambda$0 = AdvisoryProjectionScreen$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                if (advisoryProjectionViewStateAdvisoryProjectionScreen$lambda$0 instanceof AdvisoryProjectionViewState.Loading) {
                }
                UserInteractionEventDescriptor userInteractionEventDescriptorUpdateWith2 = UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor22, userInteractionEventDescriptor);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                snapshotDoubleState2 = (SnapshotDoubleState2) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                snapshotState = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                }
                snapshotState2 = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                }
                snapshotState3 = (SnapshotState) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                }
                snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                }
                snapshotState4 = (SnapshotState) objRememberedValue6;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                }
                snapshotState5 = (SnapshotState) objRememberedValue7;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == companion.getEmpty()) {
                }
                snapshotState6 = (SnapshotState) objRememberedValue8;
                composerStartRestartGroup.endReplaceGroup();
                AdvisoryProjectionViewState advisoryProjectionViewStateAdvisoryProjectionScreen$lambda$022 = AdvisoryProjectionScreen$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                SimulateDepositFrequency simulateDepositFrequencyAdvisoryProjectionScreen$lambda$202 = AdvisoryProjectionScreen$lambda$20(snapshotState5);
                Double dValueOf2 = Double.valueOf(snapshotDoubleState2.getDoubleValue());
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChanged = composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle);
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    snapshotState42 = snapshotState4CollectAsStateWithLifecycle;
                    snapshotDoubleState22 = snapshotDoubleState2;
                    objRememberedValue9 = new AdvisoryProjectionScreen2(snapshotState42, snapshotState3, snapshotFloatState2, snapshotState5, snapshotState6, snapshotState, snapshotState2, snapshotDoubleState22, snapshotState4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(advisoryProjectionViewStateAdvisoryProjectionScreen$lambda$022, simulateDepositFrequencyAdvisoryProjectionScreen$lambda$202, dValueOf2, (Function2) objRememberedValue9, composerStartRestartGroup, 0);
                    composer2 = composerStartRestartGroup;
                    final Modifier modifier52 = modifier3;
                    final SnapshotState4<? extends AdvisoryProjectionViewState> snapshotState432 = snapshotState42;
                    final SnapshotDoubleState2 snapshotDoubleState232 = snapshotDoubleState22;
                    AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptorUpdateWith2, ComposableLambda3.rememberComposableLambda(654241332, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.projection.AdvisoryProjectionScreenKt.AdvisoryProjectionScreen.2

                        /* compiled from: AdvisoryProjectionScreen.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.advisory.projection.AdvisoryProjectionScreenKt$AdvisoryProjectionScreen$2$2, reason: invalid class name */
                        static final class AnonymousClass2 implements Function3<PaddingValues, Composer, Integer, Unit> {
                            final /* synthetic */ SnapshotFloatState2 $alphaValue$delegate;
                            final /* synthetic */ SnapshotState<Currency> $currency$delegate;
                            final /* synthetic */ SnapshotState<BigDecimal> $currentPortfolioValue$delegate;
                            final /* synthetic */ SnapshotDoubleState2 $depositAmount$delegate;
                            final /* synthetic */ SnapshotState<ImmutableList3<Money>> $depositAmountList$delegate;
                            final /* synthetic */ SnapshotState<SimulateDepositFrequency> $frequency$delegate;
                            final /* synthetic */ SnapshotState<HeaderContent> $headerTexts$delegate;
                            final /* synthetic */ SnapshotState<ProjectedValues> $projectedValues$delegate;
                            final /* synthetic */ SnapshotState4<AdvisoryProjectionViewState> $viewState$delegate;

                            /* JADX WARN: Multi-variable type inference failed */
                            AnonymousClass2(SnapshotState4<? extends AdvisoryProjectionViewState> snapshotState4, SnapshotState<HeaderContent> snapshotState, SnapshotState<ProjectedValues> snapshotState2, SnapshotState<BigDecimal> snapshotState3, SnapshotDoubleState2 snapshotDoubleState2, SnapshotState<SimulateDepositFrequency> snapshotState5, SnapshotState<Currency> snapshotState6, SnapshotState<ImmutableList3<Money>> snapshotState7, SnapshotFloatState2 snapshotFloatState2) {
                                this.$viewState$delegate = snapshotState4;
                                this.$headerTexts$delegate = snapshotState;
                                this.$projectedValues$delegate = snapshotState2;
                                this.$currentPortfolioValue$delegate = snapshotState3;
                                this.$depositAmount$delegate = snapshotDoubleState2;
                                this.$frequency$delegate = snapshotState5;
                                this.$currency$delegate = snapshotState6;
                                this.$depositAmountList$delegate = snapshotState7;
                                this.$alphaValue$delegate = snapshotFloatState2;
                            }

                            public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                                int i2;
                                String accountNumber;
                                ImmutableList3<SimulateDepositFrequency> immutableList3PersistentListOf;
                                ProjectionAccountInfo projectionAccountInfo;
                                Integer userEndOfYearAge;
                                ProjectionAccountInfo projectionAccountInfo2;
                                ProjectionAccountInfo projectionAccountInfo3;
                                BrokerageAccountType brokerageAccountType;
                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                if ((i & 6) == 0) {
                                    i2 = i | (composer.changed(paddingValues) ? 4 : 2);
                                } else {
                                    i2 = i;
                                }
                                if ((i2 & 19) == 18 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(207563459, i2, -1, "com.robinhood.android.advisory.projection.AdvisoryProjectionScreen.<anonymous>.<anonymous> (AdvisoryProjectionScreen.kt:211)");
                                }
                                AdvisoryProjectionViewState advisoryProjectionViewStateAdvisoryProjectionScreen$lambda$0 = AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$0(this.$viewState$delegate);
                                AdvisoryProjectionViewState.Loaded loaded = advisoryProjectionViewStateAdvisoryProjectionScreen$lambda$0 instanceof AdvisoryProjectionViewState.Loaded ? (AdvisoryProjectionViewState.Loaded) advisoryProjectionViewStateAdvisoryProjectionScreen$lambda$0 : null;
                                boolean z = (loaded == null || (projectionAccountInfo3 = loaded.getProjectionAccountInfo()) == null || (brokerageAccountType = projectionAccountInfo3.getBrokerageAccountType()) == null || !brokerageAccountType.isRetirement()) ? false : true;
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), paddingValues);
                                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                final SnapshotState snapshotState = this.$headerTexts$delegate;
                                SnapshotState4<AdvisoryProjectionViewState> snapshotState4 = this.$viewState$delegate;
                                SnapshotState<ProjectedValues> snapshotState2 = this.$projectedValues$delegate;
                                SnapshotState<BigDecimal> snapshotState3 = this.$currentPortfolioValue$delegate;
                                final SnapshotDoubleState2 snapshotDoubleState2 = this.$depositAmount$delegate;
                                final SnapshotState snapshotState5 = this.$frequency$delegate;
                                final SnapshotState snapshotState6 = this.$currency$delegate;
                                SnapshotState<ImmutableList3<Money>> snapshotState7 = this.$depositAmountList$delegate;
                                SnapshotFloatState2 snapshotFloatState2 = this.$alphaValue$delegate;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, Alignment.INSTANCE.getStart(), composer, 6);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPadding);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                if (composer.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer.startReusableNode();
                                if (composer.getInserting()) {
                                    composer.createNode(constructor);
                                } else {
                                    composer.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                HeaderContent headerContentAdvisoryProjectionScreen$lambda$11 = AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$11(snapshotState);
                                boolean z2 = AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$0(snapshotState4) instanceof AdvisoryProjectionViewState.Loading;
                                if (loaded == null || (projectionAccountInfo2 = loaded.getProjectionAccountInfo()) == null || (accountNumber = projectionAccountInfo2.getAccountNumber()) == null) {
                                    accountNumber = "";
                                }
                                AdvisoryProjectionScreen.ProjectionHeader(headerContentAdvisoryProjectionScreen$lambda$11, z2, accountNumber, null, composer, 0, 8);
                                Modifier modifierTestTag = TestTag3.testTag(Column5.weight$default(column6, PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null), 1.0f, false, 2, null), AdvisoryProjectionScreen.TagProjectionChart);
                                ProjectedValues projectedValuesAdvisoryProjectionScreen$lambda$17 = AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$17(snapshotState2);
                                int size = AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$17(snapshotState2).getMedians().size();
                                BigDecimal bigDecimalAdvisoryProjectionScreen$lambda$5 = AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$5(snapshotState3);
                                double dAdvisoryProjectionScreen$lambda$2 = AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$2(snapshotDoubleState2);
                                SimulateDepositFrequency simulateDepositFrequencyAdvisoryProjectionScreen$lambda$20 = AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$20(snapshotState5);
                                boolean z3 = !SimulateDepositFrequency2.isRecurring(AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$20(snapshotState5)) && (AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$0(snapshotState4) instanceof AdvisoryProjectionViewState.Loaded);
                                int currentYear = loaded != null ? loaded.getCurrentYear() : 0;
                                int initialSelectedYearIndex = (loaded != null ? loaded.getInitialSelectedYearIndex() : 0) + 1;
                                Currency currencyAdvisoryProjectionScreen$lambda$8 = AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$8(snapshotState6);
                                boolean z4 = AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$0(snapshotState4) instanceof AdvisoryProjectionViewState.Loading;
                                ChartModels3 chartModels3 = (!z || loaded.getProjectionAccountInfo().getUserEndOfYearAge() == null) ? ChartModels3.YEAR : ChartModels3.AGE;
                                int iIntValue = (loaded == null || (projectionAccountInfo = loaded.getProjectionAccountInfo()) == null || (userEndOfYearAge = projectionAccountInfo.getUserEndOfYearAge()) == null) ? 0 : userEndOfYearAge.intValue();
                                composer.startReplaceGroup(-1633490746);
                                Object objRememberedValue = composer.rememberedValue();
                                Composer.Companion companion3 = Composer.INSTANCE;
                                if (objRememberedValue == companion3.getEmpty()) {
                                    objRememberedValue = new Function2() { // from class: com.robinhood.android.advisory.projection.AdvisoryProjectionScreenKt$AdvisoryProjectionScreen$2$2$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return AdvisoryProjectionScreen.C92602.AnonymousClass2.invoke$lambda$6$lambda$1$lambda$0(snapshotState, snapshotState6, ((Integer) obj).intValue(), (EndOfYearProjectionValue) obj2);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                AdvisoryProjectionChart.AdvisoryProjectionChart(projectedValuesAdvisoryProjectionScreen$lambda$17, bigDecimalAdvisoryProjectionScreen$lambda$5, dAdvisoryProjectionScreen$lambda$2, simulateDepositFrequencyAdvisoryProjectionScreen$lambda$20, currencyAdvisoryProjectionScreen$lambda$8, z3, currentYear, (Function2) objRememberedValue, modifierTestTag, size, z4, initialSelectedYearIndex, chartModels3, iIntValue, composer, 12582912, 0, 0);
                                ImmutableList3 immutableList3AdvisoryProjectionScreen$lambda$23 = AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$23(snapshotState7);
                                SimulateDepositFrequency simulateDepositFrequencyAdvisoryProjectionScreen$lambda$202 = AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$20(snapshotState5);
                                if (loaded == null || (immutableList3PersistentListOf = loaded.getSupportedFrequencies()) == null) {
                                    immutableList3PersistentListOf = extensions2.persistentListOf();
                                }
                                DepositCtaData depositCtaData = loaded != null ? loaded.getDepositCtaData() : null;
                                Modifier modifierAlpha = Alpha.alpha(companion, AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$14(snapshotFloatState2));
                                composer.startReplaceGroup(5004770);
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (objRememberedValue2 == companion3.getEmpty()) {
                                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.advisory.projection.AdvisoryProjectionScreenKt$AdvisoryProjectionScreen$2$2$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return AdvisoryProjectionScreen.C92602.AnonymousClass2.invoke$lambda$6$lambda$3$lambda$2(snapshotState5, (SimulateDepositFrequency) obj);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                Function1 function1 = (Function1) objRememberedValue2;
                                composer.endReplaceGroup();
                                composer.startReplaceGroup(5004770);
                                Object objRememberedValue3 = composer.rememberedValue();
                                if (objRememberedValue3 == companion3.getEmpty()) {
                                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.advisory.projection.AdvisoryProjectionScreenKt$AdvisoryProjectionScreen$2$2$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return AdvisoryProjectionScreen.C92602.AnonymousClass2.invoke$lambda$6$lambda$5$lambda$4(snapshotDoubleState2, ((Double) obj).doubleValue());
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue3);
                                }
                                composer.endReplaceGroup();
                                AdvisoryProjectionScreen.ProjectionFooter(immutableList3AdvisoryProjectionScreen$lambda$23, simulateDepositFrequencyAdvisoryProjectionScreen$lambda$202, immutableList3PersistentListOf, z, depositCtaData, function1, (Function1) objRememberedValue3, modifierAlpha, composer, 1769472, 0);
                                composer.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                                invoke(paddingValues, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$6$lambda$1$lambda$0(SnapshotState snapshotState, SnapshotState snapshotState2, int i, EndOfYearProjectionValue projectionChartValue) {
                                Intrinsics.checkNotNullParameter(projectionChartValue, "projectionChartValue");
                                AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$12(snapshotState, HeaderContent.copy$default(AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$11(snapshotState), Money.format$default(new Money(Currencies.USD, new BigDecimal(String.valueOf(projectionChartValue.getMedian()))), null, false, null, false, 0, 0, false, null, false, false, 991, null), i, Money.formatCompact$default(new Money(AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$8(snapshotState2), new BigDecimal(String.valueOf(projectionChartValue.getPercentile5()))), null, null, 0, 3, null), Money.formatCompact$default(new Money(AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$8(snapshotState2), new BigDecimal(String.valueOf(projectionChartValue.getPercentile95()))), null, null, 0, 3, null), null, 0, 48, null));
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$6$lambda$3$lambda$2(SnapshotState snapshotState, SimulateDepositFrequency newFrequency) {
                                Intrinsics.checkNotNullParameter(newFrequency, "newFrequency");
                                AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$21(snapshotState, newFrequency);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$6$lambda$5$lambda$4(SnapshotDoubleState2 snapshotDoubleState2, double d) {
                                AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$3(snapshotDoubleState2, d);
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i7) {
                            if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(654241332, i7, -1, "com.robinhood.android.advisory.projection.AdvisoryProjectionScreen.<anonymous> (AdvisoryProjectionScreen.kt:196)");
                            }
                            Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(modifier52, null, 1, null);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i8 = BentoTheme.$stable;
                            long jM21371getBg0d7_KjU = bentoTheme.getColors(composer3, i8).m21371getBg0d7_KjU();
                            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i8).m21425getFg0d7_KjU();
                            final Function0<Unit> function0 = onBackClicked;
                            ScaffoldKt.m5939ScaffoldTvnljyQ(modifierLogScreenTransitions$default, ComposableLambda3.rememberComposableLambda(1494359800, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.projection.AdvisoryProjectionScreenKt.AdvisoryProjectionScreen.2.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i9) {
                                    if ((i9 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1494359800, i9, -1, "com.robinhood.android.advisory.projection.AdvisoryProjectionScreen.<anonymous>.<anonymous> (AdvisoryProjectionScreen.kt:201)");
                                    }
                                    Function2<Composer, Integer, Unit> function2M11193getLambda$896990363$feature_projected_returns_externalDebug = AdvisoryProjectionScreen3.INSTANCE.m11193getLambda$896990363$feature_projected_returns_externalDebug();
                                    final Function0<Unit> function02 = function0;
                                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M11193getLambda$896990363$feature_projected_returns_externalDebug, null, ComposableLambda3.rememberComposableLambda(1799062713, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.projection.AdvisoryProjectionScreenKt.AdvisoryProjectionScreen.2.1.1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer5, Integer num) {
                                            invoke(bentoAppBarScope, composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer5, int i10) {
                                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                            if ((i10 & 6) == 0) {
                                                i10 |= (i10 & 8) == 0 ? composer5.changed(BentoAppBar) : composer5.changedInstance(BentoAppBar) ? 4 : 2;
                                            }
                                            if ((i10 & 19) == 18 && composer5.getSkipping()) {
                                                composer5.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1799062713, i10, -1, "com.robinhood.android.advisory.projection.AdvisoryProjectionScreen.<anonymous>.<anonymous>.<anonymous> (AdvisoryProjectionScreen.kt:204)");
                                            }
                                            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function02, composer5, (BentoAppBarScope.$stable << 12) | ((i10 << 12) & 57344), 7);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer4, 54), null, null, false, false, null, null, 0L, null, composer4, 390, 0, 2042);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), null, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(207563459, true, new AnonymousClass2(snapshotState432, snapshotState3, snapshotState4, snapshotState, snapshotDoubleState232, snapshotState5, snapshotState2, snapshotState6, snapshotFloatState2), composer3, 54), composer3, 805306416, 316);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier52;
                    advisoryProjectionDuxo4 = advisoryProjectionDuxo3;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                advisoryProjectionDuxo4 = advisoryProjectionDuxo2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.projection.AdvisoryProjectionScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$26(onBackClicked, modifier4, advisoryProjectionDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i3;
        if ((i4 & 147) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 4) == 0) {
                    advisoryProjectionDuxo3 = advisoryProjectionDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(advisoryProjectionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                UserInteractionEventDescriptor userInteractionEventDescriptor222 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                advisoryProjectionViewStateAdvisoryProjectionScreen$lambda$0 = AdvisoryProjectionScreen$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                if (advisoryProjectionViewStateAdvisoryProjectionScreen$lambda$0 instanceof AdvisoryProjectionViewState.Loading) {
                }
                UserInteractionEventDescriptor userInteractionEventDescriptorUpdateWith22 = UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor222, userInteractionEventDescriptor);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                snapshotDoubleState2 = (SnapshotDoubleState2) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                snapshotState = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                }
                snapshotState2 = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                }
                snapshotState3 = (SnapshotState) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                }
                snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                }
                snapshotState4 = (SnapshotState) objRememberedValue6;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                }
                snapshotState5 = (SnapshotState) objRememberedValue7;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == companion.getEmpty()) {
                }
                snapshotState6 = (SnapshotState) objRememberedValue8;
                composerStartRestartGroup.endReplaceGroup();
                AdvisoryProjectionViewState advisoryProjectionViewStateAdvisoryProjectionScreen$lambda$0222 = AdvisoryProjectionScreen$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                SimulateDepositFrequency simulateDepositFrequencyAdvisoryProjectionScreen$lambda$2022 = AdvisoryProjectionScreen$lambda$20(snapshotState5);
                Double dValueOf22 = Double.valueOf(snapshotDoubleState2.getDoubleValue());
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChanged = composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle);
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AdvisoryProjectionScreen$lambda$12(SnapshotState<HeaderContent> snapshotState, HeaderContent headerContent) {
        snapshotState.setValue(headerContent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AdvisoryProjectionScreen$lambda$21(SnapshotState<SimulateDepositFrequency> snapshotState, SimulateDepositFrequency simulateDepositFrequency) {
        snapshotState.setValue(simulateDepositFrequency);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AdvisoryProjectionScreen$lambda$3(SnapshotDoubleState2 snapshotDoubleState2, double d) {
        snapshotDoubleState2.setDoubleValue(d);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void FrequencyAndAmountSlider(final ImmutableList<Money> immutableList, final SimulateDepositFrequency simulateDepositFrequency, final ImmutableList<? extends SimulateDepositFrequency> immutableList2, final boolean z, final Function1<? super SimulateDepositFrequency, Unit> function1, final Function1<? super Double, Unit> function12, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        ImmutableList<? extends SimulateDepositFrequency> immutableList3;
        boolean z2;
        Modifier modifier2;
        final UserInteractionEventDescriptor userInteractionEventDescriptor;
        final EventLogger current;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChangedInstance;
        Object objRememberedValue;
        final SimulateDepositFrequency simulateDepositFrequency2;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1816916807);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(immutableList) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(simulateDepositFrequency.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            immutableList3 = immutableList2;
        } else {
            immutableList3 = immutableList2;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(immutableList3) ? 256 : 128;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
            }
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function12) ? 131072 : 65536;
        }
        int i4 = i2 & 64;
        if (i4 == 0) {
            if ((1572864 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
            if ((599187 & i3) != 599186 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1816916807, i3, -1, "com.robinhood.android.advisory.projection.FrequencyAndAmountSlider (AdvisoryProjectionScreen.kt:297)");
                }
                userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl(12)), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierTestTag = TestTag3.testTag(companion2, TagProjectionFrequency);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = ((57344 & i3) != 16384) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | ((i3 & 112) != 32);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    simulateDepositFrequency2 = simulateDepositFrequency;
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.projection.AdvisoryProjectionScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AdvisoryProjectionScreen.FrequencyAndAmountSlider$lambda$31$lambda$28$lambda$27(function1, current, userInteractionEventDescriptor, simulateDepositFrequency2, (SimulateDepositFrequency) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    simulateDepositFrequency2 = simulateDepositFrequency;
                }
                Function1 function13 = (Function1) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                int i5 = i3 >> 3;
                FrequencySelector3.FrequencySelector(simulateDepositFrequency2, immutableList3, modifierTestTag, z2, function13, composerStartRestartGroup, (i3 & 7168) | (i5 & 112) | (i5 & 14) | 384, 0);
                Modifier modifierTestTag2 = TestTag3.testTag(companion2, TagProjectionAmountSlider);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(current) | ((458752 & i3) != 131072) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.advisory.projection.AdvisoryProjectionScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AdvisoryProjectionScreen.FrequencyAndAmountSlider$lambda$31$lambda$30$lambda$29(function12, current, userInteractionEventDescriptor, (Money) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                AdvisoryAmountSliderKt.m11233AdvisoryAmountSliderTN_CM5M(immutableList, modifierTestTag2, 0.0f, null, (Function1) objRememberedValue2, composerStartRestartGroup, (i3 & 14) | 48, 12);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.projection.AdvisoryProjectionScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AdvisoryProjectionScreen.FrequencyAndAmountSlider$lambda$32(immutableList, simulateDepositFrequency, immutableList2, z, function1, function12, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 1572864;
        modifier2 = modifier;
        if ((599187 & i3) != 599186) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl(12)), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion22 = Modifier.INSTANCE;
                Modifier modifierTestTag3 = TestTag3.testTag(companion22, TagProjectionFrequency);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = ((57344 & i3) != 16384) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | ((i3 & 112) != 32);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    simulateDepositFrequency2 = simulateDepositFrequency;
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.projection.AdvisoryProjectionScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AdvisoryProjectionScreen.FrequencyAndAmountSlider$lambda$31$lambda$28$lambda$27(function1, current, userInteractionEventDescriptor, simulateDepositFrequency2, (SimulateDepositFrequency) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    Function1 function132 = (Function1) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    int i52 = i3 >> 3;
                    FrequencySelector3.FrequencySelector(simulateDepositFrequency2, immutableList3, modifierTestTag3, z2, function132, composerStartRestartGroup, (i3 & 7168) | (i52 & 112) | (i52 & 14) | 384, 0);
                    Modifier modifierTestTag22 = TestTag3.testTag(companion22, TagProjectionAmountSlider);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(current) | ((458752 & i3) != 131072) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance2) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.advisory.projection.AdvisoryProjectionScreenKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AdvisoryProjectionScreen.FrequencyAndAmountSlider$lambda$31$lambda$30$lambda$29(function12, current, userInteractionEventDescriptor, (Money) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        AdvisoryAmountSliderKt.m11233AdvisoryAmountSliderTN_CM5M(immutableList, modifierTestTag22, 0.0f, null, (Function1) objRememberedValue2, composerStartRestartGroup, (i3 & 14) | 48, 12);
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier4;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FrequencyAndAmountSlider$lambda$31$lambda$28$lambda$27(Function1 function1, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, SimulateDepositFrequency simulateDepositFrequency, SimulateDepositFrequency newFrequency) {
        Intrinsics.checkNotNullParameter(newFrequency, "newFrequency");
        function1.invoke(newFrequency);
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.SELECT, null, new Component(Component.ComponentType.RADIO_BUTTON, SimulateDepositFrequency2.getEventIdentifier(simulateDepositFrequency), null, 4, null), null, 43, null)), UserInteractionEventData.EventType.TAP), false, false, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FrequencyAndAmountSlider$lambda$31$lambda$30$lambda$29(Function1 function1, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Money newAmount) {
        Intrinsics.checkNotNullParameter(newAmount, "newAmount");
        double dDoubleValue = newAmount.getDecimalValue().doubleValue();
        function1.invoke(Double.valueOf(dDoubleValue));
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.SELECT, null, new Component(Component.ComponentType.SLIDER, "deposit_selection_" + dDoubleValue, null, 4, null), null, 43, null)), UserInteractionEventData.EventType.SCROLL), false, false, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ProjectionFooter(final ImmutableList<Money> depositAmountList, final SimulateDepositFrequency frequency, final ImmutableList<? extends SimulateDepositFrequency> currentSupportedFrequency, final boolean z, final DepositCtaData depositCta, final Function1<? super SimulateDepositFrequency, Unit> onFrequencySelected, final Function1<? super Double, Unit> onAmountChanged, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        DepositCtaData depositCta2;
        int i4;
        Modifier modifier2;
        int i5;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(depositAmountList, "depositAmountList");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(currentSupportedFrequency, "currentSupportedFrequency");
        Intrinsics.checkNotNullParameter(onFrequencySelected, "onFrequencySelected");
        Intrinsics.checkNotNullParameter(onAmountChanged, "onAmountChanged");
        Composer composerStartRestartGroup = composer.startRestartGroup(1164830051);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(depositAmountList) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(frequency.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(currentSupportedFrequency) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
                depositCta2 = depositCta;
            } else {
                depositCta2 = depositCta;
                if ((i & 24576) == 0) {
                    i3 |= composerStartRestartGroup.changed(depositCta2) ? 16384 : 8192;
                }
            }
            if ((i2 & 32) == 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onFrequencySelected) ? 131072 : 65536;
            }
            if ((i2 & 64) == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onAmountChanged) ? 1048576 : 524288;
            }
            i4 = i2 & 128;
            if (i4 != 0) {
                if ((12582912 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
                }
                i5 = i3;
                if ((4793491 & i5) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                    if (i4 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1164830051, i5, -1, "com.robinhood.android.advisory.projection.ProjectionFooter (AdvisoryProjectionScreen.kt:366)");
                    }
                    if (WindowSize.INSTANCE.getCurrentWidth(composerStartRestartGroup, 6) != WindowSize.Compact) {
                        composerStartRestartGroup.startReplaceGroup(-1883170470);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier2);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        int i6 = i5 >> 3;
                        FrequencyAndAmountSlider(depositAmountList, frequency, currentSupportedFrequency, z2, onFrequencySelected, onAmountChanged, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21591getLargeD9Ej5fM(), 0.0f, C2002Dp.m7995constructorimpl(12), 5, null), composerStartRestartGroup, (i5 & 8190) | (i6 & 57344) | (i6 & 458752), 0);
                        composer2 = composerStartRestartGroup;
                        DepositCta2.OptionalDepositCta(depositCta2, frequency, null, composer2, ((i5 >> 12) & 14) | (i5 & 112), 4);
                        composer2.endNode();
                        composer2.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1882332695);
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getBottom(), composerStartRestartGroup, 48);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor2);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        int i7 = i5 >> 3;
                        FrequencyAndAmountSlider(depositAmountList, frequency, currentSupportedFrequency, z, onFrequencySelected, onAmountChanged, PaddingKt.m5144paddingVpY3zN4$default(Row5.weight$default(row6, companion3, 1.75f, false, 2, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null), composerStartRestartGroup, (i5 & 8190) | (i7 & 57344) | (i7 & 458752), 0);
                        composer2 = composerStartRestartGroup;
                        DepositCta2.OptionalDepositCta(depositCta, frequency, Row5.weight$default(row6, companion3, 1.0f, false, 2, null), composer2, ((i5 >> 12) & 14) | (i5 & 112), 0);
                        composer2.endNode();
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                }
                final Modifier modifier3 = modifier2;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.projection.AdvisoryProjectionScreenKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AdvisoryProjectionScreen.ProjectionFooter$lambda$35(depositAmountList, frequency, currentSupportedFrequency, z, depositCta, onFrequencySelected, onAmountChanged, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 12582912;
            modifier2 = modifier;
            i5 = i3;
            if ((4793491 & i5) != 4793490) {
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (WindowSize.INSTANCE.getCurrentWidth(composerStartRestartGroup, 6) != WindowSize.Compact) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
            }
            final Modifier modifier32 = modifier2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z2 = z;
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        i4 = i2 & 128;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        i5 = i3;
        if ((4793491 & i5) != 4793490) {
        }
        final Modifier modifier322 = modifier2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x025e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ProjectionHeader(final HeaderContent headerContent, final boolean z, final String str, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        String str2;
        Modifier modifier2;
        boolean z2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Alignment.Horizontal start;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-642885692);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(headerContent) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            str2 = str;
        } else {
            str2 = str;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
            }
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-642885692, i3, -1, "com.robinhood.android.advisory.projection.ProjectionHeader (AdvisoryProjectionScreen.kt:427)");
                }
                float f = !z ? 0.0f : 1.0f;
                z2 = WindowSize.INSTANCE.getCurrentWidth(composerStartRestartGroup, 6) != WindowSize.Compact;
                Modifier modifierTestTag = TestTag3.testTag(modifier4, TagProjectionHeader);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierTestTag);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                if (!z2) {
                    composerStartRestartGroup.startReplaceGroup(-294471786);
                    ProjectionHeaderTopValues(headerContent.getMedianValueText(), str2, Alpha.alpha(Modifier.INSTANCE, f), composerStartRestartGroup, (i3 >> 3) & 112, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-294226948);
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierTestTag2 = TestTag3.testTag(companion3, TagProjectionHeader);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getBottom(), composerStartRestartGroup, 48);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierTestTag2);
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    ProjectionHeaderTopValues(headerContent.getMedianValueText(), str, Alpha.alpha(Row5.weight$default(row6, companion3, 1.0f, false, 2, null), f), composerStartRestartGroup, (i3 >> 3) & 112, 0);
                    ProjectionChartCursorData(headerContent, Alpha.alpha(PaddingKt.m5146paddingqDBjuR0$default(Row5.weight$default(row6, companion3, 1.0f, false, 2, null), 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21597getXxsmallD9Ej5fM(), 7, null), f), composerStartRestartGroup, i3 & 14, 0);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                }
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion4, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, 6, 1);
                if (!z) {
                    start = companion.getCenterHorizontally();
                } else {
                    start = companion.getStart();
                }
                int i5 = i3 & 14;
                LikelyPortfolioValue(headerContent, z, column6.align(modifierM21622defaultHorizontalPaddingWMci_g0, start), composerStartRestartGroup, i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 0);
                composerStartRestartGroup.startReplaceGroup(2068760351);
                if (z2) {
                    ProjectionChartCursorData(headerContent, Alpha.alpha(companion4, f), composerStartRestartGroup, i5, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.projection.AdvisoryProjectionScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AdvisoryProjectionScreen.ProjectionHeader$lambda$38(headerContent, z, str, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) != 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            float f2 = !z ? 0.0f : 1.0f;
            if (WindowSize.INSTANCE.getCurrentWidth(composerStartRestartGroup, 6) != WindowSize.Compact) {
            }
            Modifier modifierTestTag3 = TestTag3.testTag(modifier4, TagProjectionHeader);
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement2.getTop();
            Alignment.Companion companion5 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion5.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierTestTag3);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                if (!z2) {
                }
                Modifier.Companion companion42 = Modifier.INSTANCE;
                Modifier modifierM21622defaultHorizontalPaddingWMci_g02 = com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion42, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, 6, 1);
                if (!z) {
                }
                int i52 = i3 & 14;
                LikelyPortfolioValue(headerContent, z, column62.align(modifierM21622defaultHorizontalPaddingWMci_g02, start), composerStartRestartGroup, i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 0);
                composerStartRestartGroup.startReplaceGroup(2068760351);
                if (z2) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void LikelyPortfolioValue(HeaderContent headerContent, final boolean z, Modifier modifier, Composer composer, final int i, final int i2) {
        HeaderContent headerContent2;
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-78191492);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            headerContent2 = headerContent;
        } else if ((i & 6) == 0) {
            headerContent2 = headerContent;
            i3 = (composerStartRestartGroup.changed(headerContent2) ? 4 : 2) | i;
        } else {
            headerContent2 = headerContent;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-78191492, i3, -1, "com.robinhood.android.advisory.projection.LikelyPortfolioValue (AdvisoryProjectionScreen.kt:496)");
                }
                if (!z) {
                    composerStartRestartGroup.startReplaceGroup(-1530302197);
                    String strStringResource = StringResources_androidKt.stringResource(headerContent2.getLoadingTextRes(), composerStartRestartGroup, 0);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw(strStringResource, modifier3, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM(), composer2, (i3 >> 3) & 112, 0, 8184);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1530062753);
                    composerStartRestartGroup.startReplaceGroup(-2127565746);
                    AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                    String strStringResource2 = StringResources_androidKt.stringResource(C9264R.string.projection_screen_years_prefix, composerStartRestartGroup, 0);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    int iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme2.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                    try {
                        builder.append(strStringResource2);
                        Unit unit = Unit.INSTANCE;
                        builder.pop(iPushStyle);
                        builder.append(PlaceholderUtils.XXShortPlaceholderText);
                        builder.append(StringResources_androidKt.pluralStringResource(C9264R.plurals.projection_screen_years_suffix, headerContent2.getSelectedYear(), new Object[]{Integer.valueOf(headerContent2.getSelectedYear())}, composerStartRestartGroup, 0));
                        int i7 = i3;
                        AnnotatedString annotatedString = builder.toAnnotatedString();
                        composerStartRestartGroup.endReplaceGroup();
                        composer2 = composerStartRestartGroup;
                        BentoText2.m20748BentoTextQnj7Zds(annotatedString, modifier3, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, null, bentoTheme2.getTypography(composerStartRestartGroup, i6).getTextM(), composer2, (i7 >> 3) & 112, 0, 8184);
                        composer2.endReplaceGroup();
                    } catch (Throwable th) {
                        builder.pop(iPushStyle);
                        throw th;
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final HeaderContent headerContent3 = headerContent2;
                final Modifier modifier4 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.projection.AdvisoryProjectionScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AdvisoryProjectionScreen.LikelyPortfolioValue$lambda$41(headerContent3, z, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!z) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ProjectionHeaderTopValues(final String str, String str2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final android.content.Context context;
        final Navigator navigator;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int i4;
        boolean z;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final String str3 = str2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-439563834);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str3) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-439563834, i3, -1, "com.robinhood.android.advisory.projection.ProjectionHeaderTopValues (AdvisoryProjectionScreen.kt:532)");
                }
                context = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(modifier4, 0.0f, 1, null);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Alignment.Vertical centerVertically = companion.getCenterVertically();
                Modifier.Companion companion3 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                String strStringResource = StringResources_androidKt.stringResource(C9264R.string.projection_screen_title, composerStartRestartGroup, 0);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifier5 = modifier4;
                boolean z2 = false;
                i4 = i3;
                BentoText2.m20747BentoText38GnDrw(strStringResource, companion3, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getDisplayCapsuleLarge(), composerStartRestartGroup, 48, 0, 8188);
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_24);
                long jM21426getFg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU();
                String strStringResource2 = StringResources_androidKt.stringResource(C9264R.string.projection_screen_info_icon_description, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                if ((i4 & 112) == 32) {
                    z2 = true;
                }
                z = z2 | zChangedInstance;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    str3 = str2;
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.projection.AdvisoryProjectionScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AdvisoryProjectionScreen.m1734x1d9226bd(navigator, context, str3);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    str3 = str2;
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoIcon2.m20644BentoIconFU0evQE(size24, strStringResource2, jM21426getFg20d7_KjU, modifierM5146paddingqDBjuR0$default, (Function0) objRememberedValue, false, composerStartRestartGroup, BentoIcon4.Size24.$stable, 32);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                WrappedTickerKt.m19244TickerTextFNF3uiM(companion3, str, bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU(), TickerTextState.Style.DISPLAY_LARGE, composerStartRestartGroup, ((i4 << 3) & 112) | 3078);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.projection.AdvisoryProjectionScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AdvisoryProjectionScreen.ProjectionHeaderTopValues$lambda$46(str, str3, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) != 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            context = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2 = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(modifier4, 0.0f, 1, null);
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement2.getTop();
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion4.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Alignment.Vertical centerVertically2 = companion4.getCenterVertically();
                Modifier.Companion companion32 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), centerVertically2, composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion32);
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    String strStringResource3 = StringResources_androidKt.stringResource(C9264R.string.projection_screen_title, composerStartRestartGroup, 0);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i62 = BentoTheme.$stable;
                    Modifier modifier52 = modifier4;
                    boolean z22 = false;
                    i4 = i3;
                    BentoText2.m20747BentoText38GnDrw(strStringResource3, companion32, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getDisplayCapsuleLarge(), composerStartRestartGroup, 48, 0, 8188);
                    Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                    BentoIcon4.Size24 size242 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_24);
                    long jM21426getFg20d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i62).m21426getFg20d7_KjU();
                    String strStringResource22 = StringResources_androidKt.stringResource(C9264R.string.projection_screen_info_icon_description, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                    if ((i4 & 112) == 32) {
                    }
                    z = z22 | zChangedInstance2;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z) {
                        str3 = str2;
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.projection.AdvisoryProjectionScreenKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AdvisoryProjectionScreen.m1734x1d9226bd(navigator, context, str3);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        BentoIcon2.m20644BentoIconFU0evQE(size242, strStringResource22, jM21426getFg20d7_KjU2, modifierM5146paddingqDBjuR0$default2, (Function0) objRememberedValue, false, composerStartRestartGroup, BentoIcon4.Size24.$stable, 32);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endNode();
                        WrappedTickerKt.m19244TickerTextFNF3uiM(companion32, str, bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU(), TickerTextState.Style.DISPLAY_LARGE, composerStartRestartGroup, ((i4 << 3) & 112) | 3078);
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ProjectionHeaderTopValues$lambda$45$lambda$44$lambda$43$lambda$42 */
    public static final Unit m1734x1d9226bd(Navigator navigator, android.content.Context context, String str) {
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, new AdvisoryProjectionDisclosureFragmentKey(str), false, false, false, false, null, false, null, null, 1020, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0425  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ProjectionChartCursorData(final HeaderContent headerContent, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Modifier modifier3;
        Arrangement.Horizontal start;
        int currentCompositeKeyHash;
        ComposeUiNode.Companion companion;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Alignment.Companion companion2;
        Modifier.Companion companion3;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        float f;
        BentoTheme bentoTheme;
        int i4;
        float f2;
        AnnotatedString.Builder builder;
        TextAlign textAlign;
        int iPushStyle;
        Modifier modifier4;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-512421262);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(headerContent) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-512421262, i3, -1, "com.robinhood.android.advisory.projection.ProjectionChartCursorData (AdvisoryProjectionScreen.kt:574)");
                }
                boolean z = WindowSize.INSTANCE.getCurrentWidth(composerStartRestartGroup, 6) != WindowSize.Compact;
                Alignment.Companion companion4 = Alignment.INSTANCE;
                Alignment.Horizontal start2 = !z ? companion4.getStart() : companion4.getEnd();
                Arrangement arrangement = Arrangement.INSTANCE;
                start = !z ? arrangement.getStart() : arrangement.getEnd();
                TextAlign textAlignM7912boximpl = !z ? null : TextAlign.m7912boximpl(TextAlign.INSTANCE.m7920getEnde0LSkKk());
                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(modifier3, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), start2, composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
                companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                companion2 = Alignment.INSTANCE;
                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                companion3 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, centerVertically, composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
                Function0<ComposeUiNode> constructor2 = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor2);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                f = 10;
                Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(SizeKt.m5156height3ABfNKs(companion3, C2002Dp.m7995constructorimpl(f)), C2002Dp.m7995constructorimpl(f));
                Brush.Companion companion5 = Brush.INSTANCE;
                bentoTheme = BentoTheme.INSTANCE;
                i4 = BentoTheme.$stable;
                BoxKt.Box(Background3.background$default(modifierM5174width3ABfNKs, Brush.Companion.m6682verticalGradient8A3gB4$default(companion5, !bentoTheme.getColors(composerStartRestartGroup, i4).getIsDay() ? CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(AdvisoryChartColorPalette.getLightHighlightTop()), Color.m6701boximpl(AdvisoryChartColorPalette.getLightHighlightBottom())}) : CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(AdvisoryChartColorPalette.getDarkHighlightTop()), Color.m6701boximpl(AdvisoryChartColorPalette.getDarkHighlightBottom())}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composerStartRestartGroup, 0);
                f2 = 6;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion3, C2002Dp.m7995constructorimpl(f2), 0.0f, 0.0f, 0.0f, 14, null);
                composerStartRestartGroup.startReplaceGroup(-1038612519);
                textAlign = textAlignM7912boximpl;
                builder = new AnnotatedString.Builder(0, 1, null);
                builder.append(headerContent.getMinRangeText() + "-" + headerContent.getMaxRangeText());
                iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i4).m21426getFg20d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                try {
                    builder.append(" Projection range");
                    Unit unit = Unit.INSTANCE;
                    builder.pop(iPushStyle);
                    AnnotatedString annotatedString = builder.toAnnotatedString();
                    composerStartRestartGroup.endReplaceGroup();
                    modifier4 = modifier3;
                    BentoText2.m20748BentoTextQnj7Zds(annotatedString, modifierM5146paddingqDBjuR0$default, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU()), null, null, null, textAlign, 0, false, 0, 0, null, null, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextM(), composerStartRestartGroup, 48, 0, 8120);
                    composerStartRestartGroup.endNode();
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(start, companion2.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
                    Function0<ComposeUiNode> constructor3 = companion.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.useNode();
                    } else {
                        composerStartRestartGroup.createNode(constructor3);
                    }
                    composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash3 = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion.getSetModifier());
                    BoxKt.Box(Background3.m4872backgroundbw27NRU$default(SizeKt.m5174width3ABfNKs(SizeKt.m5156height3ABfNKs(companion3, C2002Dp.m7995constructorimpl(2)), C2002Dp.m7995constructorimpl(f)), bentoTheme.getColors(composerStartRestartGroup, i4).m21426getFg20d7_KjU(), null, 2, null), composerStartRestartGroup, 0);
                    Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion3, C2002Dp.m7995constructorimpl(f2), 0.0f, 0.0f, 0.0f, 14, null);
                    composerStartRestartGroup.startReplaceGroup(725637809);
                    builder = new AnnotatedString.Builder(0, 1, null);
                    builder.append(headerContent.getCurrentPortfolioText());
                    composerStartRestartGroup.startReplaceGroup(725640891);
                    iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i4).m21426getFg20d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                    try {
                        builder.append(PlaceholderUtils.XXShortPlaceholderText);
                        builder.append(StringResources_androidKt.stringResource(C9264R.string.projection_screen_current_portfolio_value, composerStartRestartGroup, 0));
                        builder.pop(iPushStyle);
                        composerStartRestartGroup.endReplaceGroup();
                        AnnotatedString annotatedString2 = builder.toAnnotatedString();
                        composerStartRestartGroup.endReplaceGroup();
                        composer2 = composerStartRestartGroup;
                        BentoText2.m20748BentoTextQnj7Zds(annotatedString2, modifierM5146paddingqDBjuR0$default2, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU()), null, null, null, textAlign, 0, false, 0, 0, null, null, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextM(), composer2, 48, 0, 8120);
                        composer2.endNode();
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier4;
                    } finally {
                    }
                } finally {
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.projection.AdvisoryProjectionScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AdvisoryProjectionScreen.ProjectionChartCursorData$lambda$54(headerContent, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (WindowSize.INSTANCE.getCurrentWidth(composerStartRestartGroup, 6) != WindowSize.Compact) {
            }
            Alignment.Companion companion42 = Alignment.INSTANCE;
            if (!z) {
            }
            Arrangement arrangement2 = Arrangement.INSTANCE;
            if (!z) {
            }
            if (!z) {
            }
            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2 = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(modifier3, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), start2, composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2);
            companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor4 = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                companion2 = Alignment.INSTANCE;
                Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
                companion3 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(start, centerVertically2, composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
                Function0<ComposeUiNode> constructor22 = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy3, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    f = 10;
                    Modifier modifierM5174width3ABfNKs2 = SizeKt.m5174width3ABfNKs(SizeKt.m5156height3ABfNKs(companion3, C2002Dp.m7995constructorimpl(f)), C2002Dp.m7995constructorimpl(f));
                    Brush.Companion companion52 = Brush.INSTANCE;
                    bentoTheme = BentoTheme.INSTANCE;
                    i4 = BentoTheme.$stable;
                    BoxKt.Box(Background3.background$default(modifierM5174width3ABfNKs2, Brush.Companion.m6682verticalGradient8A3gB4$default(companion52, !bentoTheme.getColors(composerStartRestartGroup, i4).getIsDay() ? CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(AdvisoryChartColorPalette.getLightHighlightTop()), Color.m6701boximpl(AdvisoryChartColorPalette.getLightHighlightBottom())}) : CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(AdvisoryChartColorPalette.getDarkHighlightTop()), Color.m6701boximpl(AdvisoryChartColorPalette.getDarkHighlightBottom())}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composerStartRestartGroup, 0);
                    f2 = 6;
                    Modifier modifierM5146paddingqDBjuR0$default3 = PaddingKt.m5146paddingqDBjuR0$default(companion3, C2002Dp.m7995constructorimpl(f2), 0.0f, 0.0f, 0.0f, 14, null);
                    composerStartRestartGroup.startReplaceGroup(-1038612519);
                    textAlign = textAlignM7912boximpl;
                    builder = new AnnotatedString.Builder(0, 1, null);
                    builder.append(headerContent.getMinRangeText() + "-" + headerContent.getMaxRangeText());
                    iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i4).m21426getFg20d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                    builder.append(" Projection range");
                    Unit unit2 = Unit.INSTANCE;
                    builder.pop(iPushStyle);
                    AnnotatedString annotatedString3 = builder.toAnnotatedString();
                    composerStartRestartGroup.endReplaceGroup();
                    modifier4 = modifier3;
                    BentoText2.m20748BentoTextQnj7Zds(annotatedString3, modifierM5146paddingqDBjuR0$default3, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU()), null, null, null, textAlign, 0, false, 0, 0, null, null, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextM(), composerStartRestartGroup, 48, 0, 8120);
                    composerStartRestartGroup.endNode();
                    MeasurePolicy measurePolicyRowMeasurePolicy22 = Row2.rowMeasurePolicy(start, companion2.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
                    Function0<ComposeUiNode> constructor32 = companion.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy22, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash3 = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl3.getInserting()) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion.getSetModifier());
                        BoxKt.Box(Background3.m4872backgroundbw27NRU$default(SizeKt.m5174width3ABfNKs(SizeKt.m5156height3ABfNKs(companion3, C2002Dp.m7995constructorimpl(2)), C2002Dp.m7995constructorimpl(f)), bentoTheme.getColors(composerStartRestartGroup, i4).m21426getFg20d7_KjU(), null, 2, null), composerStartRestartGroup, 0);
                        Modifier modifierM5146paddingqDBjuR0$default22 = PaddingKt.m5146paddingqDBjuR0$default(companion3, C2002Dp.m7995constructorimpl(f2), 0.0f, 0.0f, 0.0f, 14, null);
                        composerStartRestartGroup.startReplaceGroup(725637809);
                        builder = new AnnotatedString.Builder(0, 1, null);
                        builder.append(headerContent.getCurrentPortfolioText());
                        composerStartRestartGroup.startReplaceGroup(725640891);
                        iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i4).m21426getFg20d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                        builder.append(PlaceholderUtils.XXShortPlaceholderText);
                        builder.append(StringResources_androidKt.stringResource(C9264R.string.projection_screen_current_portfolio_value, composerStartRestartGroup, 0));
                        builder.pop(iPushStyle);
                        composerStartRestartGroup.endReplaceGroup();
                        AnnotatedString annotatedString22 = builder.toAnnotatedString();
                        composerStartRestartGroup.endReplaceGroup();
                        composer2 = composerStartRestartGroup;
                        BentoText2.m20748BentoTextQnj7Zds(annotatedString22, modifierM5146paddingqDBjuR0$default22, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU()), null, null, null, textAlign, 0, false, 0, 0, null, null, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextM(), composer2, 48, 0, 8120);
                        composer2.endNode();
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = modifier4;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
