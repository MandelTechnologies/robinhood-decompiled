package androidx.compose.p011ui.contentcapture;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMap2;
import androidx.collection.IntObjectMap3;
import androidx.collection.ScatterMap6;
import androidx.compose.p011ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.internal.InlineClassHelper4;
import androidx.compose.p011ui.node.Owner;
import androidx.compose.p011ui.platform.AndroidComposeView;
import androidx.compose.p011ui.platform.SemanticsNodeCopy;
import androidx.compose.p011ui.platform.SemanticsNodeWithAdjustedBounds;
import androidx.compose.p011ui.platform.SemanticsUtils_androidKt;
import androidx.compose.p011ui.platform.coreshims.AutofillIdCompat;
import androidx.compose.p011ui.platform.coreshims.ContentCaptureSessionCompat;
import androidx.compose.p011ui.platform.coreshims.ViewCompatShims;
import androidx.compose.p011ui.platform.coreshims.ViewStructureCompat;
import androidx.compose.p011ui.semantics.AccessibilityAction;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.p011ui.semantics.SemanticsActions;
import androidx.compose.p011ui.semantics.SemanticsConfiguration;
import androidx.compose.p011ui.semantics.SemanticsConfiguration2;
import androidx.compose.p011ui.semantics.SemanticsNode;
import androidx.compose.p011ui.semantics.SemanticsProperties;
import androidx.compose.p011ui.semantics.SemanticsPropertyKey;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextLayoutInput;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.unit.TextUnit;
import androidx.compose.p011ui.util.ListUtils2;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.Channel3;
import kotlinx.coroutines.channels.Channel4;

/* compiled from: AndroidContentCaptureManager.android.kt */
@Metadata(m3635d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u0097\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0006\u0097\u0001\u0098\u0001\u0099\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010\rJ\u000f\u0010 \u001a\u00020\u000bH\u0002¢\u0006\u0004\b \u0010\rJ\u001d\u0010#\u001a\u0004\u0018\u00010\"*\u00020\u000e2\u0006\u0010!\u001a\u00020\u0019H\u0002¢\u0006\u0004\b#\u0010$J-\u0010'\u001a\u00020\u000b*\u00020\u000e2\u0018\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0%H\u0002¢\u0006\u0004\b'\u0010(J!\u0010+\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u00192\b\u0010*\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u0019H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u000bH\u0002¢\u0006\u0004\b/\u0010\rJ\u001f\u00101\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u000eH\u0002¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000eH\u0002¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000eH\u0002¢\u0006\u0004\b5\u00104J\u000f\u00106\u001a\u00020\u000bH\u0002¢\u0006\u0004\b6\u0010\rJ\u000f\u00107\u001a\u00020\u000bH\u0002¢\u0006\u0004\b7\u0010\rJ\u000f\u00108\u001a\u00020\u000bH\u0002¢\u0006\u0004\b8\u0010\rJ\u0017\u0010;\u001a\u00020\u000b2\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u000b2\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b=\u0010<J\u0017\u0010@\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\bB\u0010AJ\u0010\u0010E\u001a\u00020\u000bH\u0080@¢\u0006\u0004\bC\u0010DJ\u000f\u0010G\u001a\u00020\u000bH\u0000¢\u0006\u0004\bF\u0010\rJ\u000f\u0010I\u001a\u00020\u000bH\u0000¢\u0006\u0004\bH\u0010\rJ\u000f\u0010K\u001a\u00020\u000bH\u0000¢\u0006\u0004\bJ\u0010\rJ\u000f\u0010M\u001a\u00020\u000bH\u0000¢\u0006\u0004\bL\u0010\rJ\u000f\u0010O\u001a\u00020\u000bH\u0000¢\u0006\u0004\bN\u0010\rJ/\u0010Y\u001a\u00020\u000b2\u0006\u0010Q\u001a\u00020P2\u0006\u0010S\u001a\u00020R2\u000e\u0010V\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010U0TH\u0001¢\u0006\u0004\bW\u0010XJ'\u0010`\u001a\u00020\u000b2\u0006\u0010Z\u001a\u00020\u00002\u000e\u0010]\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\\0[H\u0001¢\u0006\u0004\b^\u0010_R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010a\u001a\u0004\bb\u0010cR*\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR*\u0010i\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bi\u0010j\u0012\u0004\bo\u0010\r\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020q0p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010u\u001a\u00020t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0016\u0010x\u001a\u00020w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u0016\u0010{\u001a\u00020z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u001a\u0010~\u001a\b\u0012\u0004\u0012\u00020\u000b0}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR \u0010\u0081\u0001\u001a\u00030\u0080\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R.\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148@@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0005\b\u0089\u0001\u0010\u0018R\u0018\u0010\u008a\u0001\u001a\u00020t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010vR \u0010\u008c\u0001\u001a\t\u0012\u0004\u0012\u00020\u00100\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0019\u0010\u008e\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0018\u0010\u0090\u0001\u001a\u00020z8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010|R\u0018\u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0017\u0010\u0096\u0001\u001a\u00020z8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001¨\u0006\u009a\u0001"}, m3636d2 = {"Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;", "Landroidx/compose/ui/contentcapture/ContentCaptureManager;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroidx/compose/ui/platform/AndroidComposeView;", "view", "Lkotlin/Function0;", "Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", "onContentCaptureSession", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function0;)V", "", "sendContentCaptureDisappearEvents", "()V", "Landroidx/compose/ui/semantics/SemanticsNode;", "newNode", "Landroidx/compose/ui/platform/SemanticsNodeCopy;", "oldNode", "sendContentCaptureAppearEvents", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/compose/ui/platform/SemanticsNodeCopy;)V", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "newSemanticsNodes", "checkForContentCapturePropertyChanges", "(Landroidx/collection/IntObjectMap;)V", "", "id", "", "newText", "sendContentCaptureTextUpdateEvent", "(ILjava/lang/String;)V", "updateSemanticsCopy", "notifySubtreeStateChangeIfNeeded", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;", "toViewStructure", "(Landroidx/compose/ui/semantics/SemanticsNode;I)Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;", "Lkotlin/Function2;", "action", "fastForEachReplacedVisibleChildren", "(Landroidx/compose/ui/semantics/SemanticsNode;Lkotlin/jvm/functions/Function2;)V", "virtualId", "viewStructure", "bufferContentCaptureViewAppeared", "(ILandroidx/compose/ui/platform/coreshims/ViewStructureCompat;)V", "bufferContentCaptureViewDisappeared", "(I)V", "notifyContentCaptureChanges", "node", "updateBuffersOnAppeared", "(ILandroidx/compose/ui/semantics/SemanticsNode;)V", "updateBuffersOnDisappeared", "(Landroidx/compose/ui/semantics/SemanticsNode;)V", "updateTranslationOnAppeared", "showTranslatedText", "hideTranslatedText", "clearTranslatedText", "Landroid/view/View;", "v", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "Landroidx/lifecycle/LifecycleOwner;", "owner", "onStart", "(Landroidx/lifecycle/LifecycleOwner;)V", "onStop", "boundsUpdatesEventLoop$ui_release", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "boundsUpdatesEventLoop", "onSemanticsChange$ui_release", "onSemanticsChange", "onLayoutChange$ui_release", "onLayoutChange", "onShowTranslation$ui_release", "onShowTranslation", "onHideTranslation$ui_release", "onHideTranslation", "onClearTranslation$ui_release", "onClearTranslation", "", "virtualIds", "", "supportedFormats", "Ljava/util/function/Consumer;", "Landroid/view/translation/ViewTranslationRequest;", "requestsCollector", "onCreateVirtualViewTranslationRequests$ui_release", "([J[ILjava/util/function/Consumer;)V", "onCreateVirtualViewTranslationRequests", "contentCaptureManager", "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", "response", "onVirtualViewTranslationResponses$ui_release", "(Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;Landroid/util/LongSparseArray;)V", "onVirtualViewTranslationResponses", "Landroidx/compose/ui/platform/AndroidComposeView;", "getView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "Lkotlin/jvm/functions/Function0;", "getOnContentCaptureSession", "()Lkotlin/jvm/functions/Function0;", "setOnContentCaptureSession", "(Lkotlin/jvm/functions/Function0;)V", "contentCaptureSession", "Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", "getContentCaptureSession$ui_release", "()Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", "setContentCaptureSession$ui_release", "(Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;)V", "getContentCaptureSession$ui_release$annotations", "", "Landroidx/compose/ui/contentcapture/ContentCaptureEvent;", "bufferedEvents", "Ljava/util/List;", "", "SendRecurringContentCaptureEventsIntervalMillis", "J", "Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager$TranslateStatus;", "translateStatus", "Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager$TranslateStatus;", "", "currentSemanticsNodesInvalidated", "Z", "Lkotlinx/coroutines/channels/Channel;", "boundsUpdateChannel", "Lkotlinx/coroutines/channels/Channel;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "getHandler$ui_release", "()Landroid/os/Handler;", "currentSemanticsNodes", "Landroidx/collection/IntObjectMap;", "getCurrentSemanticsNodes$ui_release", "()Landroidx/collection/IntObjectMap;", "setCurrentSemanticsNodes$ui_release", "currentSemanticsNodesSnapshotTimestampMillis", "Landroidx/collection/MutableIntObjectMap;", "previousSemanticsNodes", "Landroidx/collection/MutableIntObjectMap;", "previousSemanticsRoot", "Landroidx/compose/ui/platform/SemanticsNodeCopy;", "checkingForSemanticsChanges", "Ljava/lang/Runnable;", "contentCaptureChangeChecker", "Ljava/lang/Runnable;", "isEnabled$ui_release", "()Z", "isEnabled", "Companion", "TranslateStatus", "ViewTranslationHelperMethods", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class AndroidContentCaptureManager implements ContentCaptureManager, DefaultLifecycleObserver, View.OnAttachStateChangeListener {
    private boolean checkingForSemanticsChanges;
    private ContentCaptureSessionCompat contentCaptureSession;
    private long currentSemanticsNodesSnapshotTimestampMillis;
    private Function0<? extends ContentCaptureSessionCompat> onContentCaptureSession;
    private SemanticsNodeCopy previousSemanticsRoot;
    private final AndroidComposeView view;
    public static final int $stable = 8;
    private final List<ContentCaptureEvent> bufferedEvents = new ArrayList();
    private long SendRecurringContentCaptureEventsIntervalMillis = 100;
    private TranslateStatus translateStatus = TranslateStatus.SHOW_ORIGINAL;
    private boolean currentSemanticsNodesInvalidated = true;
    private final Channel<Unit> boundsUpdateChannel = Channel4.Channel$default(1, null, null, 6, null);
    private final Handler handler = new Handler(Looper.getMainLooper());
    private IntObjectMap<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes = IntObjectMap2.intObjectMapOf();
    private IntObjectMap3<SemanticsNodeCopy> previousSemanticsNodes = IntObjectMap2.mutableIntObjectMapOf();
    private final Runnable contentCaptureChangeChecker = new Runnable() { // from class: androidx.compose.ui.contentcapture.AndroidContentCaptureManager$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            AndroidContentCaptureManager.contentCaptureChangeChecker$lambda$0(this.f$0);
        }
    };

    /* compiled from: AndroidContentCaptureManager.android.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ContentCaptureEventType.values().length];
            try {
                iArr[ContentCaptureEventType.VIEW_APPEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContentCaptureEventType.VIEW_DISAPPEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v) {
    }

    public AndroidContentCaptureManager(AndroidComposeView androidComposeView, Function0<? extends ContentCaptureSessionCompat> function0) {
        this.view = androidComposeView;
        this.onContentCaptureSession = function0;
        this.previousSemanticsRoot = new SemanticsNodeCopy(androidComposeView.getSemanticsOwner().getUnmergedRootSemanticsNode(), IntObjectMap2.intObjectMapOf());
    }

    public final AndroidComposeView getView() {
        return this.view;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AndroidContentCaptureManager.android.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m3636d2 = {"Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager$TranslateStatus;", "", "(Ljava/lang/String;I)V", "SHOW_ORIGINAL", "SHOW_TRANSLATED", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class TranslateStatus {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TranslateStatus[] $VALUES;
        public static final TranslateStatus SHOW_ORIGINAL = new TranslateStatus("SHOW_ORIGINAL", 0);
        public static final TranslateStatus SHOW_TRANSLATED = new TranslateStatus("SHOW_TRANSLATED", 1);

        private static final /* synthetic */ TranslateStatus[] $values() {
            return new TranslateStatus[]{SHOW_ORIGINAL, SHOW_TRANSLATED};
        }

        public static EnumEntries<TranslateStatus> getEntries() {
            return $ENTRIES;
        }

        public static TranslateStatus valueOf(String str) {
            return (TranslateStatus) Enum.valueOf(TranslateStatus.class, str);
        }

        public static TranslateStatus[] values() {
            return (TranslateStatus[]) $VALUES.clone();
        }

        private TranslateStatus(String str, int i) {
        }

        static {
            TranslateStatus[] translateStatusArr$values = $values();
            $VALUES = translateStatusArr$values;
            $ENTRIES = EnumEntries2.enumEntries(translateStatusArr$values);
        }
    }

    public final IntObjectMap<SemanticsNodeWithAdjustedBounds> getCurrentSemanticsNodes$ui_release() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            this.currentSemanticsNodes = SemanticsUtils_androidKt.getAllUncoveredSemanticsNodesToIntObjectMap(this.view.getSemanticsOwner());
            this.currentSemanticsNodesSnapshotTimestampMillis = System.currentTimeMillis();
        }
        return this.currentSemanticsNodes;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void contentCaptureChangeChecker$lambda$0(AndroidContentCaptureManager androidContentCaptureManager) {
        if (androidContentCaptureManager.isEnabled$ui_release()) {
            Owner.measureAndLayout$default(androidContentCaptureManager.view, false, 1, null);
            androidContentCaptureManager.sendContentCaptureDisappearEvents();
            androidContentCaptureManager.sendContentCaptureAppearEvents(androidContentCaptureManager.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), androidContentCaptureManager.previousSemanticsRoot);
            androidContentCaptureManager.checkForContentCapturePropertyChanges(androidContentCaptureManager.getCurrentSemanticsNodes$ui_release());
            androidContentCaptureManager.updateSemanticsCopy();
            androidContentCaptureManager.checkingForSemanticsChanges = false;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v) {
        this.handler.removeCallbacks(this.contentCaptureChangeChecker);
        this.contentCaptureSession = null;
    }

    public final boolean isEnabled$ui_release() {
        return ContentCaptureManager.INSTANCE.isEnabled() && this.contentCaptureSession != null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner owner) {
        this.contentCaptureSession = this.onContentCaptureSession.invoke();
        updateBuffersOnAppeared(-1, this.view.getSemanticsOwner().getUnmergedRootSemanticsNode());
        notifyContentCaptureChanges();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner owner) {
        updateBuffersOnDisappeared(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode());
        notifyContentCaptureChanges();
        this.contentCaptureSession = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r6, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0092 -> B:13:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object boundsUpdatesEventLoop$ui_release(Continuation<? super Unit> continuation) {
        AndroidContentCaptureManager$boundsUpdatesEventLoop$1 androidContentCaptureManager$boundsUpdatesEventLoop$1;
        Channel3<Unit> it;
        AndroidContentCaptureManager androidContentCaptureManager;
        AndroidContentCaptureManager androidContentCaptureManager2;
        Channel3<Unit> channel3;
        Object objHasNext;
        if (continuation instanceof AndroidContentCaptureManager$boundsUpdatesEventLoop$1) {
            androidContentCaptureManager$boundsUpdatesEventLoop$1 = (AndroidContentCaptureManager$boundsUpdatesEventLoop$1) continuation;
            int i = androidContentCaptureManager$boundsUpdatesEventLoop$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                androidContentCaptureManager$boundsUpdatesEventLoop$1.label = i - Integer.MIN_VALUE;
            } else {
                androidContentCaptureManager$boundsUpdatesEventLoop$1 = new AndroidContentCaptureManager$boundsUpdatesEventLoop$1(this, continuation);
            }
        }
        Object obj = androidContentCaptureManager$boundsUpdatesEventLoop$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = androidContentCaptureManager$boundsUpdatesEventLoop$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            it = this.boundsUpdateChannel.iterator();
            androidContentCaptureManager = this;
            androidContentCaptureManager$boundsUpdatesEventLoop$1.L$0 = androidContentCaptureManager;
            androidContentCaptureManager$boundsUpdatesEventLoop$1.L$1 = it;
            androidContentCaptureManager$boundsUpdatesEventLoop$1.label = 1;
            objHasNext = it.hasNext(androidContentCaptureManager$boundsUpdatesEventLoop$1);
            if (objHasNext != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            channel3 = (Channel3) androidContentCaptureManager$boundsUpdatesEventLoop$1.L$1;
            androidContentCaptureManager2 = (AndroidContentCaptureManager) androidContentCaptureManager$boundsUpdatesEventLoop$1.L$0;
            ResultKt.throwOnFailure(obj);
            it = channel3;
            androidContentCaptureManager = androidContentCaptureManager2;
            androidContentCaptureManager$boundsUpdatesEventLoop$1.L$0 = androidContentCaptureManager;
            androidContentCaptureManager$boundsUpdatesEventLoop$1.L$1 = it;
            androidContentCaptureManager$boundsUpdatesEventLoop$1.label = 1;
            objHasNext = it.hasNext(androidContentCaptureManager$boundsUpdatesEventLoop$1);
            if (objHasNext != coroutine_suspended) {
                AndroidContentCaptureManager androidContentCaptureManager3 = androidContentCaptureManager;
                channel3 = it;
                obj = objHasNext;
                androidContentCaptureManager2 = androidContentCaptureManager3;
                if (!((Boolean) obj).booleanValue()) {
                    channel3.next();
                    if (androidContentCaptureManager2.isEnabled$ui_release()) {
                        androidContentCaptureManager2.notifyContentCaptureChanges();
                    }
                    if (!androidContentCaptureManager2.checkingForSemanticsChanges) {
                        androidContentCaptureManager2.checkingForSemanticsChanges = true;
                        androidContentCaptureManager2.handler.post(androidContentCaptureManager2.contentCaptureChangeChecker);
                    }
                    long j = androidContentCaptureManager2.SendRecurringContentCaptureEventsIntervalMillis;
                    androidContentCaptureManager$boundsUpdatesEventLoop$1.L$0 = androidContentCaptureManager2;
                    androidContentCaptureManager$boundsUpdatesEventLoop$1.L$1 = channel3;
                    androidContentCaptureManager$boundsUpdatesEventLoop$1.label = 2;
                } else {
                    return Unit.INSTANCE;
                }
            }
            return coroutine_suspended;
        }
        channel3 = (Channel3) androidContentCaptureManager$boundsUpdatesEventLoop$1.L$1;
        androidContentCaptureManager2 = (AndroidContentCaptureManager) androidContentCaptureManager$boundsUpdatesEventLoop$1.L$0;
        ResultKt.throwOnFailure(obj);
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    public final void onSemanticsChange$ui_release() {
        this.currentSemanticsNodesInvalidated = true;
        if (!isEnabled$ui_release() || this.checkingForSemanticsChanges) {
            return;
        }
        this.checkingForSemanticsChanges = true;
        this.handler.post(this.contentCaptureChangeChecker);
    }

    public final void onLayoutChange$ui_release() {
        this.currentSemanticsNodesInvalidated = true;
        if (isEnabled$ui_release()) {
            notifySubtreeStateChangeIfNeeded();
        }
    }

    private final void sendContentCaptureDisappearEvents() {
        IntObjectMap3<SemanticsNodeCopy> intObjectMap3 = this.previousSemanticsNodes;
        int[] iArr = intObjectMap3.keys;
        long[] jArr = intObjectMap3.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = iArr[(i << 3) + i3];
                        if (!getCurrentSemanticsNodes$ui_release().containsKey(i4)) {
                            bufferContentCaptureViewDisappeared(i4);
                            notifySubtreeStateChangeIfNeeded();
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    private final void sendContentCaptureAppearEvents(SemanticsNode newNode, final SemanticsNodeCopy oldNode) {
        fastForEachReplacedVisibleChildren(newNode, new Function2<Integer, SemanticsNode, Unit>() { // from class: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.sendContentCaptureAppearEvents.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, SemanticsNode semanticsNode) {
                invoke(num.intValue(), semanticsNode);
                return Unit.INSTANCE;
            }

            public final void invoke(int i, SemanticsNode semanticsNode) {
                if (oldNode.getChildren().contains(semanticsNode.getId())) {
                    return;
                }
                this.updateBuffersOnAppeared(i, semanticsNode);
                this.notifySubtreeStateChangeIfNeeded();
            }
        });
        List<SemanticsNode> replacedChildren$ui_release = newNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode = replacedChildren$ui_release.get(i);
            if (getCurrentSemanticsNodes$ui_release().containsKey(semanticsNode.getId()) && this.previousSemanticsNodes.containsKey(semanticsNode.getId())) {
                SemanticsNodeCopy semanticsNodeCopy = this.previousSemanticsNodes.get(semanticsNode.getId());
                if (semanticsNodeCopy == null) {
                    InlineClassHelper4.throwIllegalStateExceptionForNullCheck("node not present in pruned tree before this change");
                    throw new ExceptionsH();
                }
                sendContentCaptureAppearEvents(semanticsNode, semanticsNodeCopy);
            }
        }
    }

    private final void sendContentCaptureTextUpdateEvent(int id, String newText) {
        ContentCaptureSessionCompat contentCaptureSessionCompat;
        if (Build.VERSION.SDK_INT >= 29 && (contentCaptureSessionCompat = this.contentCaptureSession) != null) {
            AutofillId autofillIdNewAutofillId = contentCaptureSessionCompat.newAutofillId(id);
            if (autofillIdNewAutofillId == null) {
                InlineClassHelper4.throwIllegalStateExceptionForNullCheck("Invalid content capture ID");
                throw new ExceptionsH();
            }
            contentCaptureSessionCompat.notifyViewTextChanged(autofillIdNewAutofillId, newText);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void updateSemanticsCopy() {
        this.previousSemanticsNodes.clear();
        IntObjectMap<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes$ui_release = getCurrentSemanticsNodes$ui_release();
        int[] iArr = currentSemanticsNodes$ui_release.keys;
        Object[] objArr = currentSemanticsNodes$ui_release.values;
        long[] jArr = currentSemanticsNodes$ui_release.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            this.previousSemanticsNodes.set(iArr[i4], new SemanticsNodeCopy(((SemanticsNodeWithAdjustedBounds) objArr[i4]).getSemanticsNode(), getCurrentSemanticsNodes$ui_release()));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        this.previousSemanticsRoot = new SemanticsNodeCopy(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), getCurrentSemanticsNodes$ui_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifySubtreeStateChangeIfNeeded() {
        this.boundsUpdateChannel.mo8337trySendJP2dKIU(Unit.INSTANCE);
    }

    private final ViewStructureCompat toViewStructure(SemanticsNode semanticsNode, int i) {
        AutofillIdCompat autofillId;
        AutofillId autofillId2;
        String strM7460toLegacyClassNameV4PA4sw;
        ContentCaptureSessionCompat contentCaptureSessionCompat = this.contentCaptureSession;
        if (contentCaptureSessionCompat == null || Build.VERSION.SDK_INT < 29 || (autofillId = ViewCompatShims.getAutofillId(this.view)) == null) {
            return null;
        }
        if (semanticsNode.getParent() != null) {
            autofillId2 = contentCaptureSessionCompat.newAutofillId(r4.getId());
            if (autofillId2 == null) {
                return null;
            }
        } else {
            autofillId2 = autofillId.toAutofillId();
        }
        ViewStructureCompat viewStructureCompatNewVirtualViewStructure = contentCaptureSessionCompat.newVirtualViewStructure(autofillId2, semanticsNode.getId());
        if (viewStructureCompatNewVirtualViewStructure == null) {
            return null;
        }
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig$ui_release.contains(semanticsProperties.getPassword())) {
            return null;
        }
        Bundle extras = viewStructureCompatNewVirtualViewStructure.getExtras();
        if (extras != null) {
            extras.putLong("android.view.contentcapture.EventTimestamp", this.currentSemanticsNodesSnapshotTimestampMillis);
            extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i);
        }
        String str = (String) SemanticsConfiguration2.getOrNull(unmergedConfig$ui_release, semanticsProperties.getTestTag());
        if (str != null) {
            viewStructureCompatNewVirtualViewStructure.setId(semanticsNode.getId(), null, null, str);
        }
        if (((Boolean) SemanticsConfiguration2.getOrNull(unmergedConfig$ui_release, semanticsProperties.getIsTraversalGroup())) != null) {
            viewStructureCompatNewVirtualViewStructure.setClassName("android.widget.ViewGroup");
        }
        List list = (List) SemanticsConfiguration2.getOrNull(unmergedConfig$ui_release, semanticsProperties.getText());
        if (list != null) {
            viewStructureCompatNewVirtualViewStructure.setClassName("android.widget.TextView");
            viewStructureCompatNewVirtualViewStructure.setText(ListUtils2.fastJoinToString$default(list, "\n", null, null, 0, null, null, 62, null));
        }
        AnnotatedString annotatedString = (AnnotatedString) SemanticsConfiguration2.getOrNull(unmergedConfig$ui_release, semanticsProperties.getEditableText());
        if (annotatedString != null) {
            viewStructureCompatNewVirtualViewStructure.setClassName("android.widget.EditText");
            viewStructureCompatNewVirtualViewStructure.setText(annotatedString);
        }
        List list2 = (List) SemanticsConfiguration2.getOrNull(unmergedConfig$ui_release, semanticsProperties.getContentDescription());
        if (list2 != null) {
            viewStructureCompatNewVirtualViewStructure.setContentDescription(ListUtils2.fastJoinToString$default(list2, "\n", null, null, 0, null, null, 62, null));
        }
        Role role = (Role) SemanticsConfiguration2.getOrNull(unmergedConfig$ui_release, semanticsProperties.getRole());
        if (role != null && (strM7460toLegacyClassNameV4PA4sw = SemanticsUtils_androidKt.m7460toLegacyClassNameV4PA4sw(role.getValue())) != null) {
            viewStructureCompatNewVirtualViewStructure.setClassName(strM7460toLegacyClassNameV4PA4sw);
        }
        TextLayoutResult textLayoutResult = SemanticsUtils_androidKt.getTextLayoutResult(unmergedConfig$ui_release);
        if (textLayoutResult != null) {
            TextLayoutInput layoutInput = textLayoutResult.getLayoutInput();
            viewStructureCompatNewVirtualViewStructure.setTextStyle(TextUnit.m8074getValueimpl(layoutInput.getStyle().m7662getFontSizeXSAIIZE()) * layoutInput.getDensity().getDensity() * layoutInput.getDensity().getFontScale(), 0, 0, 0);
        }
        Rect boundsInParent$ui_release = semanticsNode.getBoundsInParent$ui_release();
        viewStructureCompatNewVirtualViewStructure.setDimens((int) boundsInParent$ui_release.getLeft(), (int) boundsInParent$ui_release.getTop(), 0, 0, (int) (boundsInParent$ui_release.getRight() - boundsInParent$ui_release.getLeft()), (int) (boundsInParent$ui_release.getBottom() - boundsInParent$ui_release.getTop()));
        return viewStructureCompatNewVirtualViewStructure;
    }

    private final void fastForEachReplacedVisibleChildren(SemanticsNode semanticsNode, Function2<? super Integer, ? super SemanticsNode, Unit> function2) {
        List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i2);
            if (getCurrentSemanticsNodes$ui_release().containsKey(semanticsNode2.getId())) {
                function2.invoke(Integer.valueOf(i), semanticsNode2);
                i++;
            }
        }
    }

    private final void checkForContentCapturePropertyChanges(IntObjectMap<SemanticsNodeWithAdjustedBounds> newSemanticsNodes) {
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        SemanticsNode semanticsNode;
        int i2;
        SemanticsNode semanticsNode2;
        long j3;
        int i3;
        long[] jArr3;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> intObjectMap = newSemanticsNodes;
        int[] iArr3 = intObjectMap.keys;
        long[] jArr4 = intObjectMap.metadata;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j4 = jArr4[i4];
            char c2 = 7;
            long j5 = -9187201950435737472L;
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8;
                int i6 = 8 - ((~(i4 - length)) >>> 31);
                int i7 = 0;
                while (i7 < i6) {
                    if ((j4 & 255) < 128) {
                        int i8 = iArr3[(i4 << 3) + i7];
                        c = c2;
                        SemanticsNodeCopy semanticsNodeCopy = this.previousSemanticsNodes.get(i8);
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = intObjectMap.get(i8);
                        SemanticsNode semanticsNode3 = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
                        if (semanticsNode3 == null) {
                            InlineClassHelper4.throwIllegalStateExceptionForNullCheck("no value for specified key");
                            throw new ExceptionsH();
                        }
                        if (semanticsNodeCopy == null) {
                            ScatterMap6<SemanticsPropertyKey<?>, Object> props$ui_release = semanticsNode3.getUnmergedConfig().getProps$ui_release();
                            j2 = j5;
                            Object[] objArr = props$ui_release.keys;
                            long[] jArr5 = props$ui_release.metadata;
                            int length2 = jArr5.length - 2;
                            if (length2 >= 0) {
                                int i9 = 0;
                                int i10 = i5;
                                while (true) {
                                    long j6 = jArr5[i9];
                                    iArr2 = iArr3;
                                    if ((((~j6) << c) & j6 & j2) != j2) {
                                        int i11 = 8 - ((~(i9 - length2)) >>> 31);
                                        int i12 = 0;
                                        while (i12 < i11) {
                                            if ((j6 & 255) < 128) {
                                                i3 = i12;
                                                SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) objArr[(i9 << 3) + i12];
                                                SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
                                                jArr3 = jArr4;
                                                if (Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties.getText())) {
                                                    List list = (List) SemanticsConfiguration2.getOrNull(semanticsNode3.getUnmergedConfig(), semanticsProperties.getText());
                                                    sendContentCaptureTextUpdateEvent(semanticsNode3.getId(), String.valueOf(list != null ? (AnnotatedString) CollectionsKt.firstOrNull(list) : null));
                                                }
                                            } else {
                                                i3 = i12;
                                                jArr3 = jArr4;
                                            }
                                            j6 >>= i10;
                                            i12 = i3 + 1;
                                            jArr4 = jArr3;
                                        }
                                        jArr2 = jArr4;
                                        if (i11 != i10) {
                                            break;
                                        }
                                    } else {
                                        jArr2 = jArr4;
                                    }
                                    if (i9 == length2) {
                                        break;
                                    }
                                    i9++;
                                    iArr3 = iArr2;
                                    jArr4 = jArr2;
                                    i10 = 8;
                                }
                            } else {
                                iArr2 = iArr3;
                                jArr2 = jArr4;
                            }
                        } else {
                            iArr2 = iArr3;
                            jArr2 = jArr4;
                            j2 = j5;
                            ScatterMap6<SemanticsPropertyKey<?>, Object> props$ui_release2 = semanticsNode3.getUnmergedConfig().getProps$ui_release();
                            Object[] objArr2 = props$ui_release2.keys;
                            long[] jArr6 = props$ui_release2.metadata;
                            int length3 = jArr6.length - 2;
                            if (length3 >= 0) {
                                int i13 = 0;
                                while (true) {
                                    long j7 = jArr6[i13];
                                    long[] jArr7 = jArr6;
                                    Object[] objArr3 = objArr2;
                                    if ((((~j7) << c) & j7 & j2) != j2) {
                                        int i14 = 8 - ((~(i13 - length3)) >>> 31);
                                        int i15 = 0;
                                        while (i15 < i14) {
                                            if ((j7 & 255) < 128) {
                                                i2 = i15;
                                                SemanticsPropertyKey semanticsPropertyKey2 = (SemanticsPropertyKey) objArr3[(i13 << 3) + i15];
                                                SemanticsProperties semanticsProperties2 = SemanticsProperties.INSTANCE;
                                                semanticsNode2 = semanticsNode3;
                                                if (Intrinsics.areEqual(semanticsPropertyKey2, semanticsProperties2.getText())) {
                                                    List list2 = (List) SemanticsConfiguration2.getOrNull(semanticsNodeCopy.getUnmergedConfig(), semanticsProperties2.getText());
                                                    AnnotatedString annotatedString = list2 != null ? (AnnotatedString) CollectionsKt.firstOrNull(list2) : null;
                                                    j3 = j4;
                                                    List list3 = (List) SemanticsConfiguration2.getOrNull(semanticsNode2.getUnmergedConfig(), semanticsProperties2.getText());
                                                    AnnotatedString annotatedString2 = list3 != null ? (AnnotatedString) CollectionsKt.firstOrNull(list3) : null;
                                                    if (!Intrinsics.areEqual(annotatedString, annotatedString2)) {
                                                        sendContentCaptureTextUpdateEvent(semanticsNode2.getId(), String.valueOf(annotatedString2));
                                                    }
                                                }
                                                j7 >>= 8;
                                                i15 = i2 + 1;
                                                semanticsNode3 = semanticsNode2;
                                                j4 = j3;
                                            } else {
                                                i2 = i15;
                                                semanticsNode2 = semanticsNode3;
                                            }
                                            j3 = j4;
                                            j7 >>= 8;
                                            i15 = i2 + 1;
                                            semanticsNode3 = semanticsNode2;
                                            j4 = j3;
                                        }
                                        semanticsNode = semanticsNode3;
                                        j = j4;
                                        if (i14 != 8) {
                                            break;
                                        }
                                    } else {
                                        semanticsNode = semanticsNode3;
                                        j = j4;
                                    }
                                    if (i13 == length3) {
                                        break;
                                    }
                                    i13++;
                                    objArr2 = objArr3;
                                    jArr6 = jArr7;
                                    semanticsNode3 = semanticsNode;
                                    j4 = j;
                                }
                            }
                            i = 8;
                        }
                        j = j4;
                        i = 8;
                    } else {
                        iArr2 = iArr3;
                        jArr2 = jArr4;
                        j = j4;
                        c = c2;
                        j2 = j5;
                        i = i5;
                    }
                    j4 = j >> i;
                    i7++;
                    intObjectMap = newSemanticsNodes;
                    i5 = i;
                    c2 = c;
                    j5 = j2;
                    iArr3 = iArr2;
                    jArr4 = jArr2;
                }
                iArr = iArr3;
                jArr = jArr4;
                if (i6 != i5) {
                    return;
                }
            } else {
                iArr = iArr3;
                jArr = jArr4;
            }
            if (i4 == length) {
                return;
            }
            i4++;
            intObjectMap = newSemanticsNodes;
            iArr3 = iArr;
            jArr4 = jArr;
        }
    }

    private final void bufferContentCaptureViewAppeared(int virtualId, ViewStructureCompat viewStructure) {
        if (viewStructure == null) {
            return;
        }
        this.bufferedEvents.add(new ContentCaptureEvent(virtualId, this.currentSemanticsNodesSnapshotTimestampMillis, ContentCaptureEventType.VIEW_APPEAR, viewStructure));
    }

    private final void bufferContentCaptureViewDisappeared(int virtualId) {
        this.bufferedEvents.add(new ContentCaptureEvent(virtualId, this.currentSemanticsNodesSnapshotTimestampMillis, ContentCaptureEventType.VIEW_DISAPPEAR, null));
    }

    private final void notifyContentCaptureChanges() {
        AutofillId autofillIdNewAutofillId;
        ContentCaptureSessionCompat contentCaptureSessionCompat = this.contentCaptureSession;
        if (contentCaptureSessionCompat == null || Build.VERSION.SDK_INT < 29 || this.bufferedEvents.isEmpty()) {
            return;
        }
        List<ContentCaptureEvent> list = this.bufferedEvents;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ContentCaptureEvent contentCaptureEvent = list.get(i);
            int i2 = WhenMappings.$EnumSwitchMapping$0[contentCaptureEvent.getType().ordinal()];
            if (i2 == 1) {
                ViewStructureCompat structureCompat = contentCaptureEvent.getStructureCompat();
                if (structureCompat != null) {
                    contentCaptureSessionCompat.notifyViewAppeared(structureCompat.toViewStructure());
                }
            } else if (i2 == 2 && (autofillIdNewAutofillId = contentCaptureSessionCompat.newAutofillId(contentCaptureEvent.getId())) != null) {
                contentCaptureSessionCompat.notifyViewDisappeared(autofillIdNewAutofillId);
            }
        }
        contentCaptureSessionCompat.flush();
        this.bufferedEvents.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateBuffersOnAppeared(int index, SemanticsNode node) {
        if (isEnabled$ui_release()) {
            updateTranslationOnAppeared(node);
            bufferContentCaptureViewAppeared(node.getId(), toViewStructure(node, index));
            fastForEachReplacedVisibleChildren(node, new Function2<Integer, SemanticsNode, Unit>() { // from class: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.updateBuffersOnAppeared.1
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Integer num, SemanticsNode semanticsNode) {
                    invoke(num.intValue(), semanticsNode);
                    return Unit.INSTANCE;
                }

                public final void invoke(int i, SemanticsNode semanticsNode) {
                    AndroidContentCaptureManager.this.updateBuffersOnAppeared(i, semanticsNode);
                }
            });
        }
    }

    private final void updateBuffersOnDisappeared(SemanticsNode node) {
        if (isEnabled$ui_release()) {
            bufferContentCaptureViewDisappeared(node.getId());
            List<SemanticsNode> replacedChildren$ui_release = node.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            for (int i = 0; i < size; i++) {
                updateBuffersOnDisappeared(replacedChildren$ui_release.get(i));
            }
        }
    }

    private final void updateTranslationOnAppeared(SemanticsNode node) {
        AccessibilityAction accessibilityAction;
        Function1 function1;
        Function1 function12;
        SemanticsConfiguration unmergedConfig$ui_release = node.getUnmergedConfig();
        Boolean bool = (Boolean) SemanticsConfiguration2.getOrNull(unmergedConfig$ui_release, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution());
        if (this.translateStatus == TranslateStatus.SHOW_ORIGINAL && Intrinsics.areEqual(bool, Boolean.TRUE)) {
            AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfiguration2.getOrNull(unmergedConfig$ui_release, SemanticsActions.INSTANCE.getShowTextSubstitution());
            if (accessibilityAction2 == null || (function12 = (Function1) accessibilityAction2.getAction()) == null) {
                return;
            }
            return;
        }
        if (this.translateStatus != TranslateStatus.SHOW_TRANSLATED || !Intrinsics.areEqual(bool, Boolean.FALSE) || (accessibilityAction = (AccessibilityAction) SemanticsConfiguration2.getOrNull(unmergedConfig$ui_release, SemanticsActions.INSTANCE.getShowTextSubstitution())) == null || (function1 = (Function1) accessibilityAction.getAction()) == null) {
            return;
        }
    }

    public final void onShowTranslation$ui_release() {
        this.translateStatus = TranslateStatus.SHOW_TRANSLATED;
        showTranslatedText();
    }

    public final void onHideTranslation$ui_release() {
        this.translateStatus = TranslateStatus.SHOW_ORIGINAL;
        hideTranslatedText();
    }

    public final void onClearTranslation$ui_release() {
        this.translateStatus = TranslateStatus.SHOW_ORIGINAL;
        clearTranslatedText();
    }

    private final void showTranslatedText() {
        AccessibilityAction accessibilityAction;
        Function1 function1;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes$ui_release = getCurrentSemanticsNodes$ui_release();
        Object[] objArr = currentSemanticsNodes$ui_release.values;
        long[] jArr = currentSemanticsNodes$ui_release.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        SemanticsConfiguration unmergedConfig$ui_release = ((SemanticsNodeWithAdjustedBounds) objArr[(i << 3) + i3]).getSemanticsNode().getUnmergedConfig();
                        if (Intrinsics.areEqual(SemanticsConfiguration2.getOrNull(unmergedConfig$ui_release, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()), Boolean.FALSE) && (accessibilityAction = (AccessibilityAction) SemanticsConfiguration2.getOrNull(unmergedConfig$ui_release, SemanticsActions.INSTANCE.getShowTextSubstitution())) != null && (function1 = (Function1) accessibilityAction.getAction()) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    private final void hideTranslatedText() {
        AccessibilityAction accessibilityAction;
        Function1 function1;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes$ui_release = getCurrentSemanticsNodes$ui_release();
        Object[] objArr = currentSemanticsNodes$ui_release.values;
        long[] jArr = currentSemanticsNodes$ui_release.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        SemanticsConfiguration unmergedConfig$ui_release = ((SemanticsNodeWithAdjustedBounds) objArr[(i << 3) + i3]).getSemanticsNode().getUnmergedConfig();
                        if (Intrinsics.areEqual(SemanticsConfiguration2.getOrNull(unmergedConfig$ui_release, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()), Boolean.TRUE) && (accessibilityAction = (AccessibilityAction) SemanticsConfiguration2.getOrNull(unmergedConfig$ui_release, SemanticsActions.INSTANCE.getShowTextSubstitution())) != null && (function1 = (Function1) accessibilityAction.getAction()) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    private final void clearTranslatedText() {
        AccessibilityAction accessibilityAction;
        Function0 function0;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes$ui_release = getCurrentSemanticsNodes$ui_release();
        Object[] objArr = currentSemanticsNodes$ui_release.values;
        long[] jArr = currentSemanticsNodes$ui_release.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        SemanticsConfiguration unmergedConfig$ui_release = ((SemanticsNodeWithAdjustedBounds) objArr[(i << 3) + i3]).getSemanticsNode().getUnmergedConfig();
                        if (SemanticsConfiguration2.getOrNull(unmergedConfig$ui_release, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()) != null && (accessibilityAction = (AccessibilityAction) SemanticsConfiguration2.getOrNull(unmergedConfig$ui_release, SemanticsActions.INSTANCE.getClearTextSubstitution())) != null && (function0 = (Function0) accessibilityAction.getAction()) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AndroidContentCaptureManager.android.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0002J0\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010H\u0007J \u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0007¨\u0006\u0013"}, m3636d2 = {"Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager$ViewTranslationHelperMethods;", "", "()V", "doTranslation", "", "contentCaptureManager", "Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;", "response", "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", "onCreateVirtualViewTranslationRequests", "virtualIds", "", "supportedFormats", "", "requestsCollector", "Ljava/util/function/Consumer;", "Landroid/view/translation/ViewTranslationRequest;", "onVirtualViewTranslationResponses", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    static final class ViewTranslationHelperMethods {
        public static final ViewTranslationHelperMethods INSTANCE = new ViewTranslationHelperMethods();

        private ViewTranslationHelperMethods() {
        }

        public final void onVirtualViewTranslationResponses(final AndroidContentCaptureManager contentCaptureManager, final LongSparseArray<ViewTranslationResponse> response) {
            if (Build.VERSION.SDK_INT < 31) {
                return;
            }
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                doTranslation(contentCaptureManager, response);
            } else {
                contentCaptureManager.getView().post(new Runnable() { // from class: androidx.compose.ui.contentcapture.AndroidContentCaptureManager$ViewTranslationHelperMethods$$ExternalSyntheticLambda9
                    @Override // java.lang.Runnable
                    public final void run() {
                        AndroidContentCaptureManager.ViewTranslationHelperMethods.onVirtualViewTranslationResponses$lambda$1(contentCaptureManager, response);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onVirtualViewTranslationResponses$lambda$1(AndroidContentCaptureManager androidContentCaptureManager, LongSparseArray longSparseArray) {
            INSTANCE.doTranslation(androidContentCaptureManager, longSparseArray);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final void doTranslation(AndroidContentCaptureManager contentCaptureManager, LongSparseArray<ViewTranslationResponse> response) {
            TranslationResponseValue value;
            CharSequence text;
            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds;
            SemanticsNode semanticsNode;
            AccessibilityAction accessibilityAction;
            Function1 function1;
            int size = response.size();
            for (int i = 0; i < size; i++) {
                long jKeyAt = response.keyAt(i);
                ViewTranslationResponse viewTranslationResponseM185m = C1806x7aad6892.m185m(response.get(jKeyAt));
                if (viewTranslationResponseM185m != null && (value = viewTranslationResponseM185m.getValue("android:text")) != null && (text = value.getText()) != null && (semanticsNodeWithAdjustedBounds = contentCaptureManager.getCurrentSemanticsNodes$ui_release().get((int) jKeyAt)) != null && (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) != null && (accessibilityAction = (AccessibilityAction) SemanticsConfiguration2.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getSetTextSubstitution())) != null && (function1 = (Function1) accessibilityAction.getAction()) != null) {
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onCreateVirtualViewTranslationRequests(AndroidContentCaptureManager contentCaptureManager, long[] virtualIds, int[] supportedFormats, Consumer<ViewTranslationRequest> requestsCollector) {
            SemanticsNode semanticsNode;
            String strFastJoinToString$default;
            for (long j : virtualIds) {
                SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = contentCaptureManager.getCurrentSemanticsNodes$ui_release().get((int) j);
                if (semanticsNodeWithAdjustedBounds != null && (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) != null) {
                    C1801x7aad688d.m180m();
                    ViewTranslationRequest.Builder builderM179m = C1800x7aad688c.m179m(contentCaptureManager.getView().getAutofillId(), semanticsNode.getId());
                    List list = (List) SemanticsConfiguration2.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getText());
                    if (list != null && (strFastJoinToString$default = ListUtils2.fastJoinToString$default(list, "\n", null, null, 0, null, null, 62, null)) != null) {
                        builderM179m.setValue("android:text", TranslationRequestValue.forText(new AnnotatedString(strFastJoinToString$default, null, 2, 0 == true ? 1 : 0)));
                        requestsCollector.accept(builderM179m.build());
                    }
                }
            }
        }
    }

    public final void onCreateVirtualViewTranslationRequests$ui_release(long[] virtualIds, int[] supportedFormats, Consumer<ViewTranslationRequest> requestsCollector) {
        ViewTranslationHelperMethods.INSTANCE.onCreateVirtualViewTranslationRequests(this, virtualIds, supportedFormats, requestsCollector);
    }

    public final void onVirtualViewTranslationResponses$ui_release(AndroidContentCaptureManager contentCaptureManager, LongSparseArray<ViewTranslationResponse> response) {
        ViewTranslationHelperMethods.INSTANCE.onVirtualViewTranslationResponses(contentCaptureManager, response);
    }
}
