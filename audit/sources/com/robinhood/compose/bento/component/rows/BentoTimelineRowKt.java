package com.robinhood.compose.bento.component.rows;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.IconKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.ClipOp;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.RectangleShape2;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawContext;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.ImageLoader;
import coil.compose.AsyncImagePainter4;
import com.robinhood.android.compose.C11917R;
import com.robinhood.android.eventcontracts.analytics.EventAnalyticsString;
import com.robinhood.android.gold.sparkle.compose.GoldSparkleBrush;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.rows.Timeline;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.theme.Spacing2;
import com.robinhood.compose.bento.util.CoilUtils2;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BentoTimelineRow.kt */
@Metadata(m3635d1 = {"\u0000\u009e\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aë\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u00142\b\b\u0002\u0010\u001e\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u00142\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\"\u0010#\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010&\u001a-\u0010'\u001a\u00020\t*\u00020\t2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00182\b\b\u0002\u0010+\u001a\u00020,H\u0002¢\u0006\u0004\b-\u0010.\u001a3\u0010/\u001a\u00020\u00012\u0006\u00100\u001a\u0002012\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\u00142\b\b\u0002\u00102\u001a\u00020\u0014H\u0003¢\u0006\u0002\u00103\u001a\u0015\u00104\u001a\u00020\u00012\u0006\u00100\u001a\u000201H\u0003¢\u0006\u0002\u00105\u001a\u001d\u00106\u001a\u00020\u0018*\u00020)2\b\u00107\u001a\u0004\u0018\u00010\u0018H\u0003¢\u0006\u0004\b8\u00109\u001aE\u0010:\u001a\u00020\u00012\u0006\u0010;\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010<\u001a\u00020\u00142\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>H\u0003¢\u0006\u0002\u0010?\u001a;\u0010@\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0003¢\u0006\u0002\u0010A\u001aM\u0010B\u001a\u00020\u00012\u0006\u0010C\u001a\u00020\u00072\b\u0010D\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010<\u001a\u00020\u00142\b\b\u0002\u0010E\u001a\u00020\u00142\u000e\b\u0002\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00010GH\u0003¢\u0006\u0002\u0010H\u001a\u0017\u0010I\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0003¢\u0006\u0002\u0010J\u001a\u0017\u0010K\u001a\u00020\u00012\b\b\u0001\u0010L\u001a\u00020\u0014H\u0001¢\u0006\u0002\u0010M\u001a!\u0010N\u001a\u00020\u00012\u0012\u0010O\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030PH\u0003¢\u0006\u0002\u0010Q\" \u0010R\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030P0SX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006T²\u0006\n\u0010U\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010V\u001a\u00020WX\u008a\u008e\u0002²\u0006\n\u0010X\u001a\u00020YX\u008a\u008e\u0002²\u0006\n\u0010Z\u001a\u00020YX\u008a\u008e\u0002"}, m3636d2 = {"BentoTimelineRow", "", "status", "Lcom/robinhood/compose/bento/component/rows/Timeline$Status;", "position", "Lcom/robinhood/compose/bento/component/rows/Timeline$Position;", "titleText", "", "modifier", "Landroidx/compose/ui/Modifier;", "timestampText", "metadataText", "ctaButton", "Lcom/robinhood/compose/bento/component/rows/Timeline$CtaButton;", "infoAction", "Lcom/robinhood/compose/bento/component/rows/Timeline$InfoAction;", "colorOverrides", "Lcom/robinhood/compose/bento/component/rows/Timeline$ColorOverrides;", "previousStatus", "supportMultipleLines", "", "iconOverride", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "iconColorOverride", "Landroidx/compose/ui/graphics/Color;", "isActiveEntry", "isLargeIconContainer", "maxLines", "", "animateEntry", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "showTitlePlaceholder", "showMetadataPlaceholder", "showTimelinePlaceholder", "BentoTimelineRow-cZKY2IM", "(Lcom/robinhood/compose/bento/component/rows/Timeline$Status;Lcom/robinhood/compose/bento/component/rows/Timeline$Position;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/compose/bento/component/rows/Timeline$CtaButton;Lcom/robinhood/compose/bento/component/rows/Timeline$InfoAction;Lcom/robinhood/compose/bento/component/rows/Timeline$ColorOverrides;Lcom/robinhood/compose/bento/component/rows/Timeline$Status;ZLcom/robinhood/android/libdesignsystem/serverui/IconAsset;Landroidx/compose/ui/graphics/Color;ZZIZIZZZLandroidx/compose/runtime/Composer;IIII)V", "state", "Lcom/robinhood/compose/bento/component/rows/BentoTimelineRowState;", "(Lcom/robinhood/compose/bento/component/rows/BentoTimelineRowState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "connectorBackground", "connectorColorType", "Lcom/robinhood/compose/bento/component/rows/Timeline$ColorType;", "connectorColor", "shape", "Landroidx/compose/ui/graphics/Shape;", "connectorBackground-9LQNqLg", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/compose/bento/component/rows/Timeline$ColorType;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "TimelineStatus", "statusInfo", "Lcom/robinhood/compose/bento/component/rows/Timeline$StatusInfo;", "startAnimation", "(Lcom/robinhood/compose/bento/component/rows/Timeline$StatusInfo;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;II)V", "TimelineStatusIcon", "(Lcom/robinhood/compose/bento/component/rows/Timeline$StatusInfo;Landroidx/compose/runtime/Composer;I)V", "resolveColor", "colorOverride", "resolveColor-bMF-p3s", "(Lcom/robinhood/compose/bento/component/rows/Timeline$ColorType;Landroidx/compose/ui/graphics/Color;Landroidx/compose/runtime/Composer;I)J", "TimelineTitle", "text", "enabled", "primaryTextStyleOverride", "Lcom/robinhood/compose/bento/component/rows/Timeline$PrimaryTextStyleOverride;", "(Ljava/lang/String;ZLcom/robinhood/compose/bento/component/rows/Timeline$InfoAction;ZLandroidx/compose/ui/Modifier;Lcom/robinhood/compose/bento/component/rows/Timeline$PrimaryTextStyleOverride;Landroidx/compose/runtime/Composer;II)V", "TimelineMetadata", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/compose/bento/component/rows/Timeline$InfoAction;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;II)V", "TimelineDetailContent", "tertiaryText", "detailThumbnailImage", "showPlayButton", "onClick", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "TimelineCta", "(Lcom/robinhood/compose/bento/component/rows/Timeline$CtaButton;Landroidx/compose/runtime/Composer;I)V", "BentoTimelineRowPreview", "isLoading", "(ZLandroidx/compose/runtime/Composer;I)V", "Section", EventAnalyticsString.CONTROL_CONTRACT_SELECTOR_PAIR_MODE, "Lkotlin/Pair;", "(Lkotlin/Pair;Landroidx/compose/runtime/Composer;I)V", "progressList", "", "lib-compose-bento_externalRelease", "startEntryAnimation", "middleAndMetaHeightDp", "Landroidx/compose/ui/unit/Dp;", "positionInWindow", "Landroidx/compose/ui/geometry/Offset;", "iconPositionInWindow"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class BentoTimelineRowKt {
    private static final List<Tuples2<String, Timeline.Status>> progressList = CollectionsKt.listOf((Object[]) new Tuples2[]{new Tuples2("Completed", Timeline.Status.COMPLETE), new Tuples2("Ongoing", Timeline.Status.ONGOING), new Tuples2("Error", Timeline.Status.ERROR), new Tuples2("Warning", Timeline.Status.WARNING), new Tuples2("Incomplete", Timeline.Status.INCOMPLETE)});

    /* compiled from: BentoTimelineRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Timeline.ColorType.values().length];
            try {
                iArr[Timeline.ColorType.SPARKLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Timeline.ColorType.ENABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Timeline.ColorType.DISABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Timeline.ColorType.BACKGROUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Timeline.ColorType.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Timeline.ColorType.WARNING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Timeline.ColorType.TRANSPARENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Timeline.IconStyle.values().length];
            try {
                iArr2[Timeline.IconStyle.DOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[Timeline.IconStyle.FILLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[Timeline.IconStyle.OUTLINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoTimelineRow$lambda$15(BentoTimelineRowState bentoTimelineRowState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BentoTimelineRow(bentoTimelineRowState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoTimelineRowPreview$lambda$43(boolean z, int i, Composer composer, int i2) {
        BentoTimelineRowPreview(z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoTimelineRow_cZKY2IM$lambda$0(Timeline.Status status, Timeline.Position position, String str, Modifier modifier, String str2, String str3, Timeline.CtaButton ctaButton, Timeline.InfoAction infoAction, Timeline.ColorOverrides colorOverrides, Timeline.Status status2, boolean z, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, Color color, boolean z2, boolean z3, int i, boolean z4, int i2, boolean z5, boolean z6, boolean z7, int i3, int i4, int i5, int i6, Composer composer, int i7) {
        m20996BentoTimelineRowcZKY2IM(status, position, str, modifier, str2, str3, ctaButton, infoAction, colorOverrides, status2, z, serverToBentoAssetMapper2, color, z2, z3, i, z4, i2, z5, z6, z7, composer, RecomposeScopeImpl4.updateChangedFlags(i3 | 1), RecomposeScopeImpl4.updateChangedFlags(i4), RecomposeScopeImpl4.updateChangedFlags(i5), i6);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Section$lambda$53(Tuples2 tuples2, int i, Composer composer, int i2) {
        Section(tuples2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimelineCta$lambda$42(Timeline.CtaButton ctaButton, int i, Composer composer, int i2) {
        TimelineCta(ctaButton, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimelineDetailContent$lambda$41(String str, String str2, Modifier modifier, boolean z, boolean z2, Function0 function0, int i, int i2, Composer composer, int i3) {
        TimelineDetailContent(str, str2, modifier, z, z2, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimelineMetadata$lambda$33(String str, String str2, Timeline.InfoAction infoAction, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        TimelineMetadata(str, str2, infoAction, modifier, i, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimelineStatus$lambda$22(Timeline.StatusInfo statusInfo, Modifier modifier, boolean z, boolean z2, int i, int i2, Composer composer, int i3) {
        TimelineStatus(statusInfo, modifier, z, z2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimelineStatusIcon$lambda$29(Timeline.StatusInfo statusInfo, int i, Composer composer, int i2) {
        TimelineStatusIcon(statusInfo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimelineTitle$lambda$31(String str, boolean z, Timeline.InfoAction infoAction, boolean z2, Modifier modifier, Timeline.PrimaryTextStyleOverride primaryTextStyleOverride, int i, int i2, Composer composer, int i3) {
        TimelineTitle(str, z, infoAction, z2, modifier, primaryTextStyleOverride, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BentoTimelineRow$lambda$14$lambda$3(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float BentoTimelineRow$lambda$14$lambda$6(SnapshotState<C2002Dp> snapshotState) {
        return snapshotState.getValue().getValue();
    }

    private static final long TimelineStatusIcon$lambda$24(SnapshotState<Offset> snapshotState) {
        return snapshotState.getValue().getPackedValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:305:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012d  */
    /* renamed from: BentoTimelineRow-cZKY2IM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20996BentoTimelineRowcZKY2IM(final Timeline.Status status, final Timeline.Position position, final String titleText, Modifier modifier, String str, String str2, Timeline.CtaButton ctaButton, Timeline.InfoAction infoAction, Timeline.ColorOverrides colorOverrides, Timeline.Status status2, boolean z, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, Color color, boolean z2, boolean z3, int i, boolean z4, int i2, boolean z5, boolean z6, boolean z7, Composer composer, final int i3, final int i4, final int i5, final int i6) {
        int i7;
        Modifier modifier2;
        int i8;
        String str3;
        int i9;
        String str4;
        int i10;
        Timeline.CtaButton ctaButton2;
        int i11;
        Timeline.InfoAction infoAction2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        Color color2;
        final Timeline.CtaButton ctaButton3;
        final String str5;
        final String str6;
        Composer composer2;
        final Color color3;
        final boolean z8;
        final boolean z9;
        final int i32;
        final boolean z10;
        final int i33;
        final boolean z11;
        final boolean z12;
        final boolean z13;
        final ServerToBentoAssetMapper2 serverToBentoAssetMapper22;
        final boolean z14;
        final Timeline.Status status3;
        final Timeline.ColorOverrides colorOverrides2;
        final Timeline.InfoAction infoAction3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1447666710);
        if ((i6 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (composerStartRestartGroup.changed(status.ordinal()) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i6 & 2) != 0) {
            i7 |= 48;
        } else if ((i3 & 48) == 0) {
            i7 |= composerStartRestartGroup.changed(position.ordinal()) ? 32 : 16;
        }
        if ((i6 & 4) != 0) {
            i7 |= 384;
        } else if ((i3 & 384) == 0) {
            i7 |= composerStartRestartGroup.changed(titleText) ? 256 : 128;
        }
        int i34 = i6 & 8;
        if (i34 != 0) {
            i7 |= 3072;
        } else {
            if ((i3 & 3072) == 0) {
                modifier2 = modifier;
                i7 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i8 = i6 & 16;
            if (i8 == 0) {
                i7 |= 24576;
            } else {
                if ((i3 & 24576) == 0) {
                    str3 = str;
                    i7 |= composerStartRestartGroup.changed(str3) ? 16384 : 8192;
                }
                i9 = i6 & 32;
                if (i9 != 0) {
                    i7 |= 196608;
                    str4 = str2;
                } else {
                    str4 = str2;
                    if ((i3 & 196608) == 0) {
                        i7 |= composerStartRestartGroup.changed(str4) ? 131072 : 65536;
                    }
                }
                i10 = i6 & 64;
                if (i10 != 0) {
                    i7 |= 1572864;
                    ctaButton2 = ctaButton;
                } else {
                    ctaButton2 = ctaButton;
                    if ((i3 & 1572864) == 0) {
                        i7 |= composerStartRestartGroup.changed(ctaButton2) ? 1048576 : 524288;
                    }
                }
                i11 = i6 & 128;
                if (i11 != 0) {
                    i7 |= 12582912;
                    infoAction2 = infoAction;
                } else {
                    infoAction2 = infoAction;
                    if ((i3 & 12582912) == 0) {
                        i7 |= composerStartRestartGroup.changed(infoAction2) ? 8388608 : 4194304;
                    }
                }
                i12 = i6 & 256;
                if (i12 != 0) {
                    i7 |= 100663296;
                } else if ((i3 & 100663296) == 0) {
                    i7 |= composerStartRestartGroup.changed(colorOverrides) ? 67108864 : 33554432;
                }
                i13 = i6 & 512;
                if (i13 != 0) {
                    i7 |= 805306368;
                } else {
                    if ((i3 & 805306368) == 0) {
                        i14 = i13;
                        i7 |= composerStartRestartGroup.changed(status2 == null ? -1 : status2.ordinal()) ? 536870912 : 268435456;
                    }
                    i15 = i7;
                    i16 = i6 & 1024;
                    if (i16 == 0) {
                        i17 = i4 | 6;
                    } else if ((i4 & 6) == 0) {
                        i17 = i4 | (composerStartRestartGroup.changed(z) ? 4 : 2);
                    } else {
                        i17 = i4;
                    }
                    i18 = i6 & 2048;
                    if (i18 == 0) {
                        i17 |= 48;
                    } else {
                        if ((i4 & 48) == 0) {
                            i19 = i18;
                            i17 |= composerStartRestartGroup.changed(serverToBentoAssetMapper2 == null ? -1 : serverToBentoAssetMapper2.ordinal()) ? 32 : 16;
                        }
                        int i35 = i17;
                        i20 = i6 & 4096;
                        if (i20 != 0) {
                            i21 = i35 | 384;
                        } else {
                            int i36 = i35;
                            if ((i4 & 384) == 0) {
                                i36 |= composerStartRestartGroup.changed(color) ? 256 : 128;
                            }
                            i21 = i36;
                        }
                        i22 = i6 & 8192;
                        if (i22 != 0) {
                            i23 = i21 | 3072;
                        } else {
                            int i37 = i21;
                            if ((i4 & 3072) == 0) {
                                i23 = i37 | (composerStartRestartGroup.changed(z2) ? 2048 : 1024);
                            } else {
                                i23 = i37;
                            }
                        }
                        i24 = i6 & 16384;
                        if (i24 == 0) {
                            if ((i4 & 24576) == 0) {
                                i23 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
                            }
                            i25 = i6 & 32768;
                            if (i25 == 0) {
                                i23 |= 196608;
                            } else if ((i4 & 196608) == 0) {
                                i23 |= composerStartRestartGroup.changed(i) ? 131072 : 65536;
                            }
                            i26 = i6 & 65536;
                            if (i26 == 0) {
                                i23 |= 1572864;
                            } else if ((i4 & 1572864) == 0) {
                                i23 |= composerStartRestartGroup.changed(z4) ? 1048576 : 524288;
                            }
                            i27 = i6 & 131072;
                            if (i27 == 0) {
                                i23 |= 12582912;
                            } else if ((i4 & 12582912) == 0) {
                                i23 |= composerStartRestartGroup.changed(i2) ? 8388608 : 4194304;
                            }
                            i28 = i6 & 262144;
                            if (i28 == 0) {
                                i23 |= 100663296;
                            } else if ((i4 & 100663296) == 0) {
                                i23 |= composerStartRestartGroup.changed(z5) ? 67108864 : 33554432;
                            }
                            i29 = i6 & 524288;
                            if (i29 == 0) {
                                i23 |= 805306368;
                            } else if ((i4 & 805306368) == 0) {
                                i23 |= composerStartRestartGroup.changed(z6) ? 536870912 : 268435456;
                            }
                            i30 = i6 & 1048576;
                            if (i30 == 0) {
                                i31 = i5 | 6;
                            } else if ((i5 & 6) == 0) {
                                i31 = i5 | (composerStartRestartGroup.changed(z7) ? 4 : 2);
                            } else {
                                i31 = i5;
                            }
                            if ((i15 & 306783379) == 306783378 || (306783379 & i23) != 306783378 || (i31 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
                                if (i34 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i8 != 0) {
                                    str3 = null;
                                }
                                if (i9 != 0) {
                                    str4 = null;
                                }
                                if (i10 != 0) {
                                    ctaButton2 = null;
                                }
                                if (i11 != 0) {
                                    infoAction2 = null;
                                }
                                Timeline.ColorOverrides colorOverrides3 = i12 == 0 ? null : colorOverrides;
                                Timeline.Status status4 = i14 == 0 ? null : status2;
                                boolean z15 = i16 == 0 ? false : z;
                                ServerToBentoAssetMapper2 serverToBentoAssetMapper23 = i19 == 0 ? null : serverToBentoAssetMapper2;
                                Color color4 = i20 == 0 ? color : null;
                                boolean z16 = i22 == 0 ? false : z2;
                                boolean z17 = i24 == 0 ? false : z3;
                                int i38 = i25 == 0 ? 1 : i;
                                boolean z18 = i26 == 0 ? false : z4;
                                int i39 = i27 == 0 ? 0 : i2;
                                boolean z19 = i28 == 0 ? false : z5;
                                boolean z20 = i29 == 0 ? false : z6;
                                boolean z21 = i30 == 0 ? false : z7;
                                if (ComposerKt.isTraceInProgress()) {
                                    color2 = color4;
                                } else {
                                    color2 = color4;
                                    ComposerKt.traceEventStart(-1447666710, i15, i23, "com.robinhood.compose.bento.component.rows.BentoTimelineRow (BentoTimelineRow.kt:130)");
                                }
                                boolean z22 = z15;
                                ctaButton3 = ctaButton2;
                                Timeline.InfoAction infoAction4 = infoAction2;
                                boolean z23 = z16;
                                boolean z24 = z17;
                                str5 = str3;
                                ServerToBentoAssetMapper2 serverToBentoAssetMapper24 = serverToBentoAssetMapper23;
                                Modifier modifier4 = modifier2;
                                Timeline.ColorOverrides colorOverrides4 = colorOverrides3;
                                str6 = str4;
                                Color color5 = color2;
                                composer2 = composerStartRestartGroup;
                                BentoTimelineRow(new BentoTimelineRowState(status, position, titleText, infoAction4, str5, str6, ctaButton3, colorOverrides4, status4, z22, serverToBentoAssetMapper24, color5, null, null, z23, z24, i38, z18, i39, z19, z20, z21, null, null, 12595200, null), modifier4, composer2, (i15 >> 6) & 112, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                color3 = color5;
                                z8 = z23;
                                z9 = z24;
                                i32 = i38;
                                z10 = z18;
                                i33 = i39;
                                z11 = z19;
                                z12 = z20;
                                z13 = z21;
                                serverToBentoAssetMapper22 = serverToBentoAssetMapper24;
                                z14 = z22;
                                status3 = status4;
                                colorOverrides2 = colorOverrides4;
                                infoAction3 = infoAction4;
                                modifier3 = modifier4;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                colorOverrides2 = colorOverrides;
                                status3 = status2;
                                z8 = z2;
                                i32 = i;
                                z10 = z4;
                                i33 = i2;
                                z11 = z5;
                                z12 = z6;
                                z13 = z7;
                                composer2 = composerStartRestartGroup;
                                modifier3 = modifier2;
                                str5 = str3;
                                str6 = str4;
                                ctaButton3 = ctaButton2;
                                infoAction3 = infoAction2;
                                z14 = z;
                                serverToBentoAssetMapper22 = serverToBentoAssetMapper2;
                                color3 = color;
                                z9 = z3;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoTimelineRowKt$$ExternalSyntheticLambda18
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return BentoTimelineRowKt.BentoTimelineRow_cZKY2IM$lambda$0(status, position, titleText, modifier3, str5, str6, ctaButton3, infoAction3, colorOverrides2, status3, z14, serverToBentoAssetMapper22, color3, z8, z9, i32, z10, i33, z11, z12, z13, i3, i4, i5, i6, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i23 |= 24576;
                        i25 = i6 & 32768;
                        if (i25 == 0) {
                        }
                        i26 = i6 & 65536;
                        if (i26 == 0) {
                        }
                        i27 = i6 & 131072;
                        if (i27 == 0) {
                        }
                        i28 = i6 & 262144;
                        if (i28 == 0) {
                        }
                        i29 = i6 & 524288;
                        if (i29 == 0) {
                        }
                        i30 = i6 & 1048576;
                        if (i30 == 0) {
                        }
                        if ((i15 & 306783379) == 306783378) {
                            if (i34 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 != 0) {
                            }
                            if (i10 != 0) {
                            }
                            if (i11 != 0) {
                            }
                            if (i12 == 0) {
                            }
                            if (i14 == 0) {
                            }
                            if (i16 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            if (i20 == 0) {
                            }
                            if (i22 == 0) {
                            }
                            if (i24 == 0) {
                            }
                            if (i25 == 0) {
                            }
                            if (i26 == 0) {
                            }
                            if (i27 == 0) {
                            }
                            if (i28 == 0) {
                            }
                            if (i29 == 0) {
                            }
                            if (i30 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            boolean z222 = z15;
                            ctaButton3 = ctaButton2;
                            Timeline.InfoAction infoAction42 = infoAction2;
                            boolean z232 = z16;
                            boolean z242 = z17;
                            str5 = str3;
                            ServerToBentoAssetMapper2 serverToBentoAssetMapper242 = serverToBentoAssetMapper23;
                            Modifier modifier42 = modifier2;
                            Timeline.ColorOverrides colorOverrides42 = colorOverrides3;
                            str6 = str4;
                            Color color52 = color2;
                            composer2 = composerStartRestartGroup;
                            BentoTimelineRow(new BentoTimelineRowState(status, position, titleText, infoAction42, str5, str6, ctaButton3, colorOverrides42, status4, z222, serverToBentoAssetMapper242, color52, null, null, z232, z242, i38, z18, i39, z19, z20, z21, null, null, 12595200, null), modifier42, composer2, (i15 >> 6) & 112, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            color3 = color52;
                            z8 = z232;
                            z9 = z242;
                            i32 = i38;
                            z10 = z18;
                            i33 = i39;
                            z11 = z19;
                            z12 = z20;
                            z13 = z21;
                            serverToBentoAssetMapper22 = serverToBentoAssetMapper242;
                            z14 = z222;
                            status3 = status4;
                            colorOverrides2 = colorOverrides42;
                            infoAction3 = infoAction42;
                            modifier3 = modifier42;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i19 = i18;
                    int i352 = i17;
                    i20 = i6 & 4096;
                    if (i20 != 0) {
                    }
                    i22 = i6 & 8192;
                    if (i22 != 0) {
                    }
                    i24 = i6 & 16384;
                    if (i24 == 0) {
                    }
                    i25 = i6 & 32768;
                    if (i25 == 0) {
                    }
                    i26 = i6 & 65536;
                    if (i26 == 0) {
                    }
                    i27 = i6 & 131072;
                    if (i27 == 0) {
                    }
                    i28 = i6 & 262144;
                    if (i28 == 0) {
                    }
                    i29 = i6 & 524288;
                    if (i29 == 0) {
                    }
                    i30 = i6 & 1048576;
                    if (i30 == 0) {
                    }
                    if ((i15 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i14 = i13;
                i15 = i7;
                i16 = i6 & 1024;
                if (i16 == 0) {
                }
                i18 = i6 & 2048;
                if (i18 == 0) {
                }
                i19 = i18;
                int i3522 = i17;
                i20 = i6 & 4096;
                if (i20 != 0) {
                }
                i22 = i6 & 8192;
                if (i22 != 0) {
                }
                i24 = i6 & 16384;
                if (i24 == 0) {
                }
                i25 = i6 & 32768;
                if (i25 == 0) {
                }
                i26 = i6 & 65536;
                if (i26 == 0) {
                }
                i27 = i6 & 131072;
                if (i27 == 0) {
                }
                i28 = i6 & 262144;
                if (i28 == 0) {
                }
                i29 = i6 & 524288;
                if (i29 == 0) {
                }
                i30 = i6 & 1048576;
                if (i30 == 0) {
                }
                if ((i15 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            str3 = str;
            i9 = i6 & 32;
            if (i9 != 0) {
            }
            i10 = i6 & 64;
            if (i10 != 0) {
            }
            i11 = i6 & 128;
            if (i11 != 0) {
            }
            i12 = i6 & 256;
            if (i12 != 0) {
            }
            i13 = i6 & 512;
            if (i13 != 0) {
            }
            i14 = i13;
            i15 = i7;
            i16 = i6 & 1024;
            if (i16 == 0) {
            }
            i18 = i6 & 2048;
            if (i18 == 0) {
            }
            i19 = i18;
            int i35222 = i17;
            i20 = i6 & 4096;
            if (i20 != 0) {
            }
            i22 = i6 & 8192;
            if (i22 != 0) {
            }
            i24 = i6 & 16384;
            if (i24 == 0) {
            }
            i25 = i6 & 32768;
            if (i25 == 0) {
            }
            i26 = i6 & 65536;
            if (i26 == 0) {
            }
            i27 = i6 & 131072;
            if (i27 == 0) {
            }
            i28 = i6 & 262144;
            if (i28 == 0) {
            }
            i29 = i6 & 524288;
            if (i29 == 0) {
            }
            i30 = i6 & 1048576;
            if (i30 == 0) {
            }
            if ((i15 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i8 = i6 & 16;
        if (i8 == 0) {
        }
        str3 = str;
        i9 = i6 & 32;
        if (i9 != 0) {
        }
        i10 = i6 & 64;
        if (i10 != 0) {
        }
        i11 = i6 & 128;
        if (i11 != 0) {
        }
        i12 = i6 & 256;
        if (i12 != 0) {
        }
        i13 = i6 & 512;
        if (i13 != 0) {
        }
        i14 = i13;
        i15 = i7;
        i16 = i6 & 1024;
        if (i16 == 0) {
        }
        i18 = i6 & 2048;
        if (i18 == 0) {
        }
        i19 = i18;
        int i352222 = i17;
        i20 = i6 & 4096;
        if (i20 != 0) {
        }
        i22 = i6 & 8192;
        if (i22 != 0) {
        }
        i24 = i6 & 16384;
        if (i24 == 0) {
        }
        i25 = i6 & 32768;
        if (i25 == 0) {
        }
        i26 = i6 & 65536;
        if (i26 == 0) {
        }
        i27 = i6 & 131072;
        if (i27 == 0) {
        }
        i28 = i6 & 262144;
        if (i28 == 0) {
        }
        i29 = i6 & 524288;
        if (i29 == 0) {
        }
        i30 = i6 & 1048576;
        if (i30 == 0) {
        }
        if ((i15 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoTimelineRow(final BentoTimelineRowState state, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Timeline.StatusInfo statusInfoM21086createPIknLig;
        boolean z;
        Modifier modifier3;
        float f;
        Tuples2 tuples2M3642to;
        Modifier modifier4;
        Object objRememberedValue;
        Composer.Companion companion;
        SnapshotState snapshotState;
        Object objRememberedValue2;
        int i4;
        SnapshotState snapshotState2;
        Object objRememberedValue3;
        Animatable animatable;
        Object objRememberedValue4;
        Animatable animatable2;
        Boolean boolValueOf;
        boolean zChanged;
        final Timeline.StatusInfo statusInfo;
        Object bentoTimelineRowKt$BentoTimelineRow$2$2$1;
        final boolean z2;
        Animatable animatable3;
        Animatable animatable4;
        final SnapshotState snapshotState3;
        final SnapshotState snapshotState4;
        Boolean bool;
        Modifier modifier5;
        int i5;
        boolean z3;
        Modifier modifierM5125offsetVpY3zN4$default;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(692560240);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
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
                Modifier modifierM4893clickableXHw0xAI$default = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(692560240, i3, -1, "com.robinhood.compose.bento.component.rows.BentoTimelineRow (BentoTimelineRow.kt:162)");
                }
                statusInfoM21086createPIknLig = Timeline.StatusInfo.INSTANCE.m21086createPIknLig(state.getStatus(), state.getPosition(), state.getColorOverrides(), state.getPreviousStatus(), state.getIndex(), state.getIconOverride(), state.m21005getIconColorOverrideQN2ZGVo(), state.isLargeIconContainer(), state.getStatusIconPosition(), state.getIconStyleOverride());
                z = state.getStatus() == Timeline.Status.INCOMPLETE;
                float value = ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue();
                float fM21051getPaddingVerticalD9Ej5fM = BentoBaseRowLayout8.INSTANCE.m21051getPaddingVerticalD9Ej5fM();
                if (state.getInfoAction() == null) {
                    f = fM21051getPaddingVerticalD9Ej5fM;
                    modifier3 = modifierM4893clickableXHw0xAI$default;
                    modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierM4893clickableXHw0xAI$default, false, null, null, state.getInfoAction().getOnClick(), 7, null);
                } else {
                    modifier3 = modifierM4893clickableXHw0xAI$default;
                    f = fM21051getPaddingVerticalD9Ej5fM;
                }
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifierM4893clickableXHw0xAI$default, 0.0f, composerStartRestartGroup, 0, 1);
                composerStartRestartGroup.startReplaceGroup(-169516372);
                if (state.getSupportMultipleLines()) {
                    tuples2M3642to = Tuples4.m3642to(SizeKt.m5156height3ABfNKs(modifierM21623defaultHorizontalPaddingrAjV9yQ, Timeline.INSTANCE.m21059getHeightD9Ej5fM()), null);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChanged2 = composerStartRestartGroup.changed(value);
                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new BentoTimelineRowKt$BentoTimelineRow$2$1$1(value, f);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    tuples2M3642to = Tuples4.m3642to(modifierM21623defaultHorizontalPaddingrAjV9yQ, (MeasurePolicy) objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                modifier4 = (Modifier) tuples2M3642to.component1();
                MeasurePolicy measurePolicy = (MeasurePolicy) tuples2M3642to.component2();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 != companion.getEmpty()) {
                    i4 = 2;
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(0)), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    i4 = 2;
                }
                snapshotState2 = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = Animatable2.Animatable$default(0.0f, 0.0f, i4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                animatable = (Animatable) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = Animatable2.Animatable$default(0.0f, 0.0f, i4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                animatable2 = (Animatable) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                Float fValueOf = Float.valueOf(BentoTimelineRow$lambda$14$lambda$6(snapshotState2));
                boolValueOf = Boolean.valueOf(BentoTimelineRow$lambda$14$lambda$3(snapshotState));
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChanged = composerStartRestartGroup.changed(state) | composerStartRestartGroup.changedInstance(animatable) | composerStartRestartGroup.changedInstance(animatable2);
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue6 == companion.getEmpty()) {
                    statusInfo = statusInfoM21086createPIknLig;
                    z2 = z;
                    animatable3 = animatable;
                    animatable4 = animatable2;
                    snapshotState3 = snapshotState;
                    snapshotState4 = snapshotState2;
                    bool = boolValueOf;
                    modifier5 = modifier4;
                    i5 = 0;
                    bentoTimelineRowKt$BentoTimelineRow$2$2$1 = new BentoTimelineRowKt$BentoTimelineRow$2$2$1(state, animatable3, snapshotState3, snapshotState4, animatable4, null);
                    composerStartRestartGroup.updateRememberedValue(bentoTimelineRowKt$BentoTimelineRow$2$2$1);
                } else {
                    statusInfo = statusInfoM21086createPIknLig;
                    modifier5 = modifier4;
                    bentoTimelineRowKt$BentoTimelineRow$2$2$1 = objRememberedValue6;
                    i5 = 0;
                    z2 = z;
                    animatable3 = animatable;
                    animatable4 = animatable2;
                    snapshotState3 = snapshotState;
                    snapshotState4 = snapshotState2;
                    bool = boolValueOf;
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(fValueOf, bool, (Function2) bentoTimelineRowKt$BentoTimelineRow$2$2$1, composerStartRestartGroup, i5);
                final Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                composerStartRestartGroup.startReplaceGroup(-169415812);
                if (state.getAnimateEntry()) {
                    z3 = true;
                    modifierM5125offsetVpY3zN4$default = Modifier.INSTANCE;
                } else {
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    boolean zChanged3 = composerStartRestartGroup.changed(density);
                    Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3 || objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = new Function1() { // from class: com.robinhood.compose.bento.component.rows.BentoTimelineRowKt$$ExternalSyntheticLambda13
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return BentoTimelineRowKt.BentoTimelineRow$lambda$14$lambda$13$lambda$12(density, snapshotState4, snapshotState3, (LayoutCoordinates) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    z3 = true;
                    modifierM5125offsetVpY3zN4$default = OffsetKt.m5125offsetVpY3zN4$default(Alpha.alpha(Clip.clip(OnGloballyPositionedModifier3.onGloballyPositioned(companion2, (Function1) objRememberedValue7), RectangleShape2.getRectangleShape()), ((Number) animatable4.getValue()).floatValue()), 0.0f, C2002Dp.m7995constructorimpl(((Number) animatable3.getValue()).floatValue()), 1, null);
                }
                Modifier modifier6 = modifierM5125offsetVpY3zN4$default;
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                BentoBaseRowLayout.BentoBaseRowLayout(modifier5, modifier6, ComposableLambda3.rememberComposableLambda(-740076112, z3, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoTimelineRowKt$BentoTimelineRow$2$4
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
                            ComposerKt.traceEventStart(-740076112, i7, -1, "com.robinhood.compose.bento.component.rows.BentoTimelineRow.<anonymous>.<anonymous> (BentoTimelineRow.kt:273)");
                        }
                        boolean animateEntry = state.getAnimateEntry();
                        boolean zBentoTimelineRow$lambda$14$lambda$3 = BentoTimelineRowKt.BentoTimelineRow$lambda$14$lambda$3(snapshotState3);
                        BentoTimelineRowKt.TimelineStatus(statusInfo, ModifiersKt.bentoPlaceholder$default(Modifier.INSTANCE, state.getShowTimelinePlaceholder(), null, 2, null), animateEntry, zBentoTimelineRow$lambda$14$lambda$3, composer3, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1225021361, z3, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoTimelineRowKt$BentoTimelineRow$2$5
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
                            ComposerKt.traceEventStart(-1225021361, i7, -1, "com.robinhood.compose.bento.component.rows.BentoTimelineRow.<anonymous>.<anonymous> (BentoTimelineRow.kt:281)");
                        }
                        String titleText = state.getTitleText();
                        boolean zIsActiveEntry = state.isActiveEntry();
                        Timeline.InfoAction infoAction = state.getInfoAction();
                        Timeline.PrimaryTextStyleOverride primaryTextStyleOverride = state.getPrimaryTextStyleOverride();
                        BentoTimelineRowKt.TimelineTitle(titleText, zIsActiveEntry, infoAction, z2, ModifiersKt.bentoPlaceholder$default(Modifier.INSTANCE, state.getShowTitlePlaceholder(), null, 2, null), primaryTextStyleOverride, composer3, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1709966610, z3, new BentoTimelineRowKt$BentoTimelineRow$2$6(state, z2), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(2100055437, z3, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoTimelineRowKt$BentoTimelineRow$2$7
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
                            ComposerKt.traceEventStart(2100055437, i7, -1, "com.robinhood.compose.bento.component.rows.BentoTimelineRow.<anonymous>.<anonymous> (BentoTimelineRow.kt:309)");
                        }
                        BentoTimelineRowKt.TimelineCta(state.getCtaButton(), composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, false, true, true, measurePolicy, composer2, 918777216, 0, 64);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoTimelineRowKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BentoTimelineRowKt.BentoTimelineRow$lambda$15(state, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            statusInfoM21086createPIknLig = Timeline.StatusInfo.INSTANCE.m21086createPIknLig(state.getStatus(), state.getPosition(), state.getColorOverrides(), state.getPreviousStatus(), state.getIndex(), state.getIconOverride(), state.m21005getIconColorOverrideQN2ZGVo(), state.isLargeIconContainer(), state.getStatusIconPosition(), state.getIconStyleOverride());
            if (state.getStatus() == Timeline.Status.INCOMPLETE) {
            }
            float value2 = ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue();
            float fM21051getPaddingVerticalD9Ej5fM2 = BentoBaseRowLayout8.INSTANCE.m21051getPaddingVerticalD9Ej5fM();
            if (state.getInfoAction() == null) {
            }
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifierM4893clickableXHw0xAI$default, 0.0f, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.startReplaceGroup(-169516372);
            if (state.getSupportMultipleLines()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            modifier4 = (Modifier) tuples2M3642to.component1();
            MeasurePolicy measurePolicy2 = (MeasurePolicy) tuples2M3642to.component2();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 != companion.getEmpty()) {
            }
            snapshotState2 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
            }
            animatable = (Animatable) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
            }
            animatable2 = (Animatable) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            Float fValueOf2 = Float.valueOf(BentoTimelineRow$lambda$14$lambda$6(snapshotState2));
            boolValueOf = Boolean.valueOf(BentoTimelineRow$lambda$14$lambda$3(snapshotState));
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            zChanged = composerStartRestartGroup.changed(state) | composerStartRestartGroup.changedInstance(animatable) | composerStartRestartGroup.changedInstance(animatable2);
            Object objRememberedValue62 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                statusInfo = statusInfoM21086createPIknLig;
                z2 = z;
                animatable3 = animatable;
                animatable4 = animatable2;
                snapshotState3 = snapshotState;
                snapshotState4 = snapshotState2;
                bool = boolValueOf;
                modifier5 = modifier4;
                i5 = 0;
                bentoTimelineRowKt$BentoTimelineRow$2$2$1 = new BentoTimelineRowKt$BentoTimelineRow$2$2$1(state, animatable3, snapshotState3, snapshotState4, animatable4, null);
                composerStartRestartGroup.updateRememberedValue(bentoTimelineRowKt$BentoTimelineRow$2$2$1);
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(fValueOf2, bool, (Function2) bentoTimelineRowKt$BentoTimelineRow$2$2$1, composerStartRestartGroup, i5);
                final Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                composerStartRestartGroup.startReplaceGroup(-169415812);
                if (state.getAnimateEntry()) {
                }
                Modifier modifier62 = modifierM5125offsetVpY3zN4$default;
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                BentoBaseRowLayout.BentoBaseRowLayout(modifier5, modifier62, ComposableLambda3.rememberComposableLambda(-740076112, z3, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoTimelineRowKt$BentoTimelineRow$2$4
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
                            ComposerKt.traceEventStart(-740076112, i7, -1, "com.robinhood.compose.bento.component.rows.BentoTimelineRow.<anonymous>.<anonymous> (BentoTimelineRow.kt:273)");
                        }
                        boolean animateEntry = state.getAnimateEntry();
                        boolean zBentoTimelineRow$lambda$14$lambda$3 = BentoTimelineRowKt.BentoTimelineRow$lambda$14$lambda$3(snapshotState3);
                        BentoTimelineRowKt.TimelineStatus(statusInfo, ModifiersKt.bentoPlaceholder$default(Modifier.INSTANCE, state.getShowTimelinePlaceholder(), null, 2, null), animateEntry, zBentoTimelineRow$lambda$14$lambda$3, composer3, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1225021361, z3, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoTimelineRowKt$BentoTimelineRow$2$5
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
                            ComposerKt.traceEventStart(-1225021361, i7, -1, "com.robinhood.compose.bento.component.rows.BentoTimelineRow.<anonymous>.<anonymous> (BentoTimelineRow.kt:281)");
                        }
                        String titleText = state.getTitleText();
                        boolean zIsActiveEntry = state.isActiveEntry();
                        Timeline.InfoAction infoAction = state.getInfoAction();
                        Timeline.PrimaryTextStyleOverride primaryTextStyleOverride = state.getPrimaryTextStyleOverride();
                        BentoTimelineRowKt.TimelineTitle(titleText, zIsActiveEntry, infoAction, z2, ModifiersKt.bentoPlaceholder$default(Modifier.INSTANCE, state.getShowTitlePlaceholder(), null, 2, null), primaryTextStyleOverride, composer3, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1709966610, z3, new BentoTimelineRowKt$BentoTimelineRow$2$6(state, z2), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(2100055437, z3, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoTimelineRowKt$BentoTimelineRow$2$7
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
                            ComposerKt.traceEventStart(2100055437, i7, -1, "com.robinhood.compose.bento.component.rows.BentoTimelineRow.<anonymous>.<anonymous> (BentoTimelineRow.kt:309)");
                        }
                        BentoTimelineRowKt.TimelineCta(state.getCtaButton(), composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, false, true, true, measurePolicy2, composer2, 918777216, 0, 64);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void BentoTimelineRow$lambda$14$lambda$4(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final void BentoTimelineRow$lambda$14$lambda$7(SnapshotState<C2002Dp> snapshotState, float f) {
        snapshotState.setValue(C2002Dp.m7993boximpl(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoTimelineRow$lambda$14$lambda$13$lambda$12(Density density, SnapshotState snapshotState, SnapshotState snapshotState2, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        BentoTimelineRow$lambda$14$lambda$7(snapshotState, density.mo5013toDpu2uoSUM((int) (coordinates.mo7241getSizeYbymL2g() & 4294967295L)));
        BentoTimelineRow$lambda$14$lambda$4(snapshotState2, true);
        return Unit.INSTANCE;
    }

    /* renamed from: connectorBackground-9LQNqLg$default, reason: not valid java name */
    static /* synthetic */ Modifier m20999connectorBackground9LQNqLg$default(Modifier modifier, Timeline.ColorType colorType, long j, Shape shape, int i, Object obj) {
        if ((i & 4) != 0) {
            shape = RectangleShape2.getRectangleShape();
        }
        return m20998connectorBackground9LQNqLg(modifier, colorType, j, shape);
    }

    /* renamed from: connectorBackground-9LQNqLg, reason: not valid java name */
    private static final Modifier m20998connectorBackground9LQNqLg(Modifier modifier, Timeline.ColorType colorType, long j, Shape shape) {
        return ComposedModifier2.composed$default(modifier, null, new BentoTimelineRowKt$connectorBackground$1(colorType, j, shape), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TimelineStatus(Timeline.StatusInfo statusInfo, Modifier modifier, boolean z, boolean z2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        Object objRememberedValue;
        Composer.Companion companion;
        final Animatable animatable;
        boolean zChangedInstance;
        Object objRememberedValue2;
        int i6;
        boolean z5;
        Modifier modifierDrawWithContent;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z6;
        boolean z7;
        Shape rectangleShape;
        Shape rectangleShape2;
        long jM21000resolveColorbMFp3s;
        long jM21000resolveColorbMFp3s2;
        Timeline.StatusIconPosition statusIconPosition;
        Timeline.StatusIconPosition statusIconPosition2;
        long j;
        final boolean z8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final Timeline.StatusInfo statusInfo2 = statusInfo;
        Composer composerStartRestartGroup = composer.startRestartGroup(-621820824);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(statusInfo2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    z3 = z;
                    i3 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 == 0) {
                    if ((i & 3072) == 0) {
                        z4 = z2;
                        i3 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
                    }
                    if ((i3 & 1171) != 1170 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        z8 = z3;
                    } else {
                        if (i7 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if (i5 != 0) {
                            z4 = false;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-621820824, i3, -1, "com.robinhood.compose.bento.component.rows.TimelineStatus (BentoTimelineRow.kt:377)");
                        }
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = Animatable2.Animatable$default(0.0f, 0.0f, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        animatable = (Animatable) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        Boolean boolValueOf = Boolean.valueOf(z4);
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        int i8 = i3 & 14;
                        zChangedInstance = ((i3 & 896) != 256) | ((i3 & 7168) != 2048) | (i8 != 4) | composerStartRestartGroup.changedInstance(animatable);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                            boolean z9 = z3;
                            i6 = i3;
                            BentoTimelineRowKt$TimelineStatus$1$1 bentoTimelineRowKt$TimelineStatus$1$1 = new BentoTimelineRowKt$TimelineStatus$1$1(z9, z4, statusInfo2, animatable, null);
                            z5 = z9;
                            statusInfo2 = statusInfo2;
                            composerStartRestartGroup.updateRememberedValue(bentoTimelineRowKt$TimelineStatus$1$1);
                            objRememberedValue2 = bentoTimelineRowKt$TimelineStatus$1$1;
                        } else {
                            boolean z10 = z3;
                            i6 = i3;
                            z5 = z10;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, (i6 >> 9) & 14);
                        Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(modifier2, !statusInfo2.isLargeIconContainer() ? C2002Dp.m7995constructorimpl(32) : C2002Dp.m7995constructorimpl(24));
                        composerStartRestartGroup.startReplaceGroup(-569302312);
                        if (!z5) {
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(animatable);
                            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = new Function1() { // from class: com.robinhood.compose.bento.component.rows.BentoTimelineRowKt$$ExternalSyntheticLambda11
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return BentoTimelineRowKt.TimelineStatus$lambda$20$lambda$19(animatable, (ContentDrawScope) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            modifierDrawWithContent = DrawModifierKt.drawWithContent(companion2, (Function1) objRememberedValue3);
                        } else {
                            modifierDrawWithContent = Modifier.INSTANCE;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierThen = modifierM5174width3ABfNKs.then(modifierDrawWithContent);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierThen);
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        z6 = statusInfo2.getIconPaddingPosition() != Timeline.IconPaddingPosition.ABOVE;
                        z7 = statusInfo2.getIconPaddingPosition() == Timeline.IconPaddingPosition.BELOW;
                        if (!z6) {
                            rectangleShape = RoundedCornerShape2.RoundedCornerShape$default(0, 0, 50, 50, 3, null);
                        } else {
                            rectangleShape = RectangleShape2.getRectangleShape();
                        }
                        if (!z7) {
                            rectangleShape2 = RoundedCornerShape2.RoundedCornerShape$default(50, 50, 0, 0, 12, null);
                        } else {
                            rectangleShape2 = RectangleShape2.getRectangleShape();
                        }
                        jM21000resolveColorbMFp3s = m21000resolveColorbMFp3s(statusInfo2.getTopConnectorColor(), statusInfo2.m21084getColorOverrideQN2ZGVo(), composerStartRestartGroup, 0);
                        jM21000resolveColorbMFp3s2 = m21000resolveColorbMFp3s(statusInfo2.getBottomConnectorColor(), statusInfo2.m21084getColorOverrideQN2ZGVo(), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceGroup(-2085722672);
                        statusIconPosition = statusInfo2.getStatusIconPosition();
                        statusIconPosition2 = Timeline.StatusIconPosition.CENTER;
                        if (statusIconPosition == statusIconPosition2) {
                            BoxKt.Box(Column5.weight$default(column6, SizeKt.m5174width3ABfNKs(m20998connectorBackground9LQNqLg(Modifier.INSTANCE, statusInfo2.getTopConnectorColor(), jM21000resolveColorbMFp3s, rectangleShape), Timeline.INSTANCE.m21058getConnectorWidthD9Ej5fM()), 1.0f, false, 2, null), composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-2085704287);
                        if (z7 && statusInfo2.getStatusIconPosition() == statusIconPosition2) {
                            Modifier modifierM20999connectorBackground9LQNqLg$default = m20999connectorBackground9LQNqLg$default(Modifier.INSTANCE, statusInfo2.getTopConnectorColor(), jM21000resolveColorbMFp3s, null, 4, null);
                            Timeline timeline = Timeline.INSTANCE;
                            BoxKt.Box(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(modifierM20999connectorBackground9LQNqLg$default, timeline.m21058getConnectorWidthD9Ej5fM()), timeline.m21060getIconPaddingD9Ej5fM()), composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-2085689829);
                        if (z6 && statusInfo2.getStatusIconPosition() == statusIconPosition2) {
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, Timeline.INSTANCE.m21060getIconPaddingD9Ej5fM()), composerStartRestartGroup, 6);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-2085684065);
                        if (statusInfo2.getIconStyle() == Timeline.IconStyle.DOT && statusInfo2.getStatusIconPosition() == Timeline.StatusIconPosition.TOP) {
                            BoxKt.Box(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(m20998connectorBackground9LQNqLg(Modifier.INSTANCE, statusInfo2.getTopConnectorColor(), jM21000resolveColorbMFp3s, rectangleShape), Timeline.INSTANCE.m21058getConnectorWidthD9Ej5fM()), C2002Dp.m7995constructorimpl(6)), composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        TimelineStatusIcon(statusInfo2, composerStartRestartGroup, i8);
                        composerStartRestartGroup.startReplaceGroup(-2085664489);
                        if (z7) {
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, Timeline.INSTANCE.m21060getIconPaddingD9Ej5fM()), composerStartRestartGroup, 6);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-2085657692);
                        if (z6 || statusInfo2.getStatusIconPosition() != statusIconPosition2) {
                            j = jM21000resolveColorbMFp3s2;
                        } else {
                            Modifier modifierM20999connectorBackground9LQNqLg$default2 = m20999connectorBackground9LQNqLg$default(Modifier.INSTANCE, statusInfo2.getBottomConnectorColor(), jM21000resolveColorbMFp3s2, null, 4, null);
                            j = jM21000resolveColorbMFp3s2;
                            Timeline timeline2 = Timeline.INSTANCE;
                            BoxKt.Box(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(modifierM20999connectorBackground9LQNqLg$default2, timeline2.m21058getConnectorWidthD9Ej5fM()), timeline2.m21060getIconPaddingD9Ej5fM()), composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BoxKt.Box(Column5.weight$default(column6, SizeKt.m5174width3ABfNKs(m20998connectorBackground9LQNqLg(Modifier.INSTANCE, statusInfo2.getBottomConnectorColor(), j, rectangleShape2), Timeline.INSTANCE.m21058getConnectorWidthD9Ej5fM()), 1.0f, false, 2, null), composerStartRestartGroup, 0);
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z8 = z5;
                    }
                    final Modifier modifier3 = modifier2;
                    final boolean z11 = z4;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoTimelineRowKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return BentoTimelineRowKt.TimelineStatus$lambda$22(statusInfo2, modifier3, z8, z11, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                z4 = z2;
                if ((i3 & 1171) != 1170) {
                    if (i7 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    animatable = (Animatable) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    Boolean boolValueOf2 = Boolean.valueOf(z4);
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    int i82 = i3 & 14;
                    zChangedInstance = ((i3 & 896) != 256) | ((i3 & 7168) != 2048) | (i82 != 4) | composerStartRestartGroup.changedInstance(animatable);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance) {
                        boolean z92 = z3;
                        i6 = i3;
                        BentoTimelineRowKt$TimelineStatus$1$1 bentoTimelineRowKt$TimelineStatus$1$12 = new BentoTimelineRowKt$TimelineStatus$1$1(z92, z4, statusInfo2, animatable, null);
                        z5 = z92;
                        statusInfo2 = statusInfo2;
                        composerStartRestartGroup.updateRememberedValue(bentoTimelineRowKt$TimelineStatus$1$12);
                        objRememberedValue2 = bentoTimelineRowKt$TimelineStatus$1$12;
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, (i6 >> 9) & 14);
                        Modifier modifierM5174width3ABfNKs2 = SizeKt.m5174width3ABfNKs(modifier2, !statusInfo2.isLargeIconContainer() ? C2002Dp.m7995constructorimpl(32) : C2002Dp.m7995constructorimpl(24));
                        composerStartRestartGroup.startReplaceGroup(-569302312);
                        if (!z5) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierThen2 = modifierM5174width3ABfNKs2.then(modifierDrawWithContent);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierThen2);
                        ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion32.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion32.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion32.getSetModifier());
                            Column6 column62 = Column6.INSTANCE;
                            if (statusInfo2.getIconPaddingPosition() != Timeline.IconPaddingPosition.ABOVE) {
                            }
                            if (statusInfo2.getIconPaddingPosition() == Timeline.IconPaddingPosition.BELOW) {
                            }
                            if (!z6) {
                            }
                            if (!z7) {
                            }
                            jM21000resolveColorbMFp3s = m21000resolveColorbMFp3s(statusInfo2.getTopConnectorColor(), statusInfo2.m21084getColorOverrideQN2ZGVo(), composerStartRestartGroup, 0);
                            jM21000resolveColorbMFp3s2 = m21000resolveColorbMFp3s(statusInfo2.getBottomConnectorColor(), statusInfo2.m21084getColorOverrideQN2ZGVo(), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceGroup(-2085722672);
                            statusIconPosition = statusInfo2.getStatusIconPosition();
                            statusIconPosition2 = Timeline.StatusIconPosition.CENTER;
                            if (statusIconPosition == statusIconPosition2) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(-2085704287);
                            if (z7) {
                                Modifier modifierM20999connectorBackground9LQNqLg$default3 = m20999connectorBackground9LQNqLg$default(Modifier.INSTANCE, statusInfo2.getTopConnectorColor(), jM21000resolveColorbMFp3s, null, 4, null);
                                Timeline timeline3 = Timeline.INSTANCE;
                                BoxKt.Box(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(modifierM20999connectorBackground9LQNqLg$default3, timeline3.m21058getConnectorWidthD9Ej5fM()), timeline3.m21060getIconPaddingD9Ej5fM()), composerStartRestartGroup, 0);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(-2085689829);
                            if (z6) {
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, Timeline.INSTANCE.m21060getIconPaddingD9Ej5fM()), composerStartRestartGroup, 6);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(-2085684065);
                            if (statusInfo2.getIconStyle() == Timeline.IconStyle.DOT) {
                                BoxKt.Box(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(m20998connectorBackground9LQNqLg(Modifier.INSTANCE, statusInfo2.getTopConnectorColor(), jM21000resolveColorbMFp3s, rectangleShape), Timeline.INSTANCE.m21058getConnectorWidthD9Ej5fM()), C2002Dp.m7995constructorimpl(6)), composerStartRestartGroup, 0);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            TimelineStatusIcon(statusInfo2, composerStartRestartGroup, i82);
                            composerStartRestartGroup.startReplaceGroup(-2085664489);
                            if (z7) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(-2085657692);
                            if (z6) {
                                j = jM21000resolveColorbMFp3s2;
                                composerStartRestartGroup.endReplaceGroup();
                                BoxKt.Box(Column5.weight$default(column62, SizeKt.m5174width3ABfNKs(m20998connectorBackground9LQNqLg(Modifier.INSTANCE, statusInfo2.getBottomConnectorColor(), j, rectangleShape2), Timeline.INSTANCE.m21058getConnectorWidthD9Ej5fM()), 1.0f, false, 2, null), composerStartRestartGroup, 0);
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                z8 = z5;
                            }
                        }
                    }
                }
                final Modifier modifier32 = modifier2;
                final boolean z112 = z4;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z3 = z;
            i5 = i2 & 8;
            if (i5 == 0) {
            }
            z4 = z2;
            if ((i3 & 1171) != 1170) {
            }
            final Modifier modifier322 = modifier2;
            final boolean z1122 = z4;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z3 = z;
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        z4 = z2;
        if ((i3 & 1171) != 1170) {
        }
        final Modifier modifier3222 = modifier2;
        final boolean z11222 = z4;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimelineStatus$lambda$20$lambda$19(Animatable animatable, ContentDrawScope drawWithContent) {
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawWithContent.mo6963getSizeNHjbRc() & 4294967295L)) * ((Number) animatable.getValue()).floatValue();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawWithContent.mo6963getSizeNHjbRc() >> 32));
        int iM6700getIntersectrtfAjoo = ClipOp.INSTANCE.m6700getIntersectrtfAjoo();
        DrawContext drawContext = drawWithContent.getDrawContext();
        long jMo6936getSizeNHjbRc = drawContext.mo6936getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo6939clipRectN_I0leg(0.0f, 0.0f, fIntBitsToFloat2, fIntBitsToFloat, iM6700getIntersectrtfAjoo);
            drawWithContent.drawContent();
            drawContext.getCanvas().restore();
            drawContext.mo6937setSizeuvyYCjk(jMo6936getSizeNHjbRc);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            drawContext.getCanvas().restore();
            drawContext.mo6937setSizeuvyYCjk(jMo6936getSizeNHjbRc);
            throw th;
        }
    }

    private static final void TimelineStatusIcon(final Timeline.StatusInfo statusInfo, Composer composer, final int i) {
        int i2;
        int i3;
        Composer composer2;
        Modifier modifierM4871backgroundbw27NRU;
        Composer composerStartRestartGroup = composer.startRestartGroup(467154126);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(statusInfo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(467154126, i2, -1, "com.robinhood.compose.bento.component.rows.TimelineStatusIcon (BentoTimelineRow.kt:526)");
            }
            Color colorM21085getIconColorOverrideQN2ZGVo = statusInfo.m21085getIconColorOverrideQN2ZGVo();
            composerStartRestartGroup.startReplaceGroup(-2036447767);
            long jM21000resolveColorbMFp3s = colorM21085getIconColorOverrideQN2ZGVo == null ? m21000resolveColorbMFp3s(statusInfo.getIconColor(), statusInfo.m21084getColorOverrideQN2ZGVo(), composerStartRestartGroup, 0) : colorM21085getIconColorOverrideQN2ZGVo.getValue();
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L))), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-2036440989);
            if (((Boolean) composerStartRestartGroup.consume(LocalShowPlaceholder.getLocalShowPlaceholder())).booleanValue()) {
                modifierM4871backgroundbw27NRU = Modifier.INSTANCE;
                i3 = 1;
                composer2 = composerStartRestartGroup;
            } else {
                if (WhenMappings.$EnumSwitchMapping$0[statusInfo.getIconColor().ordinal()] == 1) {
                    composerStartRestartGroup.startReplaceGroup(-2036432403);
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.compose.bento.component.rows.BentoTimelineRowKt$$ExternalSyntheticLambda16
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return BentoTimelineRowKt.TimelineStatusIcon$lambda$27$lambda$26(snapshotState, (LayoutCoordinates) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(companion2, (Function1) objRememberedValue2);
                    Brush.Companion companion3 = Brush.INSTANCE;
                    long jTimelineStatusIcon$lambda$24 = TimelineStatusIcon$lambda$24(snapshotState);
                    i3 = 1;
                    composer2 = composerStartRestartGroup;
                    modifierM4871backgroundbw27NRU = Background3.background$default(modifierOnGloballyPositioned, GoldSparkleBrush.m15094sparkleEPk0efs(companion3, jTimelineStatusIcon$lambda$24, null, composer2, 6, 2), RoundedCornerShape2.getCircleShape(), 0.0f, 4, null);
                    composer2.endReplaceGroup();
                } else {
                    i3 = 1;
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceGroup(-2036428326);
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Color colorM21084getColorOverrideQN2ZGVo = statusInfo.m21084getColorOverrideQN2ZGVo();
                    modifierM4871backgroundbw27NRU = Background3.m4871backgroundbw27NRU(companion4, colorM21084getColorOverrideQN2ZGVo == null ? BentoTheme.INSTANCE.getColors(composer2, 6).m21368getAccent0d7_KjU() : colorM21084getColorOverrideQN2ZGVo.getValue(), RoundedCornerShape2.getCircleShape());
                    composer2.endReplaceGroup();
                }
            }
            composer2.endReplaceGroup();
            float fM7995constructorimpl = statusInfo.isLargeIconContainer() ? C2002Dp.m7995constructorimpl(32) : C2002Dp.m7995constructorimpl(20);
            int i4 = WhenMappings.$EnumSwitchMapping$1[statusInfo.getIconStyle().ordinal()];
            if (i4 == i3) {
                composer2.startReplaceGroup(1295574940);
                BoxKt.Box(Background3.m4871backgroundbw27NRU(SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(12)), jM21000resolveColorbMFp3s, RoundedCornerShape2.getCircleShape()), composer2, 0);
                composer2.endReplaceGroup();
            } else if (i4 == 2) {
                composer2.startReplaceGroup(1295808990);
                Modifier.Companion companion5 = Modifier.INSTANCE;
                Modifier modifierThen = SizeKt.m5169size3ABfNKs(companion5, fM7995constructorimpl).then(modifierM4871backgroundbw27NRU);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierThen);
                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion6.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion6.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion6.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion6.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion6.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composer2.startReplaceGroup(1815994519);
                if (statusInfo.getIcon() != null) {
                    Modifier modifierWithBentoCirclePlaceholder$default = LocalShowPlaceholder.withBentoCirclePlaceholder$default(companion5, false, i3, null);
                    Composer composer3 = composer2;
                    IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(statusInfo.getIcon().intValue(), composer2, 0), (String) null, modifierWithBentoCirclePlaceholder$default, jM21000resolveColorbMFp3s, composer3, 48, 0);
                    composer2 = composer3;
                }
                composer2.endReplaceGroup();
                composer2.endNode();
                composer2.endReplaceGroup();
            } else {
                if (i4 != 3) {
                    composer2.startReplaceGroup(-2036418174);
                    composer2.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer2.startReplaceGroup(1296434787);
                if (statusInfo.getIcon() != null) {
                    Composer composer4 = composer2;
                    IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(statusInfo.getIcon().intValue(), composer2, 0), (String) null, LocalShowPlaceholder.withBentoCirclePlaceholder$default(Modifier.INSTANCE, false, i3, null), jM21000resolveColorbMFp3s, composer4, 48, 0);
                    composer2 = composer4;
                }
                composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoTimelineRowKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoTimelineRowKt.TimelineStatusIcon$lambda$29(statusInfo, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void TimelineStatusIcon$lambda$25(SnapshotState<Offset> snapshotState, long j) {
        snapshotState.setValue(Offset.m6534boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimelineStatusIcon$lambda$27$lambda$26(SnapshotState snapshotState, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        TimelineStatusIcon$lambda$25(snapshotState, LayoutCoordinates2.positionInWindow(coordinates));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: resolveColor-bMF-p3s, reason: not valid java name */
    public static final long m21000resolveColorbMFp3s(Timeline.ColorType colorType, Color color, Composer composer, int i) {
        long jet;
        composer.startReplaceGroup(936899674);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(936899674, i, -1, "com.robinhood.compose.bento.component.rows.resolveColor (BentoTimelineRow.kt:590)");
        }
        switch (WhenMappings.$EnumSwitchMapping$0[colorType.ordinal()]) {
            case 1:
                composer.startReplaceGroup(-1582527843);
                jet = BentoTheme.INSTANCE.getColors(composer, 6).getJet();
                composer.endReplaceGroup();
                break;
            case 2:
                composer.startReplaceGroup(-1814132385);
                jet = color == null ? BentoTheme.INSTANCE.getColors(composer, 6).m21368getAccent0d7_KjU() : color.getValue();
                composer.endReplaceGroup();
                break;
            case 3:
                composer.startReplaceGroup(-1582538051);
                jet = BentoTheme.INSTANCE.getColors(composer, 6).m21373getBg30d7_KjU();
                composer.endReplaceGroup();
                break;
            case 4:
                composer.startReplaceGroup(-1582536164);
                jet = BentoTheme.INSTANCE.getColors(composer, 6).m21371getBg0d7_KjU();
                composer.endReplaceGroup();
                break;
            case 5:
                composer.startReplaceGroup(-1813944835);
                jet = color == null ? BentoTheme.INSTANCE.getColors(composer, 6).m21452getNegative0d7_KjU() : color.getValue();
                composer.endReplaceGroup();
                break;
            case 6:
                composer.startReplaceGroup(-1813867614);
                jet = color == null ? BentoTheme.INSTANCE.getColors(composer, 6).getSol() : color.getValue();
                composer.endReplaceGroup();
                break;
            case 7:
                composer.startReplaceGroup(-1582529883);
                composer.endReplaceGroup();
                jet = Color.INSTANCE.m6725getTransparent0d7_KjU();
                break;
            default:
                composer.startReplaceGroup(-1582542116);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TimelineTitle(final String str, final boolean z, final Timeline.InfoAction infoAction, final boolean z2, Modifier modifier, Timeline.PrimaryTextStyleOverride primaryTextStyleOverride, Composer composer, final int i, final int i2) {
        String str2;
        int i3;
        Modifier modifier2;
        int i4;
        Timeline.PrimaryTextStyleOverride primaryTextStyleOverride2;
        final Modifier modifier3;
        long jM21426getFg20d7_KjU;
        boolean z3;
        FontWeight bold;
        FontWeight fontWeight;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Timeline.PrimaryTextStyleOverride primaryTextStyleOverride3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1330553979);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str2 = str;
        } else {
            str2 = str;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(infoAction) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    primaryTextStyleOverride2 = primaryTextStyleOverride;
                    i3 |= composerStartRestartGroup.changed(primaryTextStyleOverride2) ? 131072 : 65536;
                }
                if ((74899 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    primaryTextStyleOverride3 = primaryTextStyleOverride2;
                } else {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    Timeline.PrimaryTextStyleOverride primaryTextStyleOverride4 = i4 == 0 ? null : primaryTextStyleOverride2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1330553979, i3, -1, "com.robinhood.compose.bento.component.rows.TimelineTitle (BentoTimelineRow.kt:615)");
                    }
                    if (z2) {
                        composerStartRestartGroup.startReplaceGroup(1237891208);
                        jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m21426getFg20d7_KjU();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1237890375);
                        jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m21425getFg0d7_KjU();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    if (z2) {
                        if ((primaryTextStyleOverride4 != null ? primaryTextStyleOverride4.m21079getEnabledColorQN2ZGVo() : null) != null) {
                            jM21426getFg20d7_KjU = primaryTextStyleOverride4.m21079getEnabledColorQN2ZGVo().getValue();
                        }
                        long j = jM21426getFg20d7_KjU;
                        if (infoAction == null) {
                            if (primaryTextStyleOverride4 == null) {
                            }
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (!composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting()) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                Row6 row6 = Row6.INSTANCE;
                                BentoText2.m20747BentoText38GnDrw(str2, null, Color.m6701boximpl(j), null, fontWeight, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 2, 0, null, 0, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getTextM(), composerStartRestartGroup, (i3 & 14) | 817889280, 0, 7530);
                                composerStartRestartGroup = composerStartRestartGroup;
                                composerStartRestartGroup.startReplaceGroup(-391683955);
                                if (z3) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                primaryTextStyleOverride3 = primaryTextStyleOverride4;
                            }
                        }
                    } else {
                        if (!z2) {
                            if ((primaryTextStyleOverride4 != null ? primaryTextStyleOverride4.m21078getDisabledColorQN2ZGVo() : null) != null) {
                                jM21426getFg20d7_KjU = primaryTextStyleOverride4.m21078getDisabledColorQN2ZGVo().getValue();
                            }
                        }
                        long j2 = jM21426getFg20d7_KjU;
                        z3 = infoAction == null && infoAction.getInfoIconPosition() == Timeline.InfoIconPosition.TITLE;
                        if (primaryTextStyleOverride4 == null) {
                            if (primaryTextStyleOverride4.isBold()) {
                                bold = FontWeight.INSTANCE.getBold();
                                fontWeight = bold;
                            }
                            fontWeight = null;
                        } else {
                            if (z) {
                                bold = FontWeight.INSTANCE.getBold();
                                fontWeight = bold;
                            }
                            fontWeight = null;
                        }
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
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
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                        Row6 row62 = Row6.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(str2, null, Color.m6701boximpl(j2), null, fontWeight, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 2, 0, null, 0, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getTextM(), composerStartRestartGroup, (i3 & 14) | 817889280, 0, 7530);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.startReplaceGroup(-391683955);
                        if (z3) {
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion3, Timeline.INSTANCE.m21061getTextSpaceWidthD9Ej5fM()), composerStartRestartGroup, 6);
                            ImageKt.Image(PainterResources_androidKt.painterResource(C20690R.drawable.ic_rds_info_16dp, composerStartRestartGroup, 0), "Info", LocalShowPlaceholder.withBentoPlaceholder$default(companion3, false, null, 3, null), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m6729tintxETnrds$default(ColorFilter.INSTANCE, j2, 0, 2, null), composerStartRestartGroup, 48, 56);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        primaryTextStyleOverride3 = primaryTextStyleOverride4;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoTimelineRowKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return BentoTimelineRowKt.TimelineTitle$lambda$31(str, z, infoAction, z2, modifier3, primaryTextStyleOverride3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            primaryTextStyleOverride2 = primaryTextStyleOverride;
            if ((74899 & i3) == 74898) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (z2) {
                }
                composerStartRestartGroup.endReplaceGroup();
                if (z2) {
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        primaryTextStyleOverride2 = primaryTextStyleOverride;
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TimelineMetadata(final String str, final String str2, final Timeline.InfoAction infoAction, Modifier modifier, int i, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        int i6;
        boolean zIsBlank;
        boolean zIsBlank2;
        boolean z;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int i7;
        final int i8;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1909767836);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(infoAction) ? 256 : 128;
        }
        int i9 = i3 & 8;
        if (i9 != 0) {
            i4 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i2 & 24576) == 0) {
                    i6 = i;
                    i4 |= composerStartRestartGroup.changed(i6) ? 16384 : 8192;
                }
                if ((i4 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    i8 = i6;
                } else {
                    Modifier modifier4 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                    int i10 = i5 == 0 ? 1 : i6;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1909767836, i4, -1, "com.robinhood.compose.bento.component.rows.TimelineMetadata (BentoTimelineRow.kt:673)");
                    }
                    zIsBlank = StringsKt.isBlank(str);
                    zIsBlank2 = StringsKt.isBlank(str2);
                    z = infoAction == null && infoAction.getInfoIconPosition() == Timeline.InfoIconPosition.METADATA;
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(1917496443);
                    if (!zIsBlank) {
                        TimelineMetadata$TimelineMetaText(i10, str, composerStartRestartGroup, i4 & 14);
                        if (!zIsBlank2) {
                            composerStartRestartGroup.startReplaceGroup(-687060556);
                            if (((Boolean) composerStartRestartGroup.consume(LocalShowPlaceholder.getLocalShowPlaceholder())).booleanValue()) {
                                composerStartRestartGroup.startReplaceGroup(-686986900);
                                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, Timeline.INSTANCE.m21061getTextSpaceWidthD9Ej5fM()), composerStartRestartGroup, 6);
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                composerStartRestartGroup.startReplaceGroup(-686898581);
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                Timeline timeline = Timeline.INSTANCE;
                                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion2, timeline.m21061getTextSpaceWidthD9Ej5fM()), composerStartRestartGroup, 6);
                                TimelineMetadata$TimelineMetaText(i10, StringResources_androidKt.stringResource(C11917R.string.timeline_secondary_text_separator, composerStartRestartGroup, 0), composerStartRestartGroup, 0);
                                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion2, timeline.m21061getTextSpaceWidthD9Ej5fM()), composerStartRestartGroup, 6);
                                composerStartRestartGroup.endReplaceGroup();
                            }
                            composerStartRestartGroup.endReplaceGroup();
                        } else if (z) {
                            composerStartRestartGroup.startReplaceGroup(-686627052);
                            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, Timeline.INSTANCE.m21061getTextSpaceWidthD9Ej5fM()), composerStartRestartGroup, 6);
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-686559782);
                            composerStartRestartGroup.endReplaceGroup();
                        }
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1917516377);
                    if (!zIsBlank2) {
                        TimelineMetadata$TimelineMetaText(i10, str2, composerStartRestartGroup, (i4 >> 3) & 14);
                        if (z) {
                            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, Timeline.INSTANCE.m21061getTextSpaceWidthD9Ej5fM()), composerStartRestartGroup, 6);
                        }
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1917522509);
                    if (z) {
                        i7 = i10;
                    } else {
                        i7 = i10;
                        ImageKt.Image(PainterResources_androidKt.painterResource(C20690R.drawable.ic_rds_info_12dp, composerStartRestartGroup, 0), "Info", LocalShowPlaceholder.withBentoPlaceholder$default(Modifier.INSTANCE, false, null, 3, null), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m6729tintxETnrds$default(ColorFilter.INSTANCE, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m21426getFg20d7_KjU(), 0, 2, null), composerStartRestartGroup, 48, 56);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    Modifier modifier5 = modifier4;
                    i8 = i7;
                    modifier3 = modifier5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoTimelineRowKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return BentoTimelineRowKt.TimelineMetadata$lambda$33(str, str2, infoAction, modifier3, i8, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 24576;
            i6 = i;
            if ((i4 & 9363) == 9362) {
                if (i9 == 0) {
                }
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                zIsBlank = StringsKt.isBlank(str);
                zIsBlank2 = StringsKt.isBlank(str2);
                if (infoAction == null) {
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                        Row6 row62 = Row6.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(1917496443);
                        if (!zIsBlank) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1917516377);
                        if (!zIsBlank2) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1917522509);
                        if (z) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Modifier modifier52 = modifier4;
                        i8 = i7;
                        modifier3 = modifier52;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 16;
        if (i5 != 0) {
        }
        i6 = i;
        if ((i4 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final void TimelineMetadata$TimelineMetaText(int i, String str, Composer composer, int i2) {
        composer.startReplaceGroup(-310191798);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-310191798, i2, -1, "com.robinhood.compose.bento.component.rows.TimelineMetadata.TimelineMetaText (BentoTimelineRow.kt:675)");
        }
        Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(Modifier.INSTANCE, null, false, 3, null);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        TextStyle textS = bentoTheme.getTypography(composer, 6).getTextS();
        long jM21426getFg20d7_KjU = bentoTheme.getColors(composer, 6).m21426getFg20d7_KjU();
        BentoText2.m20747BentoText38GnDrw(str, modifierWrapContentHeight$default, Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, i, 0, null, 0, textS, composer, (i2 & 14) | 12582960, 0, 7544);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TimelineDetailContent(final String str, final String str2, Modifier modifier, boolean z, boolean z2, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        String str3;
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        Function0<Unit> function02;
        boolean z5;
        final Function0<Unit> function03;
        long jM21426getFg20d7_KjU;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Modifier modifier3;
        Function0<Unit> function04;
        final Modifier modifier4;
        final Function0<Unit> function05;
        final boolean z6;
        final boolean z7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1104092178);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str3 = str;
        } else {
            str3 = str;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(str3) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z3 = z;
                    i3 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        z4 = z2;
                        i3 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 != 0) {
                        if ((196608 & i) == 0) {
                            function02 = function0;
                            i3 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
                        }
                        if ((i3 & 74899) == 74898 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier4 = modifier2;
                            z6 = z3;
                            z7 = z4;
                            function05 = function02;
                        } else {
                            Modifier modifier5 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                            z5 = i4 == 0 ? true : z3;
                            boolean z8 = i5 == 0 ? true : z4;
                            if (i6 == 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.compose.bento.component.rows.BentoTimelineRowKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                function03 = (Function0) objRememberedValue;
                            } else {
                                function03 = function02;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1104092178, i3, -1, "com.robinhood.compose.bento.component.rows.TimelineDetailContent (BentoTimelineRow.kt:731)");
                            }
                            if (z5) {
                                composerStartRestartGroup.startReplaceGroup(175671189);
                                jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m21426getFg20d7_KjU();
                            } else {
                                composerStartRestartGroup.startReplaceGroup(175670356);
                                jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m21425getFg0d7_KjU();
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            long j = jM21426getFg20d7_KjU;
                            int i8 = i3;
                            ImageLoader imageLoaderRememberImageLoader = CoilUtils2.rememberImageLoader(0.0d, null, composerStartRestartGroup, 0, 3);
                            composerStartRestartGroup = composerStartRestartGroup;
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, 6).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                            Alignment.Companion companion = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Row6 row6 = Row6.INSTANCE;
                            TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, 6).getTextM();
                            int iM7959getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8();
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            BentoText2.m20747BentoText38GnDrw(str3, Row5.weight$default(row6, companion3, 1.0f, false, 2, null), Color.m6701boximpl(j), null, null, null, null, iM7959getEllipsisgIe3tQ8, false, 4, 0, null, 0, textM, composerStartRestartGroup, (i8 & 14) | 817889280, 0, 7544);
                            composerStartRestartGroup.startReplaceGroup(341667631);
                            if (str2 == null) {
                                RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8));
                                Modifier modifierWithBentoPlaceholder$default = LocalShowPlaceholder.withBentoPlaceholder$default(BorderKt.m4876borderxT4_qwU(Clip.clip(AspectRatio3.aspectRatio$default(SizeKt.m5158heightInVpY3zN4$default(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme.getSpacing(composerStartRestartGroup, 6).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, C2002Dp.m7995constructorimpl(96), 1, null), 0.6666667f, false, 2, null), roundedCornerShapeM5327RoundedCornerShape0680j_4), C2002Dp.m7995constructorimpl(1), bentoTheme.getColors(composerStartRestartGroup, 6).m21426getFg20d7_KjU(), roundedCornerShapeM5327RoundedCornerShape0680j_4), false, null, 3, null);
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                boolean z9 = (i8 & 458752) == 131072;
                                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (z9 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.compose.bento.component.rows.BentoTimelineRowKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return BentoTimelineRowKt.TimelineDetailContent$lambda$40$lambda$37$lambda$36(function03);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierWithBentoPlaceholder$default, false, null, null, (Function0) objRememberedValue2, 7, null);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default);
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
                                modifier3 = modifier5;
                                function04 = function03;
                                ImageKt.Image(AsyncImagePainter4.m9105rememberAsyncImagePainter0YpotYA(str2, imageLoaderRememberImageLoader, null, null, ContentScale.INSTANCE.getCrop(), 0, null, composerStartRestartGroup, ((i8 >> 3) & 14) | 24576, 108), (String) null, boxScopeInstance.matchParentSize(companion3), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 48, 120);
                                composerStartRestartGroup.startReplaceGroup(521734105);
                                if (z8) {
                                    Modifier modifierMatchParentSize = boxScopeInstance.matchParentSize(companion3);
                                    Color.Companion companion4 = Color.INSTANCE;
                                    Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierMatchParentSize, Color.m6705copywmQWz5c$default(companion4.m6716getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
                                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
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
                                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.PLAY_INLINE_16), null, companion4.m6727getWhite0d7_KjU(), null, null, false, composerStartRestartGroup, 432, 56);
                                    composerStartRestartGroup.endNode();
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.endNode();
                            } else {
                                modifier3 = modifier5;
                                function04 = function03;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            function05 = function04;
                            z6 = z5;
                            z7 = z8;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoTimelineRowKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return BentoTimelineRowKt.TimelineDetailContent$lambda$41(str, str2, modifier4, z6, z7, function05, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 196608;
                    function02 = function0;
                    if ((i3 & 74899) == 74898) {
                        if (i7 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (z5) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        long j2 = jM21426getFg20d7_KjU;
                        int i82 = i3;
                        ImageLoader imageLoaderRememberImageLoader2 = CoilUtils2.rememberImageLoader(0.0d, null, composerStartRestartGroup, 0, 3);
                        composerStartRestartGroup = composerStartRestartGroup;
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        Modifier modifierM5146paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default2, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, 6).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                        Alignment.Companion companion5 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion5.getCenterVertically(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default2);
                        ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor4 = companion22.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion22.getSetModifier());
                            Row6 row62 = Row6.INSTANCE;
                            TextStyle textM2 = bentoTheme2.getTypography(composerStartRestartGroup, 6).getTextM();
                            int iM7959getEllipsisgIe3tQ82 = TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8();
                            Modifier.Companion companion32 = Modifier.INSTANCE;
                            BentoText2.m20747BentoText38GnDrw(str3, Row5.weight$default(row62, companion32, 1.0f, false, 2, null), Color.m6701boximpl(j2), null, null, null, null, iM7959getEllipsisgIe3tQ82, false, 4, 0, null, 0, textM2, composerStartRestartGroup, (i82 & 14) | 817889280, 0, 7544);
                            composerStartRestartGroup.startReplaceGroup(341667631);
                            if (str2 == null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier3;
                            function05 = function04;
                            z6 = z5;
                            z7 = z8;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                z4 = z2;
                i6 = i2 & 32;
                if (i6 != 0) {
                }
                function02 = function0;
                if ((i3 & 74899) == 74898) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z3 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            z4 = z2;
            i6 = i2 & 32;
            if (i6 != 0) {
            }
            function02 = function0;
            if ((i3 & 74899) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        z4 = z2;
        i6 = i2 & 32;
        if (i6 != 0) {
        }
        function02 = function0;
        if ((i3 & 74899) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimelineDetailContent$lambda$40$lambda$37$lambda$36(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TimelineCta(final Timeline.CtaButton ctaButton, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-15252895);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(ctaButton) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-15252895, i2, -1, "com.robinhood.compose.bento.component.rows.TimelineCta (BentoTimelineRow.kt:791)");
            }
            if (ctaButton != null) {
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1158049083, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoTimelineRowKt.TimelineCta.1
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
                            ComposerKt.traceEventStart(1158049083, i3, -1, "com.robinhood.compose.bento.component.rows.TimelineCta.<anonymous> (BentoTimelineRow.kt:794)");
                        }
                        BentoTextButton2.m20715BentoTextButtonPIknLig(ctaButton.getOnClick(), ctaButton.getText(), SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, false, null, composer2, 384, 120);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoTimelineRowKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoTimelineRowKt.TimelineCta$lambda$42(ctaButton, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void BentoTimelineRowPreview(final boolean z, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1100214955);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1100214955, i2, -1, "com.robinhood.compose.bento.component.rows.BentoTimelineRowPreview (BentoTimelineRow.kt:1010)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(33796765, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoTimelineRowKt.BentoTimelineRowPreview.1
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
                        ComposerKt.traceEventStart(33796765, i3, -1, "com.robinhood.compose.bento.component.rows.BentoTimelineRowPreview.<anonymous> (BentoTimelineRow.kt:1012)");
                    }
                    LocalShowPlaceholder.Loadable(z, null, null, ComposableSingletons$BentoTimelineRowKt.INSTANCE.getLambda$568011533$lib_compose_bento_externalRelease(), composer2, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoTimelineRowKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoTimelineRowKt.BentoTimelineRowPreview$lambda$43(z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Section(final Tuples2<String, ? extends Timeline.Status> tuples2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1785262801);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(tuples2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1785262801, i2, -1, "com.robinhood.compose.bento.component.rows.Section (BentoTimelineRow.kt:1030)");
            }
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
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
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, 6).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
            BentoText2.m20747BentoText38GnDrw(tuples2.getFirst(), androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, 6).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, 6).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, 6).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
            Timeline.Status second = tuples2.getSecond();
            Timeline.Position position = Timeline.Position.TOP;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.compose.bento.component.rows.BentoTimelineRowKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BentoTimelineRowKt.Section$lambda$52$lambda$45$lambda$44(context);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Timeline.CtaButton ctaButton = new Timeline.CtaButton("CTA Text", (Function0) objRememberedValue);
            Timeline.InfoIconPosition infoIconPosition = Timeline.InfoIconPosition.TITLE;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.compose.bento.component.rows.BentoTimelineRowKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BentoTimelineRowKt.Section$lambda$52$lambda$47$lambda$46(context);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            m20996BentoTimelineRowcZKY2IM(second, position, "Primary information", null, "Feb 15", "Metadata", ctaButton, new Timeline.InfoAction(infoIconPosition, (Function0) objRememberedValue2), null, null, false, null, null, false, false, 0, false, 0, false, false, false, composerStartRestartGroup, 221616, 0, 0, 2096904);
            Timeline.Status second2 = tuples2.getSecond();
            Timeline.Position position2 = Timeline.Position.BETWEEN;
            Timeline.InfoIconPosition infoIconPosition2 = Timeline.InfoIconPosition.METADATA;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.compose.bento.component.rows.BentoTimelineRowKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BentoTimelineRowKt.Section$lambda$52$lambda$49$lambda$48(context);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            Timeline.InfoAction infoAction = new Timeline.InfoAction(infoIconPosition2, (Function0) objRememberedValue3);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.compose.bento.component.rows.BentoTimelineRowKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BentoTimelineRowKt.Section$lambda$52$lambda$51$lambda$50(context);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoTimelineRow(new BentoTimelineRowState(second2, position2, "Primary information", infoAction, "Feb 15", "Metadata", null, null, null, true, null, null, null, Timeline.StatusIconPosition.TOP, false, false, 0, false, 0, false, false, false, new Timeline.DetailContent("Tertiary information that can also take multiple lines if needed. This is useful for additional context.", "", (Function0) objRememberedValue4, false, 8, null), new Timeline.PrimaryTextStyleOverride(true, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, 6).m21368getAccent0d7_KjU()), null, 4, null), 4185536, null), null, composerStartRestartGroup, 0, 2);
            composer2 = composerStartRestartGroup;
            m20996BentoTimelineRowcZKY2IM(tuples2.getSecond(), Timeline.Position.BOTTOM, "Primary information", null, null, null, null, null, null, null, false, null, null, false, false, 0, false, 0, false, false, false, composer2, 432, 0, 0, 2097144);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoTimelineRowKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoTimelineRowKt.Section$lambda$53(tuples2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Section$lambda$52$lambda$45$lambda$44(Context context) {
        Toast.makeText(context, "CTA clicked", 0).show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Section$lambda$52$lambda$47$lambda$46(Context context) {
        Toast.makeText(context, "Info clicked", 0).show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Section$lambda$52$lambda$49$lambda$48(Context context) {
        Toast.makeText(context, "Info clicked", 0).show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Section$lambda$52$lambda$51$lambda$50(Context context) {
        Toast.makeText(context, "Thumbnail clicked", 0).show();
        return Unit.INSTANCE;
    }
}
