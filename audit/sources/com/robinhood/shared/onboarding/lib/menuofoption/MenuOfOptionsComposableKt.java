package com.robinhood.shared.onboarding.lib.menuofoption;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraints;
import androidx.compose.foundation.layout.BoxWithConstraints4;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Intrinsic3;
import androidx.compose.foundation.layout.Intrinsic4;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.InspectionMode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.IntSize2;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
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
import coil.compose.AsyncImagePainter;
import coil.compose.SingletonAsyncImage;
import coil.compose.SingletonAsyncImagePainter;
import coil.decode.SvgDecoder;
import coil.request.ImageRequest;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoInfoBanner;
import com.robinhood.compose.bento.component.BentoProgressIndicator2;
import com.robinhood.compose.bento.component.BentoProgressIndicator3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.BentoTextButton3;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout8;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.Spacing2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.theme.SduiColors;
import com.robinhood.compose.theme.SduiColors3;
import com.robinhood.librobinhood.data.store.identi.SortingHatQueryArgs;
import com.robinhood.models.api.identi.ApiMenuOfOptionsHeaderCard;
import com.robinhood.models.api.identi.sortinghat.SortingHatTypes;
import com.robinhood.models.api.identi.sortinghat.SortingHatTypes2;
import com.robinhood.models.api.identi.sortinghat.SortingHatTypes3;
import com.robinhood.models.api.identi.sortinghat.SortingHatTypes4;
import com.robinhood.models.p320db.identi.sortinghat.MenuOfOptionsHeader;
import com.robinhood.models.p320db.identi.sortinghat.MenuOfOptionsPathItem;
import com.robinhood.models.p320db.identi.sortinghat.MenuOfOptionsPathItemTimeline;
import com.robinhood.models.p320db.identi.sortinghat.MenuOfOptionsPromotionalBanner;
import com.robinhood.models.p320db.identi.sortinghat.TextOverrides;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.onboarding.lib.menuofoption.FirstTradeUpsellBannerDuxo;
import com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt;
import com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsState;
import com.robinhood.shared.onboarding.lib.menuofoption.UiMenuOfOptionsItem;
import com.robinhood.utils.resource.StringResource;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MenuOfOptionsComposable.kt */
@Metadata(m3635d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aW\u0010\f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001aG\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a)\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a!\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a!\u0010 \u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b \u0010!\u001a!\u0010$\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b$\u0010%\u001a)\u0010(\u001a\u00020\t2\u0006\u0010'\u001a\u00020&2\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b(\u0010)\u001a/\u0010,\u001a\u00020\t2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020&0*2\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b,\u0010-\u001a'\u0010/\u001a\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0001¢\u0006\u0004\b/\u00100\u001a1\u00102\u001a\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u0002012\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b2\u00103\u001a#\u00106\u001a\u00020\t2\b\u00105\u001a\u0004\u0018\u0001042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b6\u00107\u001a!\u00109\u001a\u00020\t2\u0006\u0010'\u001a\u0002082\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b9\u0010:\u001a!\u0010=\u001a\u00020\t2\u0006\u0010<\u001a\u00020;2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b=\u0010>\u001a\u000f\u0010?\u001a\u00020\tH\u0003¢\u0006\u0004\b?\u0010@\u001a\u0019\u0010B\u001a\u00020\t2\b\b\u0001\u0010A\u001a\u00020\u0010H\u0003¢\u0006\u0004\bB\u0010C\"\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010F\"\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010F\"\u0014\u0010I\u001a\u00020H8\u0000X\u0080T¢\u0006\u0006\n\u0004\bI\u0010J\"\u0014\u0010K\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010F¨\u0006S²\u0006\f\u0010M\u001a\u00020L8\nX\u008a\u0084\u0002²\u0006\u000e\u0010O\u001a\u00020N8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010P\u001a\u00020N8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010M\u001a\u00020Q8\nX\u008a\u0084\u0002²\u0006\u000e\u0010R\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/identi/SortingHatQueryArgs;", "args", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsDuxo;", "duxo", "", "logPerformance", "Lkotlin/Function0;", "", "investedContent", "loadingContent", "MenuOfOptionsComposable", "(Lcom/robinhood/librobinhood/data/store/identi/SortingHatQueryArgs;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsDuxo;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "MenuOfOptionsLoading", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsState;", "menuOfOptionsState", "Lcom/robinhood/shared/app/type/AppType;", "appType", "MenuOfOptions", "(Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsState;Lcom/robinhood/shared/app/type/AppType;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/models/db/identi/sortinghat/MenuOfOptionsHeader;", "header", "MenuOfOptionsHeaderComposable", "(Lcom/robinhood/models/db/identi/sortinghat/MenuOfOptionsHeader;Lcom/robinhood/shared/app/type/AppType;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/models/api/identi/ApiMenuOfOptionsHeaderCard;", "headerCard", "MenuOfOptionsHeaderCard", "(Lcom/robinhood/models/api/identi/ApiMenuOfOptionsHeaderCard;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/models/api/identi/sortinghat/MenuOfOptionsPathSegment;", "segment", "TimelinePathSegment", "(Lcom/robinhood/models/api/identi/sortinghat/MenuOfOptionsPathSegment;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/models/db/identi/sortinghat/MenuOfOptionsPathItemTimeline;", "path", "MenuOfOptionsItemTimeline", "(Lcom/robinhood/models/db/identi/sortinghat/MenuOfOptionsPathItemTimeline;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/models/db/identi/sortinghat/MenuOfOptionsPathItem;", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "MenuOfOptionsItemContent", "(Lcom/robinhood/models/db/identi/sortinghat/MenuOfOptionsPathItem;Lcom/robinhood/shared/app/type/AppType;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lkotlinx/collections/immutable/ImmutableList;", "pathItems", "MenuOfOptionsHeaderItems", "(Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/shared/app/type/AppType;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "onCtaClicked", "FirstTradeUpsellContent", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/shared/onboarding/lib/menuofoption/FirstTradeUpsellBannerDuxo;", "FirstTradeUpsellBanner", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/onboarding/lib/menuofoption/FirstTradeUpsellBannerDuxo;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/models/api/identi/sortinghat/MenuOfOptionsAsset;", "asset", "AssetImage", "(Lcom/robinhood/models/api/identi/sortinghat/MenuOfOptionsAsset;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/shared/onboarding/lib/menuofoption/UiMenuOfOptionsItem;", "ActionItem", "(Lcom/robinhood/shared/onboarding/lib/menuofoption/UiMenuOfOptionsItem;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/models/db/identi/sortinghat/MenuOfOptionsPromotionalBanner;", "promotionalBanner", MenuOfOptionsComposableKt.PromotionalBannerTag, "(Lcom/robinhood/models/db/identi/sortinghat/MenuOfOptionsPromotionalBanner;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "FirstTradeUpsellContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "state", "MenuOfOptionsPreview", "(Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsState;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/unit/Dp;", "FeaturedHeight", "F", "DefaultHeight", "", "PromotionalBannerTag", "Ljava/lang/String;", "HeaderCardWidth", "Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsViewState;", "viewState", "", "containerWidth", "imgCenter", "Lcom/robinhood/shared/onboarding/lib/menuofoption/FirstTradeUpsellBannerDuxo$ViewState;", "showImage", "lib-menu-of-options_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class MenuOfOptionsComposableKt {
    public static final String PromotionalBannerTag = "PromotionalBanner";
    private static final float FeaturedHeight = C2002Dp.m7995constructorimpl(96);
    private static final float DefaultHeight = C2002Dp.m7995constructorimpl(64);
    private static final float HeaderCardWidth = C2002Dp.m7995constructorimpl(120);

    /* compiled from: MenuOfOptionsComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SortingHatTypes4.values().length];
            try {
                iArr[SortingHatTypes4.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SortingHatTypes4.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SortingHatTypes4.ACTIVE_FADE_TO_INACTIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SortingHatTypes4.ACTIVE_FADE_OUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SortingHatTypes4.INACTIVE_FADE_OUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SortingHatTypes2.values().length];
            try {
                iArr2[SortingHatTypes2.INACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[SortingHatTypes2.FEATURED.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[SortingHatTypes2.STANDARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ActionItem$lambda$60(UiMenuOfOptionsItem uiMenuOfOptionsItem, Modifier modifier, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        ActionItem(uiMenuOfOptionsItem, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AssetImage$lambda$52(SortingHatTypes sortingHatTypes, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AssetImage(sortingHatTypes, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FirstTradeUpsellBanner$lambda$48(Modifier modifier, FirstTradeUpsellBannerDuxo firstTradeUpsellBannerDuxo, Function0 function0, int i, int i2, Composer composer, int i3) {
        FirstTradeUpsellBanner(modifier, firstTradeUpsellBannerDuxo, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FirstTradeUpsellContent$lambda$46(Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        FirstTradeUpsellContent(modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FirstTradeUpsellContentPreview$lambda$69(int i, Composer composer, int i2) {
        FirstTradeUpsellContentPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MenuOfOptions$lambda$14(MenuOfOptionsState menuOfOptionsState, AppType appType, Function2 function2, Function2 function22, Modifier modifier, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        MenuOfOptions(menuOfOptionsState, appType, function2, function22, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MenuOfOptionsComposable$lambda$5(SortingHatQueryArgs sortingHatQueryArgs, Modifier modifier, MenuOfOptionsDuxo menuOfOptionsDuxo, boolean z, Function2 function2, Function2 function22, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        MenuOfOptionsComposable(sortingHatQueryArgs, modifier, menuOfOptionsDuxo, z, function2, function22, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MenuOfOptionsHeaderCard$lambda$24(ApiMenuOfOptionsHeaderCard apiMenuOfOptionsHeaderCard, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MenuOfOptionsHeaderCard(apiMenuOfOptionsHeaderCard, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MenuOfOptionsHeaderComposable$lambda$15(MenuOfOptionsHeader menuOfOptionsHeader, AppType appType, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MenuOfOptionsHeaderComposable(menuOfOptionsHeader, appType, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MenuOfOptionsHeaderItems$lambda$32(ImmutableList immutableList, AppType appType, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MenuOfOptionsHeaderItems(immutableList, appType, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MenuOfOptionsItemContent$lambda$30(MenuOfOptionsPathItem menuOfOptionsPathItem, AppType appType, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MenuOfOptionsItemContent(menuOfOptionsPathItem, appType, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MenuOfOptionsItemTimeline$lambda$26(MenuOfOptionsPathItemTimeline menuOfOptionsPathItemTimeline, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MenuOfOptionsItemTimeline(menuOfOptionsPathItemTimeline, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MenuOfOptionsLoading$lambda$7(Modifier modifier, int i, int i2, Composer composer, int i3) {
        MenuOfOptionsLoading(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MenuOfOptionsPreview$lambda$70(MenuOfOptionsState menuOfOptionsState, int i, Composer composer, int i2) {
        MenuOfOptionsPreview(menuOfOptionsState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PromotionalBanner$lambda$68(MenuOfOptionsPromotionalBanner menuOfOptionsPromotionalBanner, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PromotionalBanner(menuOfOptionsPromotionalBanner, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimelinePathSegment$lambda$25(SortingHatTypes4 sortingHatTypes4, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TimelinePathSegment(sortingHatTypes4, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ActionItem$lambda$54$lambda$53(Navigator navigator, Context context, String str) {
        Navigator.DefaultImpls.handleDeepLink$default(navigator, context, str != null ? Uri.parse(str) : null, null, null, false, null, 60, null);
        return Unit.INSTANCE;
    }

    private static final FirstTradeUpsellBannerDuxo.ViewState FirstTradeUpsellBanner$lambda$47(SnapshotState4<FirstTradeUpsellBannerDuxo.ViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final MenuOfOptionsViewState MenuOfOptionsComposable$lambda$0(SnapshotState4<MenuOfOptionsViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final boolean PromotionalBanner$lambda$62(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MenuOfOptionsComposable(final SortingHatQueryArgs args, Modifier modifier, MenuOfOptionsDuxo menuOfOptionsDuxo, boolean z, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        int i3;
        Modifier modifier2;
        final MenuOfOptionsDuxo menuOfOptionsDuxo2;
        int i4;
        boolean z2;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Modifier modifier3;
        boolean z3;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i8;
        boolean z4;
        Function2<? super Composer, ? super Integer, Unit> function2M25551getLambda$485312893$lib_menu_of_options_externalDebug;
        boolean zChangedInstance;
        Object objRememberedValue;
        final boolean z5;
        final Modifier modifier4;
        final MenuOfOptionsDuxo menuOfOptionsDuxo3;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(args, "args");
        Composer composerStartRestartGroup = composer.startRestartGroup(-511556402);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(args) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    menuOfOptionsDuxo2 = menuOfOptionsDuxo;
                    int i10 = composerStartRestartGroup.changedInstance(menuOfOptionsDuxo2) ? 256 : 128;
                    i3 |= i10;
                } else {
                    menuOfOptionsDuxo2 = menuOfOptionsDuxo;
                }
                i3 |= i10;
            } else {
                menuOfOptionsDuxo2 = menuOfOptionsDuxo;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        function23 = function2;
                        i3 |= composerStartRestartGroup.changedInstance(function23) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 != 0) {
                        if ((196608 & i) == 0) {
                            function24 = function22;
                            i3 |= composerStartRestartGroup.changedInstance(function24) ? 131072 : 65536;
                        }
                        if ((74899 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier4 = modifier2;
                            menuOfOptionsDuxo3 = menuOfOptionsDuxo2;
                            z5 = z2;
                            function26 = function23;
                            function27 = function24;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                modifier3 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                                if ((i2 & 4) == 0) {
                                    composerStartRestartGroup.startReplaceGroup(-747520797);
                                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                                    if (current == null) {
                                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    }
                                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                                    CreationExtras defaultViewModelCreationExtras = current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
                                    i7 = -1633490746;
                                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(MenuOfOptionsDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt$MenuOfOptionsComposable$$inlined$duxo$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                                lifecycle.addObserver(duxoLifecycleObserver);
                                                final Lifecycle lifecycle2 = lifecycle;
                                                return new DisposableEffectResult() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt$MenuOfOptionsComposable$$inlined$duxo$1.1
                                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                                    public void dispose() {
                                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                                    }
                                                };
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 0);
                                    composerStartRestartGroup.endReplaceGroup();
                                    MenuOfOptionsDuxo menuOfOptionsDuxo4 = (MenuOfOptionsDuxo) baseDuxo;
                                    i3 &= -897;
                                    z3 = false;
                                    menuOfOptionsDuxo2 = menuOfOptionsDuxo4;
                                } else {
                                    z3 = false;
                                    i7 = -1633490746;
                                }
                                if (i4 == 0) {
                                    z3 = z;
                                }
                                function25 = i5 == 0 ? null : function2;
                                if (i6 == 0) {
                                    boolean z6 = z3;
                                    i8 = i3;
                                    z4 = z6;
                                    function2M25551getLambda$485312893$lib_menu_of_options_externalDebug = ComposableSingletons$MenuOfOptionsComposableKt.INSTANCE.m25551getLambda$485312893$lib_menu_of_options_externalDebug();
                                } else {
                                    boolean z7 = z3;
                                    i8 = i3;
                                    z4 = z7;
                                    function2M25551getLambda$485312893$lib_menu_of_options_externalDebug = function22;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 4) != 0) {
                                    i3 &= -897;
                                }
                                boolean z8 = z2;
                                i8 = i3;
                                z4 = z8;
                                modifier3 = modifier2;
                                function25 = function23;
                                function2M25551getLambda$485312893$lib_menu_of_options_externalDebug = function24;
                                i7 = -1633490746;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-511556402, i8, -1, "com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposable (MenuOfOptionsComposable.kt:129)");
                            }
                            int i11 = i8;
                            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(menuOfOptionsDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                            composerStartRestartGroup = composerStartRestartGroup;
                            Function2<? super Composer, ? super Integer, Unit> function28 = function2M25551getLambda$485312893$lib_menu_of_options_externalDebug;
                            Function2<? super Composer, ? super Integer, Unit> function29 = function25;
                            MenuOfOptions(MenuOfOptionsComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getMenuOfOptionsState(), MenuOfOptionsComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getAppType(), function29, function28, !z4 ? ModifiersKt.performanceIndicator(modifier3, MenuOfOptionsComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).loadedState()) : modifier3, composerStartRestartGroup, (i11 >> 6) & 8064, 0);
                            composerStartRestartGroup.startReplaceGroup(i7);
                            zChangedInstance = composerStartRestartGroup.changedInstance(menuOfOptionsDuxo2) | composerStartRestartGroup.changedInstance(args);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return MenuOfOptionsComposableKt.MenuOfOptionsComposable$lambda$4$lambda$3(menuOfOptionsDuxo2, args, (DisposableEffectScope) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.DisposableEffect(args, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, i11 & 14);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z4;
                            modifier4 = modifier3;
                            menuOfOptionsDuxo3 = menuOfOptionsDuxo2;
                            function26 = function29;
                            function27 = function28;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return MenuOfOptionsComposableKt.MenuOfOptionsComposable$lambda$5(args, modifier4, menuOfOptionsDuxo3, z5, function26, function27, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 196608;
                    function24 = function22;
                    if ((74899 & i3) == 74898) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i9 == 0) {
                            }
                            if ((i2 & 4) == 0) {
                            }
                            if (i4 == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i112 = i8;
                            SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(menuOfOptionsDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                            composerStartRestartGroup = composerStartRestartGroup;
                            Function2<? super Composer, ? super Integer, Unit> function282 = function2M25551getLambda$485312893$lib_menu_of_options_externalDebug;
                            Function2<? super Composer, ? super Integer, Unit> function292 = function25;
                            MenuOfOptions(MenuOfOptionsComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getMenuOfOptionsState(), MenuOfOptionsComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getAppType(), function292, function282, !z4 ? ModifiersKt.performanceIndicator(modifier3, MenuOfOptionsComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2).loadedState()) : modifier3, composerStartRestartGroup, (i112 >> 6) & 8064, 0);
                            composerStartRestartGroup.startReplaceGroup(i7);
                            zChangedInstance = composerStartRestartGroup.changedInstance(menuOfOptionsDuxo2) | composerStartRestartGroup.changedInstance(args);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return MenuOfOptionsComposableKt.MenuOfOptionsComposable$lambda$4$lambda$3(menuOfOptionsDuxo2, args, (DisposableEffectScope) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.DisposableEffect(args, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, i112 & 14);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                z5 = z4;
                                modifier4 = modifier3;
                                menuOfOptionsDuxo3 = menuOfOptionsDuxo2;
                                function26 = function292;
                                function27 = function282;
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function23 = function2;
                i6 = i2 & 32;
                if (i6 != 0) {
                }
                function24 = function22;
                if ((74899 & i3) == 74898) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z2 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function23 = function2;
            i6 = i2 & 32;
            if (i6 != 0) {
            }
            function24 = function22;
            if ((74899 & i3) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function23 = function2;
        i6 = i2 & 32;
        if (i6 != 0) {
        }
        function24 = function22;
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult MenuOfOptionsComposable$lambda$4$lambda$3(final MenuOfOptionsDuxo menuOfOptionsDuxo, SortingHatQueryArgs sortingHatQueryArgs, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        menuOfOptionsDuxo.poll(sortingHatQueryArgs);
        return new DisposableEffectResult() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt$MenuOfOptionsComposable$lambda$4$lambda$3$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                menuOfOptionsDuxo.stopPolling();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MenuOfOptionsLoading(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-206394729);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-206394729, i3, -1, "com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsLoading (MenuOfOptionsComposable.kt:148)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(null, BentoProgressIndicator3.f5151S, 0L, composerStartRestartGroup, 48, 5);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MenuOfOptionsComposableKt.MenuOfOptionsLoading$lambda$7(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0220  */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MenuOfOptions(final MenuOfOptionsState menuOfOptionsState, final AppType appType, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> loadingContent, Modifier modifier, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        float f;
        Modifier modifier3;
        ?? r5;
        StringResource heroTitle;
        float f2;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(menuOfOptionsState, "menuOfOptionsState");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(loadingContent, "loadingContent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-576730055);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(menuOfOptionsState) : composerStartRestartGroup.changedInstance(menuOfOptionsState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(appType.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(loadingContent) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) != 9362 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            } else {
                Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-576730055, i3, -1, "com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptions (MenuOfOptionsComposable.kt:164)");
                }
                Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier5);
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
                if (!Intrinsics.areEqual(menuOfOptionsState, MenuOfOptionsState.Invested.INSTANCE)) {
                    composerStartRestartGroup.startReplaceGroup(1762737433);
                    if (function2 != null) {
                        composerStartRestartGroup.startReplaceGroup(-1189688414);
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 6) & 14));
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1189633699);
                        MenuOfOptionsLoading(null, composerStartRestartGroup, 0, 1);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    modifier3 = modifier5;
                    r5 = 0;
                    f = 0.0f;
                } else if (Intrinsics.areEqual(menuOfOptionsState, MenuOfOptionsState.Error.INSTANCE)) {
                    composerStartRestartGroup.startReplaceGroup(-1189533507);
                    r5 = 0;
                    ImageKt.Image(PainterResources_androidKt.painterResource(C11048R.drawable.svg_error_triangle, composerStartRestartGroup, 0), (String) null, PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 48, 120);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                    modifier3 = modifier5;
                    f = 0.0f;
                } else {
                    Object obj = null;
                    f = 0.0f;
                    int i5 = i3;
                    if (Intrinsics.areEqual(menuOfOptionsState, MenuOfOptionsState.Loading.INSTANCE)) {
                        composerStartRestartGroup.startReplaceGroup(-1189282717);
                        loadingContent.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 9) & 14));
                        composerStartRestartGroup.endReplaceGroup();
                        modifier3 = modifier5;
                        r5 = obj;
                    } else {
                        if (!(menuOfOptionsState instanceof MenuOfOptionsState.MenuOfOptions)) {
                            composerStartRestartGroup.startReplaceGroup(1762732109);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(-1189178247);
                        modifier3 = modifier5;
                        MenuOfOptionsHeaderComposable(((MenuOfOptionsState.MenuOfOptions) menuOfOptionsState).getExperience().getHeader(), appType, null, composerStartRestartGroup, i5 & 112, 4);
                        composerStartRestartGroup.endReplaceGroup();
                        r5 = obj;
                    }
                }
                heroTitle = menuOfOptionsState.getHeroTitle();
                if (heroTitle == null) {
                    Intrinsics.checkNotNull(resources);
                    CharSequence text = heroTitle.getText(resources);
                    String string2 = text != null ? text.toString() : r5;
                    composerStartRestartGroup.startReplaceGroup(1762763537);
                    if (string2 == null) {
                        f2 = f;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1762764085);
                        if (StringsKt.isBlank(string2)) {
                            f2 = f;
                        } else {
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i6 = BentoTheme.$stable;
                            Composer composer2 = composerStartRestartGroup;
                            f2 = f;
                            BentoText2.m20747BentoText38GnDrw(string2, PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21591getLargeD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getDisplayCapsuleLarge(), composer2, 0, 0, 8188);
                            composerStartRestartGroup = composer2;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Unit unit = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    StringResource title = menuOfOptionsState.getTitle();
                    if (title != null) {
                        Intrinsics.checkNotNull(resources);
                        CharSequence text2 = title.getText(resources);
                        String string3 = text2 != null ? text2.toString() : r5;
                        composerStartRestartGroup.startReplaceGroup(1762779031);
                        if (string3 != null) {
                            composerStartRestartGroup.startReplaceGroup(1762779579);
                            if (!StringsKt.isBlank(string3)) {
                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                int i7 = BentoTheme.$stable;
                                Composer composer3 = composerStartRestartGroup;
                                BentoText2.m20747BentoText38GnDrw(string3, PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion4, bentoTheme2.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), f2, 2, r5), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i7).getDisplayCapsuleMedium(), composer3, 0, 0, 8188);
                                composerStartRestartGroup = composer3;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Unit unit2 = Unit.INSTANCE;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        StringResource subtitleMarkdown = menuOfOptionsState.getSubtitleMarkdown();
                        if (subtitleMarkdown != null) {
                            Intrinsics.checkNotNull(resources);
                            CharSequence text3 = subtitleMarkdown.getText(resources);
                            String string4 = text3 != null ? text3.toString() : r5;
                            composerStartRestartGroup.startReplaceGroup(1762792990);
                            if (string4 != null) {
                                Modifier.Companion companion5 = Modifier.INSTANCE;
                                BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                                int i8 = BentoTheme.$stable;
                                Modifier modifierM21620defaultFillMaxWidthPaddingVpY3zN4 = PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion5, bentoTheme3.getSpacing(composerStartRestartGroup, i8).m21593getSmallD9Ej5fM(), bentoTheme3.getSpacing(composerStartRestartGroup, i8).m21590getDefaultD9Ej5fM());
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21620defaultFillMaxWidthPaddingVpY3zN4);
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
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                Composer composer4 = composerStartRestartGroup;
                                BentoMarkdownText2.BentoMarkdownText(string4, (Modifier) null, (MarkdownStyle) null, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer4, 0, 30);
                                composerStartRestartGroup = composer4;
                                composerStartRestartGroup.endNode();
                                Unit unit3 = Unit.INSTANCE;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1762802747);
                            Iterator<UiMenuOfOptionsItem> it = menuOfOptionsState.getRows().iterator();
                            while (it.hasNext()) {
                                ActionItem(it.next(), r5, composerStartRestartGroup, 0, 2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            MenuOfOptionsPromotionalBanner promotionalBanner = menuOfOptionsState.getPromotionalBanner();
                            composerStartRestartGroup.startReplaceGroup(1762806864);
                            if (promotionalBanner != null) {
                                PromotionalBanner(promotionalBanner, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM(), composerStartRestartGroup, 6, 0), composerStartRestartGroup, 0, 0);
                                Unit unit4 = Unit.INSTANCE;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return MenuOfOptionsComposableKt.MenuOfOptions$lambda$14(menuOfOptionsState, appType, function2, loadingContent, modifier4, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) != 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Resources resources2 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Arrangement.Vertical top2 = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion6 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion6.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier5);
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
                if (!Intrinsics.areEqual(menuOfOptionsState, MenuOfOptionsState.Invested.INSTANCE)) {
                }
                heroTitle = menuOfOptionsState.getHeroTitle();
                if (heroTitle == null) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: MenuOfOptionsComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt$MenuOfOptionsHeaderItems$1 */
    static final class C392471 implements Function3<BoxWithConstraints4, Composer, Integer, Unit> {
        final /* synthetic */ AppType $appType;
        final /* synthetic */ LazyListState $listState;
        final /* synthetic */ ImmutableList<MenuOfOptionsPathItem> $pathItems;

        C392471(LazyListState lazyListState, ImmutableList<MenuOfOptionsPathItem> immutableList, AppType appType) {
            this.$listState = lazyListState;
            this.$pathItems = immutableList;
            this.$appType = appType;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(final ImmutableList immutableList, final AppType appType, final float f, LazyListScope LazyRow) {
            Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
            final C39243xbfb8554 c39243xbfb8554 = new Function1() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt$MenuOfOptionsHeaderItems$1$invoke$lambda$2$lambda$1$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(MenuOfOptionsPathItem menuOfOptionsPathItem) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((MenuOfOptionsPathItem) obj);
                }
            };
            LazyRow.items(immutableList.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt$MenuOfOptionsHeaderItems$1$invoke$lambda$2$lambda$1$$inlined$items$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return c39243xbfb8554.invoke(immutableList.get(i));
                }
            }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt$MenuOfOptionsHeaderItems$1$invoke$lambda$2$lambda$1$$inlined$items$default$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                    int i3;
                    if ((i2 & 6) == 0) {
                        i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                    } else {
                        i3 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i3 |= composer.changed(i) ? 32 : 16;
                    }
                    if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    MenuOfOptionsPathItem menuOfOptionsPathItem = (MenuOfOptionsPathItem) immutableList.get(i);
                    composer.startReplaceGroup(-1077162592);
                    MenuOfOptionsComposableKt.MenuOfOptionsItemContent(menuOfOptionsPathItem, appType, SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, f), composer, 0, 0);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer, Integer num) {
            invoke(boxWithConstraints4, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxWithConstraints4 BoxWithConstraints, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(BoxWithConstraints) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-653306413, i2, -1, "com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsHeaderItems.<anonymous> (MenuOfOptionsComposable.kt:498)");
            }
            final float fM7995constructorimpl = C2002Dp.m7995constructorimpl(BoxWithConstraints.mo5103getMaxWidthD9Ej5fM() / 2.0f);
            LazyListState lazyListState = this.$listState;
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer.changedInstance(this.$pathItems) | composer.changed(this.$appType.ordinal()) | composer.changed(fM7995constructorimpl);
            final ImmutableList<MenuOfOptionsPathItem> immutableList = this.$pathItems;
            final AppType appType = this.$appType;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt$MenuOfOptionsHeaderItems$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MenuOfOptionsComposableKt.C392471.invoke$lambda$2$lambda$1(immutableList, appType, fM7995constructorimpl, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            LazyDslKt.LazyRow(null, lazyListState, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void MenuOfOptionsHeaderComposable(final MenuOfOptionsHeader menuOfOptionsHeader, final AppType appType, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1240189165);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(menuOfOptionsHeader) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(appType.ordinal()) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1240189165, i3, -1, "com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsHeaderComposable (MenuOfOptionsComposable.kt:245)");
                }
                if (!(menuOfOptionsHeader instanceof MenuOfOptionsHeader.Banner)) {
                    composerStartRestartGroup.startReplaceGroup(1166949744);
                    AssetImage(((MenuOfOptionsHeader.Banner) menuOfOptionsHeader).getAsset(), PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(modifier4, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (menuOfOptionsHeader instanceof MenuOfOptionsHeader.Hero) {
                    composerStartRestartGroup.startReplaceGroup(1167220343);
                    AssetImage(((MenuOfOptionsHeader.Hero) menuOfOptionsHeader).getAsset(), PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(SizeKt.m5157heightInVpY3zN4(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(modifier4, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21591getLargeD9Ej5fM(), 1, null), C2002Dp.m7995constructorimpl(0), C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE)), 0.0f, 1, null), 0.0f, composerStartRestartGroup, 0, 1), composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (menuOfOptionsHeader instanceof MenuOfOptionsHeader.Path) {
                    composerStartRestartGroup.startReplaceGroup(1167572782);
                    MenuOfOptionsHeaderItems(extensions2.toImmutableList(((MenuOfOptionsHeader.Path) menuOfOptionsHeader).getPathItems()), appType, modifier4, composerStartRestartGroup, i3 & 1008, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (!(menuOfOptionsHeader instanceof MenuOfOptionsHeader.HeaderCard)) {
                        composerStartRestartGroup.startReplaceGroup(2115852637);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(2115881523);
                    ApiMenuOfOptionsHeaderCard data = ((MenuOfOptionsHeader.HeaderCard) menuOfOptionsHeader).getData();
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    MenuOfOptionsHeaderCard(data, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifier4, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 5, null), composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MenuOfOptionsComposableKt.MenuOfOptionsHeaderComposable$lambda$15(menuOfOptionsHeader, appType, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            if (!(menuOfOptionsHeader instanceof MenuOfOptionsHeader.Banner)) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0453  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void MenuOfOptionsHeaderCard(final ApiMenuOfOptionsHeaderCard apiMenuOfOptionsHeaderCard, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        final Navigator navigator;
        final Context context;
        Object objRememberedValue;
        Composer.Companion companion;
        final CoroutineScope coroutineScope;
        boolean zChangedInstance;
        Object objRememberedValue2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        final ApiMenuOfOptionsHeaderCard apiMenuOfOptionsHeaderCard2;
        boolean zChangedInstance2;
        Object objRememberedValue3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1398978015);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changedInstance(apiMenuOfOptionsHeaderCard) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1398978015, i3, -1, "com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsHeaderCard (MenuOfOptionsComposable.kt:289)");
                }
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                coroutineScope = (CoroutineScope) objRememberedValue;
                composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                boolean zIsDeepLinkSupported = navigator.isDeepLinkSupported(Uri.parse(apiMenuOfOptionsHeaderCard.getCtaDeeplink()));
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(apiMenuOfOptionsHeaderCard);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MenuOfOptionsComposableKt.MenuOfOptionsHeaderCard$lambda$17$lambda$16(coroutineScope, navigator, context, apiMenuOfOptionsHeaderCard);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier4 = modifier3;
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifier3, zIsDeepLinkSupported, null, null, (Function0) objRememberedValue2, 6, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), apiMenuOfOptionsHeaderCard.getLoggingIdentifier(), null, null, null, new Component(Component.ComponentType.CARD, apiMenuOfOptionsHeaderCard.getLoggingIdentifier(), null, 4, null), null, 46, null), true, false, false, true, false, null, 108, null);
                Arrangement arrangement = Arrangement.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM());
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion4, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21591getLargeD9Ej5fM()), companion2.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-241049789);
                float f = HeaderCardWidth;
                Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(companion4, f);
                if (((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
                    modifierM5169size3ABfNKs = Background3.m4872backgroundbw27NRU$default(modifierM5169size3ABfNKs, bentoTheme.getColors(composerStartRestartGroup, i5).m21373getBg30d7_KjU(), null, 2, null);
                }
                composerStartRestartGroup.endReplaceGroup();
                SingletonAsyncImage.m9119AsyncImagegl8XCv8(new ImageRequest.Builder((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).data(!bentoTheme.getColors(composerStartRestartGroup, i5).getIsDay() ? apiMenuOfOptionsHeaderCard.getImage().getLight() : apiMenuOfOptionsHeaderCard.getImage().getDark()).decoderFactory(new SvgDecoder.Factory(false, 1, null)).build(), null, modifierM5169size3ABfNKs, null, null, null, null, 0.0f, null, 0, false, null, composerStartRestartGroup, 48, 0, 4088);
                Modifier modifierWeight$default = Row5.weight$default(row6, companion4, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()), companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                BentoText2.m20747BentoText38GnDrw(apiMenuOfOptionsHeaderCard.getMessage(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 0, 0, 16382);
                String ctaText = apiMenuOfOptionsHeaderCard.getCtaText();
                BentoTextButton3.Icon.Size12 size12 = new BentoTextButton3.Icon.Size12(ServerToBentoAssetMapper2.ARROW_RIGHT_12, BentoTextButton3.Icon.Position.Trailing);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                apiMenuOfOptionsHeaderCard2 = apiMenuOfOptionsHeaderCard;
                zChangedInstance2 = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(apiMenuOfOptionsHeaderCard2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MenuOfOptionsComposableKt.m2831x633b0288(coroutineScope, navigator, context, apiMenuOfOptionsHeaderCard2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue3, ctaText, null, size12, null, false, null, composerStartRestartGroup, BentoTextButton3.Icon.Size12.$stable << 9, 116);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                TimelineIndicator3.m25558TimelineIndicatorSk5a5R4(C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(f / 2) + ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue()), bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), C2002Dp.m7995constructorimpl(24)), composerStartRestartGroup, 3072, 0);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                apiMenuOfOptionsHeaderCard2 = apiMenuOfOptionsHeaderCard;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MenuOfOptionsComposableKt.MenuOfOptionsHeaderCard$lambda$24(apiMenuOfOptionsHeaderCard2, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            coroutineScope = (CoroutineScope) objRememberedValue;
            composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            boolean zIsDeepLinkSupported2 = navigator.isDeepLinkSupported(Uri.parse(apiMenuOfOptionsHeaderCard.getCtaDeeplink()));
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(apiMenuOfOptionsHeaderCard);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MenuOfOptionsComposableKt.MenuOfOptionsHeaderCard$lambda$17$lambda$16(coroutineScope, navigator, context, apiMenuOfOptionsHeaderCard);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier42 = modifier3;
                Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifier3, zIsDeepLinkSupported2, null, null, (Function0) objRememberedValue2, 6, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), apiMenuOfOptionsHeaderCard.getLoggingIdentifier(), null, null, null, new Component(Component.ComponentType.CARD, apiMenuOfOptionsHeaderCard.getLoggingIdentifier(), null, 4, null), null, 46, null), true, false, false, true, false, null, 108, null);
                Arrangement arrangement2 = Arrangement.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = arrangement2.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM());
                Alignment.Companion companion22 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_42, companion22.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default2);
                ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor4 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy3, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion32.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    Modifier.Companion companion42 = Modifier.INSTANCE;
                    Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2 = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion42, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21591getLargeD9Ej5fM()), companion22.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2);
                    Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion32.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                        Row6 row62 = Row6.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(-241049789);
                        float f2 = HeaderCardWidth;
                        Modifier modifierM5169size3ABfNKs2 = SizeKt.m5169size3ABfNKs(companion42, f2);
                        if (((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        SingletonAsyncImage.m9119AsyncImagegl8XCv8(new ImageRequest.Builder((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).data(!bentoTheme2.getColors(composerStartRestartGroup, i52).getIsDay() ? apiMenuOfOptionsHeaderCard.getImage().getLight() : apiMenuOfOptionsHeaderCard.getImage().getDark()).decoderFactory(new SvgDecoder.Factory(false, 1, null)).build(), null, modifierM5169size3ABfNKs2, null, null, null, null, 0.0f, null, 0, false, null, composerStartRestartGroup, 48, 0, 4088);
                        Modifier modifierWeight$default2 = Row5.weight$default(row62, companion42, 1.0f, false, 2, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM()), companion22.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default2);
                        Function0<ComposeUiNode> constructor32 = companion32.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy22, companion32.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion32.getSetResolvedCompositionLocals());
                        setCompositeKeyHash3 = companion32.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl3.getInserting()) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion32.getSetModifier());
                            BentoText2.m20747BentoText38GnDrw(apiMenuOfOptionsHeaderCard.getMessage(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 0, 0, 16382);
                            String ctaText2 = apiMenuOfOptionsHeaderCard.getCtaText();
                            BentoTextButton3.Icon.Size12 size122 = new BentoTextButton3.Icon.Size12(ServerToBentoAssetMapper2.ARROW_RIGHT_12, BentoTextButton3.Icon.Position.Trailing);
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            apiMenuOfOptionsHeaderCard2 = apiMenuOfOptionsHeaderCard;
                            zChangedInstance2 = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(apiMenuOfOptionsHeaderCard2);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance2) {
                                objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt$$ExternalSyntheticLambda11
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return MenuOfOptionsComposableKt.m2831x633b0288(coroutineScope, navigator, context, apiMenuOfOptionsHeaderCard2);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                composerStartRestartGroup.endReplaceGroup();
                                BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue3, ctaText2, null, size122, null, false, null, composerStartRestartGroup, BentoTextButton3.Icon.Size12.$stable << 9, 116);
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endNode();
                                TimelineIndicator3.m25558TimelineIndicatorSk5a5R4(C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(f2 / 2) + ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue()), bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU(), bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU(), SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion42, 0.0f, 1, null), C2002Dp.m7995constructorimpl(24)), composerStartRestartGroup, 3072, 0);
                                composerStartRestartGroup = composerStartRestartGroup;
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier2 = modifier42;
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MenuOfOptionsHeaderCard$lambda$17$lambda$16(CoroutineScope coroutineScope, Navigator navigator, Context context, ApiMenuOfOptionsHeaderCard apiMenuOfOptionsHeaderCard) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new MenuOfOptionsComposableKt$MenuOfOptionsHeaderCard$1$1$1(navigator, context, apiMenuOfOptionsHeaderCard, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MenuOfOptionsHeaderCard$lambda$23$lambda$22$lambda$21$lambda$20$lambda$19 */
    public static final Unit m2831x633b0288(CoroutineScope coroutineScope, Navigator navigator, Context context, ApiMenuOfOptionsHeaderCard apiMenuOfOptionsHeaderCard) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new MenuOfOptionsComposableKt$MenuOfOptionsHeaderCard$2$1$2$1$1$1(navigator, context, apiMenuOfOptionsHeaderCard, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TimelinePathSegment(final SortingHatTypes4 sortingHatTypes4, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        int i4;
        Brush solidColor;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1649486386);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(sortingHatTypes4.ordinal()) ? 4 : 2) | i;
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
                    ComposerKt.traceEventStart(-1649486386, i3, -1, "com.robinhood.shared.onboarding.lib.menuofoption.TimelinePathSegment (MenuOfOptionsComposable.kt:380)");
                }
                i4 = WhenMappings.$EnumSwitchMapping$0[sortingHatTypes4.ordinal()];
                if (i4 != 1) {
                    composerStartRestartGroup.startReplaceGroup(-313478092);
                    solidColor = new SolidColor(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21456getPositive0d7_KjU(), null);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (i4 == 2) {
                    composerStartRestartGroup.startReplaceGroup(-313475409);
                    solidColor = new SolidColor(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21373getBg30d7_KjU(), null);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (i4 == 3) {
                    composerStartRestartGroup.startReplaceGroup(-313472090);
                    Brush.Companion companion = Brush.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    solidColor = Brush.Companion.m6678linearGradientmHitzGk$default(companion, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).m21456getPositive0d7_KjU()), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).m21373getBg30d7_KjU())}), 0L, 0L, 0, 14, (Object) null);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (i4 == 4) {
                    composerStartRestartGroup.startReplaceGroup(-313465310);
                    solidColor = Brush.Companion.m6678linearGradientmHitzGk$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21456getPositive0d7_KjU()), Color.m6701boximpl(Color.INSTANCE.m6725getTransparent0d7_KjU())}), 0L, 0L, 0, 14, (Object) null);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (i4 != 5) {
                        composerStartRestartGroup.startReplaceGroup(-313479235);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(-313458595);
                    solidColor = Brush.Companion.m6678linearGradientmHitzGk$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21373getBg30d7_KjU()), Color.m6701boximpl(Color.INSTANCE.m6725getTransparent0d7_KjU())}), 0L, 0L, 0, 14, (Object) null);
                    composerStartRestartGroup.endReplaceGroup();
                }
                BoxKt.Box(Background3.background$default(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), C2002Dp.m7995constructorimpl(2)), solidColor, null, 0.0f, 6, null), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MenuOfOptionsComposableKt.TimelinePathSegment$lambda$25(sortingHatTypes4, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            i4 = WhenMappings.$EnumSwitchMapping$0[sortingHatTypes4.ordinal()];
            if (i4 != 1) {
            }
            BoxKt.Box(Background3.background$default(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), C2002Dp.m7995constructorimpl(2)), solidColor, null, 0.0f, 6, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void MenuOfOptionsItemTimeline(final MenuOfOptionsPathItemTimeline menuOfOptionsPathItemTimeline, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1705367958);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(menuOfOptionsPathItemTimeline) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1705367958, i3, -1, "com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsItemTimeline (MenuOfOptionsComposable.kt:418)");
            }
            BoxWithConstraints.BoxWithConstraints(SizeKt.m5156height3ABfNKs(modifier, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM()), null, false, ComposableLambda3.rememberComposableLambda(1774018560, true, new Function3<BoxWithConstraints4, Composer, Integer, Unit>() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt.MenuOfOptionsItemTimeline.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer2, Integer num) {
                    invoke(boxWithConstraints4, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxWithConstraints4 BoxWithConstraints, Composer composer2, int i5) {
                    int i6;
                    Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((i5 & 6) == 0) {
                        i6 = (composer2.changed(BoxWithConstraints) ? 4 : 2) | i5;
                    } else {
                        i6 = i5;
                    }
                    if ((i6 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1774018560, i6, -1, "com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsItemTimeline.<anonymous> (MenuOfOptionsComposable.kt:422)");
                    }
                    SortingHatTypes4 leadingSegment = menuOfOptionsPathItemTimeline.getLeadingSegment();
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MenuOfOptionsComposableKt.TimelinePathSegment(leadingSegment, SizeKt.m5174width3ABfNKs(BoxWithConstraints.align(companion, companion2.getCenterStart()), C2002Dp.m7995constructorimpl(BoxWithConstraints.mo5103getMaxWidthD9Ej5fM() / 2.0f)), composer2, 0, 0);
                    MenuOfOptionsComposableKt.TimelinePathSegment(menuOfOptionsPathItemTimeline.getTrailingSegment(), SizeKt.m5174width3ABfNKs(BoxWithConstraints.align(companion, companion2.getCenterEnd()), C2002Dp.m7995constructorimpl(BoxWithConstraints.mo5103getMaxWidthD9Ej5fM() / 2.0f)), composer2, 0, 0);
                    ImageKt.Image(PainterResources_androidKt.painterResource(MenuOfOptionsAssetMappers.getIconRes(menuOfOptionsPathItemTimeline.getDecoration()), composer2, 0), (String) null, BoxWithConstraints.align(companion, companion2.getCenter()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 48, 120);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MenuOfOptionsComposableKt.MenuOfOptionsItemTimeline$lambda$26(menuOfOptionsPathItemTimeline, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MenuOfOptionsItemContent(final MenuOfOptionsPathItem menuOfOptionsPathItem, final AppType appType, Modifier modifier, Composer composer, final int i, final int i2) {
        MenuOfOptionsPathItem menuOfOptionsPathItem2;
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        float f;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1090029642);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            menuOfOptionsPathItem2 = menuOfOptionsPathItem;
        } else if ((i & 6) == 0) {
            menuOfOptionsPathItem2 = menuOfOptionsPathItem;
            i3 = (composerStartRestartGroup.changedInstance(menuOfOptionsPathItem2) ? 4 : 2) | i;
        } else {
            menuOfOptionsPathItem2 = menuOfOptionsPathItem;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(appType.ordinal()) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1090029642, i3, -1, "com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsItemContent (MenuOfOptionsComposable.kt:449)");
                }
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion.getCenterHorizontally(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
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
                Modifier.Companion companion3 = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 5, null);
                f = FeaturedHeight;
                Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(modifierM5146paddingqDBjuR0$default, f);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getBottomCenter(), false);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5156height3ABfNKs);
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Painter painterPainterResource = PainterResources_androidKt.painterResource(MenuOfOptionsAssetMappers.drawableRes(menuOfOptionsPathItem2.getAsset(), bentoTheme.getColors(composerStartRestartGroup, i5).getIsDay()), composerStartRestartGroup, 0);
                Color drawableResColor = MenuOfOptionsAssetMappers.getDrawableResColor(menuOfOptionsPathItem2.getAsset(), composerStartRestartGroup, 0);
                ColorFilter colorFilterM6729tintxETnrds$default = drawableResColor == null ? ColorFilter.Companion.m6729tintxETnrds$default(ColorFilter.INSTANCE, drawableResColor.getValue(), 0, 2, null) : null;
                if (!menuOfOptionsPathItem2.getFeatured() && appType != AppType.RHC) {
                    f = DefaultHeight;
                }
                ImageKt.Image(painterPainterResource, (String) null, SizeKt.m5156height3ABfNKs(companion3, f), (Alignment) null, (ContentScale) null, 0.0f, colorFilterM6729tintxETnrds$default, composerStartRestartGroup, 48, 56);
                composerStartRestartGroup.endNode();
                BentoText2.m20747BentoText38GnDrw(menuOfOptionsPathItem.getTitle(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, 0, 0, 8190);
                composerStartRestartGroup = composerStartRestartGroup;
                MenuOfOptionsItemTimeline(menuOfOptionsPathItem.getTimeline(), androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 1, null), composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MenuOfOptionsComposableKt.MenuOfOptionsItemContent$lambda$30(menuOfOptionsPathItem, appType, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) != 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion4.getCenterHorizontally(), composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
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
                Modifier.Companion companion32 = Modifier.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion32, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), 5, null);
                f = FeaturedHeight;
                Modifier modifierM5156height3ABfNKs2 = SizeKt.m5156height3ABfNKs(modifierM5146paddingqDBjuR0$default2, f);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getBottomCenter(), false);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5156height3ABfNKs2);
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    Painter painterPainterResource2 = PainterResources_androidKt.painterResource(MenuOfOptionsAssetMappers.drawableRes(menuOfOptionsPathItem2.getAsset(), bentoTheme2.getColors(composerStartRestartGroup, i52).getIsDay()), composerStartRestartGroup, 0);
                    Color drawableResColor2 = MenuOfOptionsAssetMappers.getDrawableResColor(menuOfOptionsPathItem2.getAsset(), composerStartRestartGroup, 0);
                    if (drawableResColor2 == null) {
                    }
                    if (!menuOfOptionsPathItem2.getFeatured()) {
                        f = DefaultHeight;
                    }
                    ImageKt.Image(painterPainterResource2, (String) null, SizeKt.m5156height3ABfNKs(companion32, f), (Alignment) null, (ContentScale) null, 0.0f, colorFilterM6729tintxETnrds$default, composerStartRestartGroup, 48, 56);
                    composerStartRestartGroup.endNode();
                    BentoText2.m20747BentoText38GnDrw(menuOfOptionsPathItem.getTitle(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), composerStartRestartGroup, 0, 0, 8190);
                    composerStartRestartGroup = composerStartRestartGroup;
                    MenuOfOptionsItemTimeline(menuOfOptionsPathItem.getTimeline(), androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 1, null), composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void MenuOfOptionsHeaderItems(final ImmutableList<MenuOfOptionsPathItem> immutableList, final AppType appType, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1901487235);
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
            i3 |= composerStartRestartGroup.changed(appType.ordinal()) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1901487235, i3, -1, "com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsHeaderItems (MenuOfOptionsComposable.kt:495)");
            }
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            BoxWithConstraints.BoxWithConstraints(modifier3, null, false, ComposableLambda3.rememberComposableLambda(-653306413, true, new C392471(lazyListStateRememberLazyListState, immutableList, appType), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 6) & 14) | 3072, 6);
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(immutableList) | composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MenuOfOptionsComposableKt$MenuOfOptionsHeaderItems$2$1(immutableList, lazyListStateRememberLazyListState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MenuOfOptionsComposableKt.MenuOfOptionsHeaderItems$lambda$32(immutableList, appType, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void FirstTradeUpsellContent(Modifier modifier, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        final Function0<Unit> onCtaClicked = function0;
        Intrinsics.checkNotNullParameter(onCtaClicked, "onCtaClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1748906459);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = i | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCtaClicked) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1748906459, i3, -1, "com.robinhood.shared.onboarding.lib.menuofoption.FirstTradeUpsellContent (MenuOfOptionsComposable.kt:522)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objRememberedValue == companion3.getEmpty()) {
                objRememberedValue = SnapshotFloatState3.mutableFloatStateOf(0.0f);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotFloatState2 snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion3.getEmpty()) {
                objRememberedValue2 = SnapshotFloatState3.mutableFloatStateOf(0.0f);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotFloatState2 snapshotFloatState22 = (SnapshotFloatState2) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            float floatValue = snapshotFloatState2.getFloatValue() == 0.0f ? 0.0f : snapshotFloatState22.getFloatValue() / snapshotFloatState2.getFloatValue();
            Modifier.Companion companion4 = Modifier.INSTANCE;
            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion4, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion3.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MenuOfOptionsComposableKt.FirstTradeUpsellContent$lambda$45$lambda$40$lambda$39(snapshotFloatState2, (IntSize) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierOnSizeChanged = OnRemeasuredModifier2.onSizeChanged(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, (Function1) objRememberedValue3);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierOnSizeChanged);
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
            Painter painterPainterResource = PainterResources_androidKt.painterResource(C39252R.drawable.device_graph_chart_coins, composerStartRestartGroup, 0);
            Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(companion4, FeaturedHeight);
            composerStartRestartGroup.startReplaceGroup(5004770);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion3.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MenuOfOptionsComposableKt.FirstTradeUpsellContent$lambda$45$lambda$44$lambda$42$lambda$41(snapshotFloatState22, (LayoutCoordinates) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(modifierM5156height3ABfNKs, (Function1) objRememberedValue4);
            final float f = floatValue;
            ImageKt.Image(painterPainterResource, (String) null, modifierOnGloballyPositioned, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 432, 120);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion4, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
            Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C39252R.string.first_trade_upsell_title, composerStartRestartGroup, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 0, 0, 16382);
            Modifier modifier4 = modifier3;
            onCtaClicked = function0;
            BentoTextButton2.m20715BentoTextButtonPIknLig(onCtaClicked, StringResources_androidKt.stringResource(C39252R.string.first_trade_upsell_cta_text, composerStartRestartGroup, 0), null, new BentoTextButton3.Icon.Size12(ServerToBentoAssetMapper2.ARROW_RIGHT_12, BentoTextButton3.Icon.Position.Trailing), BentoTextButton3.Size.f5147M, false, null, composerStartRestartGroup, ((i3 >> 3) & 14) | 24576 | (BentoTextButton3.Icon.Size12.$stable << 9), 100);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            BoxWithConstraints.BoxWithConstraints(SizeKt.m5156height3ABfNKs(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion4, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM()), null, false, ComposableLambda3.rememberComposableLambda(-725346673, true, new Function3<BoxWithConstraints4, Composer, Integer, Unit>() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt$FirstTradeUpsellContent$1$3
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer2, Integer num) {
                    invoke(boxWithConstraints4, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxWithConstraints4 BoxWithConstraints, Composer composer2, int i6) {
                    int i7;
                    Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((i6 & 6) == 0) {
                        i7 = (composer2.changed(BoxWithConstraints) ? 4 : 2) | i6;
                    } else {
                        i7 = i6;
                    }
                    if ((i7 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-725346673, i7, -1, "com.robinhood.shared.onboarding.lib.menuofoption.FirstTradeUpsellContent.<anonymous>.<anonymous> (MenuOfOptionsComposable.kt:564)");
                    }
                    SortingHatTypes4 sortingHatTypes4 = SortingHatTypes4.ACTIVE;
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    Alignment.Companion companion6 = Alignment.INSTANCE;
                    MenuOfOptionsComposableKt.TimelinePathSegment(sortingHatTypes4, SizeKt.m5174width3ABfNKs(BoxWithConstraints.align(companion5, companion6.getCenterStart()), C2002Dp.m7995constructorimpl(BoxWithConstraints.mo5103getMaxWidthD9Ej5fM() * f)), composer2, 6, 0);
                    MenuOfOptionsComposableKt.TimelinePathSegment(SortingHatTypes4.ACTIVE_FADE_OUT, SizeKt.m5174width3ABfNKs(BoxWithConstraints.align(companion5, companion6.getCenterEnd()), C2002Dp.m7995constructorimpl(BoxWithConstraints.mo5103getMaxWidthD9Ej5fM() * (1 - f))), composer2, 6, 0);
                    ImageKt.Image(PainterResources_androidKt.painterResource(MenuOfOptionsAssetMappers.getIconRes(SortingHatTypes3.ACTIVE), composer2, 0), (String) null, OffsetKt.m5125offsetVpY3zN4$default(BoxWithConstraints.align(companion5, companion6.getCenterStart()), C2002Dp.m7995constructorimpl(BoxWithConstraints.mo5103getMaxWidthD9Ej5fM() * f), 0.0f, 2, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 48, 120);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MenuOfOptionsComposableKt.FirstTradeUpsellContent$lambda$46(modifier2, onCtaClicked, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FirstTradeUpsellContent$lambda$45$lambda$40$lambda$39(SnapshotFloatState2 snapshotFloatState2, IntSize intSize) {
        snapshotFloatState2.setFloatValue(Float.intBitsToFloat((int) (IntSize2.m8067toSizeozmzZPI(intSize.getPackedValue()) >> 32)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FirstTradeUpsellContent$lambda$45$lambda$44$lambda$42$lambda$41(SnapshotFloatState2 snapshotFloatState2, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        snapshotFloatState2.setFloatValue(Float.intBitsToFloat((int) (LayoutCoordinates2.positionInParent(coordinates) >> 32)) + (Float.intBitsToFloat((int) (IntSize2.m8067toSizeozmzZPI(coordinates.mo7241getSizeYbymL2g()) >> 32)) / 2));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FirstTradeUpsellBanner(Modifier modifier, FirstTradeUpsellBannerDuxo firstTradeUpsellBannerDuxo, final Function0<Unit> onCtaClicked, Composer composer, final int i, final int i2) {
        int i3;
        CreationExtras defaultViewModelCreationExtras;
        FirstTradeUpsellBannerDuxo firstTradeUpsellBannerDuxo2;
        SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        final FirstTradeUpsellBannerDuxo firstTradeUpsellBannerDuxo3;
        Intrinsics.checkNotNullParameter(onCtaClicked, "onCtaClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(716737507);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && composerStartRestartGroup.changedInstance(firstTradeUpsellBannerDuxo)) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCtaClicked) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i4 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                if ((i2 & 2) != 0) {
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
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(FirstTradeUpsellBannerDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt$FirstTradeUpsellBanner$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt$FirstTradeUpsellBanner$$inlined$duxo$1.1
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
                    firstTradeUpsellBannerDuxo2 = (FirstTradeUpsellBannerDuxo) baseDuxo;
                    i3 &= -113;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(716737507, i3, -1, "com.robinhood.shared.onboarding.lib.menuofoption.FirstTradeUpsellBanner (MenuOfOptionsComposable.kt:592)");
                }
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(firstTradeUpsellBannerDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup = composerStartRestartGroup;
                if (FirstTradeUpsellBanner$lambda$47(snapshotState4CollectAsStateWithLifecycle).getShowContent()) {
                    FirstTradeUpsellContent(modifier, onCtaClicked, composerStartRestartGroup, (i3 & 14) | ((i3 >> 3) & 112), 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                firstTradeUpsellBannerDuxo3 = firstTradeUpsellBannerDuxo2;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
            }
            firstTradeUpsellBannerDuxo2 = firstTradeUpsellBannerDuxo;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(firstTradeUpsellBannerDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            composerStartRestartGroup = composerStartRestartGroup;
            if (FirstTradeUpsellBanner$lambda$47(snapshotState4CollectAsStateWithLifecycle).getShowContent()) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            firstTradeUpsellBannerDuxo3 = firstTradeUpsellBannerDuxo2;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            firstTradeUpsellBannerDuxo3 = firstTradeUpsellBannerDuxo;
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MenuOfOptionsComposableKt.FirstTradeUpsellBanner$lambda$48(modifier2, firstTradeUpsellBannerDuxo3, onCtaClicked, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void AssetImage(final SortingHatTypes sortingHatTypes, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        Integer numValueOf;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1997937990);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(sortingHatTypes == null ? -1 : sortingHatTypes.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1997937990, i3, -1, "com.robinhood.shared.onboarding.lib.menuofoption.AssetImage (MenuOfOptionsComposable.kt:604)");
                }
                composerStartRestartGroup.startReplaceGroup(168030898);
                numValueOf = sortingHatTypes != null ? null : Integer.valueOf(MenuOfOptionsAssetMappers.drawableRes(sortingHatTypes, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay()));
                composerStartRestartGroup.endReplaceGroup();
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    Color drawableResColor = MenuOfOptionsAssetMappers.getDrawableResColor(sortingHatTypes, composerStartRestartGroup, i3 & 14);
                    ImageKt.Image(PainterResources_androidKt.painterResource(iIntValue, composerStartRestartGroup, 0), (String) null, modifier3, (Alignment) null, (ContentScale) null, 0.0f, drawableResColor != null ? ColorFilter.Companion.m6729tintxETnrds$default(ColorFilter.INSTANCE, drawableResColor.getValue(), 0, 2, null) : null, composerStartRestartGroup, ((i3 << 3) & 896) | 48, 56);
                    Unit unit = Unit.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MenuOfOptionsComposableKt.AssetImage$lambda$52(sortingHatTypes, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(168030898);
            if (sortingHatTypes != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            if (numValueOf != null) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ActionItem(final UiMenuOfOptionsItem uiMenuOfOptionsItem, Modifier modifier, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        int i3;
        final Modifier modifier2;
        StringResource secondaryText;
        BoxScopeInstance boxScopeInstance;
        ComposeUiNode.Companion companion;
        float f;
        int i4;
        FontWeight fontWeight;
        Modifier.Companion companion2;
        int i5;
        long jM21426getFg20d7_KjU;
        FontWeight bold;
        long jM21426getFg20d7_KjU2;
        Color colorM6701boximpl;
        long jM21426getFg20d7_KjU3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(886929607);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(uiMenuOfOptionsItem) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(886929607, i3, -1, "com.robinhood.shared.onboarding.lib.menuofoption.ActionItem (MenuOfOptionsComposable.kt:622)");
                }
                Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromResourceInt = ServerToBentoAssetMapper2.INSTANCE.fromResourceInt(uiMenuOfOptionsItem.getStartIcon());
                secondaryText = uiMenuOfOptionsItem.getSecondaryText();
                if (secondaryText == null) {
                    Intrinsics.checkNotNull(resources);
                    CharSequence text = secondaryText.getText(resources);
                    String string2 = text != null ? text.toString() : null;
                    UiMenuOfOptionsItem.Standard standard = uiMenuOfOptionsItem instanceof UiMenuOfOptionsItem.Standard ? (UiMenuOfOptionsItem.Standard) uiMenuOfOptionsItem : null;
                    final String link = standard != null ? standard.getLink() : null;
                    final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    boolean z = link != null;
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changed(link);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt$$ExternalSyntheticLambda15
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MenuOfOptionsComposableKt.ActionItem$lambda$54$lambda$53(navigator, context, link);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifier3, z, null, null, (Function0) objRememberedValue, 6, null);
                    Modifier modifier4 = modifier3;
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    Modifier modifierAlign = boxScopeInstance2.align(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), 0.0f, BentoBaseRowLayout8.INSTANCE.m21051getPaddingVerticalD9Ej5fM(), 1, null), companion3.getCenterStart());
                    Alignment.Vertical centerVertically = companion3.getCenterVertically();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAlign);
                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    if (uiMenuOfOptionsItem.getStyle() == SortingHatTypes2.FEATURED) {
                        composerStartRestartGroup.startReplaceGroup(-768735401);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        final long jM21456getPositive0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i7).m21456getPositive0d7_KjU();
                        final float fM21595getXsmallD9Ej5fM = bentoTheme.getSpacing(composerStartRestartGroup, i7).m21595getXsmallD9Ej5fM();
                        Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(companion5, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM());
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChanged = composerStartRestartGroup.changed(jM21456getPositive0d7_KjU) | composerStartRestartGroup.changed(fM21595getXsmallD9Ej5fM);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt$$ExternalSyntheticLambda16
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return MenuOfOptionsComposableKt.ActionItem$lambda$59$lambda$58$lambda$56$lambda$55(jM21456getPositive0d7_KjU, fM21595getXsmallD9Ej5fM, (DrawScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BoxKt.Box(DrawModifierKt.drawBehind(modifierM5169size3ABfNKs, (Function1) objRememberedValue2), composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-768240331);
                        Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion5, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.startReplaceGroup(-856062222);
                    if (serverToBentoAssetMapper2FromResourceInt != null) {
                        BentoIcon4.Size24 size24 = new BentoIcon4.Size24(serverToBentoAssetMapper2FromResourceInt);
                        int i8 = WhenMappings.$EnumSwitchMapping$1[uiMenuOfOptionsItem.getStyle().ordinal()];
                        if (i8 == 1) {
                            composerStartRestartGroup.startReplaceGroup(-856053772);
                            jM21426getFg20d7_KjU3 = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21426getFg20d7_KjU();
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            if (i8 != 2 && i8 != 3) {
                                composerStartRestartGroup.startReplaceGroup(-856056644);
                                composerStartRestartGroup.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composerStartRestartGroup.startReplaceGroup(-856050125);
                            jM21426getFg20d7_KjU3 = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        boxScopeInstance = boxScopeInstance2;
                        companion = companion4;
                        companion2 = companion5;
                        i4 = 1;
                        f = 0.0f;
                        fontWeight = null;
                        BentoIcon2.m20644BentoIconFU0evQE(size24, null, jM21426getFg20d7_KjU3, null, null, false, composerStartRestartGroup, BentoIcon4.Size24.$stable | 48, 56);
                    } else {
                        boxScopeInstance = boxScopeInstance2;
                        companion = companion4;
                        f = 0.0f;
                        i4 = 1;
                        fontWeight = null;
                        companion2 = companion5;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, f, i4, fontWeight);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i9 = BentoTheme.$stable;
                    Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, bentoTheme2.getSpacing(composerStartRestartGroup, i9).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i9).m21590getDefaultD9Ej5fM(), 0.0f, 10, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
                    Function0<ComposeUiNode> constructor3 = companion.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    StringResource primaryText = uiMenuOfOptionsItem.getPrimaryText();
                    Intrinsics.checkNotNull(resources);
                    String string3 = primaryText.getText(resources).toString();
                    TextStyle textM = bentoTheme2.getTypography(composerStartRestartGroup, i9).getTextM();
                    SortingHatTypes2 style = uiMenuOfOptionsItem.getStyle();
                    int[] iArr = WhenMappings.$EnumSwitchMapping$1;
                    int i10 = iArr[style.ordinal()];
                    if (i10 != i4) {
                        i5 = 3;
                        if (i10 != 2 && i10 != 3) {
                            composerStartRestartGroup.startReplaceGroup(-161180046);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(-161173527);
                        jM21426getFg20d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i9).m21425getFg0d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        i5 = 3;
                        composerStartRestartGroup.startReplaceGroup(-161177174);
                        jM21426getFg20d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i9).m21426getFg20d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    int i11 = iArr[uiMenuOfOptionsItem.getStyle().ordinal()];
                    if (i11 == i4 || i11 == 2) {
                        bold = FontWeight.INSTANCE.getBold();
                    } else {
                        if (i11 != i5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bold = fontWeight;
                    }
                    Modifier.Companion companion6 = companion2;
                    BoxScopeInstance boxScopeInstance3 = boxScopeInstance;
                    BentoText2.m20747BentoText38GnDrw(string3, null, Color.m6701boximpl(jM21426getFg20d7_KjU), null, bold, null, null, 0, false, 0, 0, null, 0, textM, composerStartRestartGroup, 0, 0, 8170);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.startReplaceGroup(-161162688);
                    if (string2 != null) {
                        TextOverrides secondaryTextStyleOverrides = uiMenuOfOptionsItem.getSecondaryTextStyleOverrides();
                        ThemedColor color = secondaryTextStyleOverrides != null ? secondaryTextStyleOverrides.getColor() : null;
                        TextOverrides secondaryTextStyleOverrides2 = uiMenuOfOptionsItem.getSecondaryTextStyleOverrides();
                        com.robinhood.models.serverdriven.experimental.api.TextStyle style2 = secondaryTextStyleOverrides2 != null ? secondaryTextStyleOverrides2.getStyle() : null;
                        composerStartRestartGroup.startReplaceGroup(-161155561);
                        TextStyle composeTextStyle = style2 == null ? null : UtilKt.getComposeTextStyle(style2, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-161156773);
                        if (composeTextStyle == null) {
                            composeTextStyle = bentoTheme2.getTypography(composerStartRestartGroup, i9).getTextS();
                        }
                        TextStyle textStyle = composeTextStyle;
                        composerStartRestartGroup.endReplaceGroup();
                        if (color != null) {
                            composerStartRestartGroup.startReplaceGroup(-700710695);
                            colorM6701boximpl = SduiColors2.toComposeColor(((SduiColors) composerStartRestartGroup.consume(SduiColors3.getLocalSduiColors())).isDay(composerStartRestartGroup, 0) ? color.getLight() : color.getDark(), composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-700507428);
                            int i12 = iArr[uiMenuOfOptionsItem.getStyle().ordinal()];
                            if (i12 == 1) {
                                composerStartRestartGroup.startReplaceGroup(-161135350);
                                jM21426getFg20d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i9).m21426getFg20d7_KjU();
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.endReplaceGroup();
                                colorM6701boximpl = Color.m6701boximpl(jM21426getFg20d7_KjU2);
                            } else if (i12 != 2) {
                                if (i12 != 3) {
                                    composerStartRestartGroup.startReplaceGroup(-161143442);
                                    composerStartRestartGroup.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composerStartRestartGroup.startReplaceGroup(-161135350);
                                jM21426getFg20d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i9).m21426getFg20d7_KjU();
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.endReplaceGroup();
                                colorM6701boximpl = Color.m6701boximpl(jM21426getFg20d7_KjU2);
                            } else {
                                composerStartRestartGroup.startReplaceGroup(-161140375);
                                jM21426getFg20d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i9).m21425getFg0d7_KjU();
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.endReplaceGroup();
                                colorM6701boximpl = Color.m6701boximpl(jM21426getFg20d7_KjU2);
                            }
                        }
                        BentoText2.m20747BentoText38GnDrw(string2, null, colorM6701boximpl, null, null, null, null, 0, false, 0, 0, null, 0, textStyle, composerStartRestartGroup, 0, 0, 8186);
                        composerStartRestartGroup = composerStartRestartGroup;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endNode();
                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(boxScopeInstance3.align(SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion6, ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue(), 0.0f, 2, null), 0.0f, 1, null), companion3.getBottomStart()), bentoTheme2.getColors(composerStartRestartGroup, i9).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MenuOfOptionsComposableKt.ActionItem$lambda$60(uiMenuOfOptionsItem, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Resources resources2 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromResourceInt2 = ServerToBentoAssetMapper2.INSTANCE.fromResourceInt(uiMenuOfOptionsItem.getStartIcon());
            secondaryText = uiMenuOfOptionsItem.getSecondaryText();
            if (secondaryText == null) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ActionItem$lambda$59$lambda$58$lambda$56$lambda$55(long j, float f, DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        DrawScope.m6947drawCircleVaOC9Bg$default(drawBehind, j, drawBehind.mo5016toPx0680j_4(f), 0L, 0.0f, null, null, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void PromotionalBanner(final MenuOfOptionsPromotionalBanner menuOfOptionsPromotionalBanner, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Modifier modifier3;
        BentoTheme bentoTheme;
        int i4;
        Composer composer2;
        Composer composer3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1530032975);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changedInstance(menuOfOptionsPromotionalBanner) ? 4 : 2);
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
                composer3 = composerStartRestartGroup;
            } else {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1530032975, i3, -1, "com.robinhood.shared.onboarding.lib.menuofoption.PromotionalBanner (MenuOfOptionsComposable.kt:724)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierHeight = Intrinsic3.height(modifier4, Intrinsic4.Min);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                long jM21372getBg20d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i6).m21372getBg20d7_KjU();
                BentoInfoBanner bentoInfoBanner = BentoInfoBanner.INSTANCE;
                Modifier modifierM4871backgroundbw27NRU = Background3.m4871backgroundbw27NRU(modifierHeight, jM21372getBg20d7_KjU, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoInfoBanner.m20647getCornerRadiusD9Ej5fM()));
                Alignment.Companion companion2 = Alignment.INSTANCE;
                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4871backgroundbw27NRU);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierM5143paddingVpY3zN4 = androidx.compose.foundation.layout.PaddingKt.m5143paddingVpY3zN4(Clip.clip(Row5.weight$default(row6, companion4, 1.0f, false, 2, null), bentoInfoBanner.getMainContentShapeWithoutDismiss()), bentoTheme2.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM());
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM()), companion2.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN4);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                composerStartRestartGroup.startReplaceGroup(1401790701);
                if (PromotionalBanner$lambda$62(snapshotState)) {
                    modifier3 = modifier4;
                    bentoTheme = bentoTheme2;
                    i4 = i6;
                    composer2 = composerStartRestartGroup;
                } else {
                    String imageUrl = menuOfOptionsPromotionalBanner.getImageUrl();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt$$ExternalSyntheticLambda21
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return MenuOfOptionsComposableKt.PromotionalBanner$lambda$67$lambda$66$lambda$65$lambda$64(snapshotState, (AsyncImagePainter.State.Error) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier4;
                    bentoTheme = bentoTheme2;
                    i4 = i6;
                    ImageKt.Image(SingletonAsyncImagePainter.m9121rememberAsyncImagePainterHtA5bXE(imageUrl, null, null, null, null, null, (Function1) objRememberedValue2, null, 0, null, composer2, 1572864, 958), (String) null, TestTag3.testTag(SizeKt.m5155defaultMinSizeVpY3zN4$default(companion4, 0.0f, C2002Dp.m7995constructorimpl(60), 1, null), PromotionalBannerTag), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 432, 120);
                }
                composer2.endReplaceGroup();
                Composer composer4 = composer2;
                BentoText2.m20747BentoText38GnDrw(menuOfOptionsPromotionalBanner.getMessage(), null, Color.m6701boximpl(bentoTheme.getColors(composer2, i4).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i4).getTextS(), composer4, 0, 0, 8186);
                composer3 = composer4;
                composer3.endNode();
                composer3.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MenuOfOptionsComposableKt.PromotionalBanner$lambda$68(menuOfOptionsPromotionalBanner, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierHeight2 = Intrinsic3.height(modifier4, Intrinsic4.Min);
            BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
            int i62 = BentoTheme.$stable;
            long jM21372getBg20d7_KjU2 = bentoTheme22.getColors(composerStartRestartGroup, i62).m21372getBg20d7_KjU();
            BentoInfoBanner bentoInfoBanner2 = BentoInfoBanner.INSTANCE;
            Modifier modifierM4871backgroundbw27NRU2 = Background3.m4871backgroundbw27NRU(modifierHeight2, jM21372getBg20d7_KjU2, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoInfoBanner2.m20647getCornerRadiusD9Ej5fM()));
            Alignment.Companion companion22 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically2 = companion22.getCenterVertically();
            Arrangement arrangement2 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(arrangement2.getStart(), centerVertically2, composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4871backgroundbw27NRU2);
            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy3, companion32.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                Row6 row62 = Row6.INSTANCE;
                Modifier.Companion companion42 = Modifier.INSTANCE;
                Modifier modifierM5143paddingVpY3zN42 = androidx.compose.foundation.layout.PaddingKt.m5143paddingVpY3zN4(Clip.clip(Row5.weight$default(row62, companion42, 1.0f, false, 2, null), bentoInfoBanner2.getMainContentShapeWithoutDismiss()), bentoTheme22.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), bentoTheme22.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM());
                MeasurePolicy measurePolicyRowMeasurePolicy22 = Row2.rowMeasurePolicy(arrangement2.m5089spacedBy0680j_4(bentoTheme22.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM()), companion22.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN42);
                Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy22, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                    composerStartRestartGroup.startReplaceGroup(1401790701);
                    if (PromotionalBanner$lambda$62(snapshotState)) {
                    }
                    composer2.endReplaceGroup();
                    Composer composer42 = composer2;
                    BentoText2.m20747BentoText38GnDrw(menuOfOptionsPromotionalBanner.getMessage(), null, Color.m6701boximpl(bentoTheme.getColors(composer2, i4).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i4).getTextS(), composer42, 0, 0, 8186);
                    composer3 = composer42;
                    composer3.endNode();
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier3;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void PromotionalBanner$lambda$63(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PromotionalBanner$lambda$67$lambda$66$lambda$65$lambda$64(SnapshotState snapshotState, AsyncImagePainter.State.Error it) {
        Intrinsics.checkNotNullParameter(it, "it");
        PromotionalBanner$lambda$63(snapshotState, false);
        return Unit.INSTANCE;
    }

    private static final void FirstTradeUpsellContentPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-513146684);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-513146684, i, -1, "com.robinhood.shared.onboarding.lib.menuofoption.FirstTradeUpsellContentPreview (MenuOfOptionsComposable.kt:773)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$MenuOfOptionsComposableKt.INSTANCE.m25550getLambda$460902276$lib_menu_of_options_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MenuOfOptionsComposableKt.FirstTradeUpsellContentPreview$lambda$69(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void MenuOfOptionsPreview(final MenuOfOptionsState menuOfOptionsState, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(701840893);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(menuOfOptionsState) : composerStartRestartGroup.changedInstance(menuOfOptionsState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(701840893, i2, -1, "com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsPreview (MenuOfOptionsComposable.kt:781)");
            }
            CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{LocalNavigator.getLocalNavigator().provides(Navigator.INSTANCE), InspectionMode.getLocalInspectionMode().provides(Boolean.TRUE), AutoLoggingCompositionLocals.getLocalEventLogger().provides(EventLogger.INSTANCE)}, ComposableLambda3.rememberComposableLambda(-1015213379, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt.MenuOfOptionsPreview.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1015213379, i3, -1, "com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsPreview.<anonymous> (MenuOfOptionsComposable.kt:787)");
                    }
                    final MenuOfOptionsState menuOfOptionsState2 = menuOfOptionsState;
                    BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-2078051211, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt.MenuOfOptionsPreview.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) throws Resources.NotFoundException {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) throws Resources.NotFoundException {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2078051211, i4, -1, "com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsPreview.<anonymous>.<anonymous> (MenuOfOptionsComposable.kt:788)");
                            }
                            MenuOfOptionsComposableKt.MenuOfOptions(menuOfOptionsState2, AppType.TRADER, null, ComposableSingletons$MenuOfOptionsComposableKt.INSTANCE.getLambda$287912079$lib_menu_of_options_externalDebug(), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer3, 28080, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 100663296, 255);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MenuOfOptionsComposableKt.MenuOfOptionsPreview$lambda$70(menuOfOptionsState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
