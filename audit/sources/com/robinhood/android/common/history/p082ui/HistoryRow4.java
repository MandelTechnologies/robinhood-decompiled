package com.robinhood.android.common.history.p082ui;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Rotate;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.text.style.TextOverflow;
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
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.history.C11183R;
import com.robinhood.android.common.history.p082ui.HistoryRow3;
import com.robinhood.android.common.history.p082ui.HistoryRow4;
import com.robinhood.android.common.history.p082ui.HistoryRowViewState;
import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.data.DetailErrorType;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.ComboOrderDetailContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.shared.models.history.shared.TransactionReference;
import io.reactivex.disposables.Disposable;
import java.util.List;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
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
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: HistoryRow.kt */
@Metadata(m3635d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aW\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a!\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a7\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u0018H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001aW\u0010\u001e\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00162\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u00182\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u00182\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0018H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a5\u0010\"\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0 H\u0003¢\u0006\u0004\b\"\u0010#\u001aQ\u0010)\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u00162\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\r0 2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\r0 2\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b)\u0010*\u001a\u001b\u0010+\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b+\u0010,\u001a\u0019\u0010-\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b-\u0010.\u001aa\u0010:\u001a\u00020\r2\u0014\u00102\u001a\u0010\u0012\u0004\u0012\u000200\u0018\u00010/j\u0004\u0018\u0001`12\u0006\u00104\u001a\u0002032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u00105\u001a\u00020\u00162\b\b\u0002\u0010$\u001a\u00020\u00162\n\b\u0002\u00107\u001a\u0004\u0018\u0001062\b\b\u0002\u00109\u001a\u000208H\u0007¢\u0006\u0004\b:\u0010;\u001aS\u0010:\u001a\u00020\r2\u0010\u00102\u001a\f\u0012\u0004\u0012\u0002000/j\u0002`12\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u00105\u001a\u00020\u00162\b\b\u0002\u0010$\u001a\u00020\u00162\b\b\u0002\u0010<\u001a\u0002062\b\b\u0002\u00109\u001a\u000208H\u0007¢\u0006\u0004\b:\u0010=\"\u001a\u0010>\u001a\u0002068\u0000X\u0081T¢\u0006\f\n\u0004\b>\u0010?\u0012\u0004\b@\u0010A\"\u001a\u0010B\u001a\u0002068\u0000X\u0081T¢\u0006\f\n\u0004\bB\u0010?\u0012\u0004\bC\u0010A\"\u001a\u0010D\u001a\u0002068\u0000X\u0081T¢\u0006\f\n\u0004\bD\u0010?\u0012\u0004\bE\u0010A\"\u001a\u0010F\u001a\u0002068\u0000X\u0081T¢\u0006\f\n\u0004\bF\u0010?\u0012\u0004\bG\u0010A\"\u0014\u0010H\u001a\u0002068\u0002X\u0082T¢\u0006\u0006\n\u0004\bH\u0010?\"\u0014\u0010I\u001a\u0002068\u0002X\u0082T¢\u0006\u0006\n\u0004\bI\u0010?¨\u0006P²\u0006\u000e\u0010J\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002²\u0006\f\u0010L\u001a\u00020K8\nX\u008a\u0084\u0002²\u0006\f\u0010N\u001a\u00020M8\nX\u008a\u0084\u0002²\u0006\u0010\u0010O\u001a\u0004\u0018\u00010'8\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$MetadataPrimaryComponent;", "primaryComponent", "", "secondaryText", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Icon;", "secondaryIcon", "Landroidx/compose/ui/graphics/Color;", "primaryTextColor", "secondaryTextColorOverride", "Landroidx/compose/ui/text/TextStyle;", "secondaryTextStyleOverride", "", "HistoryRowMeta-qpeXoU8", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/common/history/ui/format/TransactionSummary$MetadataPrimaryComponent;Ljava/lang/CharSequence;Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Icon;JLandroidx/compose/ui/graphics/Color;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;II)V", "HistoryRowMeta", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary;", ErrorBundle.SUMMARY_ENTRY, "SummaryMeta", "(Lcom/robinhood/android/common/history/ui/format/TransactionSummary;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$SecondarySummary;", "", "showBottomDivider", "Lkotlin/Function0;", "onClick", "SecondaryHistoryRow", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/common/history/ui/format/TransactionSummary$SecondarySummary;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "metaElement", "endElement", "PrimaryHistoryRow", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/common/history/ui/format/TransactionSummary;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function1;", "onSecondarySummaryClicked", "ExpandableHistoryRow", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/common/history/ui/format/TransactionSummary;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "compensateForCaret", "Lcom/robinhood/shared/models/history/shared/TransactionReference;", "onTransactionReferenceClicked", "Lcom/robinhood/android/navigation/app/keys/data/DetailErrorType;", "onDetailErrorClicked", "LoadedHistoryRow", "(Lcom/robinhood/android/common/history/ui/format/TransactionSummary;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "autoLogHistoryRowEvents", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/common/history/ui/format/TransactionSummary;)Landroidx/compose/ui/Modifier;", "PlaceholderHistoryRow", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "Lcom/robinhood/shared/models/history/shared/GenericStatefulHistoryEvent;", "state", "Lcom/robinhood/android/common/history/ui/HistoryRowCallbacks;", "callbacks", "isFromCryptoSource", "", "key", "Lcom/robinhood/android/common/history/ui/ComposeHistoryRowDuxo;", "duxo", "HistoryRow", "(Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;Lcom/robinhood/android/common/history/ui/HistoryRowCallbacks;Landroidx/compose/ui/Modifier;ZZLjava/lang/String;Lcom/robinhood/android/common/history/ui/ComposeHistoryRowDuxo;Landroidx/compose/runtime/Composer;II)V", "keyPrefix", "(Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;Landroidx/compose/ui/Modifier;ZZLjava/lang/String;Lcom/robinhood/android/common/history/ui/ComposeHistoryRowDuxo;Landroidx/compose/runtime/Composer;II)V", "HistoryRowMetadataPrimaryTextTestTag", "Ljava/lang/String;", "getHistoryRowMetadataPrimaryTextTestTag$annotations", "()V", "HistoryRowMetadataSecondarytTextTestTag", "getHistoryRowMetadataSecondarytTextTestTag$annotations", "HistoryRowPrimaryTextTestTag", "getHistoryRowPrimaryTextTestTag$annotations", "HistoryRowSecondaryTextTestTag", "getHistoryRowSecondaryTextTestTag$annotations", "PlaceholderPrimaryText", "PlaceholderSecondaryText", "expanded", "", "rotation", "Lcom/robinhood/android/common/history/ui/HistoryRowViewState;", "viewState", "activeDetailError", "lib-history-row_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.history.ui.HistoryRowKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class HistoryRow4 {
    public static final String HistoryRowMetadataPrimaryTextTestTag = "history_row_metadata_primary_text";
    public static final String HistoryRowMetadataSecondarytTextTestTag = "history_row_metadata_secondary_text";
    public static final String HistoryRowPrimaryTextTestTag = "history_row_primary_text";
    public static final String HistoryRowSecondaryTextTestTag = "history_row_secondary_text";
    private static final String PlaceholderPrimaryText = "XXXX xxxxxxx XXX";
    private static final String PlaceholderSecondaryText = "XXX XX";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandableHistoryRow$lambda$21(Modifier modifier, TransactionSummary transactionSummary, Function1 function1, int i, int i2, Composer composer, int i3) {
        ExpandableHistoryRow(modifier, transactionSummary, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HistoryRow$lambda$36(StatefulHistoryEvent statefulHistoryEvent, HistoryRow2 historyRow2, Modifier modifier, boolean z, boolean z2, String str, ComposeHistoryRowDuxo composeHistoryRowDuxo, int i, int i2, Composer composer, int i3) {
        HistoryRow(statefulHistoryEvent, historyRow2, modifier, z, z2, str, composeHistoryRowDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HistoryRow$lambda$44(StatefulHistoryEvent statefulHistoryEvent, Modifier modifier, boolean z, boolean z2, String str, ComposeHistoryRowDuxo composeHistoryRowDuxo, int i, int i2, Composer composer, int i3) {
        HistoryRow(statefulHistoryEvent, modifier, z, z2, str, composeHistoryRowDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HistoryRowMeta_qpeXoU8$lambda$7(Modifier modifier, TransactionSummary.MetadataPrimaryComponent metadataPrimaryComponent, CharSequence charSequence, TransactionSummary.Icon icon, long j, Color color, TextStyle textStyle, int i, int i2, Composer composer, int i3) {
        m12239HistoryRowMetaqpeXoU8(modifier, metadataPrimaryComponent, charSequence, icon, j, color, textStyle, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedHistoryRow$lambda$26(TransactionSummary transactionSummary, boolean z, Function1 function1, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LoadedHistoryRow(transactionSummary, z, function1, function12, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlaceholderHistoryRow$lambda$27(Modifier modifier, int i, int i2, Composer composer, int i3) {
        PlaceholderHistoryRow(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrimaryHistoryRow$lambda$13(Modifier modifier, TransactionSummary transactionSummary, boolean z, Function2 function2, Function2 function22, Function0 function0, int i, int i2, Composer composer, int i3) {
        PrimaryHistoryRow(modifier, transactionSummary, z, function2, function22, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SecondaryHistoryRow$lambda$9(Modifier modifier, TransactionSummary.SecondarySummary secondarySummary, boolean z, Function0 function0, int i, int i2, Composer composer, int i3) {
        SecondaryHistoryRow(modifier, secondarySummary, z, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SummaryMeta$lambda$8(TransactionSummary transactionSummary, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SummaryMeta(transactionSummary, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getHistoryRowMetadataPrimaryTextTestTag$annotations() {
    }

    public static /* synthetic */ void getHistoryRowMetadataSecondarytTextTestTag$annotations() {
    }

    public static /* synthetic */ void getHistoryRowPrimaryTextTestTag$annotations() {
    }

    public static /* synthetic */ void getHistoryRowSecondaryTextTestTag$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ExpandableHistoryRow$lambda$15(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ExpandableHistoryRow$lambda$17(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final HistoryRowViewState HistoryRow$lambda$28(SnapshotState4<? extends HistoryRowViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final DetailErrorType HistoryRow$lambda$38(SnapshotState<DetailErrorType> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010f  */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* renamed from: HistoryRowMeta-qpeXoU8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m12239HistoryRowMetaqpeXoU8(Modifier modifier, final TransactionSummary.MetadataPrimaryComponent metadataPrimaryComponent, final CharSequence charSequence, final TransactionSummary.Icon icon, long j, Color color, TextStyle textStyle, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long jM21425getFg0d7_KjU;
        Color color2;
        int i4;
        TextStyle textStyle2;
        Color color3;
        TextStyle textStyle3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        ?? r6;
        final Modifier modifier3;
        final long j2;
        final Color color4;
        final TextStyle textStyle4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-827917907);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(metadataPrimaryComponent) : composerStartRestartGroup.changedInstance(metadataPrimaryComponent) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(charSequence) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(icon) : composerStartRestartGroup.changedInstance(icon) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                jM21425getFg0d7_KjU = j;
                int i6 = composerStartRestartGroup.changed(jM21425getFg0d7_KjU) ? 16384 : 8192;
                i3 |= i6;
            } else {
                jM21425getFg0d7_KjU = j;
            }
            i3 |= i6;
        } else {
            jM21425getFg0d7_KjU = j;
        }
        int i7 = i2 & 32;
        if (i7 != 0) {
            i3 |= 196608;
        } else {
            if ((196608 & i) == 0) {
                color2 = color;
                i3 |= composerStartRestartGroup.changed(color2) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((1572864 & i) == 0) {
                    textStyle2 = textStyle;
                    i3 |= composerStartRestartGroup.changed(textStyle2) ? 1048576 : 524288;
                }
                if ((599187 & i3) == 599186 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    j2 = jM21425getFg0d7_KjU;
                    color4 = color2;
                    textStyle4 = textStyle2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i5 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                        }
                        color3 = i7 == 0 ? null : color;
                        if (i4 == 0) {
                            textStyle3 = null;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-827917907, i3, -1, "com.robinhood.android.common.history.ui.HistoryRowMeta (HistoryRow.kt:97)");
                        }
                        Alignment.Companion companion = Alignment.INSTANCE;
                        Alignment.Horizontal end = companion.getEnd();
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), end, composerStartRestartGroup, 48);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier2);
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
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Color color5 = color3;
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
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
                        TextStyle textStyle5 = textStyle3;
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        if (metadataPrimaryComponent instanceof TransactionSummary.Icon) {
                            int i8 = i3;
                            r6 = 0;
                            r6 = 0;
                            if (metadataPrimaryComponent instanceof TransactionSummary.MetadataPrimaryComponent.Text) {
                                composerStartRestartGroup.startReplaceGroup(29817755);
                                String strValueOf = String.valueOf(((TransactionSummary.MetadataPrimaryComponent.Text) metadataPrimaryComponent).getText());
                                Modifier modifierTestTag = TestTag3.testTag(companion3, HistoryRowMetadataPrimaryTextTestTag);
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function1() { // from class: com.robinhood.android.common.history.ui.HistoryRowKt$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return HistoryRow4.HistoryRowMeta_qpeXoU8$lambda$6$lambda$2$lambda$1$lambda$0((SemanticsPropertyReceiver) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                BentoText2.m20747BentoText38GnDrw(strValueOf, SemanticsModifier6.semantics$default(modifierTestTag, false, (Function1) objRememberedValue, 1, null), Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, (i8 >> 6) & 896, 0, 16376);
                                composerStartRestartGroup = composerStartRestartGroup;
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                if (!(metadataPrimaryComponent instanceof TransactionSummary.MetadataPrimaryComponent.IconText)) {
                                    composerStartRestartGroup.startReplaceGroup(944161);
                                    composerStartRestartGroup.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composerStartRestartGroup.startReplaceGroup(30270882);
                                TransactionSummary.MetadataPrimaryComponent.IconText iconText = (TransactionSummary.MetadataPrimaryComponent.IconText) metadataPrimaryComponent;
                                IconKt.m5602Iconww6aTOc(PainterResources_androidKt.painterResource(iconText.getIcon().getAsset().getResourceId(), composerStartRestartGroup, 0), (String) null, PaddingKt.m5146paddingqDBjuR0$default(row6.align(companion3, companion.getCenterVertically()), 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), iconText.getIcon().getTint().getComposeColor(composerStartRestartGroup, 0), composerStartRestartGroup, 48, 0);
                                BentoText2.m20747BentoText38GnDrw(String.valueOf(iconText.getText()), null, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, (i8 >> 6) & 896, 0, 16378);
                                composerStartRestartGroup = composerStartRestartGroup;
                                composerStartRestartGroup.endReplaceGroup();
                            }
                        } else {
                            composerStartRestartGroup.startReplaceGroup(29302318);
                            TransactionSummary.Icon icon2 = (TransactionSummary.Icon) metadataPrimaryComponent;
                            Painter painterPainterResource = PainterResources_androidKt.painterResource(icon2.getAsset().getResourceId(), composerStartRestartGroup, 0);
                            long composeColor = icon2.getTint().getComposeColor(composerStartRestartGroup, 0);
                            r6 = 0;
                            IconKt.m5602Iconww6aTOc(painterPainterResource, (String) null, PaddingKt.m5146paddingqDBjuR0$default(row6.align(companion3, companion.getCenterVertically()), 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), composeColor, composerStartRestartGroup, 48, 0);
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.startReplaceGroup(-2115532484);
                        if (charSequence != null) {
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composerStartRestartGroup, r6);
                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, r6);
                            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
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
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                            composerStartRestartGroup.startReplaceGroup(-92086290);
                            if (icon != null) {
                                IconKt.m5602Iconww6aTOc(PainterResources_androidKt.painterResource(icon.getAsset().getResourceId(), composerStartRestartGroup, r6), (String) null, PaddingKt.m5146paddingqDBjuR0$default(row6.align(companion3, companion.getCenterVertically()), 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), icon.getTint().getComposeColor(composerStartRestartGroup, r6), composerStartRestartGroup, 48, 0);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            String strValueOf2 = String.valueOf(charSequence);
                            composerStartRestartGroup.startReplaceGroup(-92068431);
                            TextStyle textS = textStyle5 == null ? BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextS() : textStyle5;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(-92065653);
                            long jM21426getFg20d7_KjU = color5 == null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21426getFg20d7_KjU() : color5.getValue();
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierTestTag2 = TestTag3.testTag(companion3, HistoryRowMetadataSecondarytTextTestTag);
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.common.history.ui.HistoryRowKt$$ExternalSyntheticLambda6
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return HistoryRow4.HistoryRowMeta_qpeXoU8$lambda$6$lambda$5$lambda$4$lambda$3((SemanticsPropertyReceiver) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Composer composer2 = composerStartRestartGroup;
                            BentoText2.m20747BentoText38GnDrw(strValueOf2, SemanticsModifier6.semantics$default(modifierTestTag2, r6, (Function1) objRememberedValue2, 1, null), Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textS, composer2, 0, 0, 8184);
                            composerStartRestartGroup = composer2;
                            composerStartRestartGroup.endNode();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        j2 = jM21425getFg0d7_KjU;
                        color4 = color5;
                        textStyle4 = textStyle5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        color3 = color;
                    }
                    textStyle3 = textStyle2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    Alignment.Horizontal end2 = companion4.getEnd();
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.getTop(), end2, composerStartRestartGroup, 48);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier2);
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor4 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Color color52 = color3;
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion22.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        Modifier.Companion companion32 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion4.getTop(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion32);
                        Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        TextStyle textStyle52 = textStyle3;
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy3, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting()) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                            Row6 row62 = Row6.INSTANCE;
                            if (metadataPrimaryComponent instanceof TransactionSummary.Icon) {
                            }
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.startReplaceGroup(-2115532484);
                            if (charSequence != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier2;
                            j2 = jM21425getFg0d7_KjU;
                            color4 = color52;
                            textStyle4 = textStyle52;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.history.ui.HistoryRowKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return HistoryRow4.HistoryRowMeta_qpeXoU8$lambda$7(modifier3, metadataPrimaryComponent, charSequence, icon, j2, color4, textStyle4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 1572864;
            textStyle2 = textStyle;
            if ((599187 & i3) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i5 != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i4 == 0) {
                        textStyle3 = textStyle2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Alignment.Companion companion42 = Alignment.INSTANCE;
                    Alignment.Horizontal end22 = companion42.getEnd();
                    Arrangement arrangement22 = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement22.getTop(), end22, composerStartRestartGroup, 48);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap42 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier42 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier2);
                    ComposeUiNode.Companion companion222 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor42 = companion222.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Color color522 = color3;
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy22, companion222.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap42, companion222.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion222.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting()) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        color2 = color;
        i4 = i2 & 64;
        if (i4 != 0) {
        }
        textStyle2 = textStyle;
        if ((599187 & i3) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HistoryRowMeta_qpeXoU8$lambda$6$lambda$2$lambda$1$lambda$0(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HistoryRowMeta_qpeXoU8$lambda$6$lambda$5$lambda$4$lambda$3(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SummaryMeta(final TransactionSummary transactionSummary, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        TextStyle textM;
        Color color;
        final Modifier modifier2;
        long jM21425getFg0d7_KjU;
        Composer composerStartRestartGroup = composer.startRestartGroup(1048956805);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(transactionSummary) : composerStartRestartGroup.changedInstance(transactionSummary) ? 4 : 2) | i;
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
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1048956805, i3, -1, "com.robinhood.android.common.history.ui.SummaryMeta (HistoryRow.kt:170)");
            }
            TransactionSummary.LayoutType layoutType = transactionSummary.getLayoutType();
            composerStartRestartGroup.startReplaceGroup(-1269818611);
            if (layoutType == TransactionSummary.LayoutType.DEFAULT) {
                color = null;
                textM = null;
            } else {
                if (layoutType != TransactionSummary.LayoutType.PENDING_CRYPTO_ORDER) {
                    throw new NoWhenBranchMatchedException();
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Color colorM6701boximpl = Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU());
                textM = bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM();
                color = colorM6701boximpl;
            }
            composerStartRestartGroup.endReplaceGroup();
            int i6 = i3;
            modifier2 = modifier3;
            TransactionSummary.MetadataPrimaryComponent metadataPrimaryComponent = transactionSummary.getMetadataPrimaryComponent();
            CharSequence metadataSecondaryText = transactionSummary.getMetadataSecondaryText();
            TransactionSummary.Icon metadataSecondaryTextIcon = transactionSummary.getMetadataSecondaryTextIcon();
            if (transactionSummary.getHasCompletedExceptionally()) {
                composerStartRestartGroup.startReplaceGroup(-1269797528);
                jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21426getFg20d7_KjU();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1269796665);
                jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
            }
            composerStartRestartGroup.endReplaceGroup();
            m12239HistoryRowMetaqpeXoU8(modifier2, metadataPrimaryComponent, metadataSecondaryText, metadataSecondaryTextIcon, jM21425getFg0d7_KjU, color, textM, composerStartRestartGroup, (TransactionSummary.Icon.$stable << 9) | ((i6 >> 3) & 14) | (TransactionSummary.MetadataPrimaryComponent.$stable << 3), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.history.ui.HistoryRowKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HistoryRow4.SummaryMeta$lambda$8(transactionSummary, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SecondaryHistoryRow(Modifier modifier, final TransactionSummary.SecondarySummary secondarySummary, final boolean z, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        boolean z2;
        Function0<Unit> function02;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1014115016);
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
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(secondarySummary) : composerStartRestartGroup.changedInstance(secondarySummary) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
            }
        }
        if ((i2 & 8) == 0) {
            if ((i & 3072) == 0) {
                function02 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1014115016, i3, -1, "com.robinhood.android.common.history.ui.SecondaryHistoryRow (HistoryRow.kt:202)");
                }
                final Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                BentoBaseRowLayout.BentoBaseRowLayout(ClickableKt.m4893clickableXHw0xAI$default(modifier4, false, null, null, function02, 7, null), null, ComposableLambda3.rememberComposableLambda(-52692860, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.history.ui.HistoryRowKt.SecondaryHistoryRow.1
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
                            ComposerKt.traceEventStart(-52692860, i5, -1, "com.robinhood.android.common.history.ui.SecondaryHistoryRow.<anonymous> (HistoryRow.kt:209)");
                        }
                        IconKt.m5602Iconww6aTOc(PainterResources_androidKt.painterResource(HistoryRowDataState2.getStartIcon(secondarySummary).getResourceId(), composer3, 0), (String) null, modifier5, HistoryRowDataState2.getStartIconTint(secondarySummary, composer3, TransactionSummary.SecondarySummary.$stable), composer3, 48, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(649241733, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.history.ui.HistoryRowKt.SecondaryHistoryRow.2
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
                            ComposerKt.traceEventStart(649241733, i5, -1, "com.robinhood.android.common.history.ui.SecondaryHistoryRow.<anonymous> (HistoryRow.kt:206)");
                        }
                        BentoText2.m20747BentoText38GnDrw(String.valueOf(secondarySummary.getPrimaryText()), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16382);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(2053110919, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.history.ui.HistoryRowKt.SecondaryHistoryRow.3
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
                            ComposerKt.traceEventStart(2053110919, i5, -1, "com.robinhood.android.common.history.ui.SecondaryHistoryRow.<anonymous> (HistoryRow.kt:217)");
                        }
                        HistoryRow4.m12239HistoryRowMetaqpeXoU8(null, secondarySummary.getMetadataPrimaryComponent(), secondarySummary.getMetadataSecondaryText(), secondarySummary.getMetadataSecondaryTextIcon(), 0L, null, null, composer3, (TransactionSummary.MetadataPrimaryComponent.$stable << 3) | (TransactionSummary.Icon.$stable << 9), 113);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, z2, false, false, null, composer2, ((i3 << 15) & 29360128) | 200064, 0, 1874);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.history.ui.HistoryRowKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return HistoryRow4.SecondaryHistoryRow$lambda$9(modifier3, secondarySummary, z, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        function02 = function0;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final Modifier modifier52 = modifier4;
            composer2 = composerStartRestartGroup;
            BentoBaseRowLayout.BentoBaseRowLayout(ClickableKt.m4893clickableXHw0xAI$default(modifier4, false, null, null, function02, 7, null), null, ComposableLambda3.rememberComposableLambda(-52692860, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.history.ui.HistoryRowKt.SecondaryHistoryRow.1
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
                        ComposerKt.traceEventStart(-52692860, i5, -1, "com.robinhood.android.common.history.ui.SecondaryHistoryRow.<anonymous> (HistoryRow.kt:209)");
                    }
                    IconKt.m5602Iconww6aTOc(PainterResources_androidKt.painterResource(HistoryRowDataState2.getStartIcon(secondarySummary).getResourceId(), composer3, 0), (String) null, modifier52, HistoryRowDataState2.getStartIconTint(secondarySummary, composer3, TransactionSummary.SecondarySummary.$stable), composer3, 48, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(649241733, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.history.ui.HistoryRowKt.SecondaryHistoryRow.2
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
                        ComposerKt.traceEventStart(649241733, i5, -1, "com.robinhood.android.common.history.ui.SecondaryHistoryRow.<anonymous> (HistoryRow.kt:206)");
                    }
                    BentoText2.m20747BentoText38GnDrw(String.valueOf(secondarySummary.getPrimaryText()), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16382);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(2053110919, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.history.ui.HistoryRowKt.SecondaryHistoryRow.3
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
                        ComposerKt.traceEventStart(2053110919, i5, -1, "com.robinhood.android.common.history.ui.SecondaryHistoryRow.<anonymous> (HistoryRow.kt:217)");
                    }
                    HistoryRow4.m12239HistoryRowMetaqpeXoU8(null, secondarySummary.getMetadataPrimaryComponent(), secondarySummary.getMetadataSecondaryText(), secondarySummary.getMetadataSecondaryTextIcon(), 0L, null, null, composer3, (TransactionSummary.MetadataPrimaryComponent.$stable << 3) | (TransactionSummary.Icon.$stable << 9), 113);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, z2, false, false, null, composer2, ((i3 << 15) & 29360128) | 200064, 0, 1874);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void PrimaryHistoryRow(Modifier modifier, final TransactionSummary transactionSummary, boolean z, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        boolean z2;
        int i4;
        TransactionSummary.Badge badge;
        Modifier modifierM4893clickableXHw0xAI$default;
        final Modifier modifier3;
        final boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1746112406);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(transactionSummary) : composerStartRestartGroup.changedInstance(transactionSummary) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function0) ? 131072 : 65536;
            }
            i4 = i3;
            if ((74899 & i4) == 74898 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                boolean z4 = i6 == 0 ? true : z2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1746112406, i4, -1, "com.robinhood.android.common.history.ui.PrimaryHistoryRow (HistoryRow.kt:239)");
                }
                composerStartRestartGroup.startReplaceGroup(1318201793);
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                builder.append(String.valueOf(transactionSummary.getSecondaryText()));
                badge = transactionSummary.getBadge();
                composerStartRestartGroup.startReplaceGroup(1318204790);
                if (badge != null) {
                    CharSequence text = badge.getText();
                    TransactionSummary.Tint tint = badge.getTint();
                    builder.append(StringResources_androidKt.stringResource(C11183R.string.transaction_history_badge_separator, composerStartRestartGroup, 0));
                    int iPushStyle = builder.pushStyle(new SpanStyle(tint.getComposeColor(composerStartRestartGroup, 0), 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65530, (DefaultConstructorMarker) null));
                    try {
                        builder.append(text.toString());
                        Unit unit = Unit.INSTANCE;
                    } finally {
                        builder.pop(iPushStyle);
                    }
                }
                composerStartRestartGroup.endReplaceGroup();
                AnnotatedString annotatedString = builder.toAnnotatedString();
                composerStartRestartGroup.endReplaceGroup();
                if (function0 == null) {
                    modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(Modifier.INSTANCE, false, null, null, function0, 7, null);
                } else {
                    modifierM4893clickableXHw0xAI$default = Modifier.INSTANCE;
                }
                Modifier modifierThen = modifier4.then(modifierM4893clickableXHw0xAI$default);
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-926963417, true, new C112001(transactionSummary), composerStartRestartGroup, 54);
                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(236617768, true, new C112012(annotatedString), composerStartRestartGroup, 54);
                int i7 = i4 << 6;
                int i8 = (i7 & 3670016) | (458752 & i7) | 27648 | ((i4 << 15) & 29360128);
                boolean z5 = z4;
                modifier3 = modifier4;
                BentoBaseRowLayout.BentoBaseRowLayout(modifierThen, null, null, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, function2, function22, z5, false, false, null, composerStartRestartGroup, i8, 0, 1798);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z3 = z5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                z3 = z2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.history.ui.HistoryRowKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return HistoryRow4.PrimaryHistoryRow$lambda$13(modifier3, transactionSummary, z3, function2, function22, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        z2 = z;
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        i4 = i3;
        if ((74899 & i4) == 74898) {
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1318201793);
            AnnotatedString.Builder builder2 = new AnnotatedString.Builder(0, 1, null);
            builder2.append(String.valueOf(transactionSummary.getSecondaryText()));
            badge = transactionSummary.getBadge();
            composerStartRestartGroup.startReplaceGroup(1318204790);
            if (badge != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            AnnotatedString annotatedString2 = builder2.toAnnotatedString();
            composerStartRestartGroup.endReplaceGroup();
            if (function0 == null) {
            }
            Modifier modifierThen2 = modifier4.then(modifierM4893clickableXHw0xAI$default);
            ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambda3.rememberComposableLambda(-926963417, true, new C112001(transactionSummary), composerStartRestartGroup, 54);
            ComposableLambda composableLambdaRememberComposableLambda22 = ComposableLambda3.rememberComposableLambda(236617768, true, new C112012(annotatedString2), composerStartRestartGroup, 54);
            int i72 = i4 << 6;
            int i82 = (i72 & 3670016) | (458752 & i72) | 27648 | ((i4 << 15) & 29360128);
            boolean z52 = z4;
            modifier3 = modifier4;
            BentoBaseRowLayout.BentoBaseRowLayout(modifierThen2, null, null, composableLambdaRememberComposableLambda3, composableLambdaRememberComposableLambda22, function2, function22, z52, false, false, null, composerStartRestartGroup, i82, 0, 1798);
            if (ComposerKt.isTraceInProgress()) {
            }
            z3 = z52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: HistoryRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.common.history.ui.HistoryRowKt$PrimaryHistoryRow$1 */
    static final class C112001 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ TransactionSummary $summary;

        C112001(TransactionSummary transactionSummary) {
            this.$summary = transactionSummary;
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
                ComposerKt.traceEventStart(-926963417, i, -1, "com.robinhood.android.common.history.ui.PrimaryHistoryRow.<anonymous> (HistoryRow.kt:265)");
            }
            String strValueOf = String.valueOf(this.$summary.getPrimaryText());
            int iM7959getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8();
            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, HistoryRow4.HistoryRowPrimaryTextTestTag);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.common.history.ui.HistoryRowKt$PrimaryHistoryRow$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return HistoryRow4.C112001.invoke$lambda$1$lambda$0((SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoText2.m20747BentoText38GnDrw(strValueOf, SemanticsModifier6.semantics$default(modifierTestTag, false, (Function1) objRememberedValue, 1, null), null, null, null, null, null, iM7959getEllipsisgIe3tQ8, false, 1, 0, null, 0, null, composer, 817889280, 0, 15740);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SemanticsPropertyReceiver semantics) {
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: HistoryRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.common.history.ui.HistoryRowKt$PrimaryHistoryRow$2 */
    static final class C112012 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ AnnotatedString $secondaryText;

        C112012(AnnotatedString annotatedString) {
            this.$secondaryText = annotatedString;
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
                ComposerKt.traceEventStart(236617768, i, -1, "com.robinhood.android.common.history.ui.PrimaryHistoryRow.<anonymous> (HistoryRow.kt:275)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            TextStyle textS = bentoTheme.getTypography(composer, i2).getTextS();
            long jM21426getFg20d7_KjU = bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU();
            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, HistoryRow4.HistoryRowSecondaryTextTestTag);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.common.history.ui.HistoryRowKt$PrimaryHistoryRow$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return HistoryRow4.C112012.invoke$lambda$1$lambda$0((SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoText2.m20748BentoTextQnj7Zds(this.$secondaryText, SemanticsModifier6.semantics$default(modifierTestTag, false, (Function1) objRememberedValue, 1, null), Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, 0, false, 0, 0, null, null, textS, composer, 0, 0, 8184);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SemanticsPropertyReceiver semantics) {
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
            return Unit.INSTANCE;
        }
    }

    private static final void ExpandableHistoryRow(Modifier modifier, final TransactionSummary transactionSummary, final Function1<? super TransactionSummary.SecondarySummary, Unit> function1, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-51816929);
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
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(transactionSummary) : composerStartRestartGroup.changedInstance(transactionSummary) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            composer2 = composerStartRestartGroup;
        } else {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-51816929, i3, -1, "com.robinhood.android.common.history.ui.ExpandableHistoryRow (HistoryRow.kt:295)");
            }
            List<TransactionSummary.SecondarySummary> secondarySummaryRows = transactionSummary.getSecondarySummaryRows();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(ExpandableHistoryRow$lambda$15(snapshotState) ? 180.0f : 360.0f, null, 0.0f, "history_row_expansion_anim", null, composerStartRestartGroup, 3072, 22);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
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
            final Column6 column6 = Column6.INSTANCE;
            boolean z = !ExpandableHistoryRow$lambda$15(snapshotState);
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(267095919, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.history.ui.HistoryRowKt$ExpandableHistoryRow$1$1
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
                        ComposerKt.traceEventStart(267095919, i5, -1, "com.robinhood.android.common.history.ui.ExpandableHistoryRow.<anonymous>.<anonymous> (HistoryRow.kt:311)");
                    }
                    Column5 column5 = column6;
                    boolean z2 = !HistoryRow4.ExpandableHistoryRow$lambda$15(snapshotState);
                    EnterTransition enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null));
                    ExitTransition exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null));
                    final TransactionSummary transactionSummary2 = transactionSummary;
                    AnimatedVisibilityKt.AnimatedVisibility(column5, z2, (Modifier) null, enterTransitionPlus, exitTransitionPlus, (String) null, ComposableLambda3.rememberComposableLambda(-2134492089, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.history.ui.HistoryRowKt$ExpandableHistoryRow$1$1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer4, Integer num) {
                            invoke(animatedVisibilityScope, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer4, int i6) {
                            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2134492089, i6, -1, "com.robinhood.android.common.history.ui.ExpandableHistoryRow.<anonymous>.<anonymous>.<anonymous> (HistoryRow.kt:316)");
                            }
                            HistoryRow4.SummaryMeta(transactionSummary2, null, composer4, TransactionSummary.$stable, 2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), composer3, 1600512, 18);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54);
            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-93363792, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.history.ui.HistoryRowKt$ExpandableHistoryRow$1$2
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
                        ComposerKt.traceEventStart(-93363792, i5, -1, "com.robinhood.android.common.history.ui.ExpandableHistoryRow.<anonymous>.<anonymous> (HistoryRow.kt:320)");
                    }
                    IconKt.m5602Iconww6aTOc(PainterResources_androidKt.painterResource(ServerToBentoAssetMapper2.CARET_DOWN_16.getResourceId(), composer3, 0), "Caret", Rotate.rotate(Modifier.INSTANCE, HistoryRow4.ExpandableHistoryRow$lambda$17(snapshotState4AnimateFloatAsState)), BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21427getFg30d7_KjU(), composer3, 48, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceGroup(5004770);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.common.history.ui.HistoryRowKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HistoryRow4.ExpandableHistoryRow$lambda$20$lambda$19$lambda$18(snapshotState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            int i5 = (i3 & 14) | 224256 | (TransactionSummary.$stable << 3) | (i3 & 112);
            Modifier modifier5 = modifier4;
            PrimaryHistoryRow(modifier5, transactionSummary, z, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, (Function0) objRememberedValue2, composerStartRestartGroup, i5, 0);
            AnimatedVisibilityKt.AnimatedVisibility(column6, ExpandableHistoryRow$lambda$15(snapshotState), (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(-1554736239, true, new HistoryRow7(secondarySummaryRows, function1), composerStartRestartGroup, 54), composerStartRestartGroup, 1572870, 30);
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.history.ui.HistoryRowKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HistoryRow4.ExpandableHistoryRow$lambda$21(modifier3, transactionSummary, function1, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void ExpandableHistoryRow$lambda$16(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandableHistoryRow$lambda$20$lambda$19$lambda$18(SnapshotState snapshotState) {
        ExpandableHistoryRow$lambda$16(snapshotState, !ExpandableHistoryRow$lambda$15(snapshotState));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void LoadedHistoryRow(final TransactionSummary transactionSummary, final boolean z, final Function1<? super TransactionReference, Unit> function1, final Function1<? super DetailErrorType, Unit> function12, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1134760043);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(transactionSummary) : composerStartRestartGroup.changedInstance(transactionSummary) ? 4 : 2) | i;
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
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
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
                    ComposerKt.traceEventStart(1134760043, i3, -1, "com.robinhood.android.common.history.ui.LoadedHistoryRow (HistoryRow.kt:354)");
                }
                if (transactionSummary.getSecondarySummaryRows().isEmpty()) {
                    composerStartRestartGroup.startReplaceGroup(-50809947);
                    Modifier modifierAutoLogHistoryRowEvents = autoLogHistoryRowEvents(modifier4, transactionSummary);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean z2 = ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.common.history.ui.HistoryRowKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return HistoryRow4.LoadedHistoryRow$lambda$23$lambda$22(function1, function12, (TransactionSummary.SecondarySummary) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ExpandableHistoryRow(modifierAutoLogHistoryRowEvents, transactionSummary, (Function1) objRememberedValue, composerStartRestartGroup, (TransactionSummary.$stable << 3) | ((i3 << 3) & 112), 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-50155847);
                    Modifier modifierAutoLogHistoryRowEvents2 = autoLogHistoryRowEvents(modifier4, transactionSummary);
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-54220339, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.history.ui.HistoryRowKt.LoadedHistoryRow.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i5) {
                            if ((i5 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-54220339, i5, -1, "com.robinhood.android.common.history.ui.LoadedHistoryRow.<anonymous> (HistoryRow.kt:376)");
                            }
                            HistoryRow4.SummaryMeta(transactionSummary, null, composer2, TransactionSummary.$stable, 2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54);
                    ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(745354190, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.history.ui.HistoryRowKt.LoadedHistoryRow.3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i5) {
                            if ((i5 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(745354190, i5, -1, "com.robinhood.android.common.history.ui.LoadedHistoryRow.<anonymous> (HistoryRow.kt:379)");
                            }
                            if (z) {
                                BoxKt.Box(SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composer2, 0);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean z3 = ((i3 & 14) == 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changedInstance(transactionSummary))) | ((i3 & 896) == 256);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.common.history.ui.HistoryRowKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HistoryRow4.LoadedHistoryRow$lambda$25$lambda$24(transactionSummary, function1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    PrimaryHistoryRow(modifierAutoLogHistoryRowEvents2, transactionSummary, false, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, (Function0) objRememberedValue2, composerStartRestartGroup, ((i3 << 3) & 112) | (TransactionSummary.$stable << 3) | 27648, 4);
                    composerStartRestartGroup = composerStartRestartGroup;
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.history.ui.HistoryRowKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return HistoryRow4.LoadedHistoryRow$lambda$26(transactionSummary, z, function1, function12, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            if (transactionSummary.getSecondarySummaryRows().isEmpty()) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedHistoryRow$lambda$23$lambda$22(Function1 function1, Function1 function12, TransactionSummary.SecondarySummary secondarySummary) {
        Intrinsics.checkNotNullParameter(secondarySummary, "secondarySummary");
        TransactionReference transactionReference = secondarySummary.getTransactionReference();
        DetailErrorType detailErrorType = secondarySummary.getDetailErrorType();
        if (transactionReference != null) {
            function1.invoke(transactionReference);
        } else if (detailErrorType != null) {
            function12.invoke(detailErrorType);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedHistoryRow$lambda$25$lambda$24(TransactionSummary transactionSummary, Function1 function1) {
        TransactionReference transactionReference = transactionSummary.getTransactionReference();
        if (transactionReference != null) {
            function1.invoke(transactionReference);
        }
        return Unit.INSTANCE;
    }

    private static final Modifier autoLogHistoryRowEvents(Modifier modifier, final TransactionSummary transactionSummary) {
        return ComposedModifier2.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.robinhood.android.common.history.ui.HistoryRowKt.autoLogHistoryRowEvents.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x0268  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Modifier invoke(Modifier composed, Composer composer, int i) {
                Modifier modifierAutoLogEvents$default;
                UserInteractionEventData.Action action;
                ComboOrderDetailContext comboOrderDetailContext;
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceGroup(-1913483553);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1913483553, i, -1, "com.robinhood.android.common.history.ui.autoLogHistoryRowEvents.<anonymous> (HistoryRow.kt:393)");
                }
                TransactionReference transactionReference = transactionSummary.getTransactionReference();
                if (transactionReference == null) {
                    modifierAutoLogEvents$default = composed;
                } else {
                    boolean z = transactionReference.getSourceType() == HistoryTransactionType.COMBO_ORDER;
                    UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    if (z) {
                        action = UserInteractionEventData.Action.VIEW_COMBO_ORDER_DETAIL;
                    } else {
                        action = UserInteractionEventData.Action.ACTION_UNSPECIFIED;
                    }
                    UserInteractionEventData.Action action2 = action;
                    Component.ComponentType componentType = Component.ComponentType.HISTORY_ROW;
                    String string2 = transactionReference.getSourceId().toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    Component component = new Component(componentType, string2, null, 4, null);
                    String strName = transactionReference.getSourceType().name();
                    Locale ROOT = Locale.ROOT;
                    Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                    String lowerCase = strName.toLowerCase(ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    if (z) {
                        String string3 = transactionReference.getSourceId().toString();
                        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                        comboOrderDetailContext = new ComboOrderDetailContext(string3, null, 0.0f, 0, null, null, 62, null);
                    } else {
                        comboOrderDetailContext = null;
                    }
                    modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(composed, UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, action2, new Context(0, 0, 0, null, null, null, null, null, 0, null, lowerCase, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, comboOrderDetailContext, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16375, null), component, null, 35, null)), true, false, false, true, false, null, 108, null);
                    if (modifierAutoLogEvents$default == null) {
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierAutoLogEvents$default;
            }
        }, 1, null);
    }

    public static final void PlaceholderHistoryRow(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1635416745);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1635416745, i3, -1, "com.robinhood.android.common.history.ui.PlaceholderHistoryRow (HistoryRow.kt:430)");
            }
            LocalShowPlaceholder.Loadable(true, null, null, ComposableLambda3.rememberComposableLambda(604350233, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.history.ui.HistoryRowKt.PlaceholderHistoryRow.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(604350233, i5, -1, "com.robinhood.android.common.history.ui.PlaceholderHistoryRow.<anonymous> (HistoryRow.kt:432)");
                    }
                    BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifier, null, HistoryRow4.PlaceholderPrimaryText, HistoryRow4.PlaceholderSecondaryText, null, null, null, false, false, false, 0L, null, composer2, 3456, 0, 4082);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.history.ui.HistoryRowKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HistoryRow4.PlaceholderHistoryRow$lambda$27(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011d  */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HistoryRow(final StatefulHistoryEvent<? extends HistoryEvent> statefulHistoryEvent, final HistoryRow2 callbacks, Modifier modifier, boolean z, boolean z2, String str, ComposeHistoryRowDuxo composeHistoryRowDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        String str2;
        ComposeHistoryRowDuxo composeHistoryRowDuxo2;
        final boolean z5;
        boolean z6;
        String str3;
        int i7;
        final ComposeHistoryRowDuxo composeHistoryRowDuxo3;
        String strValueOf;
        HistoryEvent historyEvent;
        HistoryRowViewState historyRowViewStateHistoryRow$lambda$28;
        boolean z7;
        Modifier modifier3;
        boolean zChangedInstance;
        Object objRememberedValue;
        final boolean z8;
        final String str4;
        final boolean z9;
        final ComposeHistoryRowDuxo composeHistoryRowDuxo4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(2132882701);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(statefulHistoryEvent) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
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
                            str2 = str;
                            i3 |= composerStartRestartGroup.changed(str2) ? 131072 : 65536;
                        }
                        if ((i & 1572864) == 0) {
                            composeHistoryRowDuxo2 = composeHistoryRowDuxo;
                            i3 |= ((i2 & 64) == 0 && composerStartRestartGroup.changedInstance(composeHistoryRowDuxo2)) ? 1048576 : 524288;
                        } else {
                            composeHistoryRowDuxo2 = composeHistoryRowDuxo;
                        }
                        if ((i3 & 599187) == 599186 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier4 = modifier2;
                            composeHistoryRowDuxo4 = composeHistoryRowDuxo2;
                            z8 = z3;
                            z9 = z4;
                            str4 = str2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i8 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                z5 = i4 == 0 ? false : z3;
                                z6 = i5 == 0 ? false : z4;
                                str3 = i6 == 0 ? null : str2;
                                if ((i2 & 64) != 0) {
                                    if (str3 == null) {
                                        strValueOf = String.valueOf((statefulHistoryEvent == null || (historyEvent = statefulHistoryEvent.getHistoryEvent()) == null) ? null : historyEvent.getId());
                                    } else {
                                        strValueOf = str3;
                                    }
                                    composerStartRestartGroup.startReplaceGroup(-747520797);
                                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                                    if (current == null) {
                                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    }
                                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(ComposeHistoryRowDuxo.class), current, strValueOf, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.common.history.ui.HistoryRowKt$HistoryRow$$inlined$duxo$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                                lifecycle.addObserver(duxoLifecycleObserver);
                                                final Lifecycle lifecycle2 = lifecycle;
                                                return new DisposableEffectResult() { // from class: com.robinhood.android.common.history.ui.HistoryRowKt$HistoryRow$$inlined$duxo$1.1
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
                                    composeHistoryRowDuxo2 = (ComposeHistoryRowDuxo) baseDuxo;
                                    i3 &= -3670017;
                                }
                                ComposeHistoryRowDuxo composeHistoryRowDuxo5 = composeHistoryRowDuxo2;
                                i7 = i3;
                                composeHistoryRowDuxo3 = composeHistoryRowDuxo5;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                ComposeHistoryRowDuxo composeHistoryRowDuxo6 = composeHistoryRowDuxo2;
                                i7 = i3;
                                composeHistoryRowDuxo3 = composeHistoryRowDuxo6;
                                z5 = z3;
                                z6 = z4;
                                str3 = str2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2132882701, i7, -1, "com.robinhood.android.common.history.ui.HistoryRow (HistoryRow.kt:463)");
                            }
                            int i9 = i7;
                            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(composeHistoryRowDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                            composerStartRestartGroup = composerStartRestartGroup;
                            historyRowViewStateHistoryRow$lambda$28 = HistoryRow$lambda$28(snapshotState4CollectAsStateWithLifecycle);
                            if (historyRowViewStateHistoryRow$lambda$28 instanceof HistoryRowViewState.Loaded) {
                                z7 = z6;
                                modifier3 = modifier2;
                                if (!(historyRowViewStateHistoryRow$lambda$28 instanceof HistoryRowViewState.Loading)) {
                                    composerStartRestartGroup.startReplaceGroup(1000895076);
                                    composerStartRestartGroup.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composerStartRestartGroup.startReplaceGroup(963821780);
                                PlaceholderHistoryRow(modifier3, composerStartRestartGroup, (i9 >> 6) & 14, 0);
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                composerStartRestartGroup.startReplaceGroup(963038038);
                                TransactionSummary summary = ((HistoryRowViewState.Loaded) historyRowViewStateHistoryRow$lambda$28).getSummary();
                                composerStartRestartGroup.startReplaceGroup(-1746271574);
                                int i10 = i9 & 112;
                                boolean z10 = true;
                                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(composeHistoryRowDuxo3) | (i10 == 32 || ((i9 & 64) != 0 && composerStartRestartGroup.changedInstance(callbacks))) | ((i9 & 7168) == 2048);
                                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.common.history.ui.HistoryRowKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return HistoryRow4.HistoryRow$lambda$30$lambda$29(composeHistoryRowDuxo3, callbacks, z5, (TransactionReference) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                Function1 function1 = (Function1) objRememberedValue3;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                if (i10 != 32 && ((i9 & 64) == 0 || !composerStartRestartGroup.changedInstance(callbacks))) {
                                    z10 = false;
                                }
                                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (z10 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = new Function1() { // from class: com.robinhood.android.common.history.ui.HistoryRowKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return HistoryRow4.HistoryRow$lambda$32$lambda$31(callbacks, (DetailErrorType) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                }
                                Function1 function12 = (Function1) objRememberedValue4;
                                composerStartRestartGroup.endReplaceGroup();
                                int i11 = TransactionSummary.$stable | ((i9 >> 9) & 112) | ((i9 << 6) & 57344);
                                z7 = z6;
                                modifier3 = modifier2;
                                LoadedHistoryRow(summary, z7, function1, function12, modifier3, composerStartRestartGroup, i11, 0);
                                composerStartRestartGroup.endReplaceGroup();
                            }
                            HistoryEvent historyEvent2 = statefulHistoryEvent != null ? statefulHistoryEvent.getHistoryEvent() : null;
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            zChangedInstance = composerStartRestartGroup.changedInstance(statefulHistoryEvent) | composerStartRestartGroup.changedInstance(composeHistoryRowDuxo3);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.common.history.ui.HistoryRowKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return HistoryRow4.HistoryRow$lambda$35$lambda$34(statefulHistoryEvent, composeHistoryRowDuxo3, (DisposableEffectScope) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.DisposableEffect(historyEvent2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z8 = z5;
                            str4 = str3;
                            z9 = z7;
                            composeHistoryRowDuxo4 = composeHistoryRowDuxo3;
                            modifier4 = modifier3;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.history.ui.HistoryRowKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return HistoryRow4.HistoryRow$lambda$36(statefulHistoryEvent, callbacks, modifier4, z8, z9, str4, composeHistoryRowDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 196608;
                    str2 = str;
                    if ((i & 1572864) == 0) {
                    }
                    if ((i3 & 599187) == 599186) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i8 != 0) {
                            }
                            if (i4 == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 64) != 0) {
                            }
                            ComposeHistoryRowDuxo composeHistoryRowDuxo52 = composeHistoryRowDuxo2;
                            i7 = i3;
                            composeHistoryRowDuxo3 = composeHistoryRowDuxo52;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i92 = i7;
                            SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(composeHistoryRowDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                            composerStartRestartGroup = composerStartRestartGroup;
                            historyRowViewStateHistoryRow$lambda$28 = HistoryRow$lambda$28(snapshotState4CollectAsStateWithLifecycle2);
                            if (historyRowViewStateHistoryRow$lambda$28 instanceof HistoryRowViewState.Loaded) {
                            }
                            HistoryEvent historyEvent22 = statefulHistoryEvent != null ? statefulHistoryEvent.getHistoryEvent() : null;
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            zChangedInstance = composerStartRestartGroup.changedInstance(statefulHistoryEvent) | composerStartRestartGroup.changedInstance(composeHistoryRowDuxo3);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.common.history.ui.HistoryRowKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return HistoryRow4.HistoryRow$lambda$35$lambda$34(statefulHistoryEvent, composeHistoryRowDuxo3, (DisposableEffectScope) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.DisposableEffect(historyEvent22, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                z8 = z5;
                                str4 = str3;
                                z9 = z7;
                                composeHistoryRowDuxo4 = composeHistoryRowDuxo3;
                                modifier4 = modifier3;
                            }
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
                str2 = str;
                if ((i & 1572864) == 0) {
                }
                if ((i3 & 599187) == 599186) {
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
            str2 = str;
            if ((i & 1572864) == 0) {
            }
            if ((i3 & 599187) == 599186) {
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
        str2 = str;
        if ((i & 1572864) == 0) {
        }
        if ((i3 & 599187) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HistoryRow$lambda$30$lambda$29(ComposeHistoryRowDuxo composeHistoryRowDuxo, HistoryRow2 historyRow2, boolean z, TransactionReference reference) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        composeHistoryRowDuxo.logTap(reference);
        historyRow2.onHistoryRowClicked(new HistoryRow3.TransactionDetails(reference, z));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HistoryRow$lambda$32$lambda$31(HistoryRow2 historyRow2, DetailErrorType detailErrorType) {
        Intrinsics.checkNotNullParameter(detailErrorType, "detailErrorType");
        historyRow2.onHistoryRowClicked(new HistoryRow3.DetailError(detailErrorType));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult HistoryRow$lambda$35$lambda$34(StatefulHistoryEvent statefulHistoryEvent, ComposeHistoryRowDuxo composeHistoryRowDuxo, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final Disposable target = statefulHistoryEvent != null ? composeHistoryRowDuxo.setTarget(statefulHistoryEvent) : null;
        return new DisposableEffectResult() { // from class: com.robinhood.android.common.history.ui.HistoryRowKt$HistoryRow$lambda$35$lambda$34$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                Disposable disposable = target;
                if (disposable != null) {
                    disposable.dispose();
                }
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HistoryRow(final StatefulHistoryEvent<? extends HistoryEvent> state, Modifier modifier, boolean z, boolean z2, String str, ComposeHistoryRowDuxo composeHistoryRowDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        String str2;
        ComposeHistoryRowDuxo composeHistoryRowDuxo2;
        int i7;
        ComposeHistoryRowDuxo composeHistoryRowDuxo3;
        int i8;
        final Modifier modifier3;
        final boolean z5;
        final boolean z6;
        String str3;
        final Navigator navigator;
        final android.content.Context context;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        boolean zChangedInstance;
        Object objRememberedValue2;
        final ComposeHistoryRowDuxo composeHistoryRowDuxo4;
        final SnapshotState snapshotState2;
        DetailErrorType detailErrorTypeHistoryRow$lambda$38;
        final ComposeHistoryRowDuxo composeHistoryRowDuxo5;
        final boolean z7;
        final String str4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-258406383);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
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
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    z3 = z;
                    i3 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        z4 = z2;
                        i3 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 != 0) {
                        if ((i & 24576) == 0) {
                            str2 = str;
                            i3 |= composerStartRestartGroup.changed(str2) ? 16384 : 8192;
                        }
                        if ((196608 & i) == 0) {
                            if ((i2 & 32) == 0) {
                                composeHistoryRowDuxo2 = composeHistoryRowDuxo;
                                int i10 = composerStartRestartGroup.changedInstance(composeHistoryRowDuxo2) ? 131072 : 65536;
                                i3 |= i10;
                            } else {
                                composeHistoryRowDuxo2 = composeHistoryRowDuxo;
                            }
                            i3 |= i10;
                        } else {
                            composeHistoryRowDuxo2 = composeHistoryRowDuxo;
                        }
                        i7 = i3;
                        if ((i7 & 74899) == 74898 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            z7 = z3;
                            z6 = z4;
                            str4 = str2;
                            composeHistoryRowDuxo5 = composeHistoryRowDuxo2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier4 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                                boolean z8 = i4 == 0 ? false : z3;
                                boolean z9 = i5 == 0 ? false : z4;
                                if (i6 != 0) {
                                    str2 = "history_row_";
                                }
                                if ((i2 & 32) == 0) {
                                    String str5 = str2 + state.getHistoryEvent().getId();
                                    composerStartRestartGroup.startReplaceGroup(-747520797);
                                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                                    if (current == null) {
                                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    }
                                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(ComposeHistoryRowDuxo.class), current, str5, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.common.history.ui.HistoryRowKt$HistoryRow$$inlined$duxo$2
                                            @Override // kotlin.jvm.functions.Function1
                                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                                lifecycle.addObserver(duxoLifecycleObserver);
                                                final Lifecycle lifecycle2 = lifecycle;
                                                return new DisposableEffectResult() { // from class: com.robinhood.android.common.history.ui.HistoryRowKt$HistoryRow$$inlined$duxo$2.1
                                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                                    public void dispose() {
                                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                                    }
                                                };
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, 0);
                                    composerStartRestartGroup.endReplaceGroup();
                                    i7 &= -458753;
                                    composeHistoryRowDuxo3 = (ComposeHistoryRowDuxo) baseDuxo;
                                } else {
                                    composeHistoryRowDuxo3 = composeHistoryRowDuxo2;
                                }
                                i8 = i7;
                                modifier3 = modifier4;
                                z5 = z8;
                                z6 = z9;
                                str3 = str2;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 32) != 0) {
                                    i7 &= -458753;
                                }
                                modifier3 = modifier2;
                                z5 = z3;
                                z6 = z4;
                                str3 = str2;
                                composeHistoryRowDuxo3 = composeHistoryRowDuxo2;
                                i8 = i7;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-258406383, i8, -1, "com.robinhood.android.common.history.ui.HistoryRow (HistoryRow.kt:519)");
                            }
                            navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                            context = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            snapshotState = (SnapshotState) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(composeHistoryRowDuxo3) | ((i8 & 896) == 256);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                                composeHistoryRowDuxo4 = composeHistoryRowDuxo3;
                                HistoryRow2 historyRow2 = new HistoryRow2() { // from class: com.robinhood.android.common.history.ui.HistoryRowKt$HistoryRow$5$1
                                    @Override // com.robinhood.android.common.history.p082ui.HistoryRow2
                                    public final void onHistoryRowClicked(HistoryRow3 event) {
                                        Intrinsics.checkNotNullParameter(event, "event");
                                        if (event instanceof HistoryRow3.DetailError) {
                                            snapshotState.setValue(((HistoryRow3.DetailError) event).getType());
                                        } else {
                                            if (!(event instanceof HistoryRow3.TransactionDetails)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            HistoryRowCallbackExtensions.navigateToTransactionDetails$default(navigator, context, composeHistoryRowDuxo4.getHistoryNavigator(), ((HistoryRow3.TransactionDetails) event).getReference(), z5, null, 16, null);
                                        }
                                    }
                                };
                                snapshotState2 = snapshotState;
                                composerStartRestartGroup.updateRememberedValue(historyRow2);
                                objRememberedValue2 = historyRow2;
                            } else {
                                composeHistoryRowDuxo4 = composeHistoryRowDuxo3;
                                snapshotState2 = snapshotState;
                            }
                            HistoryRow2 historyRow22 = (HistoryRow2) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                            int i11 = i8 & 14;
                            int i12 = i8 << 3;
                            HistoryRow(state, historyRow22, modifier3, z5, z6, null, composeHistoryRowDuxo4, composerStartRestartGroup, i11 | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 3670016), 32);
                            detailErrorTypeHistoryRow$lambda$38 = HistoryRow$lambda$38(snapshotState2);
                            if (detailErrorTypeHistoryRow$lambda$38 != null) {
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue4 == companion.getEmpty()) {
                                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.common.history.ui.HistoryRowKt$$ExternalSyntheticLambda15
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return HistoryRow4.HistoryRow$lambda$43$lambda$42$lambda$41(snapshotState2);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                HistoryDetailErrorDialog2.HistoryDetailErrorDialog(detailErrorTypeHistoryRow$lambda$38, (Function0) objRememberedValue4, composerStartRestartGroup, 48);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composeHistoryRowDuxo5 = composeHistoryRowDuxo4;
                            z7 = z5;
                            str4 = str3;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.history.ui.HistoryRowKt$$ExternalSyntheticLambda16
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return HistoryRow4.HistoryRow$lambda$44(state, modifier3, z7, z6, str4, composeHistoryRowDuxo5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 24576;
                    str2 = str;
                    if ((196608 & i) == 0) {
                    }
                    i7 = i3;
                    if ((i7 & 74899) == 74898) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i9 == 0) {
                            }
                            if (i4 == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 != 0) {
                            }
                            if ((i2 & 32) == 0) {
                            }
                            i8 = i7;
                            modifier3 = modifier4;
                            z5 = z8;
                            z6 = z9;
                            str3 = str2;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                            context = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                            }
                            snapshotState = (SnapshotState) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(composeHistoryRowDuxo3) | ((i8 & 896) == 256);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance) {
                                composeHistoryRowDuxo4 = composeHistoryRowDuxo3;
                                HistoryRow2 historyRow23 = new HistoryRow2() { // from class: com.robinhood.android.common.history.ui.HistoryRowKt$HistoryRow$5$1
                                    @Override // com.robinhood.android.common.history.p082ui.HistoryRow2
                                    public final void onHistoryRowClicked(HistoryRow3 event) {
                                        Intrinsics.checkNotNullParameter(event, "event");
                                        if (event instanceof HistoryRow3.DetailError) {
                                            snapshotState.setValue(((HistoryRow3.DetailError) event).getType());
                                        } else {
                                            if (!(event instanceof HistoryRow3.TransactionDetails)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            HistoryRowCallbackExtensions.navigateToTransactionDetails$default(navigator, context, composeHistoryRowDuxo4.getHistoryNavigator(), ((HistoryRow3.TransactionDetails) event).getReference(), z5, null, 16, null);
                                        }
                                    }
                                };
                                snapshotState2 = snapshotState;
                                composerStartRestartGroup.updateRememberedValue(historyRow23);
                                objRememberedValue2 = historyRow23;
                                HistoryRow2 historyRow222 = (HistoryRow2) objRememberedValue2;
                                composerStartRestartGroup.endReplaceGroup();
                                int i112 = i8 & 14;
                                int i122 = i8 << 3;
                                HistoryRow(state, historyRow222, modifier3, z5, z6, null, composeHistoryRowDuxo4, composerStartRestartGroup, i112 | (i122 & 896) | (i122 & 7168) | (57344 & i122) | (i122 & 3670016), 32);
                                detailErrorTypeHistoryRow$lambda$38 = HistoryRow$lambda$38(snapshotState2);
                                if (detailErrorTypeHistoryRow$lambda$38 != null) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composeHistoryRowDuxo5 = composeHistoryRowDuxo4;
                                z7 = z5;
                                str4 = str3;
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                z4 = z2;
                i6 = i2 & 16;
                if (i6 != 0) {
                }
                str2 = str;
                if ((196608 & i) == 0) {
                }
                i7 = i3;
                if ((i7 & 74899) == 74898) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z3 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z4 = z2;
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            str2 = str;
            if ((196608 & i) == 0) {
            }
            i7 = i3;
            if ((i7 & 74899) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z3 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z4 = z2;
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        str2 = str;
        if ((196608 & i) == 0) {
        }
        i7 = i3;
        if ((i7 & 74899) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HistoryRow$lambda$43$lambda$42$lambda$41(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }
}
