package com.robinhood.android.gold.upgrade.unified.screen;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.PrimitiveResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
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
import androidx.navigation.NavHostController;
import coil.compose.SingletonAsyncImagePainter;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.LoggableViewState2;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.gold.BentoAppBarWithTransition;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.ScreenLoggable2;
import com.robinhood.android.gold.upgrade.C18003R;
import com.robinhood.android.gold.upgrade.unified.component.GoldValuePropRowComposable;
import com.robinhood.android.gold.upgrade.unified.component.PlanSelectionSectionComposable;
import com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoViewState;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.mediaservice.ImageDensityUrl;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.LocalLifecycleAwareNavigator;
import com.robinhood.android.shared.serverui.utils.IconKt;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.InfoTagDefaults;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow3;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.targetbackend.Endpoint;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.p409ui.edge2edge.EdgeToEdgeHost;
import com.robinhood.utils.p409ui.edge2edge.LocalEdgeToEdgeHost;
import com.robinhood.utils.p409ui.edge2edge.OverrideSystemBarsStyle;
import gold_flow.proto.p466v1.Action;
import gold_flow.proto.p466v1.GoldLottieAnimation;
import gold_flow.proto.p466v1.GoldPromoAdditionalValueProps;
import gold_flow.proto.p466v1.GoldPromoInfoBanner;
import gold_flow.proto.p466v1.GoldPromoPlanSection;
import gold_flow.proto.p466v1.GoldPromoPlanSelectionSection;
import gold_flow.proto.p466v1.GoldValuePropsInfoTag;
import gold_flow.proto.p466v1.StreamValuePropsPromoContentResponse;
import gold_flow.proto.p466v1.ValueProp;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.extensions2;
import rh_server_driven_ui.p531v1.Icon;

/* compiled from: GoldUnifiedValuePropsPromoComposable.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aK\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u0013\u001a\u0017\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u0015\u001aE\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0014\u0010\u0019\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u00070\u001a2\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u001c\u001a\u0015\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001fH\u0003¢\u0006\u0002\u0010 \u001a\u001f\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020#2\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010$\u001a7\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020)2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010)H\u0003¢\u0006\u0004\b,\u0010-\u001a%\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u0002002\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rH\u0003¢\u0006\u0002\u00101\u001a\u0015\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u000204H\u0003¢\u0006\u0002\u00105\"\u0016\u0010\u0000\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003¨\u00066²\u0006\n\u00107\u001a\u000208X\u008a\u0084\u0002²\u0006\f\u00109\u001a\u0004\u0018\u00010:X\u008a\u0084\u0002²\u0006\n\u0010;\u001a\u00020)X\u008a\u008e\u0002"}, m3636d2 = {"GoldUnifiedValuePropsPromoAssetTestTag", "", "getGoldUnifiedValuePropsPromoAssetTestTag$annotations", "()V", "ValuePropsPromoCtaTestTag", "getValuePropsPromoCtaTestTag$annotations", "GoldUnifiedValuePropsPromoComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedValuePropsPromoDuxo;", "buttonColorChangeWhenScrolling", "", "loggingScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "forceLightMode", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedValuePropsPromoDuxo;ZLcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Context;ZLandroidx/compose/runtime/Composer;II)V", "Loading", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Loaded", "content", "Lgold_flow/proto/v1/StreamValuePropsPromoContentResponse;", "onAction", "Lkotlin/Function1;", "Lgold_flow/proto/v1/Action;", "(Lgold_flow/proto/v1/StreamValuePropsPromoContentResponse;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PlanSection", "planSection", "Lgold_flow/proto/v1/GoldPromoPlanSection;", "(Lgold_flow/proto/v1/GoldPromoPlanSection;Landroidx/compose/runtime/Composer;I)V", "InfoBanner", "infoBanner", "Lgold_flow/proto/v1/GoldPromoInfoBanner;", "(Lgold_flow/proto/v1/GoldPromoInfoBanner;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "InfoTag", "infoTag", "Lgold_flow/proto/v1/GoldValuePropsInfoTag;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "borderColor", "InfoTag-7qC3k5A", "(Lgold_flow/proto/v1/GoldValuePropsInfoTag;JJLandroidx/compose/ui/graphics/Color;Landroidx/compose/runtime/Composer;II)V", "AppBar", "scrollState", "Landroidx/compose/foundation/ScrollState;", "(Landroidx/compose/foundation/ScrollState;ZZLandroidx/compose/runtime/Composer;I)V", "AdditionalValueProps", "additionalValueProps", "Lgold_flow/proto/v1/GoldPromoAdditionalValueProps;", "(Lgold_flow/proto/v1/GoldPromoAdditionalValueProps;Landroidx/compose/runtime/Composer;I)V", "feature-gold-upgrade_externalRelease", "viewState", "Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedValuePropsPromoViewState;", "lottieComposition", "Lcom/airbnb/lottie/LottieComposition;", "navigationIconColor"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldUnifiedValuePropsPromoComposable {
    public static final String GoldUnifiedValuePropsPromoAssetTestTag = "gold_unified_value_props_promo_asset";
    public static final String ValuePropsPromoCtaTestTag = "value_props_promo_cta";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdditionalValueProps$lambda$26(GoldPromoAdditionalValueProps goldPromoAdditionalValueProps, int i, Composer composer, int i2) {
        AdditionalValueProps(goldPromoAdditionalValueProps, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppBar$lambda$20(ScrollState scrollState, boolean z, boolean z2, int i, Composer composer, int i2) {
        AppBar(scrollState, z, z2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldUnifiedValuePropsPromoComposable$lambda$1(Modifier modifier, GoldUnifiedValuePropsPromoDuxo goldUnifiedValuePropsPromoDuxo, boolean z, Screen screen, Context context, boolean z2, int i, int i2, Composer composer, int i3) {
        GoldUnifiedValuePropsPromoComposable(modifier, goldUnifiedValuePropsPromoDuxo, z, screen, context, z2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InfoBanner$lambda$13(GoldPromoInfoBanner goldPromoInfoBanner, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InfoBanner(goldPromoInfoBanner, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InfoTag_7qC3k5A$lambda$14(GoldValuePropsInfoTag goldValuePropsInfoTag, long j, long j2, Color color, int i, int i2, Composer composer, int i3) {
        m15172InfoTag7qC3k5A(goldValuePropsInfoTag, j, j2, color, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loaded$lambda$4(StreamValuePropsPromoContentResponse streamValuePropsPromoContentResponse, boolean z, boolean z2, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Loaded(streamValuePropsPromoContentResponse, z, z2, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loading$lambda$2(Modifier modifier, int i, int i2, Composer composer, int i3) {
        Loading(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlanSection$lambda$9(GoldPromoPlanSection goldPromoPlanSection, int i, Composer composer, int i2) {
        PlanSection(goldPromoPlanSection, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getGoldUnifiedValuePropsPromoAssetTestTag$annotations() {
    }

    public static /* synthetic */ void getValuePropsPromoCtaTestTag$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AppBar$lambda$16(SnapshotState<Color> snapshotState) {
        return snapshotState.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GoldUnifiedValuePropsPromoViewState GoldUnifiedValuePropsPromoComposable$lambda$0(SnapshotState4<? extends GoldUnifiedValuePropsPromoViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoldUnifiedValuePropsPromoComposable(Modifier modifier, GoldUnifiedValuePropsPromoDuxo goldUnifiedValuePropsPromoDuxo, boolean z, Screen screen, Context context, boolean z2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        GoldUnifiedValuePropsPromoDuxo goldUnifiedValuePropsPromoDuxo2;
        boolean z3;
        Screen screen2;
        int i4;
        Context context2;
        int i5;
        boolean z4;
        int i6;
        Screen screen3;
        final boolean z5;
        final Modifier modifier3;
        final GoldUnifiedValuePropsPromoDuxo goldUnifiedValuePropsPromoDuxo3;
        final Context context3;
        final boolean z6;
        final Screen screen4;
        CreationExtras defaultViewModelCreationExtras;
        final Screen screen5;
        final Context context4;
        final GoldUnifiedValuePropsPromoDuxo goldUnifiedValuePropsPromoDuxo4;
        final Modifier modifier4;
        final boolean z7;
        final boolean z8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1091181304);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                goldUnifiedValuePropsPromoDuxo2 = goldUnifiedValuePropsPromoDuxo;
                int i8 = composerStartRestartGroup.changedInstance(goldUnifiedValuePropsPromoDuxo2) ? 32 : 16;
                i3 |= i8;
            } else {
                goldUnifiedValuePropsPromoDuxo2 = goldUnifiedValuePropsPromoDuxo;
            }
            i3 |= i8;
        } else {
            goldUnifiedValuePropsPromoDuxo2 = goldUnifiedValuePropsPromoDuxo;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                z3 = z;
                i3 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    screen2 = screen;
                    int i10 = composerStartRestartGroup.changedInstance(screen2) ? 2048 : 1024;
                    i3 |= i10;
                } else {
                    screen2 = screen;
                }
                i3 |= i10;
            } else {
                screen2 = screen;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    context2 = context;
                    i3 |= composerStartRestartGroup.changedInstance(context2) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 == 0) {
                    if ((196608 & i) == 0) {
                        z4 = z2;
                        i3 |= composerStartRestartGroup.changed(z4) ? 131072 : 65536;
                    }
                    if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier5 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                            if ((i2 & 2) == 0) {
                                composerStartRestartGroup.startReplaceGroup(-747520797);
                                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                                if (current == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceableGroup(1729797275);
                                if (current instanceof HasDefaultViewModelProviderFactory) {
                                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                } else {
                                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                }
                                i6 = 0;
                                ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(GoldUnifiedValuePropsPromoDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                                final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                                final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                composerStartRestartGroup.startReplaceGroup(-1633490746);
                                boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoComposableKt$GoldUnifiedValuePropsPromoComposable$$inlined$duxo$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                            final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                            lifecycle.addObserver(duxoLifecycleObserver);
                                            final Lifecycle lifecycle2 = lifecycle;
                                            return new DisposableEffectResult() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoComposableKt$GoldUnifiedValuePropsPromoComposable$$inlined$duxo$1.1
                                                @Override // androidx.compose.runtime.DisposableEffectResult
                                                public void dispose() {
                                                    lifecycle2.removeObserver(duxoLifecycleObserver);
                                                }
                                            };
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
                                composerStartRestartGroup.endReplaceGroup();
                                goldUnifiedValuePropsPromoDuxo2 = (GoldUnifiedValuePropsPromoDuxo) baseDuxo;
                                i3 &= -113;
                            } else {
                                i6 = 0;
                            }
                            if (i9 != 0) {
                                z3 = i6 == true ? 1 : 0;
                            }
                            if ((i2 & 8) == 0) {
                                screen3 = new Screen(Screen.Name.GOLD_VALUE_PROPS, null, null, null, 14, null);
                                i3 &= -7169;
                            } else {
                                screen3 = screen;
                            }
                            Context context5 = i4 == 0 ? null : context;
                            if (i5 == 0) {
                                modifier3 = modifier5;
                                z5 = i6 == true ? 1 : 0;
                            } else {
                                z5 = z2;
                                modifier3 = modifier5;
                            }
                            goldUnifiedValuePropsPromoDuxo3 = goldUnifiedValuePropsPromoDuxo2;
                            context3 = context5;
                            z6 = z3;
                            screen4 = screen3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            modifier3 = modifier2;
                            goldUnifiedValuePropsPromoDuxo3 = goldUnifiedValuePropsPromoDuxo2;
                            z6 = z3;
                            screen4 = screen2;
                            context3 = context2;
                            z5 = z4;
                            i6 = 0;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1091181304, i3, -1, "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoComposable (GoldUnifiedValuePropsPromoComposable.kt:112)");
                        }
                        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(goldUnifiedValuePropsPromoDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        OverrideSystemBarsStyle.OverrideStatusBarStyle((z5 && z6) ? i6 : true, composerStartRestartGroup, i6);
                        BentoTheme2.BentoTheme(Boolean.valueOf(z5), null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1115644224, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoComposableKt.GoldUnifiedValuePropsPromoComposable.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i11) {
                                if ((i11 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1115644224, i11, -1, "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoComposable.<anonymous> (GoldUnifiedValuePropsPromoComposable.kt:118)");
                                }
                                LoggableViewState2 loggableViewState2LoadedState = GoldUnifiedValuePropsPromoComposable.GoldUnifiedValuePropsPromoComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).loadedState();
                                UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, screen4, null, context3, null, null, 53, null);
                                GoldUnifiedValuePropsPromoDuxo goldUnifiedValuePropsPromoDuxo5 = goldUnifiedValuePropsPromoDuxo3;
                                composer2.startReplaceGroup(5004770);
                                boolean zChangedInstance2 = composer2.changedInstance(goldUnifiedValuePropsPromoDuxo5);
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new GoldUnifiedValuePropsPromoComposable3(goldUnifiedValuePropsPromoDuxo5);
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceGroup();
                                Function0 function0 = (Function0) ((KFunction) objRememberedValue2);
                                GoldUnifiedValuePropsPromoDuxo goldUnifiedValuePropsPromoDuxo6 = goldUnifiedValuePropsPromoDuxo3;
                                composer2.startReplaceGroup(5004770);
                                boolean zChangedInstance3 = composer2.changedInstance(goldUnifiedValuePropsPromoDuxo6);
                                Object objRememberedValue3 = composer2.rememberedValue();
                                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new GoldUnifiedValuePropsPromoComposable4(goldUnifiedValuePropsPromoDuxo6);
                                    composer2.updateRememberedValue(objRememberedValue3);
                                }
                                composer2.endReplaceGroup();
                                Function0 function02 = (Function0) ((KFunction) objRememberedValue3);
                                final Modifier modifier6 = modifier3;
                                final Context context6 = context3;
                                final Screen screen6 = screen4;
                                final GoldUnifiedValuePropsPromoDuxo goldUnifiedValuePropsPromoDuxo7 = goldUnifiedValuePropsPromoDuxo3;
                                final boolean z9 = z6;
                                final boolean z10 = z5;
                                final SnapshotState4<GoldUnifiedValuePropsPromoViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                                ScreenLoggable2.ScreenLoggable(loggableViewState2LoadedState, userInteractionEventDescriptor, false, null, null, function0, function02, null, ComposableLambda3.rememberComposableLambda(-1077990306, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoComposableKt.GoldUnifiedValuePropsPromoComposable.1.3
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i12) {
                                        if ((i12 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1077990306, i12, -1, "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoComposable.<anonymous>.<anonymous> (GoldUnifiedValuePropsPromoComposable.kt:127)");
                                        }
                                        GoldUnifiedValuePropsPromoViewState goldUnifiedValuePropsPromoViewStateGoldUnifiedValuePropsPromoComposable$lambda$0 = GoldUnifiedValuePropsPromoComposable.GoldUnifiedValuePropsPromoComposable$lambda$0(snapshotState4);
                                        if (goldUnifiedValuePropsPromoViewStateGoldUnifiedValuePropsPromoComposable$lambda$0 instanceof GoldUnifiedValuePropsPromoViewState.Error) {
                                            composer3.startReplaceGroup(-938616920);
                                            GoldUnifiedErrorComposable.GoldUnifiedErrorComposable(context6, screen6, Background3.m4872backgroundbw27NRU$default(modifier6, BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), null, composer3, 0, 8);
                                            composer3.endReplaceGroup();
                                        } else if (goldUnifiedValuePropsPromoViewStateGoldUnifiedValuePropsPromoComposable$lambda$0 instanceof GoldUnifiedValuePropsPromoViewState.Loaded) {
                                            composer3.startReplaceGroup(-938268294);
                                            StreamValuePropsPromoContentResponse content = ((GoldUnifiedValuePropsPromoViewState.Loaded) goldUnifiedValuePropsPromoViewStateGoldUnifiedValuePropsPromoComposable$lambda$0).getContent();
                                            GoldUnifiedValuePropsPromoDuxo goldUnifiedValuePropsPromoDuxo8 = goldUnifiedValuePropsPromoDuxo7;
                                            composer3.startReplaceGroup(5004770);
                                            boolean zChangedInstance4 = composer3.changedInstance(goldUnifiedValuePropsPromoDuxo8);
                                            Object objRememberedValue4 = composer3.rememberedValue();
                                            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue4 = new GoldUnifiedValuePropsPromoComposable5(goldUnifiedValuePropsPromoDuxo8);
                                                composer3.updateRememberedValue(objRememberedValue4);
                                            }
                                            composer3.endReplaceGroup();
                                            GoldUnifiedValuePropsPromoComposable.Loaded(content, z9, z10, (Function1) objRememberedValue4, modifier6, composer3, 0, 0);
                                            composer3.endReplaceGroup();
                                        } else {
                                            if (!Intrinsics.areEqual(goldUnifiedValuePropsPromoViewStateGoldUnifiedValuePropsPromoComposable$lambda$0, GoldUnifiedValuePropsPromoViewState.Loading.INSTANCE)) {
                                                composer3.startReplaceGroup(-861564450);
                                                composer3.endReplaceGroup();
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            composer3.startReplaceGroup(-861539385);
                                            GoldUnifiedValuePropsPromoComposable.Loading(null, composer3, 0, 1);
                                            composer3.endReplaceGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), composer2, 100663296, 156);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 15) & 14) | 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                        composerStartRestartGroup = composerStartRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        screen5 = screen4;
                        context4 = context3;
                        goldUnifiedValuePropsPromoDuxo4 = goldUnifiedValuePropsPromoDuxo3;
                        modifier4 = modifier3;
                        z7 = z6;
                        z8 = z5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                        goldUnifiedValuePropsPromoDuxo4 = goldUnifiedValuePropsPromoDuxo2;
                        z7 = z3;
                        screen5 = screen2;
                        context4 = context2;
                        z8 = z4;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoComposableKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return GoldUnifiedValuePropsPromoComposable.GoldUnifiedValuePropsPromoComposable$lambda$1(modifier4, goldUnifiedValuePropsPromoDuxo4, z7, screen5, context4, z8, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                z4 = z2;
                if ((74899 & i3) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i7 == 0) {
                        }
                        if ((i2 & 2) == 0) {
                        }
                        if (i9 != 0) {
                        }
                        if ((i2 & 8) == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        goldUnifiedValuePropsPromoDuxo3 = goldUnifiedValuePropsPromoDuxo2;
                        context3 = context5;
                        z6 = z3;
                        screen4 = screen3;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        final SnapshotState4<? extends GoldUnifiedValuePropsPromoViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(goldUnifiedValuePropsPromoDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        if (z5) {
                            OverrideSystemBarsStyle.OverrideStatusBarStyle((z5 && z6) ? i6 : true, composerStartRestartGroup, i6);
                            BentoTheme2.BentoTheme(Boolean.valueOf(z5), null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1115644224, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoComposableKt.GoldUnifiedValuePropsPromoComposable.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i11) {
                                    if ((i11 & 3) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1115644224, i11, -1, "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoComposable.<anonymous> (GoldUnifiedValuePropsPromoComposable.kt:118)");
                                    }
                                    LoggableViewState2 loggableViewState2LoadedState = GoldUnifiedValuePropsPromoComposable.GoldUnifiedValuePropsPromoComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2).loadedState();
                                    UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, screen4, null, context3, null, null, 53, null);
                                    GoldUnifiedValuePropsPromoDuxo goldUnifiedValuePropsPromoDuxo5 = goldUnifiedValuePropsPromoDuxo3;
                                    composer2.startReplaceGroup(5004770);
                                    boolean zChangedInstance2 = composer2.changedInstance(goldUnifiedValuePropsPromoDuxo5);
                                    Object objRememberedValue2 = composer2.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new GoldUnifiedValuePropsPromoComposable3(goldUnifiedValuePropsPromoDuxo5);
                                        composer2.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer2.endReplaceGroup();
                                    Function0 function0 = (Function0) ((KFunction) objRememberedValue2);
                                    GoldUnifiedValuePropsPromoDuxo goldUnifiedValuePropsPromoDuxo6 = goldUnifiedValuePropsPromoDuxo3;
                                    composer2.startReplaceGroup(5004770);
                                    boolean zChangedInstance3 = composer2.changedInstance(goldUnifiedValuePropsPromoDuxo6);
                                    Object objRememberedValue3 = composer2.rememberedValue();
                                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = new GoldUnifiedValuePropsPromoComposable4(goldUnifiedValuePropsPromoDuxo6);
                                        composer2.updateRememberedValue(objRememberedValue3);
                                    }
                                    composer2.endReplaceGroup();
                                    Function0 function02 = (Function0) ((KFunction) objRememberedValue3);
                                    final Modifier modifier6 = modifier3;
                                    final Context context6 = context3;
                                    final Screen screen6 = screen4;
                                    final GoldUnifiedValuePropsPromoDuxo goldUnifiedValuePropsPromoDuxo7 = goldUnifiedValuePropsPromoDuxo3;
                                    final boolean z9 = z6;
                                    final boolean z10 = z5;
                                    final SnapshotState4<? extends GoldUnifiedValuePropsPromoViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle2;
                                    ScreenLoggable2.ScreenLoggable(loggableViewState2LoadedState, userInteractionEventDescriptor, false, null, null, function0, function02, null, ComposableLambda3.rememberComposableLambda(-1077990306, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoComposableKt.GoldUnifiedValuePropsPromoComposable.1.3
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i12) {
                                            if ((i12 & 3) == 2 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1077990306, i12, -1, "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoComposable.<anonymous>.<anonymous> (GoldUnifiedValuePropsPromoComposable.kt:127)");
                                            }
                                            GoldUnifiedValuePropsPromoViewState goldUnifiedValuePropsPromoViewStateGoldUnifiedValuePropsPromoComposable$lambda$0 = GoldUnifiedValuePropsPromoComposable.GoldUnifiedValuePropsPromoComposable$lambda$0(snapshotState4);
                                            if (goldUnifiedValuePropsPromoViewStateGoldUnifiedValuePropsPromoComposable$lambda$0 instanceof GoldUnifiedValuePropsPromoViewState.Error) {
                                                composer3.startReplaceGroup(-938616920);
                                                GoldUnifiedErrorComposable.GoldUnifiedErrorComposable(context6, screen6, Background3.m4872backgroundbw27NRU$default(modifier6, BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), null, composer3, 0, 8);
                                                composer3.endReplaceGroup();
                                            } else if (goldUnifiedValuePropsPromoViewStateGoldUnifiedValuePropsPromoComposable$lambda$0 instanceof GoldUnifiedValuePropsPromoViewState.Loaded) {
                                                composer3.startReplaceGroup(-938268294);
                                                StreamValuePropsPromoContentResponse content = ((GoldUnifiedValuePropsPromoViewState.Loaded) goldUnifiedValuePropsPromoViewStateGoldUnifiedValuePropsPromoComposable$lambda$0).getContent();
                                                GoldUnifiedValuePropsPromoDuxo goldUnifiedValuePropsPromoDuxo8 = goldUnifiedValuePropsPromoDuxo7;
                                                composer3.startReplaceGroup(5004770);
                                                boolean zChangedInstance4 = composer3.changedInstance(goldUnifiedValuePropsPromoDuxo8);
                                                Object objRememberedValue4 = composer3.rememberedValue();
                                                if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue4 = new GoldUnifiedValuePropsPromoComposable5(goldUnifiedValuePropsPromoDuxo8);
                                                    composer3.updateRememberedValue(objRememberedValue4);
                                                }
                                                composer3.endReplaceGroup();
                                                GoldUnifiedValuePropsPromoComposable.Loaded(content, z9, z10, (Function1) objRememberedValue4, modifier6, composer3, 0, 0);
                                                composer3.endReplaceGroup();
                                            } else {
                                                if (!Intrinsics.areEqual(goldUnifiedValuePropsPromoViewStateGoldUnifiedValuePropsPromoComposable$lambda$0, GoldUnifiedValuePropsPromoViewState.Loading.INSTANCE)) {
                                                    composer3.startReplaceGroup(-861564450);
                                                    composer3.endReplaceGroup();
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                composer3.startReplaceGroup(-861539385);
                                                GoldUnifiedValuePropsPromoComposable.Loading(null, composer3, 0, 1);
                                                composer3.endReplaceGroup();
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer2, 54), composer2, 100663296, 156);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 15) & 14) | 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                            composerStartRestartGroup = composerStartRestartGroup;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            screen5 = screen4;
                            context4 = context3;
                            goldUnifiedValuePropsPromoDuxo4 = goldUnifiedValuePropsPromoDuxo3;
                            modifier4 = modifier3;
                            z7 = z6;
                            z8 = z5;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            context2 = context;
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            z4 = z2;
            if ((74899 & i3) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        z3 = z;
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        context2 = context;
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        z4 = z2;
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Loading(Modifier modifier, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-91689142);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            final Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-91689142, i3, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loading (GoldUnifiedValuePropsPromoComposable.kt:151)");
            }
            modifier3 = modifier4;
            ScaffoldKt.m5939ScaffoldTvnljyQ(null, null, null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1368882779, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoComposableKt.Loading.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                    invoke(paddingValues, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues paddingValues, Composer composer2, int i5) {
                    int i6;
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i5 & 6) == 0) {
                        i6 = i5 | (composer2.changed(paddingValues) ? 4 : 2);
                    } else {
                        i6 = i5;
                    }
                    if ((i6 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1368882779, i6, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loading.<anonymous> (GoldUnifiedValuePropsPromoComposable.kt:153)");
                    }
                    LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(Background3.m4872backgroundbw27NRU$default(PaddingKt.padding(modifier4, paddingValues), BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), null, true, true, composer2, 3456, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 805306368, 511);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldUnifiedValuePropsPromoComposable.Loading$lambda$2(modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Loaded(final StreamValuePropsPromoContentResponse streamValuePropsPromoContentResponse, final boolean z, final boolean z2, final Function1<? super Action, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1270613720);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(streamValuePropsPromoContentResponse) ? 4 : 2) | i;
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
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1270613720, i3, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded (GoldUnifiedValuePropsPromoComposable.kt:170)");
                }
                final ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(ModifiersKt.logScreenTransitions$default(modifier4, null, 1, null), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-331852400, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoComposableKt$Loaded$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-331852400, i5, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous>.<anonymous> (GoldUnifiedValuePropsPromoComposable.kt:176)");
                        }
                        GoldUnifiedValuePropsPromoComposable.AppBar(scrollStateRememberScrollState, z, z2, composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54);
                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-1751176431, true, new GoldUnifiedValuePropsPromoComposable8(streamValuePropsPromoContentResponse, function1), composerStartRestartGroup, 54);
                ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambda3.rememberComposableLambda(1328621275, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoComposableKt$Loaded$1$3
                    private static final LottieComposition invoke$lambda$15$lambda$1$lambda$0(LottieCompositionResult lottieCompositionResult) {
                        return lottieCompositionResult.getValue();
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i5) {
                        int i6;
                        Function1<Action, Unit> function12;
                        StreamValuePropsPromoContentResponse streamValuePropsPromoContentResponse2;
                        Modifier.Companion companion;
                        int i7;
                        String str;
                        Modifier.Companion companion2;
                        Object obj;
                        int i8;
                        float f;
                        int i9;
                        int i10;
                        BentoTheme bentoTheme;
                        Modifier.Companion companion3;
                        BentoTheme bentoTheme2;
                        Modifier.Companion companion4;
                        int i11;
                        int i12;
                        BentoTheme bentoTheme3;
                        Modifier.Companion companion5;
                        int i13;
                        int i14;
                        float f2;
                        int i15;
                        int i16;
                        BentoTheme bentoTheme4;
                        String asset_path;
                        Composer composer4 = composer3;
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i5 & 6) == 0) {
                            i6 = i5 | (composer4.changed(paddingValues) ? 4 : 2);
                        } else {
                            i6 = i5;
                        }
                        if ((i6 & 19) == 18 && composer4.getSkipping()) {
                            composer4.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1328621275, i6, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous>.<anonymous> (GoldUnifiedValuePropsPromoComposable.kt:193)");
                        }
                        LayoutDirection layoutDirection = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        Modifier.Companion companion6 = Modifier.INSTANCE;
                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(PaddingKt.m5146paddingqDBjuR0$default(companion6, PaddingKt.calculateStartPadding(paddingValues, layoutDirection), 0.0f, PaddingKt.calculateEndPadding(paddingValues, layoutDirection), paddingValues.getBottom(), 2, null), 0.0f, 1, null), scrollStateRememberScrollState, false, null, false, 14, null);
                        StreamValuePropsPromoContentResponse streamValuePropsPromoContentResponse3 = streamValuePropsPromoContentResponse;
                        Function1<Action, Unit> function13 = function1;
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion7 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion7.getStart(), composer4, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierVerticalScroll$default);
                        ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion8.getConstructor();
                        if (composer4.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor);
                        } else {
                            composer4.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion8.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion8.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion8.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion8.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        GoldLottieAnimation header_lottie_animation = streamValuePropsPromoContentResponse3.getHeader_lottie_animation();
                        composer4.startReplaceGroup(862272875);
                        if (header_lottie_animation == null) {
                            function12 = function13;
                            str = GoldUnifiedValuePropsPromoComposable.GoldUnifiedValuePropsPromoAssetTestTag;
                            companion = companion6;
                            streamValuePropsPromoContentResponse2 = streamValuePropsPromoContentResponse3;
                            i7 = 2;
                        } else {
                            function12 = function13;
                            LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(Endpoint.BrokerageStatic.INSTANCE.getURL_APP_ASSETS().newBuilder().addPathSegment(header_lottie_animation.getLottie_url()).build().getUrl())), null, null, null, null, null, composer4, 0, 62);
                            Modifier modifierTestTag = TestTag3.testTag(Background3.m4872backgroundbw27NRU$default(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(C18003R.dimen.gold_upgrade_gold_days_value_props_asset_height, composer4, 0)), BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21372getBg20d7_KjU(), null, 2, null), GoldUnifiedValuePropsPromoComposable.GoldUnifiedValuePropsPromoAssetTestTag);
                            ContentScale fillBounds = ContentScale.INSTANCE.getFillBounds();
                            LottieComposition lottieCompositionInvoke$lambda$15$lambda$1$lambda$0 = invoke$lambda$15$lambda$1$lambda$0(lottieCompositionResultRememberLottieComposition);
                            streamValuePropsPromoContentResponse2 = streamValuePropsPromoContentResponse3;
                            companion = companion6;
                            i7 = 2;
                            str = GoldUnifiedValuePropsPromoComposable.GoldUnifiedValuePropsPromoAssetTestTag;
                            LottieAnimation2.LottieAnimation(lottieCompositionInvoke$lambda$15$lambda$1$lambda$0, modifierTestTag, false, false, null, 0.0f, 0, false, false, false, null, false, false, null, null, fillBounds, false, false, null, false, null, composer3, 0, 196608, 0, 2064380);
                            composer4 = composer3;
                            Unit unit = Unit.INSTANCE;
                        }
                        composer4.endReplaceGroup();
                        composer4.startReplaceGroup(862303310);
                        if (streamValuePropsPromoContentResponse2.getHeader_lottie_animation() != null || (asset_path = streamValuePropsPromoContentResponse2.getAsset_path()) == null) {
                            companion2 = companion;
                            obj = null;
                            i8 = 1;
                            f = 0.0f;
                            i9 = 0;
                        } else {
                            obj = null;
                            companion2 = companion;
                            i8 = 1;
                            f = 0.0f;
                            i9 = 0;
                            ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageDensityUrl(asset_path, null, i7, null).getImageDensityUrl(ContextsUiExtensions.getDensitySpec((android.content.Context) composer4.consume(AndroidCompositionLocals_androidKt.getLocalContext()))), null, null, null, 0, null, composer4, 0, 62), (String) null, TestTag3.testTag(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(C18003R.dimen.gold_upgrade_gold_days_value_props_asset_height, composer4, 0)), str), (Alignment) null, ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, composer3, 24624, 104);
                            composer4 = composer3;
                            Unit unit2 = Unit.INSTANCE;
                        }
                        composer4.endReplaceGroup();
                        BentoTheme bentoTheme5 = BentoTheme.INSTANCE;
                        int i17 = BentoTheme.$stable;
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme5.getSpacing(composer4, i17).m21592getMediumD9Ej5fM()), composer4, i9);
                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, f, composer4, 6, i8);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion7.getStart(), composer4, i9);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, i9);
                        CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                        Function0<ComposeUiNode> constructor2 = companion8.getConstructor();
                        if (composer4.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor2);
                        } else {
                            composer4.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion8.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion8.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion8.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion8.getSetModifier());
                        GoldValuePropsInfoTag info_tag = streamValuePropsPromoContentResponse2.getInfo_tag();
                        composer4.startReplaceGroup(1380114602);
                        if (info_tag == null) {
                            i10 = i17;
                        } else {
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme5.getSpacing(composer4, i17).m21593getSmallD9Ej5fM()), composer4, i9);
                            i10 = i17;
                            GoldUnifiedValuePropsPromoComposable.m15172InfoTag7qC3k5A(info_tag, 0L, 0L, null, composer4, 0, 14);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme5.getSpacing(composer4, i10).m21590getDefaultD9Ej5fM()), composer4, i9);
                            Unit unit3 = Unit.INSTANCE;
                        }
                        composer4.endReplaceGroup();
                        String title = streamValuePropsPromoContentResponse2.getTitle();
                        composer4.startReplaceGroup(1380123554);
                        if (title == null) {
                            bentoTheme = bentoTheme5;
                            companion3 = companion2;
                        } else {
                            bentoTheme = bentoTheme5;
                            companion3 = companion2;
                            BentoText2.m20747BentoText38GnDrw(title, null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme5.getTypography(composer4, i10).getDisplayCapsuleLarge(), composer3, 0, 0, 8126);
                            composer4 = composer3;
                            Unit unit4 = Unit.INSTANCE;
                        }
                        composer4.endReplaceGroup();
                        String subtitle_markdown = streamValuePropsPromoContentResponse2.getSubtitle_markdown();
                        composer4.startReplaceGroup(1380133761);
                        if (subtitle_markdown == null) {
                            companion4 = companion3;
                            bentoTheme2 = bentoTheme;
                            i12 = 6;
                            i11 = 0;
                        } else {
                            bentoTheme2 = bentoTheme;
                            companion4 = companion3;
                            i11 = 0;
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme2.getSpacing(composer4, i10).m21593getSmallD9Ej5fM()), composer4, 0);
                            i12 = 6;
                            BentoMarkdownText2.BentoMarkdownText(subtitle_markdown, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(null, TextAlign.INSTANCE.m7924getStarte0LSkKk(), 0L, 0L, false, composer3, BentoMarkdownText.$stable << 15, 29), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer3, MarkdownStyle.$stable << 6, 26);
                            composer4 = composer3;
                            Unit unit5 = Unit.INSTANCE;
                        }
                        composer4.endReplaceGroup();
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme2.getSpacing(composer4, i10).m21591getLargeD9Ej5fM()), composer4, i11);
                        composer4.endNode();
                        composer4.startReplaceGroup(862375495);
                        Iterator<T> it = streamValuePropsPromoContentResponse2.getValue_props().iterator();
                        while (it.hasNext()) {
                            GoldValuePropRowComposable.GoldValuePropRowComposable((ValueProp) it.next(), null, composer4, i11, 2);
                        }
                        composer4.endReplaceGroup();
                        Modifier.Companion companion9 = Modifier.INSTANCE;
                        BentoTheme bentoTheme6 = BentoTheme.INSTANCE;
                        int i18 = BentoTheme.$stable;
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion9, bentoTheme6.getSpacing(composer4, i18).m21591getLargeD9Ej5fM()), composer4, i11);
                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion9, 0.0f, composer4, i12, 1);
                        MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, i11);
                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer4, i11);
                        CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer4, modifierM21623defaultHorizontalPaddingrAjV9yQ2);
                        ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor3 = companion10.getConstructor();
                        if (composer4.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor3);
                        } else {
                            composer4.useNode();
                        }
                        Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer4);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy3, companion10.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion10.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion10.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion10.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        GoldPromoPlanSelectionSection plan_selection_section = streamValuePropsPromoContentResponse2.getPlan_selection_section();
                        composer4.startReplaceGroup(265745313);
                        if (plan_selection_section != null) {
                            PlanSelectionSectionComposable.PlanSelectionSectionComposable(plan_selection_section.getTitle(), extensions2.toPersistentList(plan_selection_section.getOptions()), function12, true, composer3, 3072, 0);
                            composer4 = composer3;
                            Unit unit6 = Unit.INSTANCE;
                        }
                        composer4.endReplaceGroup();
                        String gold_free_days = streamValuePropsPromoContentResponse2.getGold_free_days();
                        composer4.startReplaceGroup(265758864);
                        if (gold_free_days == null) {
                            companion5 = companion9;
                            bentoTheme3 = bentoTheme6;
                            i14 = i18;
                            i13 = i11;
                        } else {
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion9, bentoTheme6.getSpacing(composer4, i18).m21592getMediumD9Ej5fM()), composer4, i11);
                            bentoTheme3 = bentoTheme6;
                            companion5 = companion9;
                            i13 = i11;
                            i14 = i18;
                            BentoText2.m20747BentoText38GnDrw(gold_free_days, null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16382);
                            composer4 = composer3;
                            Unit unit7 = Unit.INSTANCE;
                        }
                        composer4.endReplaceGroup();
                        GoldPromoPlanSection plan_section = streamValuePropsPromoContentResponse2.getPlan_section();
                        composer4.startReplaceGroup(265765793);
                        if (plan_section != null) {
                            GoldUnifiedValuePropsPromoComposable.PlanSection(plan_section, composer4, i13);
                            Unit unit8 = Unit.INSTANCE;
                        }
                        composer4.endReplaceGroup();
                        BentoTheme bentoTheme7 = bentoTheme3;
                        int i19 = i14;
                        Modifier.Companion companion11 = companion5;
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion11, bentoTheme7.getSpacing(composer4, i19).m21591getLargeD9Ej5fM()), composer4, i13);
                        composer4.endNode();
                        GoldPromoAdditionalValueProps additional_value_props = streamValuePropsPromoContentResponse2.getAdditional_value_props();
                        composer4.startReplaceGroup(862413514);
                        if (additional_value_props != null) {
                            GoldUnifiedValuePropsPromoComposable.AdditionalValueProps(additional_value_props, composer4, i13);
                            Unit unit9 = Unit.INSTANCE;
                        }
                        composer4.endReplaceGroup();
                        GoldPromoInfoBanner info_banner = streamValuePropsPromoContentResponse2.getInfo_banner();
                        composer4.startReplaceGroup(862418890);
                        if (info_banner == null) {
                            f2 = 0.0f;
                            i15 = 6;
                            i16 = 1;
                        } else {
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion11, bentoTheme7.getSpacing(composer4, i19).m21591getLargeD9Ej5fM()), composer4, i13);
                            f2 = 0.0f;
                            i15 = 6;
                            i16 = 1;
                            GoldUnifiedValuePropsPromoComposable.InfoBanner(info_banner, com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion11, 0.0f, composer4, 6, 1), composer4, i13, i13);
                            Unit unit10 = Unit.INSTANCE;
                        }
                        composer4.endReplaceGroup();
                        String disclosure_markdown = streamValuePropsPromoContentResponse2.getDisclosure_markdown();
                        composer4.startReplaceGroup(862429773);
                        if (disclosure_markdown == null) {
                            bentoTheme4 = bentoTheme7;
                        } else {
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion11, bentoTheme7.getSpacing(composer4, i19).m21591getLargeD9Ej5fM()), composer4, i13);
                            int i20 = i15;
                            bentoTheme4 = bentoTheme7;
                            BentoMarkdownText2.BentoMarkdownText(disclosure_markdown, com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion11, f2, composer3, i20, i16), BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme7.getTypography(composer4, i19).getTextS(), 0, bentoTheme7.getColors(composer4, i19).m21426getFg20d7_KjU(), bentoTheme7.getColors(composer4, i19).m21426getFg20d7_KjU(), false, composer3, BentoMarkdownText.$stable << 15, 18), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer3, MarkdownStyle.$stable << i20, 24);
                            composer4 = composer3;
                            Unit unit11 = Unit.INSTANCE;
                        }
                        composer4.endReplaceGroup();
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion11, bentoTheme4.getSpacing(composer4, i19).m21592getMediumD9Ej5fM()), composer4, 0);
                        composer4.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54);
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifierM4872backgroundbw27NRU$default, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, null, null, 0, 0L, 0L, null, composableLambdaRememberComposableLambda3, composer2, 805306800, 504);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoComposableKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GoldUnifiedValuePropsPromoComposable.Loaded$lambda$4(streamValuePropsPromoContentResponse, z, z2, function1, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final ScrollState scrollStateRememberScrollState2 = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(ModifiersKt.logScreenTransitions$default(modifier4, null, 1, null), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
            ComposableLambda composableLambdaRememberComposableLambda4 = ComposableLambda3.rememberComposableLambda(-331852400, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoComposableKt$Loaded$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-331852400, i5, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous>.<anonymous> (GoldUnifiedValuePropsPromoComposable.kt:176)");
                    }
                    GoldUnifiedValuePropsPromoComposable.AppBar(scrollStateRememberScrollState2, z, z2, composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54);
            ComposableLambda composableLambdaRememberComposableLambda22 = ComposableLambda3.rememberComposableLambda(-1751176431, true, new GoldUnifiedValuePropsPromoComposable8(streamValuePropsPromoContentResponse, function1), composerStartRestartGroup, 54);
            ComposableLambda composableLambdaRememberComposableLambda32 = ComposableLambda3.rememberComposableLambda(1328621275, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoComposableKt$Loaded$1$3
                private static final LottieComposition invoke$lambda$15$lambda$1$lambda$0(LottieCompositionResult lottieCompositionResult) {
                    return lottieCompositionResult.getValue();
                }

                public final void invoke(PaddingValues paddingValues, Composer composer3, int i5) {
                    int i6;
                    Function1<Action, Unit> function12;
                    StreamValuePropsPromoContentResponse streamValuePropsPromoContentResponse2;
                    Modifier.Companion companion;
                    int i7;
                    String str;
                    Modifier.Companion companion2;
                    Object obj;
                    int i8;
                    float f;
                    int i9;
                    int i10;
                    BentoTheme bentoTheme;
                    Modifier.Companion companion3;
                    BentoTheme bentoTheme2;
                    Modifier.Companion companion4;
                    int i11;
                    int i12;
                    BentoTheme bentoTheme3;
                    Modifier.Companion companion5;
                    int i13;
                    int i14;
                    float f2;
                    int i15;
                    int i16;
                    BentoTheme bentoTheme4;
                    String asset_path;
                    Composer composer4 = composer3;
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i5 & 6) == 0) {
                        i6 = i5 | (composer4.changed(paddingValues) ? 4 : 2);
                    } else {
                        i6 = i5;
                    }
                    if ((i6 & 19) == 18 && composer4.getSkipping()) {
                        composer4.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1328621275, i6, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous>.<anonymous> (GoldUnifiedValuePropsPromoComposable.kt:193)");
                    }
                    LayoutDirection layoutDirection = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    Modifier.Companion companion6 = Modifier.INSTANCE;
                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(PaddingKt.m5146paddingqDBjuR0$default(companion6, PaddingKt.calculateStartPadding(paddingValues, layoutDirection), 0.0f, PaddingKt.calculateEndPadding(paddingValues, layoutDirection), paddingValues.getBottom(), 2, null), 0.0f, 1, null), scrollStateRememberScrollState2, false, null, false, 14, null);
                    StreamValuePropsPromoContentResponse streamValuePropsPromoContentResponse3 = streamValuePropsPromoContentResponse;
                    Function1<Action, Unit> function13 = function1;
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion7 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion7.getStart(), composer4, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierVerticalScroll$default);
                    ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion8.getConstructor();
                    if (composer4.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion8.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion8.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion8.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion8.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    GoldLottieAnimation header_lottie_animation = streamValuePropsPromoContentResponse3.getHeader_lottie_animation();
                    composer4.startReplaceGroup(862272875);
                    if (header_lottie_animation == null) {
                        function12 = function13;
                        str = GoldUnifiedValuePropsPromoComposable.GoldUnifiedValuePropsPromoAssetTestTag;
                        companion = companion6;
                        streamValuePropsPromoContentResponse2 = streamValuePropsPromoContentResponse3;
                        i7 = 2;
                    } else {
                        function12 = function13;
                        LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(Endpoint.BrokerageStatic.INSTANCE.getURL_APP_ASSETS().newBuilder().addPathSegment(header_lottie_animation.getLottie_url()).build().getUrl())), null, null, null, null, null, composer4, 0, 62);
                        Modifier modifierTestTag = TestTag3.testTag(Background3.m4872backgroundbw27NRU$default(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(C18003R.dimen.gold_upgrade_gold_days_value_props_asset_height, composer4, 0)), BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21372getBg20d7_KjU(), null, 2, null), GoldUnifiedValuePropsPromoComposable.GoldUnifiedValuePropsPromoAssetTestTag);
                        ContentScale fillBounds = ContentScale.INSTANCE.getFillBounds();
                        LottieComposition lottieCompositionInvoke$lambda$15$lambda$1$lambda$0 = invoke$lambda$15$lambda$1$lambda$0(lottieCompositionResultRememberLottieComposition);
                        streamValuePropsPromoContentResponse2 = streamValuePropsPromoContentResponse3;
                        companion = companion6;
                        i7 = 2;
                        str = GoldUnifiedValuePropsPromoComposable.GoldUnifiedValuePropsPromoAssetTestTag;
                        LottieAnimation2.LottieAnimation(lottieCompositionInvoke$lambda$15$lambda$1$lambda$0, modifierTestTag, false, false, null, 0.0f, 0, false, false, false, null, false, false, null, null, fillBounds, false, false, null, false, null, composer3, 0, 196608, 0, 2064380);
                        composer4 = composer3;
                        Unit unit = Unit.INSTANCE;
                    }
                    composer4.endReplaceGroup();
                    composer4.startReplaceGroup(862303310);
                    if (streamValuePropsPromoContentResponse2.getHeader_lottie_animation() != null || (asset_path = streamValuePropsPromoContentResponse2.getAsset_path()) == null) {
                        companion2 = companion;
                        obj = null;
                        i8 = 1;
                        f = 0.0f;
                        i9 = 0;
                    } else {
                        obj = null;
                        companion2 = companion;
                        i8 = 1;
                        f = 0.0f;
                        i9 = 0;
                        ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageDensityUrl(asset_path, null, i7, null).getImageDensityUrl(ContextsUiExtensions.getDensitySpec((android.content.Context) composer4.consume(AndroidCompositionLocals_androidKt.getLocalContext()))), null, null, null, 0, null, composer4, 0, 62), (String) null, TestTag3.testTag(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(C18003R.dimen.gold_upgrade_gold_days_value_props_asset_height, composer4, 0)), str), (Alignment) null, ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, composer3, 24624, 104);
                        composer4 = composer3;
                        Unit unit2 = Unit.INSTANCE;
                    }
                    composer4.endReplaceGroup();
                    BentoTheme bentoTheme5 = BentoTheme.INSTANCE;
                    int i17 = BentoTheme.$stable;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme5.getSpacing(composer4, i17).m21592getMediumD9Ej5fM()), composer4, i9);
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, f, composer4, 6, i8);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion7.getStart(), composer4, i9);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, i9);
                    CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                    Function0<ComposeUiNode> constructor2 = companion8.getConstructor();
                    if (composer4.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor2);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion8.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion8.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion8.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion8.getSetModifier());
                    GoldValuePropsInfoTag info_tag = streamValuePropsPromoContentResponse2.getInfo_tag();
                    composer4.startReplaceGroup(1380114602);
                    if (info_tag == null) {
                        i10 = i17;
                    } else {
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme5.getSpacing(composer4, i17).m21593getSmallD9Ej5fM()), composer4, i9);
                        i10 = i17;
                        GoldUnifiedValuePropsPromoComposable.m15172InfoTag7qC3k5A(info_tag, 0L, 0L, null, composer4, 0, 14);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme5.getSpacing(composer4, i10).m21590getDefaultD9Ej5fM()), composer4, i9);
                        Unit unit3 = Unit.INSTANCE;
                    }
                    composer4.endReplaceGroup();
                    String title = streamValuePropsPromoContentResponse2.getTitle();
                    composer4.startReplaceGroup(1380123554);
                    if (title == null) {
                        bentoTheme = bentoTheme5;
                        companion3 = companion2;
                    } else {
                        bentoTheme = bentoTheme5;
                        companion3 = companion2;
                        BentoText2.m20747BentoText38GnDrw(title, null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme5.getTypography(composer4, i10).getDisplayCapsuleLarge(), composer3, 0, 0, 8126);
                        composer4 = composer3;
                        Unit unit4 = Unit.INSTANCE;
                    }
                    composer4.endReplaceGroup();
                    String subtitle_markdown = streamValuePropsPromoContentResponse2.getSubtitle_markdown();
                    composer4.startReplaceGroup(1380133761);
                    if (subtitle_markdown == null) {
                        companion4 = companion3;
                        bentoTheme2 = bentoTheme;
                        i12 = 6;
                        i11 = 0;
                    } else {
                        bentoTheme2 = bentoTheme;
                        companion4 = companion3;
                        i11 = 0;
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme2.getSpacing(composer4, i10).m21593getSmallD9Ej5fM()), composer4, 0);
                        i12 = 6;
                        BentoMarkdownText2.BentoMarkdownText(subtitle_markdown, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(null, TextAlign.INSTANCE.m7924getStarte0LSkKk(), 0L, 0L, false, composer3, BentoMarkdownText.$stable << 15, 29), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer3, MarkdownStyle.$stable << 6, 26);
                        composer4 = composer3;
                        Unit unit5 = Unit.INSTANCE;
                    }
                    composer4.endReplaceGroup();
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme2.getSpacing(composer4, i10).m21591getLargeD9Ej5fM()), composer4, i11);
                    composer4.endNode();
                    composer4.startReplaceGroup(862375495);
                    Iterator<T> it = streamValuePropsPromoContentResponse2.getValue_props().iterator();
                    while (it.hasNext()) {
                        GoldValuePropRowComposable.GoldValuePropRowComposable((ValueProp) it.next(), null, composer4, i11, 2);
                    }
                    composer4.endReplaceGroup();
                    Modifier.Companion companion9 = Modifier.INSTANCE;
                    BentoTheme bentoTheme6 = BentoTheme.INSTANCE;
                    int i18 = BentoTheme.$stable;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion9, bentoTheme6.getSpacing(composer4, i18).m21591getLargeD9Ej5fM()), composer4, i11);
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion9, 0.0f, composer4, i12, 1);
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, i11);
                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer4, i11);
                    CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer4, modifierM21623defaultHorizontalPaddingrAjV9yQ2);
                    ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion10.getConstructor();
                    if (composer4.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor3);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer4);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy3, companion10.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion10.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion10.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion10.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    GoldPromoPlanSelectionSection plan_selection_section = streamValuePropsPromoContentResponse2.getPlan_selection_section();
                    composer4.startReplaceGroup(265745313);
                    if (plan_selection_section != null) {
                        PlanSelectionSectionComposable.PlanSelectionSectionComposable(plan_selection_section.getTitle(), extensions2.toPersistentList(plan_selection_section.getOptions()), function12, true, composer3, 3072, 0);
                        composer4 = composer3;
                        Unit unit6 = Unit.INSTANCE;
                    }
                    composer4.endReplaceGroup();
                    String gold_free_days = streamValuePropsPromoContentResponse2.getGold_free_days();
                    composer4.startReplaceGroup(265758864);
                    if (gold_free_days == null) {
                        companion5 = companion9;
                        bentoTheme3 = bentoTheme6;
                        i14 = i18;
                        i13 = i11;
                    } else {
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion9, bentoTheme6.getSpacing(composer4, i18).m21592getMediumD9Ej5fM()), composer4, i11);
                        bentoTheme3 = bentoTheme6;
                        companion5 = companion9;
                        i13 = i11;
                        i14 = i18;
                        BentoText2.m20747BentoText38GnDrw(gold_free_days, null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16382);
                        composer4 = composer3;
                        Unit unit7 = Unit.INSTANCE;
                    }
                    composer4.endReplaceGroup();
                    GoldPromoPlanSection plan_section = streamValuePropsPromoContentResponse2.getPlan_section();
                    composer4.startReplaceGroup(265765793);
                    if (plan_section != null) {
                        GoldUnifiedValuePropsPromoComposable.PlanSection(plan_section, composer4, i13);
                        Unit unit8 = Unit.INSTANCE;
                    }
                    composer4.endReplaceGroup();
                    BentoTheme bentoTheme7 = bentoTheme3;
                    int i19 = i14;
                    Modifier.Companion companion11 = companion5;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion11, bentoTheme7.getSpacing(composer4, i19).m21591getLargeD9Ej5fM()), composer4, i13);
                    composer4.endNode();
                    GoldPromoAdditionalValueProps additional_value_props = streamValuePropsPromoContentResponse2.getAdditional_value_props();
                    composer4.startReplaceGroup(862413514);
                    if (additional_value_props != null) {
                        GoldUnifiedValuePropsPromoComposable.AdditionalValueProps(additional_value_props, composer4, i13);
                        Unit unit9 = Unit.INSTANCE;
                    }
                    composer4.endReplaceGroup();
                    GoldPromoInfoBanner info_banner = streamValuePropsPromoContentResponse2.getInfo_banner();
                    composer4.startReplaceGroup(862418890);
                    if (info_banner == null) {
                        f2 = 0.0f;
                        i15 = 6;
                        i16 = 1;
                    } else {
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion11, bentoTheme7.getSpacing(composer4, i19).m21591getLargeD9Ej5fM()), composer4, i13);
                        f2 = 0.0f;
                        i15 = 6;
                        i16 = 1;
                        GoldUnifiedValuePropsPromoComposable.InfoBanner(info_banner, com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion11, 0.0f, composer4, 6, 1), composer4, i13, i13);
                        Unit unit10 = Unit.INSTANCE;
                    }
                    composer4.endReplaceGroup();
                    String disclosure_markdown = streamValuePropsPromoContentResponse2.getDisclosure_markdown();
                    composer4.startReplaceGroup(862429773);
                    if (disclosure_markdown == null) {
                        bentoTheme4 = bentoTheme7;
                    } else {
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion11, bentoTheme7.getSpacing(composer4, i19).m21591getLargeD9Ej5fM()), composer4, i13);
                        int i20 = i15;
                        bentoTheme4 = bentoTheme7;
                        BentoMarkdownText2.BentoMarkdownText(disclosure_markdown, com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion11, f2, composer3, i20, i16), BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme7.getTypography(composer4, i19).getTextS(), 0, bentoTheme7.getColors(composer4, i19).m21426getFg20d7_KjU(), bentoTheme7.getColors(composer4, i19).m21426getFg20d7_KjU(), false, composer3, BentoMarkdownText.$stable << 15, 18), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer3, MarkdownStyle.$stable << i20, 24);
                        composer4 = composer3;
                        Unit unit11 = Unit.INSTANCE;
                    }
                    composer4.endReplaceGroup();
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion11, bentoTheme4.getSpacing(composer4, i19).m21592getMediumD9Ej5fM()), composer4, 0);
                    composer4.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54);
            Modifier modifier52 = modifier4;
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifierM4872backgroundbw27NRU$default2, composableLambdaRememberComposableLambda4, composableLambdaRememberComposableLambda22, null, null, 0, 0L, 0L, null, composableLambdaRememberComposableLambda32, composer2, 805306800, 504);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PlanSection(final GoldPromoPlanSection goldPromoPlanSection, Composer composer, final int i) {
        int i2;
        int i3;
        Modifier.Companion companion;
        Composer composerStartRestartGroup = composer.startRestartGroup(1422646688);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(goldPromoPlanSection) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1422646688, i2, -1, "com.robinhood.android.gold.upgrade.unified.screen.PlanSection (GoldUnifiedValuePropsPromoComposable.kt:319)");
            }
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), bentoTheme.getColors(composerStartRestartGroup, i4).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 6, 4);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
            GoldValuePropsInfoTag info_tag = goldPromoPlanSection.getInfo_tag();
            composerStartRestartGroup.startReplaceGroup(-1007844366);
            if (info_tag != null) {
                m15172InfoTag7qC3k5A(info_tag, bentoTheme.getColors(composerStartRestartGroup, i4).m21372getBg20d7_KjU(), 0L, null, composerStartRestartGroup, 3072, 4);
                composerStartRestartGroup = composerStartRestartGroup;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            String title = goldPromoPlanSection.getTitle();
            composerStartRestartGroup.startReplaceGroup(-1007835082);
            if (title == null) {
                companion = companion2;
                i3 = i4;
            } else {
                Composer composer2 = composerStartRestartGroup;
                i3 = i4;
                companion = companion2;
                BentoText2.m20747BentoText38GnDrw(title, null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getDisplayCapsuleSmall(), composer2, 0, 0, 8126);
                composerStartRestartGroup = composer2;
            }
            composerStartRestartGroup.endReplaceGroup();
            String subtitle = goldPromoPlanSection.getSubtitle();
            composerStartRestartGroup.startReplaceGroup(-1007827497);
            if (subtitle != null) {
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                Composer composer3 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(subtitle, null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM(), composer3, 0, 0, 8126);
                composerStartRestartGroup = composer3;
            }
            composerStartRestartGroup.endReplaceGroup();
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), bentoTheme.getColors(composerStartRestartGroup, i3).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 6, 4);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldUnifiedValuePropsPromoComposable.PlanSection$lambda$9(goldPromoPlanSection, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InfoBanner(final GoldPromoInfoBanner goldPromoInfoBanner, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        BentoIcon4 bentoIcon;
        int i4;
        String content_markdown;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(2017005235);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(goldPromoInfoBanner) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) != 18 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2017005235, i3, -1, "com.robinhood.android.gold.upgrade.unified.screen.InfoBanner (GoldUnifiedValuePropsPromoComposable.kt:354)");
                }
                Arrangement arrangement = Arrangement.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM());
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(Background3.m4872backgroundbw27NRU$default(BorderKt.m4876borderxT4_qwU(modifier3, C2002Dp.m7995constructorimpl(1), bentoTheme.getColors(composerStartRestartGroup, i6).m21373getBg30d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM())), bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU(), null, 2, null), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM());
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerVertically, composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5142padding3ABfNKs);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                ServerToBentoAssetMapper2.Companion companion2 = ServerToBentoAssetMapper2.INSTANCE;
                Icon icon = goldPromoInfoBanner.getIcon();
                ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue = companion2.fromServerValue(icon == null ? IconKt.getServerValue(icon) : null);
                bentoIcon = serverToBentoAssetMapper2FromServerValue != null ? BentoIcon4.INSTANCE.toBentoIcon(serverToBentoAssetMapper2FromServerValue) : null;
                composerStartRestartGroup.startReplaceGroup(1031861407);
                if (bentoIcon == null) {
                    i4 = i6;
                    BentoIcon2.m20644BentoIconFU0evQE(bentoIcon, null, bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU(), null, null, false, composerStartRestartGroup, BentoIcon4.$stable | 48, 56);
                } else {
                    i4 = i6;
                }
                composerStartRestartGroup.endReplaceGroup();
                content_markdown = goldPromoInfoBanner.getContent_markdown();
                composerStartRestartGroup.startReplaceGroup(1031866071);
                if (content_markdown != null) {
                    BentoMarkdownText2.BentoMarkdownText(content_markdown, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composerStartRestartGroup, i4).getTextS(), 0, 0L, bentoTheme.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU(), false, composerStartRestartGroup, BentoMarkdownText.$stable << 15, 22), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, MarkdownStyle.$stable << 6, 26);
                    composerStartRestartGroup = composerStartRestartGroup;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GoldUnifiedValuePropsPromoComposable.InfoBanner$lambda$13(goldPromoInfoBanner, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) != 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Arrangement arrangement2 = Arrangement.INSTANCE;
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i62 = BentoTheme.$stable;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = arrangement2.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM());
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            Modifier modifierM5142padding3ABfNKs2 = PaddingKt.m5142padding3ABfNKs(Background3.m4872backgroundbw27NRU$default(BorderKt.m4876borderxT4_qwU(modifier3, C2002Dp.m7995constructorimpl(1), bentoTheme2.getColors(composerStartRestartGroup, i62).m21373getBg30d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM())), bentoTheme2.getColors(composerStartRestartGroup, i62).m21371getBg0d7_KjU(), null, 2, null), bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM());
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_42, centerVertically2, composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5142padding3ABfNKs2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                Row6 row62 = Row6.INSTANCE;
                ServerToBentoAssetMapper2.Companion companion22 = ServerToBentoAssetMapper2.INSTANCE;
                Icon icon2 = goldPromoInfoBanner.getIcon();
                ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue2 = companion22.fromServerValue(icon2 == null ? IconKt.getServerValue(icon2) : null);
                if (serverToBentoAssetMapper2FromServerValue2 != null) {
                }
                composerStartRestartGroup.startReplaceGroup(1031861407);
                if (bentoIcon == null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                content_markdown = goldPromoInfoBanner.getContent_markdown();
                composerStartRestartGroup.startReplaceGroup(1031866071);
                if (content_markdown != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0161  */
    /* renamed from: InfoTag-7qC3k5A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m15172InfoTag7qC3k5A(final GoldValuePropsInfoTag goldValuePropsInfoTag, long j, long j2, Color color, Composer composer, final int i, final int i2) {
        int i3;
        long jM21371getBg0d7_KjU;
        final long jM21425getFg0d7_KjU;
        Color colorM6701boximpl;
        Color color2;
        Modifier modifierM4876borderxT4_qwU;
        final long j3;
        final Color color3;
        final long j4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-840520351);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(goldValuePropsInfoTag) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                jM21371getBg0d7_KjU = j;
                int i4 = composerStartRestartGroup.changed(jM21371getBg0d7_KjU) ? 32 : 16;
                i3 |= i4;
            } else {
                jM21371getBg0d7_KjU = j;
            }
            i3 |= i4;
        } else {
            jM21371getBg0d7_KjU = j;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                jM21425getFg0d7_KjU = j2;
                int i5 = composerStartRestartGroup.changed(jM21425getFg0d7_KjU) ? 256 : 128;
                i3 |= i5;
            } else {
                jM21425getFg0d7_KjU = j2;
            }
            i3 |= i5;
        } else {
            jM21425getFg0d7_KjU = j2;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                colorM6701boximpl = color;
                int i6 = composerStartRestartGroup.changed(colorM6701boximpl) ? 2048 : 1024;
                i3 |= i6;
            } else {
                colorM6701boximpl = color;
            }
            i3 |= i6;
        } else {
            colorM6701boximpl = color;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                int i7 = i3;
                color2 = colorM6701boximpl;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                if (color2 == null) {
                }
                int i8 = i7 << 3;
                long j5 = jM21371getBg0d7_KjU;
                SurfaceKt.m5967SurfaceT9BRK9s(UtilKt.autoLogEvents(Modifier.INSTANCE, Component.ComponentType.BUTTON, goldValuePropsInfoTag.getIdentifier(), false, composerStartRestartGroup, 54, 4).then(modifierM4876borderxT4_qwU), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(InfoTagDefaults.INSTANCE.m20818getShapeRadiusD9Ej5fM()), j5, jM21425getFg0d7_KjU, 0.0f, 0.0f, null, ComposableLambda3.rememberComposableLambda(-19905604, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoComposableKt$InfoTag$1
                    public final void invoke(Composer composer2, int i9) {
                        if ((i9 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-19905604, i9, -1, "com.robinhood.android.gold.upgrade.unified.screen.InfoTag.<anonymous> (GoldUnifiedValuePropsPromoComposable.kt:401)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i10 = BentoTheme.$stable;
                        Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(companion, C2002Dp.m7995constructorimpl(bentoTheme.getSpacing(composer2, i10).m21593getSmallD9Ej5fM() + bentoTheme.getSpacing(composer2, i10).m21595getXsmallD9Ej5fM()), bentoTheme.getSpacing(composer2, i10).m21595getXsmallD9Ej5fM(), bentoTheme.getSpacing(composer2, i10).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer2, i10).m21595getXsmallD9Ej5fM());
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        GoldValuePropsInfoTag goldValuePropsInfoTag2 = goldValuePropsInfoTag;
                        long j6 = jM21425getFg0d7_KjU;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5145paddingqDBjuR0);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        ServerToBentoAssetMapper2.Companion companion3 = ServerToBentoAssetMapper2.INSTANCE;
                        Icon icon = goldValuePropsInfoTag2.getIcon();
                        ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue = companion3.fromServerValue(icon != null ? IconKt.getServerValue(icon) : null);
                        composer2.startReplaceGroup(259374810);
                        if (serverToBentoAssetMapper2FromServerValue != null) {
                            composer2.startReplaceGroup(259375881);
                            if (serverToBentoAssetMapper2FromServerValue != ServerToBentoAssetMapper2.UNKNOWN) {
                                androidx.compose.material3.IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(serverToBentoAssetMapper2FromServerValue.getResourceId(), composer2, 0), serverToBentoAssetMapper2FromServerValue.getServerValue(), LocalShowPlaceholder.withBentoCirclePlaceholder$default(SizeKt.m5169size3ABfNKs(companion, C2002Dp.m7995constructorimpl(16)), false, 1, null), j6, composer2, 0, 0);
                            }
                            composer2.endReplaceGroup();
                        }
                        composer2.endReplaceGroup();
                        Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, bentoTheme.getSpacing(composer2, i10).m21593getSmallD9Ej5fM()), composer2, 0);
                        BentoText2.m20747BentoText38GnDrw(goldValuePropsInfoTag2.getLabel(), null, Color.m6701boximpl(j6), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i10).getTextS(), composer2, 24576, 0, 8170);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (i8 & 896) | 12582912 | (i8 & 7168), 112);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                }
                j3 = jM21425getFg0d7_KjU;
                color3 = color2;
                j4 = j5;
            } else {
                if ((i2 & 2) != 0) {
                    jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU();
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    colorM6701boximpl = Color.m6701boximpl(jM21425getFg0d7_KjU);
                    i3 &= -7169;
                }
                int i72 = i3;
                color2 = colorM6701boximpl;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-840520351, i72, -1, "com.robinhood.android.gold.upgrade.unified.screen.InfoTag (GoldUnifiedValuePropsPromoComposable.kt:380)");
                }
                if (color2 == null) {
                    modifierM4876borderxT4_qwU = BorderKt.m4876borderxT4_qwU(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(1), color2.getValue(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(InfoTagDefaults.INSTANCE.m20818getShapeRadiusD9Ej5fM()));
                } else {
                    modifierM4876borderxT4_qwU = Modifier.INSTANCE;
                }
                int i82 = i72 << 3;
                long j52 = jM21371getBg0d7_KjU;
                SurfaceKt.m5967SurfaceT9BRK9s(UtilKt.autoLogEvents(Modifier.INSTANCE, Component.ComponentType.BUTTON, goldValuePropsInfoTag.getIdentifier(), false, composerStartRestartGroup, 54, 4).then(modifierM4876borderxT4_qwU), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(InfoTagDefaults.INSTANCE.m20818getShapeRadiusD9Ej5fM()), j52, jM21425getFg0d7_KjU, 0.0f, 0.0f, null, ComposableLambda3.rememberComposableLambda(-19905604, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoComposableKt$InfoTag$1
                    public final void invoke(Composer composer2, int i9) {
                        if ((i9 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-19905604, i9, -1, "com.robinhood.android.gold.upgrade.unified.screen.InfoTag.<anonymous> (GoldUnifiedValuePropsPromoComposable.kt:401)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i10 = BentoTheme.$stable;
                        Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(companion, C2002Dp.m7995constructorimpl(bentoTheme.getSpacing(composer2, i10).m21593getSmallD9Ej5fM() + bentoTheme.getSpacing(composer2, i10).m21595getXsmallD9Ej5fM()), bentoTheme.getSpacing(composer2, i10).m21595getXsmallD9Ej5fM(), bentoTheme.getSpacing(composer2, i10).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer2, i10).m21595getXsmallD9Ej5fM());
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        GoldValuePropsInfoTag goldValuePropsInfoTag2 = goldValuePropsInfoTag;
                        long j6 = jM21425getFg0d7_KjU;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5145paddingqDBjuR0);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        ServerToBentoAssetMapper2.Companion companion3 = ServerToBentoAssetMapper2.INSTANCE;
                        Icon icon = goldValuePropsInfoTag2.getIcon();
                        ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue = companion3.fromServerValue(icon != null ? IconKt.getServerValue(icon) : null);
                        composer2.startReplaceGroup(259374810);
                        if (serverToBentoAssetMapper2FromServerValue != null) {
                            composer2.startReplaceGroup(259375881);
                            if (serverToBentoAssetMapper2FromServerValue != ServerToBentoAssetMapper2.UNKNOWN) {
                                androidx.compose.material3.IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(serverToBentoAssetMapper2FromServerValue.getResourceId(), composer2, 0), serverToBentoAssetMapper2FromServerValue.getServerValue(), LocalShowPlaceholder.withBentoCirclePlaceholder$default(SizeKt.m5169size3ABfNKs(companion, C2002Dp.m7995constructorimpl(16)), false, 1, null), j6, composer2, 0, 0);
                            }
                            composer2.endReplaceGroup();
                        }
                        composer2.endReplaceGroup();
                        Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, bentoTheme.getSpacing(composer2, i10).m21593getSmallD9Ej5fM()), composer2, 0);
                        BentoText2.m20747BentoText38GnDrw(goldValuePropsInfoTag2.getLabel(), null, Color.m6701boximpl(j6), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i10).getTextS(), composer2, 24576, 0, 8170);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (i82 & 896) | 12582912 | (i82 & 7168), 112);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j3 = jM21425getFg0d7_KjU;
                color3 = color2;
                j4 = j52;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            j4 = jM21371getBg0d7_KjU;
            j3 = jM21425getFg0d7_KjU;
            color3 = colorM6701boximpl;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldUnifiedValuePropsPromoComposable.InfoTag_7qC3k5A$lambda$14(goldValuePropsInfoTag, j4, j3, color3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AppBar(ScrollState scrollState, final boolean z, final boolean z2, Composer composer, final int i) {
        int i2;
        final long j;
        final SnapshotState snapshotState;
        Object obj;
        final long j2;
        final ScrollState scrollState2 = scrollState;
        Composer composerStartRestartGroup = composer.startRestartGroup(2083993549);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(scrollState2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2083993549, i3, -1, "com.robinhood.android.gold.upgrade.unified.screen.AppBar (GoldUnifiedValuePropsPromoComposable.kt:441)");
            }
            final NavHostController navController = ((LifecycleAwareNavigator) composerStartRestartGroup.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator())).getNavController();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            long jet = bentoTheme.getColors(composerStartRestartGroup, i4).getJet();
            long nova = bentoTheme.getColors(composerStartRestartGroup, i4).getNova();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Color.m6701boximpl(z2 ? jet : nova), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            final EdgeToEdgeHost edgeToEdgeHost = (EdgeToEdgeHost) composerStartRestartGroup.consume(LocalEdgeToEdgeHost.getLocalEdgeToEdgeHost());
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance = ((i3 & 112) == 32) | composerStartRestartGroup.changedInstance(edgeToEdgeHost) | composerStartRestartGroup.changed(nova) | composerStartRestartGroup.changed(jet);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                j = jet;
                snapshotState = snapshotState2;
                j2 = nova;
                obj = new Function1() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoComposableKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return GoldUnifiedValuePropsPromoComposable.AppBar$lambda$19$lambda$18(z, edgeToEdgeHost, j2, j, snapshotState, ((Boolean) obj2).booleanValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                snapshotState = snapshotState2;
                obj = objRememberedValue2;
                j = jet;
                j2 = nova;
            }
            Function1 function1 = (Function1) obj;
            composerStartRestartGroup.endReplaceGroup();
            float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(C18003R.dimen.gold_upgrade_gold_days_value_props_asset_height, composerStartRestartGroup, 0);
            long j3 = z2 ? j2 : j;
            if (z2) {
                j2 = j;
            }
            scrollState2 = scrollState;
            BentoAppBarWithTransition.m12210BentoAppBarWithTransitionzVdqMik(scrollState2, fDimensionResource, null, ComposableLambda3.rememberComposableLambda(1052560242, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoComposableKt.AppBar.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer2, Integer num) {
                    invoke(bentoAppBarScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(final BentoAppBarScope BentoAppBarWithTransition, Composer composer2, int i5) {
                    int i6;
                    Intrinsics.checkNotNullParameter(BentoAppBarWithTransition, "$this$BentoAppBarWithTransition");
                    if ((i5 & 6) == 0) {
                        i6 = i5 | ((i5 & 8) == 0 ? composer2.changed(BentoAppBarWithTransition) : composer2.changedInstance(BentoAppBarWithTransition) ? 4 : 2);
                    } else {
                        i6 = i5;
                    }
                    if ((i6 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1052560242, i6, -1, "com.robinhood.android.gold.upgrade.unified.screen.AppBar.<anonymous> (GoldUnifiedValuePropsPromoComposable.kt:467)");
                    }
                    composer2.startReplaceGroup(-2101887353);
                    long jAppBar$lambda$16 = (z || z2) ? GoldUnifiedValuePropsPromoComposable.AppBar$lambda$16(snapshotState) : BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).getNova();
                    composer2.endReplaceGroup();
                    final NavHostController navHostController = navController;
                    BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, jAppBar$lambda$16, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(1378629828, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoComposableKt.AppBar.1.1
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
                                ComposerKt.traceEventStart(1378629828, i7, -1, "com.robinhood.android.gold.upgrade.unified.screen.AppBar.<anonymous>.<anonymous> (GoldUnifiedValuePropsPromoComposable.kt:474)");
                            }
                            BentoAppBarScope bentoAppBarScope = BentoAppBarWithTransition;
                            NavHostController navHostController2 = navHostController;
                            composer3.startReplaceGroup(5004770);
                            boolean zChangedInstance2 = composer3.changedInstance(navHostController2);
                            Object objRememberedValue3 = composer3.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new GoldUnifiedValuePropsPromoComposable2(navHostController2);
                                composer3.updateRememberedValue(objRememberedValue3);
                            }
                            composer3.endReplaceGroup();
                            bentoAppBarScope.m20576BentoCloseButtoncf5BqRc(null, false, 0L, (Function0) objRememberedValue3, composer3, BentoAppBarScope.$stable << 12, 7);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 805306368, 509);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, function1, j3, j2, composerStartRestartGroup, (i3 & 14) | 3072, 52);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoComposableKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return GoldUnifiedValuePropsPromoComposable.AppBar$lambda$20(scrollState2, z, z2, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final void AppBar$lambda$17(SnapshotState<Color> snapshotState, long j) {
        snapshotState.setValue(Color.m6701boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppBar$lambda$19$lambda$18(boolean z, EdgeToEdgeHost edgeToEdgeHost, long j, long j2, SnapshotState snapshotState, boolean z2) {
        if (z) {
            if (edgeToEdgeHost != null) {
                edgeToEdgeHost.overrideStatusBarStyle(!z2);
            }
            if (!z2) {
                j = j2;
            }
            AppBar$lambda$17(snapshotState, j);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AdditionalValueProps(final GoldPromoAdditionalValueProps goldPromoAdditionalValueProps, Composer composer, final int i) {
        Composer composer2;
        BentoValuePropRow2 icon;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1296466982);
        int i2 = (i & 6) == 0 ? i | (composerStartRestartGroup.changedInstance(goldPromoAdditionalValueProps) ? 4 : 2) : i;
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1296466982, i2, -1, "com.robinhood.android.gold.upgrade.unified.screen.AdditionalValueProps (GoldUnifiedValuePropsPromoComposable.kt:493)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1610065993);
            String title = goldPromoAdditionalValueProps.getTitle();
            composerStartRestartGroup.startReplaceGroup(1610066893);
            if (title != null) {
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                BentoText2.m20747BentoText38GnDrw(title, com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composerStartRestartGroup, 6, 1), null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextL(), composerStartRestartGroup, 24576, 0, 8172);
                composerStartRestartGroup = composerStartRestartGroup;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1610079437);
            for (ValueProp valueProp : goldPromoAdditionalValueProps.getValue_props()) {
                String strNullIfEmpty = StringsKt.nullIfEmpty(valueProp.getTitle());
                String content = valueProp.getContent();
                ServerToBentoAssetMapper3 serverToBentoAssetMapper3FromServerValue = ServerToBentoAssetMapper3.INSTANCE.fromServerValue(valueProp.getPog_key());
                if (serverToBentoAssetMapper3FromServerValue != null) {
                    icon = new BentoValuePropRow2.Pog(serverToBentoAssetMapper3FromServerValue);
                } else {
                    icon = new BentoValuePropRow2.Icon(ServerToBentoAssetMapper2.SPARKLE_BULLET_24, null, 2, null);
                }
                BentoValuePropRow3.BentoValuePropRow(strNullIfEmpty, content, icon, BentoValuePropRow.Top, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composerStartRestartGroup, 27648, 0);
            }
            composer2 = composerStartRestartGroup;
            composer2.endReplaceGroup();
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldUnifiedValuePropsPromoComposable.AdditionalValueProps$lambda$26(goldPromoAdditionalValueProps, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
