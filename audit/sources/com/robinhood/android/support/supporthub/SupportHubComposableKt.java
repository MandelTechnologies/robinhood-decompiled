package com.robinhood.android.support.supporthub;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SheetValue;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PrimitiveResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
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
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope3;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope6;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtils2;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import coil.compose.SingletonAsyncImage;
import coil.compose.SingletonAsyncImagePainter;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.history.p153ui.MerchantRewardDetailComposable;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.RichTexts2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.comboorders.detail.TestTags;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.android.support.supporthub.SupportHubComposableKt;
import com.robinhood.android.support.supporthub.SupportHubEvent;
import com.robinhood.android.support.supporthub.SupportHubViewState;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.extensions.BannerVisibility;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoInfoBanner2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.BentoTextButton3;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p355ui.supporthub.AlertBanner;
import com.robinhood.models.p355ui.supporthub.AppointmentCard;
import com.robinhood.models.p355ui.supporthub.AssignedAgent;
import com.robinhood.models.p355ui.supporthub.GetSupport;
import com.robinhood.models.p355ui.supporthub.GetSupportAction;
import com.robinhood.models.p355ui.supporthub.RecommendationCard;
import com.robinhood.models.p355ui.supporthub.RecommendedActions;
import com.robinhood.models.p355ui.supporthub.SupportRow;
import com.robinhood.models.p355ui.supporthub.SupportSection;
import com.robinhood.models.p355ui.supporthub.ThemedUrl;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.rosetta.eventlogging.CXIssue;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.support.C39996R;
import com.robinhood.shared.support.contracts.ConciergeExplainerFragmentKey;
import com.robinhood.shared.support.contracts.ConciergeOnboardingFragmentKey;
import com.robinhood.utils.p409ui.edge2edge.OverrideSystemBarsStyle;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import p479j$.time.Month;
import p479j$.time.ZoneId;
import p479j$.time.ZonedDateTime;
import p479j$.time.format.DateTimeFormatter;
import p479j$.time.format.TextStyle;

/* compiled from: SupportHubComposable.kt */
@Metadata(m3635d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001aG\u0010\r\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\nH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001aO\u0010\u0018\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a7\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001aA\u0010$\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020\u000b2\u0016\u0010#\u001a\u0012\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00030\nj\u0002`\"H\u0003¢\u0006\u0004\b$\u0010%\u001a/\u0010(\u001a\u00020\u00032\u0006\u0010'\u001a\u00020&2\u0016\u0010#\u001a\u0012\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00030\nj\u0002`\"H\u0003¢\u0006\u0004\b(\u0010)\u001a7\u0010,\u001a\u00020\u00032\u0006\u0010+\u001a\u00020*2\u0016\u0010#\u001a\u0012\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00030\nj\u0002`\"2\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b,\u0010-\u001a7\u00100\u001a\u00020\u00032\u0006\u0010/\u001a\u00020.2\u0016\u0010#\u001a\u0012\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00030\nj\u0002`\"2\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b0\u00101\u001a7\u00103\u001a\u00020\u00032\u0006\u00102\u001a\u00020\u001e2\u0016\u0010#\u001a\u0012\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00030\nj\u0002`\"2\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b3\u00104\u001aC\u00109\u001a\u00020\u00032\u0006\u00106\u001a\u0002052\u0016\u0010#\u001a\u0012\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00030\nj\u0002`\"2\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u00108\u001a\u0004\u0018\u000107H\u0003¢\u0006\u0004\b9\u0010:\u001aa\u0010?\u001a\u00020\u00032\u0006\u0010<\u001a\u00020;2\u0016\u0010#\u001a\u0012\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00030\nj\u0002`\"2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010=\u001a\u00020\u00112\b\b\u0002\u0010>\u001a\u00020\u00112\n\b\u0002\u00108\u001a\u0004\u0018\u000107H\u0003¢\u0006\u0004\b?\u0010@\u001aE\u0010E\u001a\u00020\u00032\u0006\u0010B\u001a\u00020A2\u0016\u0010C\u001a\u0012\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00030\nj\u0002`\"2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\bE\u0010F\u001a\u001f\u0010I\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010H\u001a\u00020GH\u0003¢\u0006\u0004\bI\u0010J\u001a/\u0010P\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010K\u001a\u00020!2\u0006\u0010M\u001a\u00020L2\u0006\u0010O\u001a\u00020NH\u0002¢\u0006\u0004\bP\u0010Q\u001a-\u0010T\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010R\u001a\u00020\u001a2\b\u0010S\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\bT\u0010U\u001a-\u0010V\u001a\u00020\u0016*\u00020\u00162\u0006\u0010R\u001a\u00020\u001a2\b\u0010S\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\bV\u0010W\u001aC\u0010]\u001a\u00020\u0016*\u00020\u00162\u0006\u0010X\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010K\u001a\u00020!2\u0006\u0010Z\u001a\u00020Y2\u0006\u0010[\u001a\u00020\u00112\u0006\u0010\\\u001a\u00020\u0011H\u0002¢\u0006\u0004\b]\u0010^\"\u0014\u0010_\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b_\u0010`*$\b\u0002\u0010a\"\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00030\n2\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00030\n¨\u0006f²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\u0014\u0010d\u001a\n\u0012\u0004\u0012\u00020c\u0018\u00010b8\nX\u008a\u0084\u0002²\u0006\u000e\u0010e\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/support/supporthub/SupportHubDuxo;", "duxo", "Lkotlin/Function0;", "", "onToolbarBackPressed", "SupportHubComposable", "(Lcom/robinhood/android/support/supporthub/SupportHubDuxo;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Lcom/robinhood/android/support/supporthub/SupportHubViewState;", "state", "onClickConciergeQna", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "SupportHubScaffold", "(Lcom/robinhood/android/support/supporthub/SupportHubViewState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "Lcom/robinhood/android/support/supporthub/SupportHubViewState$InitialLoadingState$Loaded;", TestTags.LOADED, "", "isConciergeUser", "onBackPressed", "Landroidx/compose/material3/TopAppBarScrollBehavior;", "scrollBehavior", "Landroidx/compose/ui/Modifier;", "modifier", "SupportHubAppBar", "(Lcom/robinhood/android/support/supporthub/SupportHubViewState$InitialLoadingState$Loaded;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "title", "LargeAppBarHeader", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/models/ui/supporthub/RecommendedActions;", "recommendedActions", "paddingValues", "Lcom/robinhood/models/ui/supporthub/GetSupportAction;", "Lcom/robinhood/android/support/supporthub/OnClickCtaCallback;", "onClickCta", "Content", "(Lcom/robinhood/android/support/supporthub/SupportHubViewState$InitialLoadingState$Loaded;Lcom/robinhood/models/ui/supporthub/RecommendedActions;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lcom/robinhood/models/ui/supporthub/AlertBanner;", MerchantRewardDetailComposable.BANNER_TEST_TAG, "AlertBanner", "(Lcom/robinhood/models/ui/supporthub/AlertBanner;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lcom/robinhood/models/ui/supporthub/AppointmentCard;", "appointment", "ScheduledAppointment", "(Lcom/robinhood/models/ui/supporthub/AppointmentCard;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)V", "Lcom/robinhood/models/ui/supporthub/AssignedAgent;", "agent", "AssignedAgent", "(Lcom/robinhood/models/ui/supporthub/AssignedAgent;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)V", "actions", "RecommendationActions", "(Lcom/robinhood/models/ui/supporthub/RecommendedActions;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)V", "Lcom/robinhood/models/ui/supporthub/SupportSection;", "section", "", "recommendedActionCount", "SupportSections", "(Lcom/robinhood/models/ui/supporthub/SupportSection;Lkotlin/jvm/functions/Function1;ZLjava/lang/Integer;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/models/ui/supporthub/SupportRow;", "row", "removeHorizontalPadding", "showBottomDivider", "SupportRow", "(Lcom/robinhood/models/ui/supporthub/SupportRow;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/android/support/supporthub/SupportHubViewState$BottomSheetData$Menu;", "menu", "onClickMenuItem", "onDismissed", "BottomSheetMenu", "(Lcom/robinhood/android/support/supporthub/SupportHubViewState$BottomSheetData$Menu;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "Lcom/robinhood/android/support/supporthub/SupportHubViewState$DialogData;", WebsocketGatewayConstants.DATA_KEY, "Dialog", "(Lcom/robinhood/android/support/supporthub/SupportHubDuxo;Lcom/robinhood/android/support/supporthub/SupportHubViewState$DialogData;Landroidx/compose/runtime/Composer;I)V", "action", "Landroid/content/Context;", "context", "Lcom/robinhood/android/navigation/Navigator;", "navigator", "handleAction", "(Lcom/robinhood/android/support/supporthub/SupportHubDuxo;Lcom/robinhood/models/ui/supporthub/GetSupportAction;Landroid/content/Context;Lcom/robinhood/android/navigation/Navigator;)V", "rowId", "deeplink", "logSelectSupportChannelIfConcierge", "(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Ljava/lang/String;)Landroidx/compose/ui/Modifier;", "logSelectSupportChannel", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Z)Landroidx/compose/ui/Modifier;", "id", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "componentType", "logTap", "logAppear", "autoLogActionEvents", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLcom/robinhood/models/ui/supporthub/GetSupportAction;Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;ZZ)Landroidx/compose/ui/Modifier;", "PRIORITY_SUPPORT", "Ljava/lang/String;", "OnClickCtaCallback", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/support/supporthub/SupportHubEvent;", "event", "showDialog", "feature-support_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class SupportHubComposableKt {
    private static final String PRIORITY_SUPPORT = "robinhood://get_priority_support";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AlertBanner$lambda$38(AlertBanner alertBanner, Function1 function1, int i, Composer composer, int i2) {
        AlertBanner(alertBanner, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AssignedAgent$lambda$44(AssignedAgent assignedAgent, Function1 function1, boolean z, int i, Composer composer, int i2) {
        AssignedAgent(assignedAgent, function1, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomSheetMenu$lambda$65(SupportHubViewState.BottomSheetData.Menu menu, Function1 function1, Function0 function0, boolean z, int i, Composer composer, int i2) {
        BottomSheetMenu(menu, function1, function0, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$33(SupportHubViewState.InitialLoadingState.Loaded loaded, RecommendedActions recommendedActions, PaddingValues paddingValues, Function1 function1, int i, Composer composer, int i2) {
        Content(loaded, recommendedActions, paddingValues, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Dialog$lambda$72(SupportHubDuxo supportHubDuxo, SupportHubViewState.DialogData dialogData, int i, Composer composer, int i2) {
        Dialog(supportHubDuxo, dialogData, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LargeAppBarHeader$lambda$21(String str, boolean z, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LargeAppBarHeader(str, z, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecommendationActions$lambda$45(RecommendedActions recommendedActions, Function1 function1, boolean z, int i, Composer composer, int i2) {
        RecommendationActions(recommendedActions, function1, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecommendationActions$lambda$47(RecommendedActions recommendedActions, Function1 function1, boolean z, int i, Composer composer, int i2) {
        RecommendationActions(recommendedActions, function1, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScheduledAppointment$lambda$42(AppointmentCard appointmentCard, Function1 function1, boolean z, int i, Composer composer, int i2) {
        ScheduledAppointment(appointmentCard, function1, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SupportHubAppBar$lambda$17(SupportHubViewState.InitialLoadingState.Loaded loaded, boolean z, Function0 function0, Function0 function02, TopAppBarScrollBehavior topAppBarScrollBehavior, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SupportHubAppBar(loaded, z, function0, function02, topAppBarScrollBehavior, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SupportHubComposable$lambda$12(SupportHubDuxo supportHubDuxo, Function0 function0, int i, Composer composer, int i2) {
        SupportHubComposable(supportHubDuxo, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SupportHubScaffold$lambda$13(SupportHubViewState supportHubViewState, Function0 function0, Function0 function02, Function3 function3, int i, Composer composer, int i2) {
        SupportHubScaffold(supportHubViewState, function0, function02, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SupportRow$lambda$58(SupportRow supportRow, Function1 function1, boolean z, Modifier modifier, boolean z2, boolean z3, Integer num, int i, int i2, Composer composer, int i3) {
        SupportRow(supportRow, function1, z, modifier, z2, z3, num, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SupportSections$lambda$50(SupportSection supportSection, Function1 function1, boolean z, Integer num, int i, int i2, Composer composer, int i3) {
        SupportSections(supportSection, function1, z, num, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SupportHubViewState SupportHubComposable$lambda$0(SnapshotState4<SupportHubViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<SupportHubEvent> SupportHubComposable$lambda$1(SnapshotState4<Event<SupportHubEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final boolean SupportHubComposable$lambda$3(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    public static final void SupportHubComposable(SupportHubDuxo duxo, Function0<Unit> onToolbarBackPressed, Composer composer, final int i) {
        int i2;
        final SupportHubDuxo supportHubDuxo;
        final Function0<Unit> function0;
        Composer composer2;
        EventConsumer<SupportHubEvent> eventConsumerInvoke;
        EventConsumer<SupportHubEvent> eventConsumerInvoke2;
        EventConsumer<SupportHubEvent> eventConsumerInvoke3;
        EventConsumer<SupportHubEvent> eventConsumerInvoke4;
        EventConsumer<SupportHubEvent> eventConsumerInvoke5;
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Intrinsics.checkNotNullParameter(onToolbarBackPressed, "onToolbarBackPressed");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1611703547);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(duxo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onToolbarBackPressed) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            supportHubDuxo = duxo;
            function0 = onToolbarBackPressed;
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1611703547, i2, -1, "com.robinhood.android.support.supporthub.SupportHubComposable (SupportHubComposable.kt:123)");
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            final StateFlow<Event<SupportHubEvent>> eventFlow = duxo.getEventFlow();
            composerStartRestartGroup.startReplaceGroup(-523522313);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            Lifecycle.State state = Lifecycle.State.STARTED;
            CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
            Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$SupportHubComposable$$inlined$collectEventAsStateWithLifecycle$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                    Object objCollect = eventFlow.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.support.supporthub.SupportHubComposableKt$SupportHubComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.support.supporthub.SupportHubComposableKt$SupportHubComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "SupportHubComposable.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.support.supporthub.SupportHubComposableKt$SupportHubComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            Event event = (Event) obj;
                            if ((event != null ? event.getData() : null) instanceof SupportHubEvent) {
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
            };
            Event<SupportHubEvent> value = eventFlow.getValue();
            Event<SupportHubEvent> event = value;
            if (!((event != null ? event.getData() : null) instanceof SupportHubEvent)) {
                value = null;
            }
            SupportHubViewState.InitialLoadingState.Loaded loaded = null;
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endReplaceGroup();
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(coroutineContextImpl6, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            final SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            SupportHubViewState.InitialLoadingState initialLoadingState = SupportHubComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getInitialLoadingState();
            if (initialLoadingState instanceof SupportHubViewState.InitialLoadingState.Loaded) {
                loaded = (SupportHubViewState.InitialLoadingState.Loaded) initialLoadingState;
            }
            boolean z = false;
            if (loaded != null && loaded.isConcierge()) {
                z = true;
            }
            SupportHubViewState supportHubViewStateSupportHubComposable$lambda$0 = SupportHubComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SupportHubComposableKt.SupportHubComposable$lambda$6$lambda$5(navigator, context);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Function0 function02 = (Function0) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            int i3 = i2;
            C290822 c290822 = new C290822(duxo, context, navigator, sheetStateRememberModalBottomSheetState, snapshotState4CollectAsStateWithLifecycle, z);
            supportHubDuxo = duxo;
            function0 = onToolbarBackPressed;
            SupportHubScaffold(supportHubViewStateSupportHubComposable$lambda$0, function02, function0, ComposableLambda3.rememberComposableLambda(879971542, true, c290822, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 << 3) & 896) | 3072);
            composer2 = composerStartRestartGroup;
            final Event<SupportHubEvent> eventSupportHubComposable$lambda$1 = SupportHubComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
            if (eventSupportHubComposable$lambda$1 != null && (eventSupportHubComposable$lambda$1.getData() instanceof SupportHubEvent.OpenBottomSheet) && (eventConsumerInvoke5 = eventSupportHubComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke5.consume(eventSupportHubComposable$lambda$1, new Function1() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$SupportHubComposable$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m19121invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m19121invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new SupportHubComposableKt$SupportHubComposable$3$1(sheetStateRememberModalBottomSheetState, null), 3, null);
                    }
                });
            }
            final Event<SupportHubEvent> eventSupportHubComposable$lambda$12 = SupportHubComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
            if (eventSupportHubComposable$lambda$12 != null && (eventSupportHubComposable$lambda$12.getData() instanceof SupportHubEvent.CloseBottomSheet) && (eventConsumerInvoke4 = eventSupportHubComposable$lambda$12.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke4.consume(eventSupportHubComposable$lambda$12, new Function1() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$SupportHubComposable$$inlined$consumeIfType$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m19122invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m19122invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new SupportHubComposableKt$SupportHubComposable$4$1(sheetStateRememberModalBottomSheetState, null), 3, null);
                    }
                });
            }
            final Event<SupportHubEvent> eventSupportHubComposable$lambda$13 = SupportHubComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
            if (eventSupportHubComposable$lambda$13 != null && (eventSupportHubComposable$lambda$13.getData() instanceof SupportHubEvent.OpenDialog) && (eventConsumerInvoke3 = eventSupportHubComposable$lambda$13.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke3.consume(eventSupportHubComposable$lambda$13, new Function1() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$SupportHubComposable$$inlined$consumeIfType$3
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m19123invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m19123invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        SupportHubComposableKt.SupportHubComposable$lambda$4(snapshotState, true);
                    }
                });
            }
            final Event<SupportHubEvent> eventSupportHubComposable$lambda$14 = SupportHubComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
            if (eventSupportHubComposable$lambda$14 != null && (eventSupportHubComposable$lambda$14.getData() instanceof SupportHubEvent.CloseDialog) && (eventConsumerInvoke2 = eventSupportHubComposable$lambda$14.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke2.consume(eventSupportHubComposable$lambda$14, new Function1() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$SupportHubComposable$$inlined$consumeIfType$4
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m19124invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m19124invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        SupportHubComposableKt.SupportHubComposable$lambda$4(snapshotState, false);
                    }
                });
            }
            if (SupportHubComposable$lambda$3(snapshotState)) {
                Dialog(supportHubDuxo, SupportHubComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getDialogData(), composer2, i3 & 14);
            }
            final Event<SupportHubEvent> eventSupportHubComposable$lambda$15 = SupportHubComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
            if (eventSupportHubComposable$lambda$15 != null && (eventSupportHubComposable$lambda$15.getData() instanceof SupportHubEvent.ShowConciergeOnboarding) && (eventConsumerInvoke = eventSupportHubComposable$lambda$15.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke.consume(eventSupportHubComposable$lambda$15, new Function1() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$SupportHubComposable$$inlined$consumeIfType$5
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m19125invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m19125invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, new ConciergeOnboardingFragmentKey(false, 1, null), false, false, false, false, null, false, null, null, 1020, null);
                    }
                });
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SupportHubComposableKt.SupportHubComposable$lambda$12(supportHubDuxo, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SupportHubComposable$lambda$4(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SupportHubComposable$lambda$6$lambda$5(Navigator navigator, Context context) {
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, ConciergeExplainerFragmentKey.INSTANCE, false, false, false, false, null, false, null, null, 1020, null);
        return Unit.INSTANCE;
    }

    /* compiled from: SupportHubComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.support.supporthub.SupportHubComposableKt$SupportHubComposable$2 */
    static final class C290822 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ SupportHubDuxo $duxo;
        final /* synthetic */ boolean $isConcierge;
        final /* synthetic */ Navigator $navigator;
        final /* synthetic */ SheetState $sheetState;
        final /* synthetic */ SnapshotState4<SupportHubViewState> $state$delegate;

        C290822(SupportHubDuxo supportHubDuxo, Context context, Navigator navigator, SheetState sheetState, SnapshotState4<SupportHubViewState> snapshotState4, boolean z) {
            this.$duxo = supportHubDuxo;
            this.$context = context;
            this.$navigator = navigator;
            this.$sheetState = sheetState;
            this.$state$delegate = snapshotState4;
            this.$isConcierge = z;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SupportHubDuxo supportHubDuxo, Context context, Navigator navigator, GetSupportAction action) {
            Intrinsics.checkNotNullParameter(action, "action");
            SupportHubComposableKt.handleAction(supportHubDuxo, action, context, navigator);
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i2 = (composer.changed(paddingValues) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(879971542, i2, -1, "com.robinhood.android.support.supporthub.SupportHubComposable.<anonymous> (SupportHubComposable.kt:149)");
            }
            SupportHubViewState.InitialLoadingState initialLoadingState = SupportHubComposableKt.SupportHubComposable$lambda$0(this.$state$delegate).getInitialLoadingState();
            if (initialLoadingState instanceof SupportHubViewState.InitialLoadingState.Uninitialized) {
                composer.startReplaceGroup(-1248015222);
                composer.endReplaceGroup();
            } else if (initialLoadingState instanceof SupportHubViewState.InitialLoadingState.Updating) {
                composer.startReplaceGroup(-1247941845);
                SupportHubLoadingComposable.SupportHubLoadingComposable(paddingValues, composer, i2 & 14);
                composer.endReplaceGroup();
            } else if (initialLoadingState instanceof SupportHubViewState.InitialLoadingState.Loaded) {
                composer.startReplaceGroup(-1247735850);
                SupportHubViewState.InitialLoadingState.Loaded loaded = (SupportHubViewState.InitialLoadingState.Loaded) initialLoadingState;
                RecommendedActions recommendedActions = SupportHubComposableKt.SupportHubComposable$lambda$0(this.$state$delegate).getRecommendedActions();
                composer.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composer.changedInstance(this.$duxo) | composer.changedInstance(this.$context) | composer.changedInstance(this.$navigator);
                final SupportHubDuxo supportHubDuxo = this.$duxo;
                final Context context = this.$context;
                final Navigator navigator = this.$navigator;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$SupportHubComposable$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SupportHubComposableKt.C290822.invoke$lambda$1$lambda$0(supportHubDuxo, context, navigator, (GetSupportAction) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                SupportHubComposableKt.Content(loaded, recommendedActions, paddingValues, (Function1) objRememberedValue, composer, (i2 << 6) & 896);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1247212756);
                composer.endReplaceGroup();
            }
            SupportHubViewState.BottomSheetData bottomSheetData = SupportHubComposableKt.SupportHubComposable$lambda$0(this.$state$delegate).getBottomSheetData();
            if ((this.$sheetState.getCurrentValue() == SheetValue.Expanded || (bottomSheetData instanceof SupportHubViewState.BottomSheetData.Menu) || (bottomSheetData instanceof SupportHubViewState.BottomSheetData.Loading)) && ((bottomSheetData instanceof SupportHubViewState.BottomSheetData.Menu) || (bottomSheetData instanceof SupportHubViewState.BottomSheetData.Loading))) {
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composer.changedInstance(this.$duxo);
                final SupportHubDuxo supportHubDuxo2 = this.$duxo;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$SupportHubComposable$2$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SupportHubComposableKt.C290822.invoke$lambda$3$lambda$2(supportHubDuxo2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue2, null, false, this.$sheetState, null, 0L, ComposableLambda3.rememberComposableLambda(857725669, true, new AnonymousClass3(bottomSheetData, this.$duxo, this.$context, this.$navigator, this.$isConcierge), composer, 54), composer, 1572864, 54);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* compiled from: SupportHubComposable.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.support.supporthub.SupportHubComposableKt$SupportHubComposable$2$3, reason: invalid class name */
        static final class AnonymousClass3 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
            final /* synthetic */ SupportHubViewState.BottomSheetData $bottomSheetData;
            final /* synthetic */ Context $context;
            final /* synthetic */ SupportHubDuxo $duxo;
            final /* synthetic */ boolean $isConcierge;
            final /* synthetic */ Navigator $navigator;

            AnonymousClass3(SupportHubViewState.BottomSheetData bottomSheetData, SupportHubDuxo supportHubDuxo, Context context, Navigator navigator, boolean z) {
                this.$bottomSheetData = bottomSheetData;
                this.$duxo = supportHubDuxo;
                this.$context = context;
                this.$navigator = navigator;
                this.$isConcierge = z;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
                invoke(rhModalBottomSheet5, composer, num.intValue());
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$1$lambda$0(SupportHubDuxo supportHubDuxo, Context context, Navigator navigator, GetSupportAction action) {
                Intrinsics.checkNotNullParameter(action, "action");
                SupportHubComposableKt.handleAction(supportHubDuxo, action, context, navigator);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$3$lambda$2(SupportHubDuxo supportHubDuxo) {
                supportHubDuxo.closeBottomSheet();
                return Unit.INSTANCE;
            }

            public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(857725669, i, -1, "com.robinhood.android.support.supporthub.SupportHubComposable.<anonymous>.<anonymous> (SupportHubComposable.kt:185)");
                }
                SupportHubViewState.BottomSheetData bottomSheetData = this.$bottomSheetData;
                if (bottomSheetData instanceof SupportHubViewState.BottomSheetData.Menu) {
                    composer.startReplaceGroup(1745093089);
                    SupportHubViewState.BottomSheetData.Menu menu = (SupportHubViewState.BottomSheetData.Menu) this.$bottomSheetData;
                    composer.startReplaceGroup(-1746271574);
                    boolean zChangedInstance = composer.changedInstance(this.$duxo) | composer.changedInstance(this.$context) | composer.changedInstance(this.$navigator);
                    final SupportHubDuxo supportHubDuxo = this.$duxo;
                    final Context context = this.$context;
                    final Navigator navigator = this.$navigator;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$SupportHubComposable$2$3$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SupportHubComposableKt.C290822.AnonymousClass3.invoke$lambda$1$lambda$0(supportHubDuxo, context, navigator, (GetSupportAction) obj);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    Function1 function1 = (Function1) objRememberedValue;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(5004770);
                    boolean zChangedInstance2 = composer.changedInstance(this.$duxo);
                    final SupportHubDuxo supportHubDuxo2 = this.$duxo;
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$SupportHubComposable$2$3$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SupportHubComposableKt.C290822.AnonymousClass3.invoke$lambda$3$lambda$2(supportHubDuxo2);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    composer.endReplaceGroup();
                    SupportHubComposableKt.BottomSheetMenu(menu, function1, (Function0) objRememberedValue2, this.$isConcierge, composer, 0);
                    composer.endReplaceGroup();
                } else if (bottomSheetData instanceof SupportHubViewState.BottomSheetData.Loading) {
                    composer.startReplaceGroup(1745634535);
                    BottomSheetLoadingComposable.BottomSheetLoadingComposable(((SupportHubViewState.BottomSheetData.Loading) this.$bottomSheetData).getTitle(), ((SupportHubViewState.BottomSheetData.Loading) this.$bottomSheetData).getSubtitle(), this.$isConcierge, null, 0, composer, 0, 24);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-359320535);
                    composer.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(SupportHubDuxo supportHubDuxo) {
            supportHubDuxo.closeBottomSheet();
            return Unit.INSTANCE;
        }
    }

    private static final void SupportHubScaffold(SupportHubViewState supportHubViewState, final Function0<Unit> function0, final Function0<Unit> function02, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i) {
        final SupportHubViewState supportHubViewState2;
        int i2;
        Function0<Unit> function03;
        Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function32;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1834096902);
        if ((i & 6) == 0) {
            supportHubViewState2 = supportHubViewState;
            i2 = (composerStartRestartGroup.changedInstance(supportHubViewState2) ? 4 : 2) | i;
        } else {
            supportHubViewState2 = supportHubViewState;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function03 = function02;
            i2 |= composerStartRestartGroup.changedInstance(function03) ? 256 : 128;
        } else {
            function03 = function02;
        }
        if ((i & 3072) == 0) {
            function32 = function3;
            i2 |= composerStartRestartGroup.changedInstance(function32) ? 2048 : 1024;
        } else {
            function32 = function3;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1834096902, i2, -1, "com.robinhood.android.support.supporthub.SupportHubScaffold (SupportHubComposable.kt:248)");
            }
            final TopAppBarScrollBehavior topAppBarScrollBehaviorEnterAlwaysScrollBehavior = TopAppBarDefaults.INSTANCE.enterAlwaysScrollBehavior(AppBarKt.rememberTopAppBarState(0.0f, 0.0f, 0.0f, composerStartRestartGroup, 0, 7), null, null, null, composerStartRestartGroup, TopAppBarDefaults.$stable << 12, 14);
            SupportHubViewState.InitialLoadingState initialLoadingState = supportHubViewState2.getInitialLoadingState();
            final SupportHubViewState.InitialLoadingState.Loaded loaded = initialLoadingState instanceof SupportHubViewState.InitialLoadingState.Loaded ? (SupportHubViewState.InitialLoadingState.Loaded) initialLoadingState : null;
            final boolean z = loaded != null && loaded.isConcierge();
            final Function0<Unit> function04 = function03;
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m5939ScaffoldTvnljyQ(null, ComposableLambda3.rememberComposableLambda(1733844426, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt.SupportHubScaffold.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1733844426, i3, -1, "com.robinhood.android.support.supporthub.SupportHubScaffold.<anonymous> (SupportHubComposable.kt:257)");
                    }
                    SupportHubComposableKt.SupportHubAppBar(loaded, z, function0, function04, topAppBarScrollBehaviorEnterAlwaysScrollBehavior, null, composer3, 0, 32);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, function32, composer2, ((i2 << 18) & 1879048192) | 48, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SupportHubComposableKt.SupportHubScaffold$lambda$13(supportHubViewState2, function0, function02, function3, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f6  */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SupportHubAppBar(final SupportHubViewState.InitialLoadingState.Loaded loaded, final boolean z, final Function0<Unit> onClickConciergeQna, final Function0<Unit> onBackPressed, final TopAppBarScrollBehavior scrollBehavior, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ?? r10;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClickConciergeQna, "onClickConciergeQna");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Intrinsics.checkNotNullParameter(scrollBehavior, "scrollBehavior");
        Composer composerStartRestartGroup = composer.startRestartGroup(-706045512);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(loaded) ? 4 : 2) | i;
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
            i3 |= composerStartRestartGroup.changedInstance(onClickConciergeQna) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackPressed) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(scrollBehavior) ? 16384 : 8192;
        }
        int i5 = i2 & 32;
        if (i5 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            i4 = i3;
            if ((74899 & i4) == 74898 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-706045512, i4, -1, "com.robinhood.android.support.supporthub.SupportHubAppBar (SupportHubComposable.kt:278)");
                }
                float collapsedFraction = scrollBehavior.getState().getCollapsedFraction();
                boolean zBooleanValue = ((Boolean) composerStartRestartGroup.consume(BannerVisibility.getLocalBannerVisible())).booleanValue();
                Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), null, false, 3, null);
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWrapContentHeight$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                int currentMarker = composerStartRestartGroup.getCurrentMarker();
                composerStartRestartGroup.startReplaceGroup(-837621012);
                composerStartRestartGroup.startReplaceGroup(-304115891);
                if (z) {
                    r10 = 0;
                } else {
                    OverrideSystemBarsStyle.OverrideStatusBarStyle(false, composerStartRestartGroup, 6);
                    r10 = 0;
                    BoxKt.Box(Background3.m4872backgroundbw27NRU$default(boxScopeInstance.matchParentSize(TestTag3.testTag(Modifier.INSTANCE, "ConciergeAppBarBackground")), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getJet(), null, 2, null), composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierThen = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), null, r10, 3, null).then(zBooleanValue ? WindowInsetsPadding_androidKt.statusBarsPadding(companion3) : companion3);
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, r10);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, r10);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierThen);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1444085611);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                BentoAppBarScope.INSTANCE.m20575BentoBackButtondrOMvmE(TestTag3.testTag(companion3, "ToolbarBackButton"), false, !z ? Color.m6701boximpl(Color.INSTANCE.m6727getWhite0d7_KjU()) : null, onBackPressed, composerStartRestartGroup, (BentoAppBarScope.$stable << 12) | (i4 & 7168), 2);
                composerStartRestartGroup.endNode();
                if (loaded != null) {
                    composerStartRestartGroup.endToMarker(currentMarker);
                } else {
                    float f = 1.0f - collapsedFraction;
                    LargeAppBarHeader(loaded.getTitle(), z, onClickConciergeQna, Alpha.alpha(companion3, f * f * f), composerStartRestartGroup, i4 & 1008, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SupportHubComposableKt.SupportHubAppBar$lambda$17(loaded, z, onClickConciergeQna, onBackPressed, scrollBehavior, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        i4 = i3;
        if ((74899 & i4) == 74898) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            float collapsedFraction2 = scrollBehavior.getState().getCollapsedFraction();
            boolean zBooleanValue2 = ((Boolean) composerStartRestartGroup.consume(BannerVisibility.getLocalBannerVisible())).booleanValue();
            Modifier modifierWrapContentHeight$default2 = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), null, false, 3, null);
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWrapContentHeight$default2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor4 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion22.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                int currentMarker2 = composerStartRestartGroup.getCurrentMarker();
                composerStartRestartGroup.startReplaceGroup(-837621012);
                composerStartRestartGroup.startReplaceGroup(-304115891);
                if (z) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Modifier modifierThen2 = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null), null, r10, 3, null).then(zBooleanValue2 ? WindowInsetsPadding_androidKt.statusBarsPadding(companion32) : companion32);
                Arrangement arrangement2 = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion4.getStart(), composerStartRestartGroup, r10);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, r10);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierThen2);
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-1444085611);
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion4.getTop(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                    Function0<ComposeUiNode> constructor32 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash3 = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl3.getInserting()) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion22.getSetModifier());
                        Row6 row62 = Row6.INSTANCE;
                        if (!z) {
                        }
                        BentoAppBarScope.INSTANCE.m20575BentoBackButtondrOMvmE(TestTag3.testTag(companion32, "ToolbarBackButton"), false, !z ? Color.m6701boximpl(Color.INSTANCE.m6727getWhite0d7_KjU()) : null, onBackPressed, composerStartRestartGroup, (BentoAppBarScope.$stable << 12) | (i4 & 7168), 2);
                        composerStartRestartGroup.endNode();
                        if (loaded != null) {
                        }
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

    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void LargeAppBarHeader(final String str, final boolean z, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        String str2;
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int i4;
        Object obj;
        float f;
        int i5;
        Composer composer2;
        Modifier modifier3;
        long jM21425getFg0d7_KjU;
        Composer composer3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-174216104);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str2 = str;
        } else if ((i & 6) == 0) {
            str2 = str;
            i3 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
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
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                composer3 = composerStartRestartGroup;
                modifier4 = modifier2;
            } else {
                if (i6 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-174216104, i3, -1, "com.robinhood.android.support.supporthub.LargeAppBarHeader (SupportHubComposable.kt:351)");
                }
                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, false, 3, null);
                Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWrapContentHeight$default);
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
                composerStartRestartGroup.startReplaceGroup(-295832336);
                if (z) {
                    i4 = i3;
                    obj = null;
                    f = 0.0f;
                    i5 = 1;
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                } else {
                    Modifier modifierAlign = column6.align(PaddingKt.m5146paddingqDBjuR0$default(TestTag3.testTag(companion, "ConciergeQna"), 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 11, null), companion2.getEnd());
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean z2 = (i3 & 896) == 256;
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$$ExternalSyntheticLambda19
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SupportHubComposableKt.LargeAppBarHeader$lambda$20$lambda$19$lambda$18(function0);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    obj = null;
                    i4 = i3;
                    modifier3 = modifier2;
                    i5 = 1;
                    f = 0.0f;
                    SurfaceKt.m5967SurfaceT9BRK9s(ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifierAlign, false, null, null, (Function0) objRememberedValue, 7, null), UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, UserInteractionEventData.Action.VIEW_DEEPLINK, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, new CXIssue(null, null, null, null, null, null, null, null, null, 0, null, null, "support_hub_concierge_pill", null, null, null, null, 0, null, false, null, true, null, 6287359, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262145, -1, -1, -1, -1, -1, 16383, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 35, null), false, false, false, true, false, null, 108, null), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(100)), Color.INSTANCE.m6727getWhite0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableSingletons$SupportHubComposableKt.INSTANCE.getLambda$1370541868$feature_support_externalRelease(), composerStartRestartGroup, 12583296, 120);
                    composer2 = composerStartRestartGroup;
                }
                composer2.endReplaceGroup();
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(TestTag3.testTag(modifier3, "Title"), f, i5, obj);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i7 = BentoTheme.$stable;
                Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer2, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i7).m21591getLargeD9Ej5fM());
                composer2.startReplaceGroup(-295763588);
                if (!z) {
                    jM21425getFg0d7_KjU = Color.INSTANCE.m6727getWhite0d7_KjU();
                } else {
                    jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i7).m21425getFg0d7_KjU();
                }
                composer2.endReplaceGroup();
                Composer composer4 = composer2;
                BentoText2.m20747BentoText38GnDrw(str2, modifierM5145paddingqDBjuR0, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i7).getDisplayCapsuleLarge(), composer4, i4 & 14, 0, 8184);
                composer3 = composer4;
                composer3.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return SupportHubComposableKt.LargeAppBarHeader$lambda$21(str, z, function0, modifier4, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) != 1170) {
            if (i6 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Modifier.Companion companion4 = Modifier.INSTANCE;
            Modifier modifierWrapContentHeight$default2 = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), null, false, 3, null);
            Arrangement.Vertical top2 = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion22 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWrapContentHeight$default2);
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
                composerStartRestartGroup.startReplaceGroup(-295832336);
                if (z) {
                }
                composer2.endReplaceGroup();
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(TestTag3.testTag(modifier3, "Title"), f, i5, obj);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i72 = BentoTheme.$stable;
                Modifier modifierM5145paddingqDBjuR02 = PaddingKt.m5145paddingqDBjuR0(modifierFillMaxWidth$default2, bentoTheme2.getSpacing(composer2, i72).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer2, i72).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer2, i72).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer2, i72).m21591getLargeD9Ej5fM());
                composer2.startReplaceGroup(-295763588);
                if (!z) {
                }
                composer2.endReplaceGroup();
                Composer composer42 = composer2;
                BentoText2.m20747BentoText38GnDrw(str2, modifierM5145paddingqDBjuR02, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i72).getDisplayCapsuleLarge(), composer42, i4 & 14, 0, 8184);
                composer3 = composer42;
                composer3.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LargeAppBarHeader$lambda$20$lambda$19$lambda$18(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Content(final SupportHubViewState.InitialLoadingState.Loaded loaded, final RecommendedActions recommendedActions, final PaddingValues paddingValues, final Function1<? super GetSupportAction, Unit> function1, Composer composer, final int i) {
        int i2;
        BentoTheme bentoTheme;
        int i3;
        Composer composer2;
        int i4;
        int i5;
        Composer composer3;
        Function1<? super GetSupportAction, Unit> function12 = function1;
        Composer composerStartRestartGroup = composer.startRestartGroup(-867623738);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(loaded) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(recommendedActions) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(paddingValues) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
        }
        int i6 = i2;
        if ((i6 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer3 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-867623738, i6, -1, "com.robinhood.android.support.supporthub.Content (SupportHubComposable.kt:429)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.padding(TestTag3.testTag(companion, "Content"), paddingValues), 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            composerStartRestartGroup.startReplaceGroup(1360494170);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i7 = BentoTheme.$stable;
            if (bentoTheme2.getColors(composerStartRestartGroup, i7).getIsDay()) {
                bentoTheme = bentoTheme2;
                i3 = i7;
                composer2 = composerStartRestartGroup;
                i4 = 0;
            } else {
                composer2 = composerStartRestartGroup;
                i4 = 0;
                bentoTheme = bentoTheme2;
                i3 = i7;
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme2.getColors(composerStartRestartGroup, i7).m21373getBg30d7_KjU(), 0.0f, composer2, 0, 5);
            }
            composer2.endReplaceGroup();
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, companion, 1.0f, false, 2, null), ScrollKt.rememberScrollState(i4, composer2, i4, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer2, i4);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, i4);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierVerticalScroll$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer2.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer2, i3).m21590getDefaultD9Ej5fM()), composer2, i4);
            AlertBanner alertBanner = (AlertBanner) CollectionsKt.firstOrNull((List) loaded.getAlertBanners());
            composer2.startReplaceGroup(-2111877416);
            if (alertBanner != null) {
                AlertBanner(alertBanner, function12, composer2, (i6 >> 6) & 112);
                Unit unit = Unit.INSTANCE;
            }
            composer2.endReplaceGroup();
            SupportSection getPrioritySupport = loaded.getGetPrioritySupport();
            composer2.startReplaceGroup(-2111869607);
            if (getPrioritySupport == null) {
                i5 = 1;
            } else {
                List<RecommendationCard> actions = recommendedActions != null ? recommendedActions.getActions() : null;
                if (actions == null) {
                    actions = CollectionsKt.emptyList();
                }
                Composer composer4 = composer2;
                i5 = 1;
                SupportSections(getPrioritySupport, function12, loaded.isConcierge(), Integer.valueOf(actions.size()), composer4, (i6 >> 6) & 112, 0);
                composer2 = composer4;
                Unit unit2 = Unit.INSTANCE;
            }
            composer2.endReplaceGroup();
            AppointmentCard appointment = loaded.getAppointment();
            composer2.startReplaceGroup(-2111856591);
            if (appointment != null) {
                ScheduledAppointment(appointment, function12, loaded.isConcierge(), composer2, (i6 >> 6) & 112);
                Unit unit3 = Unit.INSTANCE;
            }
            composer2.endReplaceGroup();
            AssignedAgent assignedAgent = loaded.getAssignedAgent();
            composer2.startReplaceGroup(-2111847644);
            if (assignedAgent != null) {
                AssignedAgent(assignedAgent, function12, loaded.isConcierge(), composer2, (i6 >> 6) & 112);
                Unit unit4 = Unit.INSTANCE;
            }
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(-2111838962);
            if (recommendedActions != null) {
                RecommendationActions(recommendedActions, function12, loaded.isConcierge(), composer2, (i6 >> 6) & 112);
                Unit unit5 = Unit.INSTANCE;
            }
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(-2111829572);
            Iterator<SupportSection> it = loaded.getSections().iterator();
            while (it.hasNext()) {
                Composer composer5 = composer2;
                SupportSections(it.next(), function12, loaded.isConcierge(), null, composer5, (i6 >> 6) & 112, 8);
                function12 = function1;
                composer2 = composer5;
            }
            composer2.endReplaceGroup();
            Modifier.Companion companion4 = Modifier.INSTANCE;
            BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
            int i8 = BentoTheme.$stable;
            Composer composer6 = composer2;
            BentoText2.m20747BentoText38GnDrw(loaded.getVersionName(), SizeKt.fillMaxWidth$default(PaddingKt.m5143paddingVpY3zN4(companion4, bentoTheme3.getSpacing(composer2, i8).m21592getMediumD9Ej5fM(), bentoTheme3.getSpacing(composer2, i8).m21590getDefaultD9Ej5fM()), 0.0f, i5, null), Color.m6701boximpl(bentoTheme3.getColors(composer2, i8).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composer2, i8).getTextS(), composer6, 0, 0, 8184);
            composer3 = composer6;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme3.getSpacing(composer3, i8).m21590getDefaultD9Ej5fM()), composer3, 0);
            composer3.endNode();
            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Component component = new Component(Component.ComponentType.BUTTON, null, null, 6, null);
            UserInteractionEventData.Action action = UserInteractionEventData.Action.CONTACT_SUPPORT;
            List<RecommendationCard> actions2 = recommendedActions != null ? recommendedActions.getActions() : null;
            if (actions2 == null) {
                actions2 = CollectionsKt.emptyList();
            }
            UserInteractionEventDescriptor userInteractionEventDescriptorCopy$default = UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, action, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, new CXIssue(null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, actions2.size(), null, false, null, loaded.isConcierge(), null, 6160383, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262145, -1, -1, -1, -1, -1, 16383, null), component, null, 35, null);
            final GetSupport getSupport = loaded.getGetSupport();
            composer3.startReplaceGroup(1360600589);
            if (getSupport != null) {
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(PaddingKt.m5143paddingVpY3zN4(companion4, bentoTheme3.getSpacing(composer3, i8).m21592getMediumD9Ej5fM(), bentoTheme3.getSpacing(composer3, i8).m21590getDefaultD9Ej5fM()), 0.0f, 1, null), userInteractionEventDescriptorCopy$default, false, false, false, true, false, null, 108, null);
                String ctaLabel = getSupport.getCtaLabel();
                composer3.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composer3.changedInstance(getSupport) | ((i6 & 7168) == 2048);
                Object objRememberedValue = composer3.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$$ExternalSyntheticLambda22
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SupportHubComposableKt.Content$lambda$32$lambda$31$lambda$30$lambda$29(function1, getSupport);
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue);
                }
                composer3.endReplaceGroup();
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, ctaLabel, modifierAutoLogEvents$default, null, null, false, false, null, null, null, null, false, null, composer3, 0, 0, 8184);
                composer3 = composer3;
                Unit unit6 = Unit.INSTANCE;
            }
            composer3.endReplaceGroup();
            composer3.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SupportHubComposableKt.Content$lambda$33(loaded, recommendedActions, paddingValues, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$32$lambda$31$lambda$30$lambda$29(Function1 function1, GetSupport getSupport) {
        function1.invoke(getSupport.getCtaAction());
        return Unit.INSTANCE;
    }

    private static final void AlertBanner(final AlertBanner alertBanner, final Function1<? super GetSupportAction, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1809558559);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(alertBanner) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1809558559, i3, -1, "com.robinhood.android.support.supporthub.AlertBanner (SupportHubComposable.kt:561)");
            }
            AnnotatedString annotatedStringM15957toAnnotatedStringiJQMabo = RichTexts2.m15957toAnnotatedStringiJQMabo(alertBanner.getMessage(), 0L, composerStartRestartGroup, 0, 1);
            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, "AlertBanner");
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifierTestTag, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM());
            ServerToBentoAssetMapper2 icon = alertBanner.getIcon();
            BentoIcon4.Size24 size24 = icon != null ? new BentoIcon4.Size24(icon) : null;
            long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU();
            long jM21372getBg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i4).m21372getBg20d7_KjU();
            BentoIcon4.Size24 size242 = size24;
            String ctaLabel = alertBanner.getCtaLabel();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = ((i3 & 112) == 32) | composerStartRestartGroup.changedInstance(alertBanner);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SupportHubComposableKt.AlertBanner$lambda$37$lambda$36(alertBanner, function1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoInfoBanner2.m20654BentoInfoBannernjYn8yo(annotatedStringM15957toAnnotatedStringiJQMabo, ctaLabel, jM21425getFg0d7_KjU, jM21372getBg20d7_KjU, modifierM5143paddingVpY3zN4, size242, (Function0) objRememberedValue, null, composerStartRestartGroup, BentoIcon4.Size24.$stable << 15, 128);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SupportHubComposableKt.AlertBanner$lambda$38(alertBanner, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AlertBanner$lambda$37$lambda$36(AlertBanner alertBanner, Function1 function1) {
        GetSupportAction ctaAction = alertBanner.getCtaAction();
        if (ctaAction != null) {
            function1.invoke(ctaAction);
        }
        return Unit.INSTANCE;
    }

    private static final void ScheduledAppointment(AppointmentCard appointmentCard, Function1<? super GetSupportAction, Unit> function1, boolean z, Composer composer, final int i) {
        int i2;
        final AppointmentCard appointmentCard2;
        final Function1<? super GetSupportAction, Unit> function12;
        Composer composer2;
        final boolean z2 = z;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1443372010);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(appointmentCard) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            appointmentCard2 = appointmentCard;
            function12 = function1;
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1443372010, i2, -1, "com.robinhood.android.support.supporthub.ScheduledAppointment (SupportHubComposable.kt:589)");
            }
            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Component component = new Component(Component.ComponentType.CARD, null, null, 6, null);
            UserInteractionEventData.Action action = UserInteractionEventData.Action.VIEW_DEEPLINK;
            int i3 = i2;
            CXIssue cXIssue = new CXIssue(null, null, null, null, null, null, null, null, null, 0, null, null, "support_hub_appointment", null, null, null, null, 0, null, false, appointmentCard.getId(), z2, null, 5238783, null);
            z2 = z2;
            UserInteractionEventDescriptor userInteractionEventDescriptorCopy$default = UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, action, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, cXIssue, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262145, -1, -1, -1, -1, -1, 16383, null), component, null, 35, null);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierTestTag = TestTag3.testTag(companion, "Appointment");
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5143paddingVpY3zN4(modifierTestTag, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM()), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
            boolean z3 = false;
            BentoText2.m20747BentoText38GnDrw(appointmentCard.getHeading(), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getDisplayCapsuleSmall(), composerStartRestartGroup, 48, 0, 8188);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(SizeKt.m5158heightInVpY3zN4$default(companion, C2002Dp.m7995constructorimpl(84), 0.0f, 2, null), 0.0f, 1, null), userInteractionEventDescriptorCopy$default, false, false, false, true, false, null, 108, null);
            RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8));
            long jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i4).m21371getBg0d7_KjU();
            BorderStroke borderStrokeM4886BorderStrokecXLIe8U = BorderStroke2.m4886BorderStrokecXLIe8U(PrimitiveResources_androidKt.dimensionResource(C39996R.dimen.support_hub_recommended_action_border, composerStartRestartGroup, 0), bentoTheme.getColors(composerStartRestartGroup, i4).m21373getBg30d7_KjU());
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            appointmentCard2 = appointmentCard;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(appointmentCard2);
            if ((i3 & 112) == 32) {
                z3 = true;
            }
            boolean z4 = z3 | zChangedInstance;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                function12 = function1;
                objRememberedValue = new Function0() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SupportHubComposableKt.ScheduledAppointment$lambda$41$lambda$40$lambda$39(appointmentCard2, function12);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                function12 = function1;
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            SurfaceKt.m5969Surfaceo_FOJdg((Function0) objRememberedValue, modifierAutoLogEvents$default, false, roundedCornerShapeM5327RoundedCornerShape0680j_4, jM21371getBg0d7_KjU, 0L, 0.0f, 0.0f, borderStrokeM4886BorderStrokecXLIe8U, null, ComposableLambda3.rememberComposableLambda(985061079, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$ScheduledAppointment$1$2
                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(985061079, i5, -1, "com.robinhood.android.support.supporthub.ScheduledAppointment.<anonymous>.<anonymous> (SupportHubComposable.kt:646)");
                    }
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(companion3, bentoTheme2.getSpacing(composer3, i6).m21590getDefaultD9Ej5fM());
                    AppointmentCard appointmentCard3 = appointmentCard2;
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Horizontal start = arrangement.getStart();
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, companion4.getTop(), composer3, 0);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierM5142padding3ABfNKs);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion5.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
                    ZonedDateTime zonedDateTimeAtZone = appointmentCard3.getStartTime().atZone(zoneIdSystemDefault);
                    ZonedDateTime zonedDateTimeAtZone2 = appointmentCard3.getEndTime().atZone(zoneIdSystemDefault);
                    Month month = zonedDateTimeAtZone.getMonth();
                    TextStyle textStyle = TextStyle.SHORT;
                    Locale locale = Locale.ENGLISH;
                    String displayName = month.getDisplayName(textStyle, locale);
                    int dayOfMonth = zonedDateTimeAtZone.getDayOfMonth();
                    DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("h:mm a", locale);
                    DateTimeFormatter dateTimeFormatterOfPattern2 = DateTimeFormatter.ofPattern("zz", locale);
                    String str = zonedDateTimeAtZone.format(dateTimeFormatterOfPattern);
                    String str2 = zonedDateTimeAtZone2.format(dateTimeFormatterOfPattern);
                    String string2 = zonedDateTimeAtZone.format(dateTimeFormatterOfPattern2);
                    if (string2.length() > 2) {
                        Intrinsics.checkNotNull(string2);
                        char cFirst = StringsKt.first(string2);
                        char cLast = StringsKt.last(string2);
                        StringBuilder sb = new StringBuilder();
                        sb.append(cFirst);
                        sb.append(cLast);
                        string2 = sb.toString();
                    }
                    String str3 = str + "-" + str2 + PlaceholderUtils.XXShortPlaceholderText + string2;
                    Modifier modifierM5176widthInVpY3zN4$default = SizeKt.m5176widthInVpY3zN4$default(PaddingKt.m5142padding3ABfNKs(Background3.m4872backgroundbw27NRU$default(companion3, bentoTheme2.getColors(composer3, i6).m21372getBg20d7_KjU(), null, 2, null), bentoTheme2.getSpacing(composer3, i6).m21593getSmallD9Ej5fM()), C2002Dp.m7995constructorimpl(32), 0.0f, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion4.getCenterHorizontally(), composer3, 48);
                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer3, modifierM5176widthInVpY3zN4$default);
                    Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor3);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion5.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    Intrinsics.checkNotNull(displayName);
                    androidx.compose.p011ui.text.TextStyle textS = bentoTheme2.getTypography(composer3, i6).getTextS();
                    TextOverflow.Companion companion6 = TextOverflow.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(displayName, null, null, null, null, null, null, companion6.m7959getEllipsisgIe3tQ8(), false, 0, 0, null, 0, textS, composer3, 12582912, 0, 8062);
                    BentoText2.m20747BentoText38GnDrw(String.valueOf(dayOfMonth), null, null, null, FontWeight.INSTANCE.getBold(), null, null, companion6.m7959getEllipsisgIe3tQ8(), false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i6).getTextL(), composer3, 12607488, 0, 8046);
                    composer3.endNode();
                    Modifier modifierM5142padding3ABfNKs2 = PaddingKt.m5142padding3ABfNKs(companion3, bentoTheme2.getSpacing(composer3, i6).m21593getSmallD9Ej5fM());
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), composer3, 0);
                    int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer3, modifierM5142padding3ABfNKs2);
                    Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor4);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy3, companion5.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion5.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion5.getSetModifier());
                    BentoText2.m20747BentoText38GnDrw(appointmentCard3.getTitle(), null, null, null, null, null, null, companion6.m7959getEllipsisgIe3tQ8(), false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i6).getTextM(), composer3, 12582912, 0, 8062);
                    BentoText2.m20747BentoText38GnDrw(str3, null, Color.m6701boximpl(bentoTheme2.getColors(composer3, i6).m21426getFg20d7_KjU()), null, null, null, null, companion6.m7959getEllipsisgIe3tQ8(), false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i6).getTextS(), composer3, 12582912, 0, 8058);
                    composer3.endNode();
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composer2, 0, 6, 740);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SupportHubComposableKt.ScheduledAppointment$lambda$42(appointmentCard2, function12, z2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScheduledAppointment$lambda$41$lambda$40$lambda$39(AppointmentCard appointmentCard, Function1 function1) {
        GetSupportAction action = appointmentCard.getAction();
        if (action == null) {
            return Unit.INSTANCE;
        }
        function1.invoke(action);
        return Unit.INSTANCE;
    }

    private static final void AssignedAgent(AssignedAgent assignedAgent, Function1<? super GetSupportAction, Unit> function1, final boolean z, Composer composer, final int i) {
        int i2;
        final AssignedAgent assignedAgent2;
        final Function1<? super GetSupportAction, Unit> function12;
        Composer composerStartRestartGroup = composer.startRestartGroup(580457445);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(assignedAgent) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            assignedAgent2 = assignedAgent;
            function12 = function1;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(580457445, i2, -1, "com.robinhood.android.support.supporthub.AssignedAgent (SupportHubComposable.kt:725)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierTestTag = TestTag3.testTag(companion, "AssignedAgent");
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5143paddingVpY3zN4(modifierTestTag, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM()), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
            BentoText2.m20747BentoText38GnDrw(assignedAgent.getHeading(), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleSmall(), composerStartRestartGroup, 48, 0, 8188);
            composerStartRestartGroup = composerStartRestartGroup;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
            assignedAgent2 = assignedAgent;
            function12 = function1;
            SurfaceKt.m5967SurfaceT9BRK9s(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8)), bentoTheme.getColors(composerStartRestartGroup, i3).m21371getBg0d7_KjU(), 0L, 0.0f, 0.0f, BorderStroke2.m4886BorderStrokecXLIe8U(PrimitiveResources_androidKt.dimensionResource(C39996R.dimen.support_hub_recommended_action_border, composerStartRestartGroup, 0), bentoTheme.getColors(composerStartRestartGroup, i3).m21373getBg30d7_KjU()), ComposableLambda3.rememberComposableLambda(-1091819596, true, new SupportHubComposableKt$AssignedAgent$1$1(assignedAgent2, function12), composerStartRestartGroup, 54), composerStartRestartGroup, 12582918, 56);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SupportHubComposableKt.AssignedAgent$lambda$44(assignedAgent2, function12, z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void RecommendationActions(final RecommendedActions recommendedActions, final Function1<? super GetSupportAction, Unit> function1, final boolean z, Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2143383415);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(recommendedActions) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2143383415, i2, -1, "com.robinhood.android.support.supporthub.RecommendationActions (SupportHubComposable.kt:849)");
            }
            if (recommendedActions.getActions().isEmpty()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SupportHubComposableKt.RecommendationActions$lambda$45(recommendedActions, function1, z, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierTestTag = TestTag3.testTag(companion, "RecommendedActions");
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5143paddingVpY3zN4(modifierTestTag, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM()), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            int i4 = 1;
            String heading = recommendedActions.getHeading();
            androidx.compose.p011ui.text.TextStyle displayCapsuleSmall = bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleSmall();
            Object obj = null;
            int i5 = 0;
            BentoText2.m20747BentoText38GnDrw(heading, modifierFillMaxWidth$default2, null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleSmall, composerStartRestartGroup, 48, 0, 8188);
            Composer composer3 = composerStartRestartGroup;
            composer3.startReplaceGroup(1284036474);
            for (final RecommendationCard recommendationCard : recommendedActions.getActions()) {
                Modifier.Companion companion3 = Modifier.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme2.getSpacing(composer3, i6).m21590getDefaultD9Ej5fM()), composer3, i5);
                final float fM7995constructorimpl = C2002Dp.m7995constructorimpl(156);
                int i7 = i5;
                i4 = 1;
                Composer composer4 = composer3;
                SurfaceKt.m5967SurfaceT9BRK9s(autoLogActionEvents(SizeKt.fillMaxWidth$default(companion3, 0.0f, i4, obj), recommendationCard.getId(), z, recommendationCard.getCtaAction(), Component.ComponentType.CARD, false, true), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8)), bentoTheme2.getColors(composer3, i6).m21371getBg0d7_KjU(), 0L, 0.0f, 0.0f, BorderStroke2.m4886BorderStrokecXLIe8U(PrimitiveResources_androidKt.dimensionResource(C39996R.dimen.support_hub_recommended_action_border, composer3, i7), bentoTheme2.getColors(composer3, i6).m21373getBg30d7_KjU()), ComposableLambda3.rememberComposableLambda(-963039300, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$RecommendationActions$2$1
                    public final void invoke(Composer composer5, int i8) {
                        final ConstraintSetForInlineDsl constraintSetForInlineDsl;
                        final SnapshotState snapshotState;
                        if ((i8 & 3) == 2 && composer5.getSkipping()) {
                            composer5.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-963039300, i8, -1, "com.robinhood.android.support.supporthub.RecommendationActions.<anonymous>.<anonymous> (SupportHubComposable.kt:893)");
                        }
                        Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(SizeKt.m5158heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), fM7995constructorimpl, 0.0f, 2, null), BentoTheme.INSTANCE.getSpacing(composer5, BentoTheme.$stable).m21590getDefaultD9Ej5fM());
                        final RecommendationCard recommendationCard2 = recommendationCard;
                        final boolean z2 = z;
                        final Function1<GetSupportAction, Unit> function12 = function1;
                        composer5.startReplaceGroup(-1003410150);
                        composer5.startReplaceGroup(212064437);
                        composer5.endReplaceGroup();
                        Density density = (Density) composer5.consume(CompositionLocalsKt.getLocalDensity());
                        Object objRememberedValue = composer5.rememberedValue();
                        Composer.Companion companion4 = Composer.INSTANCE;
                        if (objRememberedValue == companion4.getEmpty()) {
                            objRememberedValue = new Measurer2(density);
                            composer5.updateRememberedValue(objRememberedValue);
                        }
                        final Measurer2 measurer2 = (Measurer2) objRememberedValue;
                        Object objRememberedValue2 = composer5.rememberedValue();
                        if (objRememberedValue2 == companion4.getEmpty()) {
                            objRememberedValue2 = new ConstraintLayoutScope();
                            composer5.updateRememberedValue(objRememberedValue2);
                        }
                        final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
                        Object objRememberedValue3 = composer5.rememberedValue();
                        if (objRememberedValue3 == companion4.getEmpty()) {
                            objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composer5.updateRememberedValue(objRememberedValue3);
                        }
                        final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue3;
                        Object objRememberedValue4 = composer5.rememberedValue();
                        if (objRememberedValue4 == companion4.getEmpty()) {
                            objRememberedValue4 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                            composer5.updateRememberedValue(objRememberedValue4);
                        }
                        final ConstraintSetForInlineDsl constraintSetForInlineDsl2 = (ConstraintSetForInlineDsl) objRememberedValue4;
                        Object objRememberedValue5 = composer5.rememberedValue();
                        if (objRememberedValue5 == companion4.getEmpty()) {
                            objRememberedValue5 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                            composer5.updateRememberedValue(objRememberedValue5);
                        }
                        final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue5;
                        boolean zChangedInstance = composer5.changedInstance(measurer2);
                        final int i9 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                        boolean zChanged = zChangedInstance | composer5.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                        Object objRememberedValue6 = composer5.rememberedValue();
                        if (zChanged || objRememberedValue6 == companion4.getEmpty()) {
                            Object obj2 = new MeasurePolicy() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$RecommendationActions$2$1$invoke$$inlined$ConstraintLayout$2
                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
                                    return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i10);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
                                    return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i10);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
                                    return super.minIntrinsicHeight(intrinsicMeasureScope, list, i10);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
                                    return super.minIntrinsicWidth(intrinsicMeasureScope, list, i10);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                /* renamed from: measure-3p2s80s */
                                public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                                    final LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    snapshotState3.getValue();
                                    long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl2, list, linkedHashMap, i9);
                                    snapshotState2.getValue();
                                    int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                                    int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                                    final Measurer2 measurer22 = measurer2;
                                    return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$RecommendationActions$2$1$invoke$$inlined$ConstraintLayout$2.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                            invoke2(placementScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(Placeable.PlacementScope placementScope) {
                                            measurer22.performLayout(placementScope, list, linkedHashMap);
                                        }
                                    }, 4, null);
                                }
                            };
                            constraintSetForInlineDsl = constraintSetForInlineDsl2;
                            snapshotState = snapshotState2;
                            composer5.updateRememberedValue(obj2);
                            objRememberedValue6 = obj2;
                        } else {
                            constraintSetForInlineDsl = constraintSetForInlineDsl2;
                            snapshotState = snapshotState2;
                        }
                        MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue6;
                        Object objRememberedValue7 = composer5.rememberedValue();
                        if (objRememberedValue7 == companion4.getEmpty()) {
                            objRememberedValue7 = new Function0<Unit>() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$RecommendationActions$2$1$invoke$$inlined$ConstraintLayout$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    snapshotState.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                                    constraintSetForInlineDsl.setKnownDirty(true);
                                }
                            };
                            composer5.updateRememberedValue(objRememberedValue7);
                        }
                        final Function0 function0 = (Function0) objRememberedValue7;
                        boolean zChangedInstance2 = composer5.changedInstance(measurer2);
                        Object objRememberedValue8 = composer5.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue8 == companion4.getEmpty()) {
                            objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$RecommendationActions$2$1$invoke$$inlined$ConstraintLayout$4
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                                }
                            };
                            composer5.updateRememberedValue(objRememberedValue8);
                        }
                        LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierM5142padding3ABfNKs, false, (Function1) objRememberedValue8, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$RecommendationActions$2$1$invoke$$inlined$ConstraintLayout$5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                invoke(composer6, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer6, int i10) {
                                if ((i10 & 3) == 2 && composer6.getSkipping()) {
                                    composer6.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1200550679, i10, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                                }
                                snapshotState3.setValue(Unit.INSTANCE);
                                int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                                constraintLayoutScope.reset();
                                ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                                composer6.startReplaceGroup(1261969824);
                                ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                                Modifier.Companion companion5 = Modifier.INSTANCE;
                                composer6.startReplaceGroup(-1633490746);
                                boolean zChanged2 = composer6.changed(constraintLayoutBaseScope4Component3) | composer6.changed(constraintLayoutBaseScope4Component2);
                                Object objRememberedValue9 = composer6.rememberedValue();
                                if (zChanged2 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue9 = new SupportHubComposableKt$RecommendationActions$2$1$1$1$1(constraintLayoutBaseScope4Component3, constraintLayoutBaseScope4Component2);
                                    composer6.updateRememberedValue(objRememberedValue9);
                                }
                                composer6.endReplaceGroup();
                                Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(companion5, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue9);
                                String content = recommendationCard2.getContent();
                                BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                                int i11 = BentoTheme.$stable;
                                BentoText2.m20747BentoText38GnDrw(content, modifierConstrainAs, null, null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 0, 0, null, 0, bentoTheme3.getTypography(composer6, i11).getTextL(), composer6, 12582912, 0, 8060);
                                composer6.startReplaceGroup(5004770);
                                boolean zChanged3 = composer6.changed(constraintLayoutBaseScope4Component1);
                                Object objRememberedValue10 = composer6.rememberedValue();
                                if (zChanged3 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue10 = new SupportHubComposableKt$RecommendationActions$2$1$1$2$1(constraintLayoutBaseScope4Component1);
                                    composer6.updateRememberedValue(objRememberedValue10);
                                }
                                composer6.endReplaceGroup();
                                Modifier modifierAutoLogActionEvents = SupportHubComposableKt.autoLogActionEvents(PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope2.constrainAs(companion5, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue10), 0.0f, bentoTheme3.getSpacing(composer6, i11).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), recommendationCard2.getId(), z2, recommendationCard2.getCtaAction(), Component.ComponentType.CARD, true, false);
                                String ctaLabel = recommendationCard2.getCtaLabel();
                                BentoTextButton3.Icon.Size12 size12 = new BentoTextButton3.Icon.Size12(ServerToBentoAssetMapper2.ARROW_RIGHT_12, BentoTextButton3.Icon.Position.Trailing);
                                composer6.startReplaceGroup(-1633490746);
                                boolean zChanged4 = composer6.changed(function12) | composer6.changedInstance(recommendationCard2);
                                Object objRememberedValue11 = composer6.rememberedValue();
                                if (zChanged4 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue11 = new SupportHubComposableKt$RecommendationActions$2$1$1$3$1(function12, recommendationCard2);
                                    composer6.updateRememberedValue(objRememberedValue11);
                                }
                                composer6.endReplaceGroup();
                                BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue11, ctaLabel, modifierAutoLogActionEvents, size12, null, false, null, composer6, BentoTextButton3.Icon.Size12.$stable << 9, 112);
                                Modifier modifierTestTag2 = TestTag3.testTag(companion5, "RecommendationCardImage");
                                composer6.startReplaceGroup(-1633490746);
                                boolean zChanged5 = composer6.changed(constraintLayoutBaseScope4Component1) | composer6.changedInstance(recommendationCard2);
                                Object objRememberedValue12 = composer6.rememberedValue();
                                if (zChanged5 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue12 = new SupportHubComposableKt$RecommendationActions$2$1$1$4$1(constraintLayoutBaseScope4Component1, recommendationCard2);
                                    composer6.updateRememberedValue(objRememberedValue12);
                                }
                                composer6.endReplaceGroup();
                                Modifier modifierM5142padding3ABfNKs2 = PaddingKt.m5142padding3ABfNKs(constraintLayoutScope2.constrainAs(modifierTestTag2, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue12), PrimitiveResources_androidKt.dimensionResource(C39996R.dimen.support_hub_recommended_action_border, composer6, 0));
                                String dark = null;
                                if (bentoTheme3.getColors(composer6, i11).getIsDay()) {
                                    ThemedUrl imgUrl = recommendationCard2.getImgUrl();
                                    if (imgUrl != null) {
                                        dark = imgUrl.getLight();
                                    }
                                } else {
                                    ThemedUrl imgUrl2 = recommendationCard2.getImgUrl();
                                    if (imgUrl2 != null) {
                                        dark = imgUrl2.getDark();
                                    }
                                }
                                SingletonAsyncImage.m9118AsyncImageVb_qNX0(dark, null, modifierM5142padding3ABfNKs2, SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(C39996R.drawable.image_oval_placeholder), null, null, null, 0, null, composer6, 0, 62), null, SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(C39996R.drawable.image_oval_placeholder), null, null, null, 0, null, composer6, 0, 62), null, null, null, Alignment.INSTANCE.getCenter(), ContentScale.INSTANCE.getFit(), 0.0f, null, 0, false, null, composer6, 805306416, 6, 63952);
                                constraintLayoutScope2.createVerticalChain(new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component1, constraintLayoutBaseScope4Component2}, ConstraintLayoutBaseScope3.INSTANCE.getSpreadInside());
                                composer6.endReplaceGroup();
                                if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                                    EffectsKt.SideEffect(function0, composer6, 6);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer5, 54), measurePolicy, composer5, 48, 0);
                        composer5.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                        invoke(composer5, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composer3, 54), composer4, 12582912, 56);
                i5 = i7;
                composer3 = composer4;
                obj = obj;
            }
            composer2 = composer3;
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return SupportHubComposableKt.RecommendationActions$lambda$47(recommendedActions, function1, z, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a8 A[LOOP:0: B:72:0x01a2->B:74:0x01a8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void SupportSections(final SupportSection supportSection, final Function1<? super GetSupportAction, Unit> function1, final boolean z, Integer num, Composer composer, final int i, final int i2) {
        SupportSection supportSection2;
        int i3;
        int i4;
        Integer num2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Iterator<T> it;
        final Integer num3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1203756757);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            supportSection2 = supportSection;
        } else if ((i & 6) == 0) {
            supportSection2 = supportSection;
            i3 = (composerStartRestartGroup.changedInstance(supportSection2) ? 4 : 2) | i;
        } else {
            supportSection2 = supportSection;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
                }
                i4 = i2 & 8;
                if (i4 == 0) {
                    if ((i & 3072) == 0) {
                        num2 = num;
                        i3 |= composerStartRestartGroup.changed(num2) ? 2048 : 1024;
                    }
                    if ((i3 & 1171) != 1170 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        num3 = num2;
                    } else {
                        Integer num4 = i4 == 0 ? null : num2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1203756757, i3, -1, "com.robinhood.android.support.supporthub.SupportSections (SupportHubComposable.kt:984)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
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
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i5 = BentoTheme.$stable;
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                        BentoText2.m20747BentoText38GnDrw(supportSection2.getHeading(), SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8188);
                        composerStartRestartGroup = composerStartRestartGroup;
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceGroup(-293518472);
                        it = supportSection.getRows().iterator();
                        while (it.hasNext()) {
                            SupportRow((SupportRow) it.next(), function1, z, null, false, false, num4, composerStartRestartGroup, (i3 & 1008) | ((i3 << 9) & 3670016), 56);
                        }
                        Integer num5 = num4;
                        composerStartRestartGroup.endReplaceGroup();
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        num3 = num5;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return SupportHubComposableKt.SupportSections$lambda$50(supportSection, function1, z, num3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                num2 = num;
                if ((i3 & 1171) != 1170) {
                    if (i4 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i52 = BentoTheme.$stable;
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                        BentoText2.m20747BentoText38GnDrw(supportSection2.getHeading(), SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(companion3, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8188);
                        composerStartRestartGroup = composerStartRestartGroup;
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceGroup(-293518472);
                        it = supportSection.getRows().iterator();
                        while (it.hasNext()) {
                        }
                        Integer num52 = num4;
                        composerStartRestartGroup.endReplaceGroup();
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        num3 = num52;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i4 = i2 & 8;
            if (i4 == 0) {
            }
            num2 = num;
            if ((i3 & 1171) != 1170) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        num2 = num;
        if ((i3 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0107  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List, kotlin.jvm.internal.DefaultConstructorMarker] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void SupportRow(SupportRow supportRow, final Function1<? super GetSupportAction, Unit> function1, final boolean z, Modifier modifier, boolean z2, boolean z3, Integer num, Composer composer, final int i, final int i2) {
        SupportRow supportRow2;
        int i3;
        Modifier modifier2;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        final Integer num2;
        final GetSupportAction action;
        boolean zAreEqual;
        ?? r4;
        Modifier modifierAutoLogActionEvents;
        Modifier modifier3;
        String secondaryLabel;
        AnnotatedString annotatedString;
        ServerToBentoAssetMapper2 leadingIcon;
        AnnotatedString annotatedString2;
        BentoBaseRowState.Start.Icon icon;
        boolean zChangedInstance;
        Object objRememberedValue;
        Composer composer2;
        final boolean z6;
        final boolean z7;
        final Modifier modifier4;
        Uri uri;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-868516661);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            supportRow2 = supportRow;
        } else if ((i & 6) == 0) {
            supportRow2 = supportRow;
            i3 = (composerStartRestartGroup.changedInstance(supportRow2) ? 4 : 2) | i;
        } else {
            supportRow2 = supportRow;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    z4 = z2;
                    i3 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 == 0) {
                    if ((196608 & i) == 0) {
                        z5 = z3;
                        i3 |= composerStartRestartGroup.changed(z5) ? 131072 : 65536;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                        num2 = num;
                    } else {
                        num2 = num;
                        if ((i & 1572864) == 0) {
                            i3 |= composerStartRestartGroup.changed(num2) ? 1048576 : 524288;
                        }
                    }
                    if ((i3 & 599187) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier5 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                        boolean z8 = i4 == 0 ? false : z4;
                        boolean z9 = i5 == 0 ? true : z5;
                        if (i6 != 0) {
                            num2 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-868516661, i3, -1, "com.robinhood.android.support.supporthub.SupportRow (SupportHubComposable.kt:1022)");
                        }
                        action = supportRow2.getAction();
                        GetSupportAction.Deeplink deeplink = !(action instanceof GetSupportAction.Deeplink) ? (GetSupportAction.Deeplink) action : null;
                        zAreEqual = Intrinsics.areEqual((deeplink != null || (uri = deeplink.getUri()) == null) ? null : uri.toString(), PRIORITY_SUPPORT);
                        composerStartRestartGroup.startReplaceGroup(-1420840318);
                        if (!zAreEqual) {
                            r4 = 0;
                            Modifier modifier6 = modifier5;
                            modifierAutoLogActionEvents = ModifiersKt.autoLogEvents$default(modifier6, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.CONTACT_SUPPORT, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, new CXIssue(null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, num2 != null ? num2.intValue() : 0, null, false, null, z, null, 6160383, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262145, -1, -1, -1, -1, -1, 16383, null), new Component(Component.ComponentType.ROW, null, null, 6, null), null, 35, null), false, false, false, true, false, null, 108, null);
                            modifier3 = modifier6;
                            action = action;
                        } else {
                            Modifier modifier7 = modifier5;
                            r4 = 0;
                            modifierAutoLogActionEvents = autoLogActionEvents(modifier7, supportRow2.getId(), z, action, Component.ComponentType.ROW, true, false);
                            modifier3 = modifier7;
                        }
                        Modifier modifier8 = modifierAutoLogActionEvents;
                        composerStartRestartGroup.endReplaceGroup();
                        AnnotatedString annotatedString3 = new AnnotatedString(supportRow2.getPrimaryLabel(), r4, 2, r4);
                        secondaryLabel = supportRow2.getSecondaryLabel();
                        composerStartRestartGroup.startReplaceGroup(-1420806403);
                        if (secondaryLabel != null) {
                            annotatedString = r4;
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-1420805607);
                            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, r4);
                            ThemedColor secondaryLabelColor = supportRow2.getSecondaryLabelColor();
                            composerStartRestartGroup.startReplaceGroup(-1420803525);
                            Color composeColor = secondaryLabelColor == null ? null : SduiColors2.toComposeColor(secondaryLabelColor, composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceGroup();
                            if (composeColor == null) {
                                builder.append(secondaryLabel);
                            } else {
                                int iPushStyle = builder.pushStyle(new SpanStyle(composeColor.getValue(), 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65530, (DefaultConstructorMarker) null));
                                try {
                                    builder.append(secondaryLabel);
                                    Unit unit = Unit.INSTANCE;
                                } finally {
                                    builder.pop(iPushStyle);
                                }
                            }
                            annotatedString = builder.toAnnotatedString();
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        leadingIcon = supportRow2.getLeadingIcon();
                        if (leadingIcon == null) {
                            annotatedString2 = annotatedString;
                            icon = new BentoBaseRowState.Start.Icon(leadingIcon, null, null, 6, null);
                        } else {
                            annotatedString2 = annotatedString;
                            icon = null;
                        }
                        ServerToBentoAssetMapper2 trailingIcon = supportRow2.getTrailingIcon();
                        BentoBaseRowState.Meta.Icon icon2 = trailingIcon == null ? new BentoBaseRowState.Meta.Icon(trailingIcon, "", (Color) null, (Function0) null, 12, (DefaultConstructorMarker) null) : null;
                        boolean z10 = !supportRow2.isDisabled();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        zChangedInstance = ((i3 & 112) == 32) | composerStartRestartGroup.changedInstance(action);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$$ExternalSyntheticLambda11
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SupportHubComposableKt.SupportRow$lambda$57$lambda$56(function1, action);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composer2 = composerStartRestartGroup;
                        boolean z11 = z8;
                        boolean z12 = z9;
                        BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(modifier8, icon, annotatedString3, annotatedString2, null, icon2, null, z12, false, z11, z10, false, 0L, (Function0) objRememberedValue, composer2, (BentoBaseRowState.Start.Icon.$stable << 3) | (BentoBaseRowState.Meta.Icon.$stable << 15) | (29360128 & (i3 << 6)) | ((i3 << 15) & 1879048192), 0, 6480);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z6 = z12;
                        z7 = z11;
                        modifier4 = modifier3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        modifier4 = modifier2;
                        z7 = z4;
                        z6 = z5;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final SupportRow supportRow3 = supportRow2;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return SupportHubComposableKt.SupportRow$lambda$58(supportRow3, function1, z, modifier4, z7, z6, num2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                z5 = z3;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((i3 & 599187) == 599186) {
                    if (i7 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    action = supportRow2.getAction();
                    if (!(action instanceof GetSupportAction.Deeplink)) {
                    }
                    if (deeplink != null) {
                        zAreEqual = Intrinsics.areEqual((deeplink != null || (uri = deeplink.getUri()) == null) ? null : uri.toString(), PRIORITY_SUPPORT);
                        composerStartRestartGroup.startReplaceGroup(-1420840318);
                        if (!zAreEqual) {
                        }
                        Modifier modifier82 = modifierAutoLogActionEvents;
                        composerStartRestartGroup.endReplaceGroup();
                        AnnotatedString annotatedString32 = new AnnotatedString(supportRow2.getPrimaryLabel(), r4, 2, r4);
                        secondaryLabel = supportRow2.getSecondaryLabel();
                        composerStartRestartGroup.startReplaceGroup(-1420806403);
                        if (secondaryLabel != null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        leadingIcon = supportRow2.getLeadingIcon();
                        if (leadingIcon == null) {
                        }
                        ServerToBentoAssetMapper2 trailingIcon2 = supportRow2.getTrailingIcon();
                        if (trailingIcon2 == null) {
                        }
                        boolean z102 = !supportRow2.isDisabled();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        zChangedInstance = ((i3 & 112) == 32) | composerStartRestartGroup.changedInstance(action);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$$ExternalSyntheticLambda11
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SupportHubComposableKt.SupportRow$lambda$57$lambda$56(function1, action);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            composerStartRestartGroup.endReplaceGroup();
                            composer2 = composerStartRestartGroup;
                            boolean z112 = z8;
                            boolean z122 = z9;
                            BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(modifier82, icon, annotatedString32, annotatedString2, null, icon2, null, z122, false, z112, z102, false, 0L, (Function0) objRememberedValue, composer2, (BentoBaseRowState.Start.Icon.$stable << 3) | (BentoBaseRowState.Meta.Icon.$stable << 15) | (29360128 & (i3 << 6)) | ((i3 << 15) & 1879048192), 0, 6480);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            z6 = z122;
                            z7 = z112;
                            modifier4 = modifier3;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z4 = z2;
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            z5 = z3;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((i3 & 599187) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z4 = z2;
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        z5 = z3;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((i3 & 599187) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SupportRow$lambda$57$lambda$56(Function1 function1, GetSupportAction getSupportAction) {
        function1.invoke(getSupportAction);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BottomSheetMenu(final SupportHubViewState.BottomSheetData.Menu menu, final Function1<? super GetSupportAction, Unit> function1, final Function0<Unit> function0, final boolean z, Composer composer, final int i) {
        SupportHubViewState.BottomSheetData.Menu menu2;
        int i2;
        int iM7919getCentere0LSkKk;
        PaddingValues paddingValuesM5135PaddingValues0680j_4;
        int i3;
        int i4;
        float f;
        Modifier.Companion companion;
        String string2;
        boolean z2 = z;
        Composer composerStartRestartGroup = composer.startRestartGroup(1893865167);
        if ((i & 6) == 0) {
            menu2 = menu;
            i2 = (composerStartRestartGroup.changedInstance(menu2) ? 4 : 2) | i;
        } else {
            menu2 = menu;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1893865167, i2, -1, "com.robinhood.android.support.supporthub.BottomSheetMenu (SupportHubComposable.kt:1095)");
            }
            if (z2) {
                iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7924getStarte0LSkKk();
            } else {
                iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
            }
            String subtitle = menu2.getSubtitle();
            if (subtitle != null && !StringsKt.isBlank(subtitle)) {
                composerStartRestartGroup.startReplaceGroup(1447162804);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                paddingValuesM5135PaddingValues0680j_4 = PaddingKt.m5138PaddingValuesa9UjIt4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM());
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1447384981);
                paddingValuesM5135PaddingValues0680j_4 = PaddingKt.m5135PaddingValues0680j_4(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM());
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(ScrollKt.verticalScroll$default(TestTag3.testTag(companion2, "BottomSheet"), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            int i6 = i2;
            String title = menu2.getTitle();
            composerStartRestartGroup.startReplaceGroup(1716868591);
            if (title == null) {
                i3 = i6;
                companion = companion2;
                f = 0.0f;
                i4 = 1;
            } else {
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(PaddingKt.padding(TestTag3.testTag(companion2, "BottomSheetTitle"), paddingValuesM5135PaddingValues0680j_4), 0.0f, 1, null);
                androidx.compose.p011ui.text.TextStyle displayCapsuleSmall = BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getDisplayCapsuleSmall();
                TextAlign textAlignM7912boximpl = TextAlign.m7912boximpl(iM7919getCentere0LSkKk);
                i3 = i6;
                i4 = 1;
                f = 0.0f;
                companion = companion2;
                BentoText2.m20747BentoText38GnDrw(title, modifierFillMaxWidth$default2, null, null, null, null, textAlignM7912boximpl, 0, false, 0, 0, null, 0, displayCapsuleSmall, composerStartRestartGroup, 0, 0, 8124);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            composerStartRestartGroup.endReplaceGroup();
            String subtitle2 = menu.getSubtitle();
            composerStartRestartGroup.startReplaceGroup(1716882690);
            if (subtitle2 != null) {
                Modifier modifierTestTag = TestTag3.testTag(companion, "BottomSheetSubtitle");
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i7 = BentoTheme.$stable;
                Composer composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(subtitle2, SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(modifierTestTag, bentoTheme2.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), 6, null), f, i4, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i7).getTextM(), composer2, 0, 0, 8124);
                composerStartRestartGroup = composer2;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1716898478);
            for (SupportRow supportRow : menu.getRows()) {
                GetSupportAction action = supportRow.getAction();
                if (action instanceof GetSupportAction.Deeplink) {
                    string2 = ((GetSupportAction.Deeplink) action).getUri().toString();
                } else {
                    string2 = action instanceof GetSupportAction.Sms ? ((GetSupportAction.Sms) action).getUri().toString() : null;
                }
                Modifier modifierLogSelectSupportChannelIfConcierge = logSelectSupportChannelIfConcierge(Modifier.INSTANCE, z2, supportRow.getId(), string2);
                int i8 = i3;
                SupportRow(supportRow, function1, z2, modifierLogSelectSupportChannelIfConcierge, false, false, null, composerStartRestartGroup, (i8 & 112) | ((i8 >> 3) & 896), 112);
                z2 = z;
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierTestTag2 = TestTag3.testTag(Modifier.INSTANCE, "BottomSheetDismissCta");
            BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
            int i9 = BentoTheme.$stable;
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(PaddingKt.m5143paddingVpY3zN4(modifierTestTag2, bentoTheme3.getSpacing(composerStartRestartGroup, i9).m21592getMediumD9Ej5fM(), bentoTheme3.getSpacing(composerStartRestartGroup, i9).m21590getDefaultD9Ej5fM()), f, i4, null);
            String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_close, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(5004770);
            int i10 = (i3 & 896) == 256 ? i4 : 0;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i10 != 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SupportHubComposableKt.BottomSheetMenu$lambda$64$lambda$63$lambda$62(function0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Composer composer3 = composerStartRestartGroup;
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierFillMaxWidth$default3, null, null, false, false, null, null, null, null, false, null, composer3, 0, 0, 8184);
            composerStartRestartGroup = composer3;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SupportHubComposableKt.BottomSheetMenu$lambda$65(menu, function1, function0, z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomSheetMenu$lambda$64$lambda$63$lambda$62(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final void Dialog(final SupportHubDuxo supportHubDuxo, final SupportHubViewState.DialogData dialogData, Composer composer, final int i) {
        int i2;
        String strStringResource;
        String strStringResource2;
        String strStringResource3;
        BentoAlertButton bentoAlertButton;
        Composer composerStartRestartGroup = composer.startRestartGroup(-558841432);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(supportHubDuxo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(dialogData) : composerStartRestartGroup.changedInstance(dialogData) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-558841432, i2, -1, "com.robinhood.android.support.supporthub.Dialog (SupportHubComposable.kt:1183)");
            }
            if (dialogData instanceof SupportHubViewState.DialogData.Error) {
                final boolean z = ((SupportHubViewState.DialogData.Error) dialogData).getKind() == SupportHubViewState.DialogData.Kind.CHANNEL_AVAILABILITY;
                if (z) {
                    composerStartRestartGroup.startReplaceGroup(-1151519143);
                    strStringResource = StringResources_androidKt.stringResource(C39996R.string.concierge_onboarding_error_title, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1151417184);
                    strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_error_title, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (z) {
                    composerStartRestartGroup.startReplaceGroup(-1151231897);
                    strStringResource2 = StringResources_androidKt.stringResource(C39996R.string.concierge_channel_availability_error_title, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1151112330);
                    strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_error_summary, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(strStringResource2);
                if (z) {
                    composerStartRestartGroup.startReplaceGroup(-1150901220);
                    strStringResource3 = StringResources_androidKt.stringResource(C11048R.string.error_try_again, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1150801865);
                    strStringResource3 = StringResources_androidKt.stringResource(C11048R.string.general_label_got_it, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChanged = composerStartRestartGroup.changed(z) | composerStartRestartGroup.changedInstance(supportHubDuxo);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SupportHubComposableKt.Dialog$lambda$67$lambda$66(z, supportHubDuxo);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoAlertButton bentoAlertButton2 = new BentoAlertButton(strStringResource3, (Function0) objRememberedValue);
                composerStartRestartGroup.startReplaceGroup(-175655129);
                if (z) {
                    String strStringResource4 = StringResources_androidKt.stringResource(C11048R.string.general_label_got_it, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(supportHubDuxo);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SupportHubComposableKt.Dialog$lambda$69$lambda$68(supportHubDuxo);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    bentoAlertButton = new BentoAlertButton(strStringResource4, (Function0) objRememberedValue2);
                } else {
                    bentoAlertButton = null;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(supportHubDuxo);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SupportHubComposableKt.Dialog$lambda$71$lambda$70(supportHubDuxo);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                Function0 function0 = (Function0) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                int i3 = BentoAlertDialog2.Body.Text.$stable << 3;
                int i4 = BentoAlertButton.$stable;
                BentoAlertDialog.BentoAlertDialog(strStringResource, text, bentoAlertButton2, null, bentoAlertButton, null, false, null, function0, composerStartRestartGroup, i3 | (i4 << 6) | (i4 << 12), EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SupportHubComposableKt.Dialog$lambda$72(supportHubDuxo, dialogData, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Dialog$lambda$67$lambda$66(boolean z, SupportHubDuxo supportHubDuxo) {
        if (z) {
            supportHubDuxo.closeDialog();
            supportHubDuxo.openPrioritySupport();
        } else {
            supportHubDuxo.closeDialog();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Dialog$lambda$69$lambda$68(SupportHubDuxo supportHubDuxo) {
        supportHubDuxo.closeDialog();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Dialog$lambda$71$lambda$70(SupportHubDuxo supportHubDuxo) {
        supportHubDuxo.closeDialog();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleAction(SupportHubDuxo supportHubDuxo, GetSupportAction getSupportAction, Context context, Navigator navigator) {
        if (getSupportAction instanceof GetSupportAction.Deeplink) {
            GetSupportAction.Deeplink deeplink = (GetSupportAction.Deeplink) getSupportAction;
            String string2 = deeplink.getUri().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            if (Intrinsics.areEqual(string2, PRIORITY_SUPPORT)) {
                supportHubDuxo.openPrioritySupport();
                return;
            } else {
                Navigator.DefaultImpls.handleDeepLink$default(navigator, context, deeplink.getUri(), null, null, false, null, 60, null);
                return;
            }
        }
        if (getSupportAction instanceof GetSupportAction.Sms) {
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(((GetSupportAction.Sms) getSupportAction).getUri());
            context.startActivity(intent);
        } else {
            if (!(getSupportAction instanceof GetSupportAction.Alert)) {
                throw new NoWhenBranchMatchedException();
            }
            supportHubDuxo.handleAlertAction((GetSupportAction.Alert) getSupportAction);
        }
    }

    private static final Modifier logSelectSupportChannelIfConcierge(Modifier modifier, boolean z, String str, String str2) {
        return z ? logSelectSupportChannel(modifier, str, str2, true) : modifier;
    }

    private static final Modifier logSelectSupportChannel(Modifier modifier, final String str, final String str2, final boolean z) {
        return ComposedModifier2.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt.logSelectSupportChannel.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier composed, Composer composer, int i) {
                UserInteractionEventDescriptor userInteractionEventDescriptorCopy$default;
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceGroup(1187284422);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1187284422, i, -1, "com.robinhood.android.support.supporthub.logSelectSupportChannel.<anonymous> (SupportHubComposable.kt:1277)");
                }
                String str3 = str2;
                if (str3 == null) {
                    userInteractionEventDescriptorCopy$default = null;
                } else {
                    String str4 = str;
                    boolean z2 = z;
                    userInteractionEventDescriptorCopy$default = UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.SELECT_SUPPORT_CHANNEL, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, new CXIssue(null, null, null, null, null, null, null, str3, null, 0, null, null, str4, null, null, null, null, 0, null, false, null, z2, null, 6287231, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262145, -1, -1, -1, -1, -1, 16383, null), new Component(Component.ComponentType.ROW, null, null, 6, null), null, 35, null);
                }
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(composed, userInteractionEventDescriptorCopy$default, false, false, false, true, false, null, 108, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierAutoLogEvents$default;
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier autoLogActionEvents(Modifier modifier, final String str, final boolean z, final GetSupportAction getSupportAction, final Component.ComponentType componentType, final boolean z2, final boolean z3) {
        return ComposedModifier2.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt.autoLogActionEvents.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier composed, Composer composer, int i) {
                UserInteractionEventDescriptor userInteractionEventDescriptorCopy$default;
                Modifier modifierAutoLogEvents$default;
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceGroup(665711949);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(665711949, i, -1, "com.robinhood.android.support.supporthub.autoLogActionEvents.<anonymous> (SupportHubComposable.kt:1306)");
                }
                GetSupportAction getSupportAction2 = getSupportAction;
                if (getSupportAction2 instanceof GetSupportAction.Alert) {
                    composer.startReplaceGroup(-1934219792);
                    composer.endReplaceGroup();
                    userInteractionEventDescriptorCopy$default = null;
                } else if (getSupportAction2 instanceof GetSupportAction.Sms) {
                    composer.startReplaceGroup(-1934162782);
                    UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    Component component = new Component(componentType, null, null, 6, null);
                    UserInteractionEventData.Action action = UserInteractionEventData.Action.VIEW_DEEPLINK;
                    String string2 = ((GetSupportAction.Sms) getSupportAction).getUri().toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    int i5 = 0;
                    String str2 = null;
                    String str3 = null;
                    userInteractionEventDescriptorCopy$default = UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, action, new com.robinhood.rosetta.eventlogging.Context(i2, i3, i4, null, null, null, null, null, i5, null, str2, null, null, str3, null, null, null, null, new CXIssue(null, null, null, null, null, null, null, string2, null, 0, null, null, str, null, null, null, null, 0, null, false, null, z, null, 6287231, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262145, -1, -1, -1, -1, -1, 16383, null), component, null, 35, null);
                    composer.endReplaceGroup();
                } else {
                    if (!(getSupportAction2 instanceof GetSupportAction.Deeplink)) {
                        composer.startReplaceGroup(-200942015);
                        composer.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer.startReplaceGroup(-1933594366);
                    UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    Component component2 = new Component(componentType, null, null, 6, null);
                    UserInteractionEventData.Action action2 = UserInteractionEventData.Action.VIEW_DEEPLINK;
                    String string3 = ((GetSupportAction.Deeplink) getSupportAction).getUri().toString();
                    Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                    int i6 = 0;
                    int i7 = 0;
                    int i8 = 0;
                    int i9 = 0;
                    String str4 = null;
                    String str5 = null;
                    userInteractionEventDescriptorCopy$default = UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, null, action2, new com.robinhood.rosetta.eventlogging.Context(i6, i7, i8, null, null, null, null, null, i9, null, str4, null, null, str5, null, null, null, null, new CXIssue(null, null, null, null, null, null, null, string3, null, 0, null, null, str, null, null, null, null, 0, null, false, null, z, null, 6287231, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262145, -1, -1, -1, -1, -1, 16383, null), component2, null, 35, null);
                    composer.endReplaceGroup();
                }
                UserInteractionEventDescriptor userInteractionEventDescriptor3 = userInteractionEventDescriptorCopy$default;
                if (userInteractionEventDescriptor3 == null || (modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(composed, userInteractionEventDescriptor3, z3, false, false, z2, false, null, 108, null)) == null) {
                    modifierAutoLogEvents$default = composed;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierAutoLogEvents$default;
            }
        }, 1, null);
    }
}
