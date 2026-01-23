package com.robinhood.android.pathfinder.corepages.supportlanding;

import android.os.Parcelable;
import androidx.compose.animation.SingleValueAnimation;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.TabKt;
import androidx.compose.material.TabPosition;
import androidx.compose.material.TabRowDefaults;
import androidx.compose.material.TabRowKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import coil.compose.LocalImageLoader;
import coil.compose.LocalImageLoader2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragmentHost;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiStateHandler2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiStateHandler3;
import com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingComposable5;
import com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingViewState;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoChip;
import com.robinhood.compose.bento.component.BentoPogKt;
import com.robinhood.compose.bento.component.BentoPogSize;
import com.robinhood.compose.bento.component.BentoProgressBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.CoilUtils2;
import com.robinhood.compose.theme.SduiColors;
import com.robinhood.compose.theme.SduiColors3;
import com.robinhood.models.p355ui.SupportLandingAccount;
import com.robinhood.models.p355ui.pathfinder.contexts.SupportLandingAccountTab;
import com.robinhood.models.serverdriven.experimental.api.AlertAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertMobilePresentationStyle;
import com.robinhood.models.serverdriven.experimental.api.PathfinderAction;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.utils.compose.arrangement.TopWithFooter;
import io.noties.markwon.Markwon;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SupportLandingComposable.kt */
@Metadata(m3635d1 = {"\u0000º\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001aý\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\t2$\u0010\u0011\u001a \u0012\u0004\u0012\u00020\u0013\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u00010\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\t2$\u0010\u001a\u001a \u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u001c0\u001b\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\tH\u0001¢\u0006\u0002\u0010\u001e\u001a\u009e\u0002\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\t2$\u0010\u0011\u001a \u0012\u0004\u0012\u00020\u0013\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u00010\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\t2$\u0010\u001a\u001a \u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u001c0\u001b\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2'\u0010 \u001a#\u0012\u0004\u0012\u00020!\u0012\u0013\u0012\u00110\n¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010\u0012H\u0001¢\u0006\u0002\u0010%\u001a\r\u0010&\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010'\u001aK\u0010(\u001a\u00020\u00012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010,\u001a\u00020-2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u0010.\u001a/\u0010/\u001a\u00020\u00012\u0006\u00100\u001a\u00020+2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\f2\u0006\u00104\u001a\u00020\fH\u0003¢\u0006\u0004\b5\u00106\u001a\u0088\u0002\u00107\u001a\u00020\u0001*\u0002082\b\u00100\u001a\u0004\u0018\u00010+2\b\u00109\u001a\u0004\u0018\u00010:2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010;\u001a\u0002022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\t2$\u0010\u0011\u001a \u0012\u0004\u0012\u00020\u0013\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u00010\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\t2$\u0010\u001a\u001a \u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u001c0\u001b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010<2'\u0010 \u001a#\u0012\u0004\u0012\u00020!\u0012\u0013\u0012\u00110\n¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010\u0012H\u0003¢\u0006\u0002\u0010=\u001aÒ\u0001\u0010>\u001a\u00020\u00012\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u0002022\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\t2$\u0010\u0011\u001a \u0012\u0004\u0012\u00020\u0013\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u00010\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010<2'\u0010 \u001a#\u0012\u0004\u0012\u00020!\u0012\u0013\u0012\u00110\n¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010\u0012H\u0003¢\u0006\u0002\u0010B\u001a*\u0010C\u001a\u00020\u0001*\u00020D2\u0006\u0010A\u001a\u0002022\u0006\u0010E\u001a\u00020\n2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010<H\u0002\u001a\u0013\u0010F\u001a\u0004\u0018\u00010\f*\u00020GH\u0003¢\u0006\u0002\u0010H\u001a\u0014\u0010Q\u001a\u00020\n*\u00020\n2\u0006\u0010R\u001a\u00020\nH\u0000\"\u000e\u0010I\u001a\u00020-X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010J\u001a\u00020-X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010K\u001a\u00020-X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010L\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010M\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010N\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010O\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010P\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000¨\u0006S²\u0006\u0012\u0010T\u001a\n\u0012\u0004\u0012\u00020V\u0018\u00010UX\u008a\u008e\u0002"}, m3636d2 = {"SupportLandingComposable", "", "viewState", "Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingViewState;", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "markwon", "Lio/noties/markwon/Markwon;", "onTabSelected", "Lkotlin/Function1;", "", "onTabBackgroundChanged", "Landroidx/compose/ui/graphics/Color;", "onDeeplink", "Lcom/robinhood/models/serverdriven/experimental/api/PathfinderAction$Deeplink;", "onUpdateBackend", "Lcom/robinhood/models/serverdriven/experimental/api/PathfinderAction$UpdateBackend;", "onSubmitForm", "Lkotlin/Function2;", "Lcom/robinhood/models/serverdriven/experimental/api/PathfinderAction$SubmitForm;", "", "", "onDismiss", "Lcom/robinhood/models/serverdriven/experimental/api/PathfinderAction$Dismiss;", "onBottomSheet", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragmentHost$SheetListener;", "onAccountChipSelected", "", "Lkotlin/Pair;", "onClickRetry", "(Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingViewState;Landroidx/fragment/app/FragmentManager;Lio/noties/markwon/Markwon;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "SupportLandingScreen", "showDialogFragment", "Landroidx/fragment/app/DialogFragment;", "Lkotlin/ParameterName;", "name", "tag", "(Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingViewState;Lio/noties/markwon/Markwon;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "SupportLandingScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "Tabs", "tabs", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/ui/pathfinder/contexts/SupportLandingAccountTab;", "selectedTabIndex", "", "(Lkotlinx/collections/immutable/ImmutableList;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "TabItem", "tab", "isSelected", "", "pictogramTint", "backgroundTint", "TabItem-9z6LAg8", "(Lcom/robinhood/models/ui/pathfinder/contexts/SupportLandingAccountTab;ZJJLandroidx/compose/runtime/Composer;I)V", "TabContentContainer", "Landroidx/compose/foundation/layout/ColumnScope;", "tabStatus", "Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingViewState$TabContentStatus;", "showInputUploadLoading", "Lkotlin/Function0;", "(Landroidx/compose/foundation/layout/ColumnScope;Lcom/robinhood/models/ui/pathfinder/contexts/SupportLandingAccountTab;Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingViewState$TabContentStatus;Lio/noties/markwon/Markwon;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Content", "account", "Lcom/robinhood/models/ui/SupportLandingAccount;", "showAccountDropdownChip", "(Lcom/robinhood/models/ui/SupportLandingAccount;ZLio/noties/markwon/Markwon;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "accountDropdownChip", "Landroidx/compose/foundation/lazy/LazyListScope;", "text", "toDayColor", "Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;", "(Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Color;", "TabEdgePadding", "TabHorizontalSpacing", "TabMinWidth", SupportLandingComposable5.SupportLandingTestTagTabBar, SupportLandingComposable5.SupportLandingTestTagTab, SupportLandingComposable5.SupportLandingTestTagContent, SupportLandingComposable5.SupportLandingTestTagAccountDropdownChip, SupportLandingComposable5.SupportLandingTestTagProgressBar, "withIdentifier", "identifier", "feature-pathfinder-core-pages_externalDebug", "alertState", "Lcom/robinhood/models/serverdriven/experimental/api/AlertAction;", "Lcom/robinhood/models/serverdriven/experimental/api/PathfinderAction;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class SupportLandingComposable5 {
    public static final String SupportLandingTestTagAccountDropdownChip = "SupportLandingTestTagAccountDropdownChip";
    public static final String SupportLandingTestTagContent = "SupportLandingTestTagContent";
    public static final String SupportLandingTestTagProgressBar = "SupportLandingTestTagProgressBar";
    public static final String SupportLandingTestTagTab = "SupportLandingTestTagTab";
    public static final String SupportLandingTestTagTabBar = "SupportLandingTestTagTabBar";
    private static final int TabEdgePadding = 12;
    private static final int TabHorizontalSpacing = 12;
    private static final int TabMinWidth = 80;

    /* compiled from: SupportLandingComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GenericAlertMobilePresentationStyle.values().length];
            try {
                iArr[GenericAlertMobilePresentationStyle.MODAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GenericAlertMobilePresentationStyle.BOTTOM_SHEET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$30(SupportLandingAccount supportLandingAccount, boolean z, Markwon markwon, Function1 function1, Function1 function12, Function2 function2, Function1 function13, Function1 function14, Function0 function0, Function2 function22, int i, Composer composer, int i2) {
        Content(supportLandingAccount, z, markwon, function1, function12, function2, function13, function14, function0, function22, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SupportLandingComposable$lambda$2(SupportLandingViewState supportLandingViewState, FragmentManager fragmentManager, Markwon markwon, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function2 function2, Function1 function15, Function1 function16, Function1 function17, Function1 function18, int i, int i2, Composer composer, int i3) {
        SupportLandingComposable(supportLandingViewState, fragmentManager, markwon, function1, function12, function13, function14, function2, function15, function16, function17, function18, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SupportLandingScreen$lambda$8(SupportLandingViewState supportLandingViewState, Markwon markwon, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function2 function2, Function1 function15, Function1 function16, Function1 function17, Function1 function18, Function2 function22, int i, int i2, Composer composer, int i3) {
        SupportLandingScreen(supportLandingViewState, markwon, function1, function12, function13, function14, function2, function15, function16, function17, function18, function22, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SupportLandingScreenPreview$lambda$9(int i, Composer composer, int i2) {
        SupportLandingScreenPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TabContentContainer$lambda$19(Column5 column5, SupportLandingAccountTab supportLandingAccountTab, SupportLandingViewState.TabContentStatus tabContentStatus, Markwon markwon, boolean z, Function1 function1, Function1 function12, Function2 function2, Function1 function13, Function1 function14, Function1 function15, Function0 function0, Function2 function22, int i, int i2, Composer composer, int i3) {
        TabContentContainer(column5, supportLandingAccountTab, tabContentStatus, markwon, z, function1, function12, function2, function13, function14, function15, function0, function22, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TabItem_9z6LAg8$lambda$14(SupportLandingAccountTab supportLandingAccountTab, boolean z, long j, long j2, int i, Composer composer, int i2) {
        m17558TabItem9z6LAg8(supportLandingAccountTab, z, j, j2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Tabs$lambda$12(ImmutableList immutableList, int i, Function1 function1, Function1 function12, int i2, Composer composer, int i3) {
        Tabs(immutableList, i, function1, function12, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    private static final AlertAction<PathfinderAction> Content$lambda$21(SnapshotState<AlertAction<PathfinderAction>> snapshotState) {
        return snapshotState.getValue();
    }

    public static final void SupportLandingComposable(final SupportLandingViewState viewState, final FragmentManager childFragmentManager, final Markwon markwon, final Function1<? super String, Unit> onTabSelected, final Function1<? super Color, Unit> onTabBackgroundChanged, final Function1<? super PathfinderAction.Deeplink, Unit> onDeeplink, final Function1<? super PathfinderAction.UpdateBackend, Unit> onUpdateBackend, final Function2<? super PathfinderAction.SubmitForm, ? super Map<String, ? extends Object>, Unit> onSubmitForm, final Function1<? super PathfinderAction.Dismiss, Unit> onDismiss, final Function1<? super RhBottomSheetDialogFragmentHost.SheetListener, Unit> onBottomSheet, final Function1<? super List<Tuples2<String, String>>, Unit> onAccountChipSelected, final Function1<? super String, Unit> onClickRetry, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Composer composer2;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(childFragmentManager, "childFragmentManager");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(onTabSelected, "onTabSelected");
        Intrinsics.checkNotNullParameter(onTabBackgroundChanged, "onTabBackgroundChanged");
        Intrinsics.checkNotNullParameter(onDeeplink, "onDeeplink");
        Intrinsics.checkNotNullParameter(onUpdateBackend, "onUpdateBackend");
        Intrinsics.checkNotNullParameter(onSubmitForm, "onSubmitForm");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onBottomSheet, "onBottomSheet");
        Intrinsics.checkNotNullParameter(onAccountChipSelected, "onAccountChipSelected");
        Intrinsics.checkNotNullParameter(onClickRetry, "onClickRetry");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1406860506);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(childFragmentManager) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(markwon) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onTabSelected) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onTabBackgroundChanged) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDeeplink) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onUpdateBackend) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSubmitForm) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismiss) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBottomSheet) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changedInstance(onAccountChipSelected) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onClickRetry) ? 32 : 16;
        }
        if ((i3 & 306783379) != 306783378 || (i4 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1406860506, i3, i4, "com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingComposable (SupportLandingComposable.kt:84)");
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(childFragmentManager);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function2() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingComposableKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SupportLandingComposable5.SupportLandingComposable$lambda$1$lambda$0(childFragmentManager, (DialogFragment) obj, (String) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            int i5 = i3 & 14;
            int i6 = i3 >> 3;
            int i7 = i5 | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (i6 & 57344) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128) | (i6 & 234881024) | ((i4 << 27) & 1879048192);
            int i8 = (i4 >> 3) & 14;
            composer2 = composerStartRestartGroup;
            SupportLandingScreen(viewState, markwon, onTabSelected, onTabBackgroundChanged, onDeeplink, onUpdateBackend, onSubmitForm, onDismiss, onBottomSheet, onAccountChipSelected, onClickRetry, (Function2) objRememberedValue, composer2, i7, i8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingComposableKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SupportLandingComposable5.SupportLandingComposable$lambda$2(viewState, childFragmentManager, markwon, onTabSelected, onTabBackgroundChanged, onDeeplink, onUpdateBackend, onSubmitForm, onDismiss, onBottomSheet, onAccountChipSelected, onClickRetry, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SupportLandingComposable$lambda$1$lambda$0(FragmentManager fragmentManager, DialogFragment fragment, String tag) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(tag, "tag");
        fragment.show(fragmentManager, tag);
        return Unit.INSTANCE;
    }

    public static final void SupportLandingScreen(final SupportLandingViewState viewState, final Markwon markwon, final Function1<? super String, Unit> onTabSelected, final Function1<? super Color, Unit> onTabBackgroundChanged, final Function1<? super PathfinderAction.Deeplink, Unit> onDeeplink, final Function1<? super PathfinderAction.UpdateBackend, Unit> onUpdateBackend, final Function2<? super PathfinderAction.SubmitForm, ? super Map<String, ? extends Object>, Unit> onSubmitForm, final Function1<? super PathfinderAction.Dismiss, Unit> onDismiss, final Function1<? super RhBottomSheetDialogFragmentHost.SheetListener, Unit> onBottomSheet, final Function1<? super List<Tuples2<String, String>>, Unit> onAccountChipSelected, final Function1<? super String, Unit> onClickRetry, final Function2<? super DialogFragment, ? super String, Unit> showDialogFragment, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(onTabSelected, "onTabSelected");
        Intrinsics.checkNotNullParameter(onTabBackgroundChanged, "onTabBackgroundChanged");
        Intrinsics.checkNotNullParameter(onDeeplink, "onDeeplink");
        Intrinsics.checkNotNullParameter(onUpdateBackend, "onUpdateBackend");
        Intrinsics.checkNotNullParameter(onSubmitForm, "onSubmitForm");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onBottomSheet, "onBottomSheet");
        Intrinsics.checkNotNullParameter(onAccountChipSelected, "onAccountChipSelected");
        Intrinsics.checkNotNullParameter(onClickRetry, "onClickRetry");
        Intrinsics.checkNotNullParameter(showDialogFragment, "showDialogFragment");
        Composer composerStartRestartGroup = composer.startRestartGroup(956538594);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(markwon) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onTabSelected) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onTabBackgroundChanged) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDeeplink) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onUpdateBackend) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSubmitForm) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismiss) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBottomSheet) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onAccountChipSelected) ? 536870912 : 268435456;
        }
        int i5 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changedInstance(onClickRetry) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(showDialogFragment) ? 32 : 16;
        }
        if ((i5 & 306783379) == 306783378 && (i4 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(956538594, i5, i4, "com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingScreen (SupportLandingComposable.kt:115)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            int i6 = i4;
            Tabs(viewState.getTabs(), viewState.getSelectedTabIndex(), onTabSelected, onTabBackgroundChanged, composerStartRestartGroup, i5 & 8064);
            SupportLandingAccountTab supportLandingAccountTab = (SupportLandingAccountTab) CollectionsKt.getOrNull(viewState.getTabs(), viewState.getSelectedTabIndex());
            SupportLandingViewState.TabContentStatus selectedTabStatus = viewState.getSelectedTabStatus();
            boolean showInputUploadLoading = viewState.getShowInputUploadLoading();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = ((i6 & 14) == 4) | composerStartRestartGroup.changedInstance(viewState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SupportLandingComposable5.SupportLandingScreen$lambda$6$lambda$5$lambda$4$lambda$3(onClickRetry, viewState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            int i7 = i5 << 3;
            TabContentContainer(column6, supportLandingAccountTab, selectedTabStatus, markwon, showInputUploadLoading, onDeeplink, onUpdateBackend, onSubmitForm, onDismiss, onBottomSheet, onAccountChipSelected, (Function0) objRememberedValue, showDialogFragment, composerStartRestartGroup, 6 | ((i5 << 6) & 7168) | (i7 & 458752) | (i7 & 3670016) | (i7 & 29360128) | (i7 & 234881024) | (i7 & 1879048192), ((i5 >> 27) & 14) | ((i6 << 3) & 896));
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            String selectedAccountType = viewState.getSelectedAccountType();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(viewState) | composerStartRestartGroup.changedInstance(current);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new SupportLandingComposable6(viewState, current, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(selectedAccountType, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SupportLandingComposable5.SupportLandingScreen$lambda$8(viewState, markwon, onTabSelected, onTabBackgroundChanged, onDeeplink, onUpdateBackend, onSubmitForm, onDismiss, onBottomSheet, onAccountChipSelected, onClickRetry, showDialogFragment, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SupportLandingScreen$lambda$6$lambda$5$lambda$4$lambda$3(Function1 function1, SupportLandingViewState supportLandingViewState) {
        function1.invoke(supportLandingViewState.getSelectedAccountType());
        return Unit.INSTANCE;
    }

    public static final void SupportLandingScreenPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(724929605);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(724929605, i, -1, "com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingScreenPreview (SupportLandingComposable.kt:161)");
            }
            CompositionLocal3.CompositionLocalProvider(AutoLoggingCompositionLocals.getLocalEventLogger().provides(EventLogger.Noop.INSTANCE), SupportLandingComposable.INSTANCE.getLambda$115351429$feature_pathfinder_core_pages_externalDebug(), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingComposableKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SupportLandingComposable5.SupportLandingScreenPreview$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Tabs(final ImmutableList<SupportLandingAccountTab> immutableList, final int i, final Function1<? super String, Unit> function1, final Function1<? super Color, Unit> function12, Composer composer, final int i2) {
        int i3;
        Function1<? super Color, Unit> function13;
        long jM6725getTransparent0d7_KjU;
        Animatable animatable;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1433263772);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(immutableList) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            function13 = function12;
            i3 |= composerStartRestartGroup.changedInstance(function13) ? 2048 : 1024;
        } else {
            function13 = function12;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1433263772, i3, -1, "com.robinhood.android.pathfinder.corepages.supportlanding.Tabs (SupportLandingComposable.kt:204)");
            }
            SupportLandingAccountTab supportLandingAccountTab = (SupportLandingAccountTab) CollectionsKt.getOrNull(immutableList, i);
            ThemedColor backgroundColor = supportLandingAccountTab != null ? supportLandingAccountTab.getBackgroundColor() : null;
            composerStartRestartGroup.startReplaceGroup(1318026512);
            Color dayColor = backgroundColor == null ? null : toDayColor(backgroundColor, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceGroup();
            if (dayColor != null) {
                jM6725getTransparent0d7_KjU = dayColor.getValue();
            } else {
                jM6725getTransparent0d7_KjU = Color.INSTANCE.m6725getTransparent0d7_KjU();
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SingleValueAnimation.m4804Animatable8_81llA(jM6725getTransparent0d7_KjU);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Animatable animatable2 = (Animatable) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Color colorM6701boximpl = Color.m6701boximpl(jM6725getTransparent0d7_KjU);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance = ((i3 & 7168) == 2048) | composerStartRestartGroup.changedInstance(animatable2) | composerStartRestartGroup.changed(jM6725getTransparent0d7_KjU);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                animatable = animatable2;
                objRememberedValue2 = new SupportLandingComposable7(animatable, jM6725getTransparent0d7_KjU, function13, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                animatable = animatable2;
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(colorM6701boximpl, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
            TabRowKt.m5663ScrollableTabRowsKfQg0A(i, SizeKt.wrapContentHeight$default(TestTag3.testTag(Modifier.INSTANCE, SupportLandingTestTagTabBar), null, false, 3, null), ((Color) animatable.getValue()).getValue(), 0L, C2002Dp.m7995constructorimpl(12), ComposableLambda3.rememberComposableLambda(-1504667516, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingComposableKt.Tabs.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                    invoke((List<TabPosition>) list, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(List<TabPosition> tabPositions, Composer composer2, int i4) {
                    Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1504667516, i4, -1, "com.robinhood.android.pathfinder.corepages.supportlanding.Tabs.<anonymous> (SupportLandingComposable.kt:223)");
                    }
                    TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                    tabRowDefaults.m5660Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).getNova(), composer2, TabRowDefaults.$stable << 9, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(1501636228, true, new C253813(immutableList, i, function1), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 14) | 12804144, 72);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SupportLandingComposable5.Tabs$lambda$12(immutableList, i, function1, function12, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: SupportLandingComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingComposableKt$Tabs$3 */
    static final class C253813 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function1<String, Unit> $onTabSelected;
        final /* synthetic */ int $selectedTabIndex;
        final /* synthetic */ ImmutableList<SupportLandingAccountTab> $tabs;

        /* JADX WARN: Multi-variable type inference failed */
        C253813(ImmutableList<SupportLandingAccountTab> immutableList, int i, Function1<? super String, Unit> function1) {
            this.$tabs = immutableList;
            this.$selectedTabIndex = i;
            this.$onTabSelected = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void invoke(Composer composer, int i) {
            Composer composer2 = composer;
            if ((i & 3) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1501636228, i, -1, "com.robinhood.android.pathfinder.corepages.supportlanding.Tabs.<anonymous> (SupportLandingComposable.kt:232)");
            }
            int i2 = 0;
            int i3 = 0;
            for (final SupportLandingAccountTab supportLandingAccountTab : this.$tabs) {
                int i4 = i3 + 1;
                final boolean z = this.$selectedTabIndex == i3 ? 1 : i2;
                Color dayColor = SupportLandingComposable5.toDayColor(supportLandingAccountTab.getBackgroundColor(), composer2, i2);
                composer2.startReplaceGroup(-36591777);
                final long prime = dayColor == null ? BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).getPrime() : dayColor.getValue();
                composer2.endReplaceGroup();
                Color dayColor2 = SupportLandingComposable5.toDayColor(supportLandingAccountTab.getSelectedColor(), composer2, i2);
                composer2.startReplaceGroup(-36588708);
                final long nova = dayColor2 == null ? BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).getNova() : dayColor2.getValue();
                composer2.endReplaceGroup();
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(TestTag3.testTag(Modifier.INSTANCE, SupportLandingComposable5.withIdentifier(SupportLandingComposable5.SupportLandingTestTagTab, supportLandingAccountTab.getAccountType())), C2002Dp.m7995constructorimpl(12), 0.0f, 2, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierM5144paddingVpY3zN4$default, 0.0f, bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer2, i5).m21595getXsmallD9Ej5fM(), 5, null);
                composer2.startReplaceGroup(-1633490746);
                boolean zChanged = composer2.changed(this.$onTabSelected) | composer2.changedInstance(supportLandingAccountTab);
                final Function1<String, Unit> function1 = this.$onTabSelected;
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingComposableKt$Tabs$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SupportLandingComposable5.C253813.invoke$lambda$1$lambda$0(function1, supportLandingAccountTab);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                TabKt.m5653TabEVJuX4I(z, (Function0) objRememberedValue, modifierM5146paddingqDBjuR0$default, false, null, 0L, 0L, ComposableLambda3.rememberComposableLambda(16036968, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingComposableKt.Tabs.3.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                        invoke(column5, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Column5 Tab, Composer composer3, int i6) {
                        Intrinsics.checkNotNullParameter(Tab, "$this$Tab");
                        if ((i6 & 17) == 16 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-256578332, i6, -1, "com.robinhood.android.pathfinder.corepages.supportlanding.Tabs.<anonymous>.<anonymous> (SupportLandingComposable.kt:245)");
                        }
                        SupportLandingComposable5.m17558TabItem9z6LAg8(supportLandingAccountTab, z, prime, nova, composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), composer2, 12582912, 120);
                composer2 = composer;
                i3 = i4;
                i2 = i2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function1 function1, SupportLandingAccountTab supportLandingAccountTab) {
            function1.invoke(supportLandingAccountTab.getAccountType());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TabItem-9z6LAg8, reason: not valid java name */
    public static final void m17558TabItem9z6LAg8(SupportLandingAccountTab supportLandingAccountTab, final boolean z, long j, final long j2, Composer composer, final int i) {
        final SupportLandingAccountTab supportLandingAccountTab2;
        int i2;
        long j3;
        long j4;
        Composer composerStartRestartGroup = composer.startRestartGroup(1777270987);
        if ((i & 6) == 0) {
            supportLandingAccountTab2 = supportLandingAccountTab;
            i2 = (composerStartRestartGroup.changedInstance(supportLandingAccountTab2) ? 4 : 2) | i;
        } else {
            supportLandingAccountTab2 = supportLandingAccountTab;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            j3 = j;
            i2 |= composerStartRestartGroup.changed(j3) ? 256 : 128;
        } else {
            j3 = j;
        }
        if ((i & 3072) == 0) {
            j4 = j2;
            i2 |= composerStartRestartGroup.changed(j4) ? 2048 : 1024;
        } else {
            j4 = j2;
        }
        if ((i2 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1777270987, i2, -1, "com.robinhood.android.pathfinder.corepages.supportlanding.TabItem (SupportLandingComposable.kt:267)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM5155defaultMinSizeVpY3zN4$default = SizeKt.m5155defaultMinSizeVpY3zN4$default(companion, C2002Dp.m7995constructorimpl(80), 0.0f, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5155defaultMinSizeVpY3zN4$default);
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
            int i3 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM(), 1, null);
            int resourceId = supportLandingAccountTab2.getPictogramAsset().getResourceId();
            BentoPogSize bentoPogSize = BentoPogSize.Standard;
            composerStartRestartGroup.startReplaceGroup(-494487378);
            long nova = z ? j3 : bentoTheme.getColors(composerStartRestartGroup, i3).getNova();
            composerStartRestartGroup.endReplaceGroup();
            BentoPogKt.m20684BentoPictogramPogRhg8lNc(resourceId, modifierM5144paddingVpY3zN4$default, false, bentoPogSize, null, Color.m6701boximpl(nova), Color.m6701boximpl(z ? j4 : Color.INSTANCE.m6725getTransparent0d7_KjU()), composerStartRestartGroup, 3072, 20);
            String displayName = supportLandingAccountTab2.getDisplayName();
            long nova2 = bentoTheme.getColors(composerStartRestartGroup, i3).getNova();
            TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM();
            FontWeight.Companion companion3 = FontWeight.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(displayName, null, Color.m6701boximpl(nova2), null, z ? companion3.getBold() : companion3.getNormal(), null, null, 0, false, 0, 0, null, 0, textM, composerStartRestartGroup, 0, 0, 8170);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final long j5 = j3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SupportLandingComposable5.TabItem_9z6LAg8$lambda$14(supportLandingAccountTab2, z, j5, j2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void TabContentContainer(final Column5 column5, final SupportLandingAccountTab supportLandingAccountTab, final SupportLandingViewState.TabContentStatus tabContentStatus, final Markwon markwon, final boolean z, final Function1<? super PathfinderAction.Deeplink, Unit> function1, final Function1<? super PathfinderAction.UpdateBackend, Unit> function12, final Function2<? super PathfinderAction.SubmitForm, ? super Map<String, ? extends Object>, Unit> function2, final Function1<? super PathfinderAction.Dismiss, Unit> function13, final Function1<? super RhBottomSheetDialogFragmentHost.SheetListener, Unit> function14, final Function1<? super List<Tuples2<String, String>>, Unit> function15, final Function0<Unit> function0, final Function2<? super DialogFragment, ? super String, Unit> function22, Composer composer, final int i, final int i2) {
        int i3;
        Markwon markwon2;
        Function1<? super PathfinderAction.Deeplink, Unit> function16;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2005677010);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(column5) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(supportLandingAccountTab) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(tabContentStatus) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            markwon2 = markwon;
            i3 |= composerStartRestartGroup.changedInstance(markwon2) ? 2048 : 1024;
        } else {
            markwon2 = markwon;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            function16 = function1;
            i3 |= composerStartRestartGroup.changedInstance(function16) ? 131072 : 65536;
        } else {
            function16 = function1;
        }
        if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function12) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function13) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function14) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changedInstance(function15) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function22) ? 256 : 128;
        }
        int i5 = i4;
        if ((i3 & 306783379) == 306783378 && (i5 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2005677010, i3, i5, "com.robinhood.android.pathfinder.corepages.supportlanding.TabContentContainer (SupportLandingComposable.kt:302)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierWeight$default = Column5.weight$default(column5, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (tabContentStatus == null || (tabContentStatus instanceof SupportLandingViewState.TabContentStatus.Loading)) {
                composerStartRestartGroup.startReplaceGroup(556674837);
                SupportLandingLoadingComposable.SupportLandingLoadingComposable(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (tabContentStatus instanceof SupportLandingViewState.TabContentStatus.Error) {
                composerStartRestartGroup.startReplaceGroup(556678061);
                SupportLandingErrorComposable.SupportLandingErrorComposable(function0, composerStartRestartGroup, (i5 >> 3) & 14);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(tabContentStatus instanceof SupportLandingViewState.TabContentStatus.Success)) {
                    composerStartRestartGroup.startReplaceGroup(556672979);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(77328246);
                SupportLandingViewState.TabContentStatus.Success success = (SupportLandingViewState.TabContentStatus.Success) tabContentStatus;
                SupportLandingAccount displayedAccount = success.getDisplayedAccount();
                if (displayedAccount != null) {
                    boolean showAccountDropdownChip = success.getShowAccountDropdownChip();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean z2 = ((i5 & 14) == 4) | ((i3 & 896) == 256);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SupportLandingComposable5.TabContentContainer$lambda$18$lambda$17$lambda$16$lambda$15(function15, tabContentStatus);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    int i6 = i3 >> 6;
                    Content(displayedAccount, showAccountDropdownChip, markwon2, function16, function12, function2, function13, function14, (Function0) objRememberedValue, function22, composerStartRestartGroup, ((i3 >> 3) & 896) | (i6 & 7168) | (57344 & i6) | (458752 & i6) | (3670016 & i6) | (i6 & 29360128) | ((i5 << 21) & 1879048192));
                    Unit unit = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.startReplaceGroup(556708434);
            if (z) {
                ThemedColor backgroundColor = supportLandingAccountTab != null ? supportLandingAccountTab.getBackgroundColor() : null;
                composerStartRestartGroup.startReplaceGroup(556710848);
                Color dayColor = backgroundColor == null ? null : toDayColor(backgroundColor, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                BentoProgressBar2.m20697BentoIndeterminateProgressBareaDK9VM(boxScopeInstance.align(SizeKt.fillMaxWidth$default(TestTag3.testTag(companion, SupportLandingTestTagProgressBar), 0.0f, 1, null), companion2.getTopCenter()), false, dayColor != null ? dayColor.getValue() : Color.INSTANCE.m6725getTransparent0d7_KjU(), Color.INSTANCE.m6725getTransparent0d7_KjU(), composerStartRestartGroup, 3072, 2);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SupportLandingComposable5.TabContentContainer$lambda$19(column5, supportLandingAccountTab, tabContentStatus, markwon, z, function1, function12, function2, function13, function14, function15, function0, function22, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TabContentContainer$lambda$18$lambda$17$lambda$16$lambda$15(Function1 function1, SupportLandingViewState.TabContentStatus tabContentStatus) {
        function1.invoke(((SupportLandingViewState.TabContentStatus.Success) tabContentStatus).getSelectableAccountNameToNumber());
        return Unit.INSTANCE;
    }

    private static final void Content(final SupportLandingAccount supportLandingAccount, final boolean z, final Markwon markwon, final Function1<? super PathfinderAction.Deeplink, Unit> function1, final Function1<? super PathfinderAction.UpdateBackend, Unit> function12, final Function2<? super PathfinderAction.SubmitForm, ? super Map<String, ? extends Object>, Unit> function2, final Function1<? super PathfinderAction.Dismiss, Unit> function13, final Function1<? super RhBottomSheetDialogFragmentHost.SheetListener, Unit> function14, final Function0<Unit> function0, final Function2<? super DialogFragment, ? super String, Unit> function22, Composer composer, final int i) {
        int i2;
        Function1<? super PathfinderAction.Deeplink, Unit> function15;
        Function1<? super PathfinderAction.UpdateBackend, Unit> function16;
        Function2<? super PathfinderAction.SubmitForm, ? super Map<String, ? extends Object>, Unit> function23;
        int i3;
        SduiStateHandler3 sduiStateHandler3;
        final SnapshotState snapshotState;
        Composer composerStartRestartGroup = composer.startRestartGroup(-438349472);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(supportLandingAccount) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(markwon) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function15 = function1;
            i2 |= composerStartRestartGroup.changedInstance(function15) ? 2048 : 1024;
        } else {
            function15 = function1;
        }
        if ((i & 24576) == 0) {
            function16 = function12;
            i2 |= composerStartRestartGroup.changedInstance(function16) ? 16384 : 8192;
        } else {
            function16 = function12;
        }
        if ((196608 & i) == 0) {
            function23 = function2;
            i2 |= composerStartRestartGroup.changedInstance(function23) ? 131072 : 65536;
        } else {
            function23 = function2;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function13) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function14) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 = i2 | (composerStartRestartGroup.changedInstance(function0) ? 67108864 : 33554432);
        } else {
            i3 = i2;
        }
        if ((i & 805306368) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function22) ? 536870912 : 268435456;
        }
        int i4 = i3;
        if ((i4 & 306783379) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-438349472, i4, -1, "com.robinhood.android.pathfinder.corepages.supportlanding.Content (SupportLandingComposable.kt:358)");
            }
            final SduiStateHandler3 sduiStateHandler3RememberStateHandler = SduiStateHandler2.rememberStateHandler(composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance = ((i4 & 7168) == 2048) | ((3670016 & i4) == 1048576) | ((57344 & i4) == 16384) | composerStartRestartGroup.changedInstance(sduiStateHandler3RememberStateHandler) | ((i4 & 458752) == 131072);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                final Function1<? super PathfinderAction.Deeplink, Unit> function17 = function15;
                final Function1<? super PathfinderAction.UpdateBackend, Unit> function18 = function16;
                final Function2<? super PathfinderAction.SubmitForm, ? super Map<String, ? extends Object>, Unit> function24 = function23;
                Function1 function19 = new Function1() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingComposableKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(SupportLandingComposable5.Content$lambda$24$lambda$23(function17, function13, function18, sduiStateHandler3RememberStateHandler, function24, snapshotState2, (PathfinderAction) obj));
                    }
                };
                sduiStateHandler3 = sduiStateHandler3RememberStateHandler;
                snapshotState = snapshotState2;
                composerStartRestartGroup.updateRememberedValue(function19);
                objRememberedValue2 = function19;
            } else {
                sduiStateHandler3 = sduiStateHandler3RememberStateHandler;
                snapshotState = snapshotState2;
            }
            Function1 function110 = (Function1) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            CompositionLocal3.CompositionLocalProvider(LocalImageLoader.m9117providesimpl(LocalImageLoader2.getLocalImageLoader(), CoilUtils2.rememberImageLoader(0.0d, null, composerStartRestartGroup, 0, 3)), ComposableLambda3.rememberComposableLambda(-1076029920, true, new C253791(supportLandingAccount, z, function0, sduiStateHandler3, function110), composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            AlertAction<PathfinderAction> alertActionContent$lambda$21 = Content$lambda$21(snapshotState);
            if (alertActionContent$lambda$21 != null) {
                int i5 = WhenMappings.$EnumSwitchMapping$0[alertActionContent$lambda$21.getMobile_presentation_style().ordinal()];
                if (i5 == 1) {
                    composerStartRestartGroup.startReplaceGroup(1047836920);
                    SduiAlert sduiAlert = SduiAlert.INSTANCE;
                    Parcelable alert = alertActionContent$lambda$21.getAlert();
                    SupportLandingComposable8 supportLandingComposable8 = new SupportLandingComposable8(function110);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingComposableKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SupportLandingComposable5.Content$lambda$29$lambda$26$lambda$25(snapshotState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    sduiAlert.Dialog(alert, supportLandingComposable8, null, (Function0) objRememberedValue3, composerStartRestartGroup, (SduiAlert.$stable << 12) | 3072, 4);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (i5 != 2) {
                        composerStartRestartGroup.startReplaceGroup(-936032904);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(1048095739);
                    SduiAlert sduiAlert2 = SduiAlert.INSTANCE;
                    GenericAlertContent<ActionT> alert2 = alertActionContent$lambda$21.getAlert();
                    SupportLandingComposable8 supportLandingComposable82 = new SupportLandingComposable8(function110);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingComposableKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SupportLandingComposable5.Content$lambda$29$lambda$28$lambda$27(snapshotState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function14.invoke(sduiAlert2.sheetListener(markwon, alert2, supportLandingComposable82, (Function0<Unit>) objRememberedValue4, (Function1<? super String, Unit>) ((1008 & 16) != 0 ? new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SduiAlert.sheetListener$lambda$19((String) obj);
                        }
                    } : null), (Function1<? super String, Unit>) ((1008 & 32) != 0 ? new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SduiAlert.sheetListener$lambda$20((String) obj);
                        }
                    } : null), (1008 & 64) != 0 ? false : false, (1008 & 128) != 0 ? false : false, (1008 & 256) != 0, (1008 & 512) != 0 ? null : null, (Function2<? super DialogFragment, ? super String, Unit>) function22));
                    composerStartRestartGroup.endReplaceGroup();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingComposableKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SupportLandingComposable5.Content$lambda$30(supportLandingAccount, z, markwon, function1, function12, function2, function13, function14, function0, function22, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Content$lambda$24$lambda$23(Function1 function1, Function1 function12, Function1 function13, SduiStateHandler3 sduiStateHandler3, Function2 function2, SnapshotState snapshotState, PathfinderAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        snapshotState.setValue(null);
        if (action instanceof PathfinderAction.Deeplink) {
            function1.invoke(action);
        } else if (action instanceof PathfinderAction.Dismiss) {
            function12.invoke(action);
        } else if (action instanceof PathfinderAction.InfoAlert) {
            snapshotState.setValue(((PathfinderAction.InfoAlert) action).getValue2());
        } else if (action instanceof PathfinderAction.UpdateBackend) {
            function13.invoke(action);
        } else {
            if (!(action instanceof PathfinderAction.SubmitForm)) {
                throw new NoWhenBranchMatchedException();
            }
            if (sduiStateHandler3.validateComponents(((PathfinderAction.SubmitForm) action).getValue2().getValidate_on_submit(), true)) {
                function2.invoke(action, sduiStateHandler3.serverValueStates());
            }
        }
        return true;
    }

    /* compiled from: SupportLandingComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingComposableKt$Content$1 */
    static final class C253791 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SupportLandingAccount $account;
        final /* synthetic */ Function1<PathfinderAction, Boolean> $actionHandler;
        final /* synthetic */ Function0<Unit> $onAccountChipSelected;
        final /* synthetic */ boolean $showAccountDropdownChip;
        final /* synthetic */ SduiStateHandler3 $stateHandler;

        /* JADX WARN: Multi-variable type inference failed */
        C253791(SupportLandingAccount supportLandingAccount, boolean z, Function0<Unit> function0, SduiStateHandler3 sduiStateHandler3, Function1<? super PathfinderAction, Boolean> function1) {
            this.$account = supportLandingAccount;
            this.$showAccountDropdownChip = z;
            this.$onAccountChipSelected = function0;
            this.$stateHandler = sduiStateHandler3;
            this.$actionHandler = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1076029920, i, -1, "com.robinhood.android.pathfinder.corepages.supportlanding.Content.<anonymous> (SupportLandingComposable.kt:388)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(TestTag3.testTag(Modifier.INSTANCE, SupportLandingComposable5.SupportLandingTestTagContent), 0.0f, 1, null);
            TopWithFooter topWithFooter = new TopWithFooter(this.$account.getAccountFooter().size());
            composer.startReplaceGroup(-1224400529);
            boolean zChanged = composer.changed(this.$showAccountDropdownChip) | composer.changedInstance(this.$account) | composer.changed(this.$onAccountChipSelected) | composer.changedInstance(this.$stateHandler) | composer.changed(this.$actionHandler);
            final boolean z = this.$showAccountDropdownChip;
            final SupportLandingAccount supportLandingAccount = this.$account;
            final Function0<Unit> function0 = this.$onAccountChipSelected;
            final SduiStateHandler3 sduiStateHandler3 = this.$stateHandler;
            final Function1<PathfinderAction, Boolean> function1 = this.$actionHandler;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Function1 function12 = new Function1() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingComposableKt$Content$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SupportLandingComposable5.C253791.invoke$lambda$1$lambda$0(z, supportLandingAccount, function0, sduiStateHandler3, function1, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(function12);
                objRememberedValue = function12;
            }
            composer.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierFillMaxSize$default, null, null, false, topWithFooter, null, null, false, null, (Function1) objRememberedValue, composer, 6, 494);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(boolean z, SupportLandingAccount supportLandingAccount, Function0 function0, SduiStateHandler3 sduiStateHandler3, Function1 function1, LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            String displayName = supportLandingAccount.getDisplayName();
            if (displayName == null) {
                displayName = "";
            }
            SupportLandingComposable5.accountDropdownChip(LazyColumn, z, displayName, function0);
            List listPlus = CollectionsKt.plus((Collection) supportLandingAccount.getAccountContent(), (Iterable) supportLandingAccount.getAccountFooter());
            SduiColumns.sduiItems(LazyColumn, extensions2.toPersistentList(listPlus), PathfinderAction.class, sduiStateHandler3, new SupportLandingComposable8(function1), HorizontalPadding.Default);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$29$lambda$26$lambda$25(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$29$lambda$28$lambda$27(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void accountDropdownChip(LazyListScope lazyListScope, boolean z, final String str, final Function0<Unit> function0) {
        if (z) {
            LazyListScope.item$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-1605880864, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingComposableKt.accountDropdownChip.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1605880864, i, -1, "com.robinhood.android.pathfinder.corepages.supportlanding.accountDropdownChip.<anonymous> (SupportLandingComposable.kt:437)");
                    }
                    Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, SupportLandingComposable5.SupportLandingTestTagAccountDropdownChip);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i2 = BentoTheme.$stable;
                    BentoChip.BentoDropdownChip(function0, PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(modifierTestTag, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), false, null, str, composer, 0, 12);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Color toDayColor(ThemedColor themedColor, Composer composer, int i) {
        composer.startReplaceGroup(-1947812412);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1947812412, i, -1, "com.robinhood.android.pathfinder.corepages.supportlanding.toDayColor (SupportLandingComposable.kt:450)");
        }
        final com.robinhood.models.serverdriven.experimental.api.Color light = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).isDay(composer, 0) ? themedColor.getLight() : themedColor.getDark();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        BentoTheme2.BentoTheme(Boolean.TRUE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-312814836, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingComposableKt.toDayColor.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r4v1, types: [T, androidx.compose.ui.graphics.Color] */
            public final void invoke(Composer composer2, int i2) {
                if ((i2 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-312814836, i2, -1, "com.robinhood.android.pathfinder.corepages.supportlanding.toDayColor.<anonymous> (SupportLandingComposable.kt:454)");
                }
                objectRef.element = SduiColors2.toComposeColor(light, composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
        Color color = (Color) objectRef.element;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return color;
    }

    public static final String withIdentifier(String str, String identifier) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return str + "_" + identifier;
    }
}
