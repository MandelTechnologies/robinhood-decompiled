package com.robinhood.android.common.portfolio.position;

import android.content.Context;
import android.net.Uri;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.LayoutDirection;
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
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.portfolio.position.SwipeRow3;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiMarkdownText2;
import com.robinhood.android.models.portfolio.PositionSwipeBehavior;
import com.robinhood.android.models.portfolio.api.ApiPositionSwipeBehavior;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.android.swipetodismiss.FractionalThreshold;
import com.robinhood.android.swipetodismiss.SwipeToDismiss;
import com.robinhood.android.swipetodismiss.SwipeToDismiss2;
import com.robinhood.android.swipetodismiss.SwipeToDismiss3;
import com.robinhood.android.swipetodismiss.SwipeToDismiss4;
import com.robinhood.android.swipetodismiss.ThresholdConfig;
import com.robinhood.compose.bento.component.BentoProgressIndicator2;
import com.robinhood.compose.bento.component.BentoProgressIndicator3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertMobilePresentationStyle;
import com.robinhood.models.serverdriven.experimental.api.MarkdownText;
import com.robinhood.models.serverdriven.experimental.api.TextStyle;
import com.robinhood.utils.compose.OnLifecycle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: SwipeRow.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aÚ\u0001\u0010\u0017\u001a\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000b2\u0019\b\u0002\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0002\b\u000f2\u0019\b\u0002\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0002\b\u000f2\u0019\b\u0002\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0002\b\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a9\u0010\"\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b \u0010!\u001a\u0018\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\fH\u0086@¢\u0006\u0004\b$\u0010%¨\u0006+²\u0006\u000e\u0010&\u001a\u00020\u001d8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001e\u001a\u00020\u001d8\n@\nX\u008a\u008e\u0002²\u0006\u0016\u0010)\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010*\u001a\u00020\u001d8\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/models/portfolio/PositionSwipeBehavior;", "swipingBehaviors", "Lkotlinx/collections/immutable/ImmutableMap;", "Lcom/robinhood/android/swipetodismiss/DismissValue;", "Lkotlin/Function0;", "", "actions", "content", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lcom/robinhood/android/swipetodismiss/DismissState;", "animation", "Lcom/robinhood/analytics/EventLogger;", "Lkotlin/ExtensionFunctionType;", "onSwipeStarted", "logOnSwipeLeft", "logOnSwipeRight", "Lcom/robinhood/android/navigation/Navigator;", "navigator", "", "onAlertWithReceiptDismissed", "SwipeRow", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableMap;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/robinhood/android/navigation/Navigator;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "Lcom/robinhood/android/swipetodismiss/DismissDirection;", "dismissDirection", "", "showSpinner", "swipeBehavior", "SwipeRowBackground-yWKOrZg", "(JLcom/robinhood/android/swipetodismiss/DismissDirection;ZLcom/robinhood/android/models/portfolio/PositionSwipeBehavior;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SwipeRowBackground", "dismissState", "runSwipeAnimationPreview", "(Lcom/robinhood/android/swipetodismiss/DismissState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "didVibrate", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "alert", "isRowResetting", "feature-lib-portfolio_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.portfolio.position.SwipeRowKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class SwipeRow3 {

    /* compiled from: SwipeRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.portfolio.position.SwipeRowKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ApiPositionSwipeBehavior.SwipeType.values().length];
            try {
                iArr[ApiPositionSwipeBehavior.SwipeType.START_TO_END.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiPositionSwipeBehavior.SwipeType.END_TO_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiPositionSwipeBehavior.SwipeType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SwipeToDismiss.values().length];
            try {
                iArr2[SwipeToDismiss.StartToEnd.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[SwipeToDismiss.EndToStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: SwipeRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.position.SwipeRowKt", m3645f = "SwipeRow.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_LOADING_INDICATOR_VALUE, EnumC7081g.SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE, EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_GREEN_CIRCLED_CHECKMARK_VALUE, 300}, m3647m = "runSwipeAnimationPreview")
    /* renamed from: com.robinhood.android.common.portfolio.position.SwipeRowKt$runSwipeAnimationPreview$1 */
    static final class C115661 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C115661(Continuation<? super C115661> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SwipeRow3.runSwipeAnimationPreview(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SwipeRow$lambda$32(ImmutableList immutableList, ImmutableMap immutableMap, Function2 function2, Modifier modifier, Function3 function3, Function1 function1, Function1 function12, Function1 function13, Navigator navigator, Function1 function14, int i, int i2, Composer composer, int i3) {
        SwipeRow(immutableList, immutableMap, function2, modifier, function3, function1, function12, function13, navigator, function14, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SwipeRowBackground_yWKOrZg$lambda$35$lambda$34$lambda$33(long j, SwipeToDismiss swipeToDismiss, boolean z, PositionSwipeBehavior positionSwipeBehavior, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m12329SwipeRowBackgroundyWKOrZg(j, swipeToDismiss, z, positionSwipeBehavior, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SwipeRowBackground_yWKOrZg$lambda$36(long j, SwipeToDismiss swipeToDismiss, boolean z, PositionSwipeBehavior positionSwipeBehavior, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m12329SwipeRowBackgroundyWKOrZg(j, swipeToDismiss, z, positionSwipeBehavior, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SwipeRow$lambda$1$lambda$0(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SwipeRow$lambda$3$lambda$2(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SwipeRow$lambda$5$lambda$4(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0322 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SwipeRow(final ImmutableList<PositionSwipeBehavior> swipingBehaviors, final ImmutableMap<SwipeToDismiss3, ? extends Function0<Unit>> actions, final Function2<? super Composer, ? super Integer, Unit> content, Modifier modifier, Function3<? super SwipeToDismiss2, ? super Composer, ? super Integer, Unit> function3, Function1<? super EventLogger, Unit> function1, Function1<? super EventLogger, Unit> function12, Function1<? super EventLogger, Unit> function13, Navigator navigator, Function1<? super String, Unit> function14, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function3<? super SwipeToDismiss2, ? super Composer, ? super Integer, Unit> lambda$1541770572$feature_lib_portfolio_externalDebug;
        int i5;
        Function1<? super EventLogger, Unit> function15;
        int i6;
        int i7;
        final Function1<? super EventLogger, Unit> function16;
        int i8;
        Function1<? super String, Unit> function17;
        Function1<? super EventLogger, Unit> function18;
        Navigator navigator2;
        Function1<? super EventLogger, Unit> function19;
        Function1<? super String, Unit> function110;
        Function1<? super EventLogger, Unit> function111;
        Modifier modifier3;
        Function3<? super SwipeToDismiss2, ? super Composer, ? super Integer, Unit> function32;
        Function1<? super EventLogger, Unit> function112;
        int i9;
        final Navigator navigator3;
        Object objRememberedValue;
        Composer.Companion companion;
        int i10;
        Object objRememberedValue2;
        Object objRememberedValue3;
        Object objRememberedValue4;
        Iterator<PositionSwipeBehavior> it;
        int i11;
        Boolean boolValueOf;
        SnapshotState snapshotState;
        SwipeToDismiss2 swipeToDismiss2;
        boolean zChanged;
        Object objRememberedValue5;
        SnapshotState snapshotState2;
        Object objRememberedValue6;
        Composer.Companion companion2;
        Object objRememberedValue7;
        Navigator navigator4;
        SwipeToDismiss3 currentValue;
        Boolean boolValueOf2;
        boolean zChanged2;
        Object objRememberedValue8;
        EventLogger eventLogger;
        SwipeToDismiss3 swipeToDismiss3;
        SwipeToDismiss2 swipeToDismiss22;
        Composer composer2;
        Boolean bool;
        Function3<? super SwipeToDismiss2, ? super Composer, ? super Integer, Unit> function33;
        Function1<? super EventLogger, Unit> function113;
        Function1<? super EventLogger, Unit> function114;
        Function1<? super String, Unit> function115;
        final Navigator navigator5;
        final Function1<? super EventLogger, Unit> function116;
        final Function1<? super String, Unit> function117;
        final Function3<? super SwipeToDismiss2, ? super Composer, ? super Integer, Unit> function34;
        final Modifier modifier4;
        SwipeToDismiss3 swipeToDismiss32;
        Tuples2 tuples2M3642to;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(swipingBehaviors, "swipingBehaviors");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(2004138237);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(swipingBehaviors) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(actions) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
        }
        int i12 = i2 & 8;
        if (i12 != 0) {
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
                    lambda$1541770572$feature_lib_portfolio_externalDebug = function3;
                    i3 |= composerStartRestartGroup.changedInstance(lambda$1541770572$feature_lib_portfolio_externalDebug) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 == 0) {
                    if ((196608 & i) == 0) {
                        function15 = function1;
                        i3 |= composerStartRestartGroup.changedInstance(function15) ? 131072 : 65536;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function12) ? 1048576 : 524288;
                    }
                    i7 = i2 & 128;
                    if (i7 == 0) {
                        i3 |= 12582912;
                        function16 = function13;
                    } else {
                        function16 = function13;
                        if ((i & 12582912) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function16) ? 8388608 : 4194304;
                        }
                    }
                    if ((i & 100663296) == 0) {
                        i3 |= ((i2 & 256) == 0 && composerStartRestartGroup.changedInstance(navigator)) ? 67108864 : 33554432;
                    }
                    i8 = i2 & 512;
                    if (i8 == 0) {
                        i3 |= 805306368;
                        function17 = function14;
                    } else {
                        function17 = function14;
                        if ((i & 805306368) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function17) ? 536870912 : 268435456;
                        }
                    }
                    if ((i3 & 306783379) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i12 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                lambda$1541770572$feature_lib_portfolio_externalDebug = SwipeRow.INSTANCE.getLambda$1541770572$feature_lib_portfolio_externalDebug();
                            }
                            if (i5 != 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue9 = new Function1() { // from class: com.robinhood.android.common.portfolio.position.SwipeRowKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return SwipeRow3.SwipeRow$lambda$1$lambda$0((EventLogger) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                function15 = (Function1) objRememberedValue9;
                            }
                            if (i6 == 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue10 = new Function1() { // from class: com.robinhood.android.common.portfolio.position.SwipeRowKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return SwipeRow3.SwipeRow$lambda$3$lambda$2((EventLogger) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                                }
                                function18 = (Function1) objRememberedValue10;
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                function18 = function12;
                            }
                            if (i7 != 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue11 = new Function1() { // from class: com.robinhood.android.common.portfolio.position.SwipeRowKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return SwipeRow3.SwipeRow$lambda$5$lambda$4((EventLogger) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                                }
                                function16 = (Function1) objRememberedValue11;
                                composerStartRestartGroup.endReplaceGroup();
                            }
                            if ((i2 & 256) == 0) {
                                navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                                i3 &= -234881025;
                            } else {
                                navigator2 = navigator;
                            }
                            function19 = function18;
                            if (i8 == 0) {
                                function110 = null;
                                i9 = i3;
                                function111 = function16;
                                navigator3 = navigator2;
                                modifier3 = modifier2;
                                function32 = lambda$1541770572$feature_lib_portfolio_externalDebug;
                                function112 = function15;
                            } else {
                                function110 = function17;
                                function111 = function16;
                                modifier3 = modifier2;
                                function32 = lambda$1541770572$feature_lib_portfolio_externalDebug;
                                function112 = function15;
                                i9 = i3;
                                navigator3 = navigator2;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                            }
                            function19 = function12;
                            function110 = function17;
                            function111 = function16;
                            modifier3 = modifier2;
                            function32 = lambda$1541770572$feature_lib_portfolio_externalDebug;
                            function112 = function15;
                            i9 = i3;
                            navigator3 = navigator;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2004138237, i9, -1, "com.robinhood.android.common.portfolio.position.SwipeRow (SwipeRow.kt:66)");
                        }
                        final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        SwipeToDismiss2 swipeToDismiss2RememberDismissState = SwipeToDismiss4.rememberDismissState(null, null, composerStartRestartGroup, 0, 3);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue != companion.getEmpty()) {
                            i10 = 2;
                            objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            i10 = 2;
                        }
                        SnapshotState snapshotState3 = (SnapshotState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, i10, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        SnapshotState snapshotState4 = (SnapshotState) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        Modifier modifier5 = modifier3;
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = SnapshotState3.mutableStateOf$default(null, null, i10, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        final SnapshotState snapshotState5 = (SnapshotState) objRememberedValue3;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, i10, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        final SnapshotState snapshotState6 = (SnapshotState) objRememberedValue4;
                        composerStartRestartGroup.endReplaceGroup();
                        HapticFeedback hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                        EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                        ArrayList arrayList = new ArrayList();
                        it = swipingBehaviors.iterator();
                        while (true) {
                            i11 = i9;
                            if (it.hasNext()) {
                                Map map = MapsKt.toMap(arrayList);
                                LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
                                Iterator it2 = map.entrySet().iterator();
                                while (it2.hasNext()) {
                                    Map.Entry entry = (Map.Entry) it2.next();
                                    int i13 = WhenMappings.$EnumSwitchMapping$1[((SwipeToDismiss) entry.getKey()).ordinal()];
                                    Iterator it3 = it2;
                                    if (i13 == 1) {
                                        swipeToDismiss32 = SwipeToDismiss3.DismissedToEnd;
                                    } else {
                                        if (i13 != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        swipeToDismiss32 = SwipeToDismiss3.DismissedToStart;
                                    }
                                    linkedHashMap.put(swipeToDismiss32, entry.getValue());
                                    it2 = it3;
                                }
                                GenericAlertContent<GenericAction> genericAlertContentSwipeRow$lambda$13 = SwipeRow$lambda$13(snapshotState5);
                                composerStartRestartGroup.startReplaceGroup(1831552376);
                                if (genericAlertContentSwipeRow$lambda$13 != null) {
                                    SduiAlert sduiAlert = SduiAlert.INSTANCE;
                                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(navigator3) | composerStartRestartGroup.changedInstance(context);
                                    Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                                    if (zChangedInstance || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue12 = new SduiActionHandler() { // from class: com.robinhood.android.common.portfolio.position.SwipeRowKt$SwipeRow$4$1$1

                                            /* compiled from: SwipeRow.kt */
                                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                            /* renamed from: com.robinhood.android.common.portfolio.position.SwipeRowKt$SwipeRow$4$1$1$WhenMappings */
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

                                            @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                                            /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                                            public final boolean mo15941handle(GenericAction action) {
                                                Intrinsics.checkNotNullParameter(action, "action");
                                                if (action instanceof GenericAction.Deeplink) {
                                                    try {
                                                        Navigator navigator6 = navigator3;
                                                        if (navigator6 != null) {
                                                            Navigator.DefaultImpls.handleDeepLink$default(navigator6, context, Uri.parse(((GenericAction.Deeplink) action).getValue2().getUri()), null, null, false, null, 44, null);
                                                        }
                                                        snapshotState5.setValue(null);
                                                        return true;
                                                    } catch (Exception unused) {
                                                        snapshotState5.setValue(null);
                                                        return false;
                                                    } catch (Throwable th) {
                                                        snapshotState5.setValue(null);
                                                        throw th;
                                                    }
                                                }
                                                if (action instanceof GenericAction.Dismiss) {
                                                    snapshotState5.setValue(null);
                                                    return true;
                                                }
                                                if (!(action instanceof GenericAction.InfoAlert)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                GenericAction.InfoAlert infoAlert = (GenericAction.InfoAlert) action;
                                                int i14 = WhenMappings.$EnumSwitchMapping$0[infoAlert.getValue2().getMobile_presentation_style().ordinal()];
                                                if (i14 == 1) {
                                                    snapshotState5.setValue(infoAlert.getValue2().getAlert());
                                                    return true;
                                                }
                                                if (i14 == 2) {
                                                    snapshotState5.setValue(null);
                                                    return false;
                                                }
                                                throw new NoWhenBranchMatchedException();
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                                    }
                                    SduiActionHandler sduiActionHandler = (SduiActionHandler) objRememberedValue12;
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(5004770);
                                    Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue13 = new Function0() { // from class: com.robinhood.android.common.portfolio.position.SwipeRowKt$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return SwipeRow3.SwipeRow$lambda$23$lambda$22$lambda$21(snapshotState5);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    sduiAlert.Dialog(genericAlertContentSwipeRow$lambda$13, sduiActionHandler, null, (Function0) objRememberedValue13, composerStartRestartGroup, (SduiAlert.$stable << 12) | 3072, 4);
                                    Unit unit = Unit.INSTANCE;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                SwipeToDismiss3 to = swipeToDismiss2RememberDismissState.getProgress().getTo();
                                PositionSwipeBehavior positionSwipeBehavior = (PositionSwipeBehavior) linkedHashMap.get(swipeToDismiss2RememberDismissState.getProgress().getTo());
                                if (positionSwipeBehavior != null) {
                                    boolValueOf = Boolean.valueOf(swipeToDismiss2RememberDismissState.getProgress().getFraction() > positionSwipeBehavior.getActuationPercentage());
                                } else {
                                    boolValueOf = null;
                                }
                                composerStartRestartGroup.startReplaceGroup(-1224400529);
                                boolean zChanged3 = composerStartRestartGroup.changed(swipeToDismiss2RememberDismissState) | composerStartRestartGroup.changedInstance(linkedHashMap) | composerStartRestartGroup.changedInstance(hapticFeedback);
                                Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                                if (zChanged3) {
                                    snapshotState = snapshotState5;
                                } else {
                                    snapshotState = snapshotState5;
                                    if (objRememberedValue14 != Composer.INSTANCE.getEmpty()) {
                                        swipeToDismiss2 = swipeToDismiss2RememberDismissState;
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(to, boolValueOf, (Function2) objRememberedValue14, composerStartRestartGroup, 0);
                                    Boolean boolValueOf3 = Boolean.valueOf(SwipeRow$lambda$16(snapshotState6));
                                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                                    zChanged = composerStartRestartGroup.changed(swipeToDismiss2);
                                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                    if (!zChanged || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue5 = new SwipeRow7(swipeToDismiss2, snapshotState6, snapshotState3, snapshotState4, null);
                                        snapshotState2 = snapshotState4;
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                    } else {
                                        snapshotState2 = snapshotState4;
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(boolValueOf3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 0);
                                    LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                                    composerStartRestartGroup.startReplaceGroup(5004770);
                                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                    companion2 = Composer.INSTANCE;
                                    if (objRememberedValue6 == companion2.getEmpty()) {
                                        objRememberedValue6 = new Function0() { // from class: com.robinhood.android.common.portfolio.position.SwipeRowKt$$ExternalSyntheticLambda4
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return SwipeRow3.SwipeRow$lambda$28$lambda$27(snapshotState6);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                    }
                                    Function0 function0 = (Function0) objRememberedValue6;
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(5004770);
                                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue7 == companion2.getEmpty()) {
                                        objRememberedValue7 = new Function0() { // from class: com.robinhood.android.common.portfolio.position.SwipeRowKt$$ExternalSyntheticLambda5
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return SwipeRow3.SwipeRow$lambda$30$lambda$29(snapshotState6);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    navigator4 = navigator3;
                                    OnLifecycle.OnLifecycle(lifecycleOwner, null, null, function0, null, null, (Function0) objRememberedValue7, null, composerStartRestartGroup, 1575936, 182);
                                    function32.invoke(swipeToDismiss2, composerStartRestartGroup, Integer.valueOf((i11 >> 9) & 112));
                                    currentValue = swipeToDismiss2.getCurrentValue();
                                    boolValueOf2 = Boolean.valueOf(SwipeRow$lambda$16(snapshotState6));
                                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                                    zChanged2 = composerStartRestartGroup.changed(swipeToDismiss2) | ((i11 & 112) != 32) | composerStartRestartGroup.changedInstance(linkedHashMap) | ((i11 & 29360128) != 8388608) | composerStartRestartGroup.changedInstance(current) | ((i11 & 3670016) != 1048576) | composerStartRestartGroup.changedInstance(navigator4) | ((i11 & 1879048192) != 536870912) | composerStartRestartGroup.changedInstance(context);
                                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                                    if (!zChanged2 || objRememberedValue8 == companion2.getEmpty()) {
                                        eventLogger = current;
                                        swipeToDismiss3 = currentValue;
                                        swipeToDismiss22 = swipeToDismiss2;
                                        composer2 = composerStartRestartGroup;
                                        bool = boolValueOf2;
                                        function33 = function32;
                                        function113 = function19;
                                        function114 = function111;
                                        function115 = function110;
                                        SwipeRow4 swipeRow4 = new SwipeRow4(actions, swipeToDismiss22, linkedHashMap, function114, eventLogger, function113, navigator4, context, snapshotState6, snapshotState2, snapshotState, function115, null);
                                        navigator4 = navigator4;
                                        composer2.updateRememberedValue(swipeRow4);
                                        objRememberedValue8 = swipeRow4;
                                    } else {
                                        eventLogger = current;
                                        swipeToDismiss3 = currentValue;
                                        swipeToDismiss22 = swipeToDismiss2;
                                        function33 = function32;
                                        composer2 = composerStartRestartGroup;
                                        bool = boolValueOf2;
                                        function113 = function19;
                                        function114 = function111;
                                        function115 = function110;
                                    }
                                    composer2.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(swipeToDismiss3, bool, (Function2) objRememberedValue8, composer2, 0);
                                    Function1<? super EventLogger, Unit> function118 = function112;
                                    function15 = function118;
                                    CompositionLocal3.CompositionLocalProvider(CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr), ComposableLambda3.rememberComposableLambda(970378301, true, new C1156511(swipeToDismiss22, modifier5, map, function118, eventLogger, snapshotState2, content), composer2, 54), composer2, ProvidedValue.$stable | 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    navigator5 = navigator4;
                                    function116 = function113;
                                    function117 = function115;
                                    function34 = function33;
                                    modifier4 = modifier5;
                                    function16 = function114;
                                }
                                objRememberedValue14 = new SwipeRow6(swipeToDismiss2RememberDismissState, linkedHashMap, hapticFeedback, snapshotState3, null);
                                swipeToDismiss2 = swipeToDismiss2RememberDismissState;
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(to, boolValueOf, (Function2) objRememberedValue14, composerStartRestartGroup, 0);
                                Boolean boolValueOf32 = Boolean.valueOf(SwipeRow$lambda$16(snapshotState6));
                                composerStartRestartGroup.startReplaceGroup(-1224400529);
                                zChanged = composerStartRestartGroup.changed(swipeToDismiss2);
                                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue5 = new SwipeRow7(swipeToDismiss2, snapshotState6, snapshotState3, snapshotState4, null);
                                    snapshotState2 = snapshotState4;
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                    composerStartRestartGroup.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(boolValueOf32, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 0);
                                    LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                                    composerStartRestartGroup.startReplaceGroup(5004770);
                                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                    companion2 = Composer.INSTANCE;
                                    if (objRememberedValue6 == companion2.getEmpty()) {
                                    }
                                    Function0 function02 = (Function0) objRememberedValue6;
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(5004770);
                                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue7 == companion2.getEmpty()) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    navigator4 = navigator3;
                                    OnLifecycle.OnLifecycle(lifecycleOwner2, null, null, function02, null, null, (Function0) objRememberedValue7, null, composerStartRestartGroup, 1575936, 182);
                                    function32.invoke(swipeToDismiss2, composerStartRestartGroup, Integer.valueOf((i11 >> 9) & 112));
                                    currentValue = swipeToDismiss2.getCurrentValue();
                                    boolValueOf2 = Boolean.valueOf(SwipeRow$lambda$16(snapshotState6));
                                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                                    zChanged2 = composerStartRestartGroup.changed(swipeToDismiss2) | ((i11 & 112) != 32) | composerStartRestartGroup.changedInstance(linkedHashMap) | ((i11 & 29360128) != 8388608) | composerStartRestartGroup.changedInstance(current) | ((i11 & 3670016) != 1048576) | composerStartRestartGroup.changedInstance(navigator4) | ((i11 & 1879048192) != 536870912) | composerStartRestartGroup.changedInstance(context);
                                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                                    if (zChanged2) {
                                        eventLogger = current;
                                        swipeToDismiss3 = currentValue;
                                        swipeToDismiss22 = swipeToDismiss2;
                                        composer2 = composerStartRestartGroup;
                                        bool = boolValueOf2;
                                        function33 = function32;
                                        function113 = function19;
                                        function114 = function111;
                                        function115 = function110;
                                        SwipeRow4 swipeRow42 = new SwipeRow4(actions, swipeToDismiss22, linkedHashMap, function114, eventLogger, function113, navigator4, context, snapshotState6, snapshotState2, snapshotState, function115, null);
                                        navigator4 = navigator4;
                                        composer2.updateRememberedValue(swipeRow42);
                                        objRememberedValue8 = swipeRow42;
                                        composer2.endReplaceGroup();
                                        EffectsKt.LaunchedEffect(swipeToDismiss3, bool, (Function2) objRememberedValue8, composer2, 0);
                                        Function1<? super EventLogger, Unit> function1182 = function112;
                                        function15 = function1182;
                                        CompositionLocal3.CompositionLocalProvider(CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr), ComposableLambda3.rememberComposableLambda(970378301, true, new C1156511(swipeToDismiss22, modifier5, map, function1182, eventLogger, snapshotState2, content), composer2, 54), composer2, ProvidedValue.$stable | 48);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        navigator5 = navigator4;
                                        function116 = function113;
                                        function117 = function115;
                                        function34 = function33;
                                        modifier4 = modifier5;
                                        function16 = function114;
                                    }
                                }
                            } else {
                                PositionSwipeBehavior next = it.next();
                                int i14 = WhenMappings.$EnumSwitchMapping$0[next.getSwipeType().ordinal()];
                                if (i14 == 1) {
                                    tuples2M3642to = Tuples4.m3642to(SwipeToDismiss.StartToEnd, next);
                                } else if (i14 == 2) {
                                    tuples2M3642to = Tuples4.m3642to(SwipeToDismiss.EndToStart, next);
                                } else {
                                    if (i14 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    tuples2M3642to = null;
                                }
                                if (tuples2M3642to != null) {
                                    arrayList.add(tuples2M3642to);
                                }
                                i9 = i11;
                            }
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        navigator5 = navigator;
                        modifier4 = modifier2;
                        function34 = lambda$1541770572$feature_lib_portfolio_externalDebug;
                        composer2 = composerStartRestartGroup;
                        function117 = function17;
                        function116 = function12;
                    }
                    final Function1<? super EventLogger, Unit> function119 = function15;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.portfolio.position.SwipeRowKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return SwipeRow3.SwipeRow$lambda$32(swipingBehaviors, actions, content, modifier4, function34, function119, function116, function16, navigator5, function117, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                function15 = function1;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                i7 = i2 & 128;
                if (i7 == 0) {
                }
                if ((i & 100663296) == 0) {
                }
                i8 = i2 & 512;
                if (i8 == 0) {
                }
                if ((i3 & 306783379) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 != 0) {
                        }
                        if ((i2 & 256) == 0) {
                        }
                        function19 = function18;
                        if (i8 == 0) {
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        SwipeToDismiss2 swipeToDismiss2RememberDismissState2 = SwipeToDismiss4.rememberDismissState(null, null, composerStartRestartGroup, 0, 3);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue != companion.getEmpty()) {
                        }
                        SnapshotState snapshotState32 = (SnapshotState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                        }
                        SnapshotState snapshotState42 = (SnapshotState) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        Modifier modifier52 = modifier3;
                        if (objRememberedValue3 == companion.getEmpty()) {
                        }
                        final SnapshotState snapshotState52 = (SnapshotState) objRememberedValue3;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                        }
                        final SnapshotState snapshotState62 = (SnapshotState) objRememberedValue4;
                        composerStartRestartGroup.endReplaceGroup();
                        HapticFeedback hapticFeedback2 = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                        EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                        ArrayList arrayList2 = new ArrayList();
                        it = swipingBehaviors.iterator();
                        while (true) {
                            i11 = i9;
                            if (it.hasNext()) {
                            }
                            i9 = i11;
                        }
                    }
                }
                final Function1 function1192 = function15;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            lambda$1541770572$feature_lib_portfolio_externalDebug = function3;
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            function15 = function1;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            i7 = i2 & 128;
            if (i7 == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i8 = i2 & 512;
            if (i8 == 0) {
            }
            if ((i3 & 306783379) == 306783378) {
            }
            final Function1 function11922 = function15;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        lambda$1541770572$feature_lib_portfolio_externalDebug = function3;
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        function15 = function1;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        i7 = i2 & 128;
        if (i7 == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i8 = i2 & 512;
        if (i8 == 0) {
        }
        if ((i3 & 306783379) == 306783378) {
        }
        final Function1 function119222 = function15;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SwipeRow$lambda$8(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SwipeRow$lambda$11(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SwipeRow$lambda$17(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SwipeRow$lambda$10(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final GenericAlertContent<GenericAction> SwipeRow$lambda$13(SnapshotState<GenericAlertContent<GenericAction>> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SwipeRow$lambda$16(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SwipeRow$lambda$7(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SwipeRow$lambda$23$lambda$22$lambda$21(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SwipeRow$lambda$30$lambda$29(SnapshotState snapshotState) {
        SwipeRow$lambda$17(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SwipeRow$lambda$28$lambda$27(SnapshotState snapshotState) {
        SwipeRow$lambda$17(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* compiled from: SwipeRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.common.portfolio.position.SwipeRowKt$SwipeRow$11 */
    static final class C1156511 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function2<Composer, Integer, Unit> $content;
        final /* synthetic */ Map<SwipeToDismiss, PositionSwipeBehavior> $directions;
        final /* synthetic */ SwipeToDismiss2 $dismissState;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function1<EventLogger, Unit> $onSwipeStarted;
        final /* synthetic */ SnapshotState<Boolean> $showSpinner$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C1156511(SwipeToDismiss2 swipeToDismiss2, Modifier modifier, Map<SwipeToDismiss, PositionSwipeBehavior> map, Function1<? super EventLogger, Unit> function1, EventLogger eventLogger, SnapshotState<Boolean> snapshotState, Function2<? super Composer, ? super Integer, Unit> function2) {
            this.$dismissState = swipeToDismiss2;
            this.$modifier = modifier;
            this.$directions = map;
            this.$onSwipeStarted = function1;
            this.$eventLogger = eventLogger;
            this.$showSpinner$delegate = snapshotState;
            this.$content = function2;
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
                ComposerKt.traceEventStart(970378301, i, -1, "com.robinhood.android.common.portfolio.position.SwipeRow.<anonymous> (SwipeRow.kt:207)");
            }
            SwipeToDismiss2 swipeToDismiss2 = this.$dismissState;
            Modifier modifier = this.$modifier;
            Set<SwipeToDismiss> setKeySet = this.$directions.keySet();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(this.$directions);
            final Map<SwipeToDismiss, PositionSwipeBehavior> map = this.$directions;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.common.portfolio.position.SwipeRowKt$SwipeRow$11$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SwipeRow3.C1156511.invoke$lambda$1$lambda$0(map, (SwipeToDismiss) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            final SwipeToDismiss2 swipeToDismiss22 = this.$dismissState;
            final Map<SwipeToDismiss, PositionSwipeBehavior> map2 = this.$directions;
            final SnapshotState<Boolean> snapshotState = this.$showSpinner$delegate;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1840396081, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.portfolio.position.SwipeRowKt.SwipeRow.11.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer2, Integer num) {
                    invoke(row5, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Row5 SwipeToDismiss, Composer composer2, int i2) {
                    Intrinsics.checkNotNullParameter(SwipeToDismiss, "$this$SwipeToDismiss");
                    if ((i2 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1840396081, i2, -1, "com.robinhood.android.common.portfolio.position.SwipeRow.<anonymous>.<anonymous> (SwipeRow.kt:215)");
                    }
                    SwipeToDismiss dismissDirection = swipeToDismiss22.getDismissDirection();
                    if (dismissDirection == null) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    PositionSwipeBehavior positionSwipeBehavior = map2.get(dismissDirection);
                    if (positionSwipeBehavior == null) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    Color composeColor = SduiColors2.toComposeColor(positionSwipeBehavior.getBackgroundColor(), composer2, 0);
                    if (composeColor == null) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        SwipeRow3.m12329SwipeRowBackgroundyWKOrZg(composeColor.getValue(), dismissDirection, SwipeRow3.SwipeRow$lambda$10(snapshotState), positionSwipeBehavior, null, composer2, 0, 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }
            }, composer, 54);
            final Function2<Composer, Integer, Unit> function2 = this.$content;
            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-163372754, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.portfolio.position.SwipeRowKt.SwipeRow.11.3
                public final void invoke(Row5 SwipeToDismiss, Composer composer2, int i2) {
                    Intrinsics.checkNotNullParameter(SwipeToDismiss, "$this$SwipeToDismiss");
                    if ((i2 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-163372754, i2, -1, "com.robinhood.android.common.portfolio.position.SwipeRow.<anonymous>.<anonymous> (SwipeRow.kt:226)");
                    }
                    Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.wrapContentSize$default(Modifier.INSTANCE, null, false, 3, null), BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
                    Function2<Composer, Integer, Unit> function22 = function2;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM4872backgroundbw27NRU$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    function22.invoke(composer2, 0);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer2, Integer num) {
                    invoke(row5, composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composer, 54);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$onSwipeStarted) | composer.changedInstance(this.$eventLogger);
            final Function1<EventLogger, Unit> function12 = this.$onSwipeStarted;
            final EventLogger eventLogger = this.$eventLogger;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.common.portfolio.position.SwipeRowKt$SwipeRow$11$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SwipeRow3.C1156511.invoke$lambda$3$lambda$2(function12, eventLogger);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            SwipeToDismiss4.SwipeToDismiss(swipeToDismiss2, modifier, setKeySet, function1, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, (Function0) objRememberedValue2, composer, 221184, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ThresholdConfig invoke$lambda$1$lambda$0(Map map, SwipeToDismiss direction) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            PositionSwipeBehavior positionSwipeBehavior = (PositionSwipeBehavior) map.get(direction);
            return new FractionalThreshold(positionSwipeBehavior != null ? positionSwipeBehavior.getActuationPercentage() : 0.33f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(Function1 function1, EventLogger eventLogger) {
            function1.invoke(eventLogger);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015d  */
    /* renamed from: SwipeRowBackground-yWKOrZg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m12329SwipeRowBackgroundyWKOrZg(final long j, final SwipeToDismiss swipeToDismiss, final boolean z, final PositionSwipeBehavior positionSwipeBehavior, Modifier modifier, Composer composer, final int i, final int i2) {
        long j2;
        int i3;
        final PositionSwipeBehavior positionSwipeBehavior2;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Modifier modifier3;
        int i5;
        final Modifier modifier4;
        Alignment centerStart;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(2039764192);
        int currentMarker = composerStartRestartGroup.getCurrentMarker();
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            j2 = j;
        } else {
            j2 = j;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(j2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(swipeToDismiss.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                positionSwipeBehavior2 = positionSwipeBehavior;
                i3 |= composerStartRestartGroup.changedInstance(positionSwipeBehavior2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                }
                if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                } else {
                    final Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2039764192, i3, -1, "com.robinhood.android.common.portfolio.position.SwipeRowBackground (SwipeRow.kt:246)");
                    }
                    Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier5, 0.0f, 1, null), Color.m6705copywmQWz5c$default(j2, 0.15f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    Alignment.Companion companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(1928511118);
                    if (!z) {
                        composerStartRestartGroup.startReplaceGroup(1928508513);
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        Modifier modifierAlign = boxScopeInstance.align(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), companion.getCenter());
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAlign);
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
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                        composerStartRestartGroup.startReplaceGroup(-1248996381);
                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.wrapContentSize$default(companion3, null, false, 3, null), 0.0f, composerStartRestartGroup, 6, 1);
                        int i6 = WhenMappings.$EnumSwitchMapping$1[swipeToDismiss.ordinal()];
                        if (i6 == 1) {
                            centerStart = companion.getCenterStart();
                        } else {
                            if (i6 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            centerStart = companion.getCenterEnd();
                        }
                        Modifier modifierAlign2 = boxScopeInstance.align(modifierM21623defaultHorizontalPaddingrAjV9yQ, centerStart);
                        Color composeColor = SduiColors2.toComposeColor(positionSwipeBehavior2.getTextColor(), composerStartRestartGroup, 0);
                        if (composeColor != null) {
                            BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(modifierAlign2, BentoProgressIndicator3.f5151S, composeColor.getValue(), composerStartRestartGroup, 48, 0);
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceGroup();
                            modifier3 = modifier5;
                        } else {
                            composerStartRestartGroup.endToMarker(currentMarker);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup2 != null) {
                                scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.common.portfolio.position.SwipeRowKt$$ExternalSyntheticLambda7
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return SwipeRow3.SwipeRowBackground_yWKOrZg$lambda$35$lambda$34$lambda$33(j, swipeToDismiss, z, positionSwipeBehavior2, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                    } else {
                        modifier3 = modifier5;
                        composerStartRestartGroup.startReplaceGroup(1929339499);
                        MarkdownText markdownTextCopy$default = MarkdownText.copy$default(positionSwipeBehavior.getText(), null, TextStyle.TEXT_MEDIUM_BOLD, null, positionSwipeBehavior.getTextColor(), null, 21, null);
                        int i7 = WhenMappings.$EnumSwitchMapping$1[swipeToDismiss.ordinal()];
                        if (i7 == 1) {
                            i5 = 8388611;
                        } else {
                            if (i7 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i5 = 8388613;
                        }
                        SduiMarkdownText2.SduiMarkdownText(markdownTextCopy$default, boxScopeInstance.align(SizeKt.fillMaxWidth$default(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composerStartRestartGroup, 6, 1), 0.0f, 1, null), companion.getCenter()), Integer.valueOf(i5), 0, 0, composerStartRestartGroup, 0, 24);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.portfolio.position.SwipeRowKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SwipeRow3.SwipeRowBackground_yWKOrZg$lambda$36(j, swipeToDismiss, z, positionSwipeBehavior, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier5, 0.0f, 1, null), Color.m6705copywmQWz5c$default(j2, 0.15f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                Alignment.Companion companion4 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default2);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy3, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(1928511118);
                    if (!z) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier3;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        positionSwipeBehavior2 = positionSwipeBehavior;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ef, code lost:
    
        if (r9.animateInternalToOffset(0.0f, r10, r0) != r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095 A[PHI: r9
      0x0095: PHI (r9v4 com.robinhood.android.swipetodismiss.DismissState) = (r9v1 com.robinhood.android.swipetodismiss.DismissState), (r9v6 com.robinhood.android.swipetodismiss.DismissState) binds: [B:24:0x0092, B:18:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1 A[PHI: r9
      0x00a1: PHI (r9v7 com.robinhood.android.swipetodismiss.DismissState) = (r9v4 com.robinhood.android.swipetodismiss.DismissState), (r9v9 com.robinhood.android.swipetodismiss.DismissState) binds: [B:27:0x009e, B:17:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1 A[PHI: r9
      0x00b1: PHI (r9v10 com.robinhood.android.swipetodismiss.DismissState) = (r9v7 com.robinhood.android.swipetodismiss.DismissState), (r9v12 com.robinhood.android.swipetodismiss.DismissState) binds: [B:30:0x00ae, B:16:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bf A[PHI: r9
      0x00bf: PHI (r9v13 com.robinhood.android.swipetodismiss.DismissState) = (r9v10 com.robinhood.android.swipetodismiss.DismissState), (r9v15 com.robinhood.android.swipetodismiss.DismissState) binds: [B:33:0x00bc, B:15:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4 A[PHI: r9
      0x00d4: PHI (r9v16 com.robinhood.android.swipetodismiss.DismissState) = (r9v13 com.robinhood.android.swipetodismiss.DismissState), (r9v18 com.robinhood.android.swipetodismiss.DismissState) binds: [B:36:0x00d1, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0 A[PHI: r9
      0x00e0: PHI (r9v19 com.robinhood.android.swipetodismiss.DismissState) = (r9v16 com.robinhood.android.swipetodismiss.DismissState), (r9v22 com.robinhood.android.swipetodismiss.DismissState) binds: [B:39:0x00dd, B:13:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object runSwipeAnimationPreview(SwipeToDismiss2 swipeToDismiss2, Continuation<? super Unit> continuation) {
        C115661 c115661;
        float minBound;
        AnimationSpec<Float> animationSpec;
        AnimationSpec<Float> animationSpec2;
        float maxBound;
        AnimationSpec<Float> animationSpec3;
        if (continuation instanceof C115661) {
            c115661 = (C115661) continuation;
            int i = c115661.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c115661.label = i - Integer.MIN_VALUE;
            } else {
                c115661 = new C115661(continuation);
            }
        }
        Object obj = c115661.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c115661.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                c115661.L$0 = swipeToDismiss2;
                c115661.label = 1;
                if (DelayKt.delay(1000L, c115661) != coroutine_suspended) {
                    minBound = swipeToDismiss2.getMinBound() * 0.25f;
                    animationSpec = swipeToDismiss2.getAnimationSpec();
                    c115661.L$0 = swipeToDismiss2;
                    c115661.label = 2;
                    if (swipeToDismiss2.animateInternalToOffset(minBound, animationSpec, c115661) != coroutine_suspended) {
                        c115661.L$0 = swipeToDismiss2;
                        c115661.label = 3;
                        if (DelayKt.delay(1000L, c115661) != coroutine_suspended) {
                            animationSpec2 = swipeToDismiss2.getAnimationSpec();
                            c115661.L$0 = swipeToDismiss2;
                            c115661.label = 4;
                            if (swipeToDismiss2.animateInternalToOffset(0.0f, animationSpec2, c115661) != coroutine_suspended) {
                                c115661.L$0 = swipeToDismiss2;
                                c115661.label = 5;
                                if (DelayKt.delay(500L, c115661) != coroutine_suspended) {
                                    maxBound = swipeToDismiss2.getMaxBound() * 0.25f;
                                    animationSpec3 = swipeToDismiss2.getAnimationSpec();
                                    c115661.L$0 = swipeToDismiss2;
                                    c115661.label = 6;
                                    if (swipeToDismiss2.animateInternalToOffset(maxBound, animationSpec3, c115661) != coroutine_suspended) {
                                        c115661.L$0 = swipeToDismiss2;
                                        c115661.label = 7;
                                        if (DelayKt.delay(1000L, c115661) != coroutine_suspended) {
                                            AnimationSpec<Float> animationSpec4 = swipeToDismiss2.getAnimationSpec();
                                            c115661.L$0 = null;
                                            c115661.label = 8;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutine_suspended;
            case 1:
                swipeToDismiss2 = (SwipeToDismiss2) c115661.L$0;
                ResultKt.throwOnFailure(obj);
                minBound = swipeToDismiss2.getMinBound() * 0.25f;
                animationSpec = swipeToDismiss2.getAnimationSpec();
                c115661.L$0 = swipeToDismiss2;
                c115661.label = 2;
                if (swipeToDismiss2.animateInternalToOffset(minBound, animationSpec, c115661) != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 2:
                swipeToDismiss2 = (SwipeToDismiss2) c115661.L$0;
                ResultKt.throwOnFailure(obj);
                c115661.L$0 = swipeToDismiss2;
                c115661.label = 3;
                if (DelayKt.delay(1000L, c115661) != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 3:
                swipeToDismiss2 = (SwipeToDismiss2) c115661.L$0;
                ResultKt.throwOnFailure(obj);
                animationSpec2 = swipeToDismiss2.getAnimationSpec();
                c115661.L$0 = swipeToDismiss2;
                c115661.label = 4;
                if (swipeToDismiss2.animateInternalToOffset(0.0f, animationSpec2, c115661) != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 4:
                swipeToDismiss2 = (SwipeToDismiss2) c115661.L$0;
                ResultKt.throwOnFailure(obj);
                c115661.L$0 = swipeToDismiss2;
                c115661.label = 5;
                if (DelayKt.delay(500L, c115661) != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 5:
                swipeToDismiss2 = (SwipeToDismiss2) c115661.L$0;
                ResultKt.throwOnFailure(obj);
                maxBound = swipeToDismiss2.getMaxBound() * 0.25f;
                animationSpec3 = swipeToDismiss2.getAnimationSpec();
                c115661.L$0 = swipeToDismiss2;
                c115661.label = 6;
                if (swipeToDismiss2.animateInternalToOffset(maxBound, animationSpec3, c115661) != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 6:
                swipeToDismiss2 = (SwipeToDismiss2) c115661.L$0;
                ResultKt.throwOnFailure(obj);
                c115661.L$0 = swipeToDismiss2;
                c115661.label = 7;
                if (DelayKt.delay(1000L, c115661) != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 7:
                swipeToDismiss2 = (SwipeToDismiss2) c115661.L$0;
                ResultKt.throwOnFailure(obj);
                AnimationSpec<Float> animationSpec42 = swipeToDismiss2.getAnimationSpec();
                c115661.L$0 = null;
                c115661.label = 8;
                break;
            case 8:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
