package com.robinhood.shared.common.agreementview;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.text.PrecomputedTextCompat;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.widget.NestedScrollView;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.designsystem.textinput.TextWatcherAdapter;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.markdown.util.TextViewsKt;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.disposer.ViewScopedCompletable;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.shared.common.agreementview.RdsAgreementView;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.TypedArrays3;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.animation.Animators;
import io.noties.markwon.Markwon;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.BehaviorSubject;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.LocalDate;

/* compiled from: RdsAgreementView.kt */
@Metadata(m3635d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0010\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0006«\u0001¬\u0001\u00ad\u0001B\u001b\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J&\u0010\u0016\u001a\u00020\f2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\f0\u0013¢\u0006\u0002\b\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0018\u0010\u0010J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ7\u0010$\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001fH\u0016¢\u0006\u0004\b$\u0010%J/\u0010+\u001a\u00020\f2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\u001fH\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/JW\u00108\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020-2\u0006\u00100\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\u001f2\u0006\u00102\u001a\u00020\u001f2\u0006\u00103\u001a\u00020\u001f2\u0006\u00104\u001a\u00020\u001f2\u0006\u00105\u001a\u00020\u001f2\u0006\u00106\u001a\u00020\u001f2\u0006\u00107\u001a\u00020\u001fH\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\f2\b\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\f¢\u0006\u0004\b>\u0010\u0010J\u0017\u0010@\u001a\u00020\f2\b\b\u0001\u0010?\u001a\u00020\u001f¢\u0006\u0004\b@\u0010AJ\u0015\u0010C\u001a\u00020\f2\u0006\u0010'\u001a\u00020B¢\u0006\u0004\bC\u0010DJ\r\u0010F\u001a\u00020E¢\u0006\u0004\bF\u0010GJ\u0013\u0010J\u001a\b\u0012\u0004\u0012\u00020I0H¢\u0006\u0004\bJ\u0010KJ\u0013\u0010M\u001a\b\u0012\u0004\u0012\u00020L0H¢\u0006\u0004\bM\u0010KJ\u000f\u0010O\u001a\u00020NH\u0014¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020\f2\u0006\u0010Q\u001a\u00020NH\u0014¢\u0006\u0004\bR\u0010SR\"\u0010U\u001a\u00020T8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0014\u0010[\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010^\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010`\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010_R\u0014\u0010a\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010_R\u0014\u0010b\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010_R\u0014\u0010c\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010_R\u0014\u0010e\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010h\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010k\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00020I0m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u001a\u0010p\u001a\b\u0012\u0004\u0012\u00020L0m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010oR\"\u0010r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0q0m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010oR\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010sR\u0016\u0010t\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR*\u0010w\u001a\u00020I2\u0006\u0010v\u001a\u00020I8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R1\u0010}\u001a\u0004\u0018\u00010\u001f2\b\u0010v\u001a\u0004\u0018\u00010\u001f8\u0006@FX\u0087\u000e¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R0\u0010\u0083\u0001\u001a\u00020\u001f2\u0006\u0010v\u001a\u00020\u001f8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0005\b\u0087\u0001\u0010AR1\u0010\u0088\u0001\u001a\u00020&2\u0006\u0010v\u001a\u00020&8\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R1\u0010\u008e\u0001\u001a\u00020&2\u0006\u0010v\u001a\u00020&8\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010\u0089\u0001\u001a\u0006\b\u008f\u0001\u0010\u008b\u0001\"\u0006\b\u0090\u0001\u0010\u008d\u0001R1\u0010\u0091\u0001\u001a\u00020&2\u0006\u0010v\u001a\u00020&8\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0091\u0001\u0010\u0089\u0001\u001a\u0006\b\u0092\u0001\u0010\u008b\u0001\"\u0006\b\u0093\u0001\u0010\u008d\u0001R3\u0010\u0095\u0001\u001a\u00030\u0094\u00012\u0007\u0010v\u001a\u00030\u0094\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R3\u0010\u009b\u0001\u001a\u00030\u0094\u00012\u0007\u0010v\u001a\u00030\u0094\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u009b\u0001\u0010\u0096\u0001\u001a\u0006\b\u009c\u0001\u0010\u0098\u0001\"\u0006\b\u009d\u0001\u0010\u009a\u0001RA\u0010\u009f\u0001\u001a\n\u0012\u0005\u0012\u00030\u0094\u00010\u009e\u00012\u000e\u0010v\u001a\n\u0012\u0005\u0012\u00030\u0094\u00010\u009e\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0006\b£\u0001\u0010¤\u0001R/\u0010¥\u0001\u001a\u00020\u00192\u0006\u0010v\u001a\u00020\u00198\u0006@FX\u0086\u000e¢\u0006\u0016\n\u0005\b¥\u0001\u0010u\u001a\u0006\b¦\u0001\u0010§\u0001\"\u0005\b¨\u0001\u0010\u001cR\u0017\u0010ª\u0001\u001a\u00020\u001f8TX\u0094\u0004¢\u0006\b\u001a\u0006\b©\u0001\u0010\u0086\u0001¨\u0006®\u0001"}, m3636d2 = {"Lcom/robinhood/shared/common/agreementview/RdsAgreementView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/core/widget/NestedScrollView$OnScrollChangeListener;", "Lcom/robinhood/android/designsystem/textinput/TextWatcherAdapter;", "Landroid/view/View$OnClickListener;", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "initialize", "(Landroid/util/AttributeSet;)V", "refreshUi", "()V", "scrollToBottom", "scrollToTop", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "action", "onAgreementAccepted", "(Lkotlin/jvm/functions/Function1;)V", "onAttachedToWindow", "", "isLoading", "updateAcceptButtonLoading", "(Z)V", "Landroidx/core/widget/NestedScrollView;", "view", "", "scrollX", "scrollY", "oldScrollX", "oldScrollY", "onScrollChange", "(Landroidx/core/widget/NestedScrollView;IIII)V", "", "text", "start", "before", "count", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "Landroid/view/View;", "onClick", "(Landroid/view/View;)V", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "Lcom/robinhood/shared/common/agreementview/RdsAgreementView$OnAgreementAcceptedListener;", "listener", "setOnAgreementAcceptedListener", "(Lcom/robinhood/shared/common/agreementview/RdsAgreementView$OnAgreementAcceptedListener;)V", "reset", "resId", "loadFromRawResource", "(I)V", "Landroidx/core/text/PrecomputedTextCompat;", "loadFromString", "(Landroidx/core/text/PrecomputedTextCompat;)V", "Landroidx/core/text/PrecomputedTextCompat$Params;", "getTextMetricsParams", "()Landroidx/core/text/PrecomputedTextCompat$Params;", "Lio/reactivex/Observable;", "Lcom/robinhood/shared/common/agreementview/RdsAgreementView$State;", "stateChanges", "()Lio/reactivex/Observable;", "", "scrollDepthPercentChanges", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "savedState", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "Lio/noties/markwon/Markwon;", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "scrollView", "Landroidx/core/widget/NestedScrollView;", "Landroid/widget/TextView;", "agreementTxt", "Landroid/widget/TextView;", "effectiveDateTxt", "titleTxt", "headerTxt", "descriptionTxt", "Lcom/robinhood/android/designsystem/button/RdsButton;", "acceptBtn", "Lcom/robinhood/android/designsystem/button/RdsButton;", "Landroid/widget/LinearLayout;", "panel", "Landroid/widget/LinearLayout;", "Landroidx/compose/ui/platform/ComposeView;", "additionalCheckboxesComposeView", "Landroidx/compose/ui/platform/ComposeView;", "Lio/reactivex/subjects/BehaviorSubject;", "stateSubject", "Lio/reactivex/subjects/BehaviorSubject;", "percentScrolledDownSubject", "Lcom/robinhood/utils/Optional;", "resIdSubject", "Lcom/robinhood/shared/common/agreementview/RdsAgreementView$OnAgreementAcceptedListener;", "autoScrollingTriggered", "Z", "value", "state", "Lcom/robinhood/shared/common/agreementview/RdsAgreementView$State;", "getState", "()Lcom/robinhood/shared/common/agreementview/RdsAgreementView$State;", "setState", "(Lcom/robinhood/shared/common/agreementview/RdsAgreementView$State;)V", "effectiveDateTextResId", "Ljava/lang/Integer;", "getEffectiveDateTextResId", "()Ljava/lang/Integer;", "setEffectiveDateTextResId", "(Ljava/lang/Integer;)V", "gravity", "I", "getGravity", "()I", "setGravity", "titleTxtText", "Ljava/lang/CharSequence;", "getTitleTxtText", "()Ljava/lang/CharSequence;", "setTitleTxtText", "(Ljava/lang/CharSequence;)V", "headerTxtText", "getHeaderTxtText", "setHeaderTxtText", "descriptionTxtText", "getDescriptionTxtText", "setDescriptionTxtText", "", "reviewButtonText", "Ljava/lang/String;", "getReviewButtonText", "()Ljava/lang/String;", "setReviewButtonText", "(Ljava/lang/String;)V", "acceptButtonText", "getAcceptButtonText", "setAcceptButtonText", "", "additionalCheckboxes", "Ljava/util/List;", "getAdditionalCheckboxes", "()Ljava/util/List;", "setAdditionalCheckboxes", "(Ljava/util/List;)V", "areAllCheckboxesChecked", "getAreAllCheckboxesChecked", "()Z", "setAreAllCheckboxesChecked", "getLayoutRes", "layoutRes", "OnAgreementAcceptedListener", "State", "SavedState", "lib-agreement-view_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public class RdsAgreementView extends Hammer_RdsAgreementView implements NestedScrollView.OnScrollChangeListener, TextWatcherAdapter, View.OnClickListener, View.OnLayoutChangeListener {
    public static final int $stable = 8;
    private final RdsButton acceptBtn;
    private String acceptButtonText;
    private List<String> additionalCheckboxes;
    private final ComposeView additionalCheckboxesComposeView;
    private final TextView agreementTxt;
    private boolean areAllCheckboxesChecked;
    private boolean autoScrollingTriggered;
    private final TextView descriptionTxt;
    private CharSequence descriptionTxtText;
    private Integer effectiveDateTextResId;
    private final TextView effectiveDateTxt;
    private int gravity;
    private final TextView headerTxt;
    private CharSequence headerTxtText;
    private OnAgreementAcceptedListener listener;
    public Markwon markwon;
    private final LinearLayout panel;
    private final BehaviorSubject<Float> percentScrolledDownSubject;
    private BehaviorSubject<Optional<Integer>> resIdSubject;
    private String reviewButtonText;
    private final NestedScrollView scrollView;
    private State state;
    private final BehaviorSubject<State> stateSubject;
    private final TextView titleTxt;
    private CharSequence titleTxtText;

    /* compiled from: RdsAgreementView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/common/agreementview/RdsAgreementView$OnAgreementAcceptedListener;", "", "onAgreementAccepted", "", "view", "Lcom/robinhood/shared/common/agreementview/RdsAgreementView;", "lib-agreement-view_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface OnAgreementAcceptedListener {
        void onAgreementAccepted(RdsAgreementView view);
    }

    /* compiled from: RdsAgreementView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.REVIEWING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.ACCEPTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.ACCEPTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.designsystem.textinput.TextWatcherAdapter, android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        TextWatcherAdapter.DefaultImpls.afterTextChanged(this, editable);
    }

    @Override // com.robinhood.android.designsystem.textinput.TextWatcherAdapter, android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        TextWatcherAdapter.DefaultImpls.beforeTextChanged(this, charSequence, i, i2, i3);
    }

    public /* synthetic */ RdsAgreementView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RdsAgreementView(Context context, AttributeSet attributeSet) {
        super(new ScarletContextWrapper(context, null, null, 6, null), attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, getLayoutRes(), this);
        View viewFindViewById = findViewById(C37400R.id.agreement_scroll_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        NestedScrollView nestedScrollView = (NestedScrollView) viewFindViewById;
        this.scrollView = nestedScrollView;
        View viewFindViewById2 = findViewById(C37400R.id.agreement_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById2;
        this.agreementTxt = textView;
        View viewFindViewById3 = findViewById(C37400R.id.agreement_effective_date_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.effectiveDateTxt = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(C37400R.id.agreement_title_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.titleTxt = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(C37400R.id.agreement_header_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.headerTxt = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(C37400R.id.agreement_description_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.descriptionTxt = (TextView) viewFindViewById6;
        View viewFindViewById7 = findViewById(C37400R.id.agreement_accept_btn);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        RdsButton rdsButton = (RdsButton) viewFindViewById7;
        this.acceptBtn = rdsButton;
        View viewFindViewById8 = findViewById(C37400R.id.agreement_panel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        LinearLayout linearLayout = (LinearLayout) viewFindViewById8;
        this.panel = linearLayout;
        View viewFindViewById9 = findViewById(C37400R.id.additional_checkboxes_compose_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.additionalCheckboxesComposeView = (ComposeView) viewFindViewById9;
        State state = State.REVIEWING;
        BehaviorSubject<State> behaviorSubjectCreateDefault = BehaviorSubject.createDefault(state);
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreateDefault, "createDefault(...)");
        this.stateSubject = behaviorSubjectCreateDefault;
        BehaviorSubject<Float> behaviorSubjectCreateDefault2 = BehaviorSubject.createDefault(Float.valueOf(0.0f));
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreateDefault2, "createDefault(...)");
        this.percentScrolledDownSubject = behaviorSubjectCreateDefault2;
        BehaviorSubject<Optional<Integer>> behaviorSubjectCreateDefault3 = BehaviorSubject.createDefault(Optional2.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreateDefault3, "createDefault(...)");
        this.resIdSubject = behaviorSubjectCreateDefault3;
        nestedScrollView.setOnScrollChangeListener(this);
        textView.addTextChangedListener(this);
        rdsButton.setOnClickListener(this);
        linearLayout.addOnLayoutChangeListener(this);
        this.state = state;
        this.gravity = 17;
        this.titleTxtText = "";
        this.headerTxtText = "";
        this.descriptionTxtText = "";
        this.reviewButtonText = "";
        this.acceptButtonText = "";
        this.additionalCheckboxes = CollectionsKt.emptyList();
        this.areAllCheckboxesChecked = true;
        initialize(attributeSet);
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    protected int getLayoutRes() {
        return C37400R.layout.merge_rds_agreement_view;
    }

    private final void initialize(AttributeSet attrs) {
        if (attrs == null) {
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int[] RdsAgreementView = C13997R.styleable.RdsAgreementView;
        Intrinsics.checkNotNullExpressionValue(RdsAgreementView, "RdsAgreementView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, RdsAgreementView, 0, 0);
        Integer resourceIdOrNull = TypedArrays3.getResourceIdOrNull(typedArrayObtainStyledAttributes, C13997R.styleable.RdsAgreementView_rawResId);
        if (resourceIdOrNull != null) {
            loadFromRawResource(resourceIdOrNull.intValue());
        }
        String string2 = typedArrayObtainStyledAttributes.getString(C13997R.styleable.RdsAgreementView_descriptionText);
        if (string2 != null) {
            setDescriptionTxtText(string2);
        }
        String string3 = typedArrayObtainStyledAttributes.getString(C13997R.styleable.RdsAgreementView_reviewButtonText);
        if (string3 != null) {
            setReviewButtonText(string3);
        }
        String string4 = typedArrayObtainStyledAttributes.getString(C13997R.styleable.RdsAgreementView_acceptButtonText);
        if (string4 != null) {
            setAcceptButtonText(string4);
        }
        Integer resourceIdOrNull2 = TypedArrays3.getResourceIdOrNull(typedArrayObtainStyledAttributes, C13997R.styleable.RdsAgreementView_effectiveDateText);
        if (resourceIdOrNull2 != null) {
            setEffectiveDateTextResId(Integer.valueOf(resourceIdOrNull2.intValue()));
        }
        if (typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.RdsAgreementView_hasAchromaticPrimaryButton, false)) {
            ScarletManager2.overrideStyle$default(this.acceptBtn, new ThemedResourceReference(ResourceType.STYLE.INSTANCE, C20690R.attr.primaryMonochromeButtonStyle), false, 2, null);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void onAgreementAccepted(final Function1<? super RdsAgreementView, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.listener = new OnAgreementAcceptedListener() { // from class: com.robinhood.shared.common.agreementview.RdsAgreementView.onAgreementAccepted.1
            @Override // com.robinhood.shared.common.agreementview.RdsAgreementView.OnAgreementAcceptedListener
            public void onAgreementAccepted(RdsAgreementView view) {
                Intrinsics.checkNotNullParameter(view, "view");
                action.invoke(view);
            }
        };
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Observable<Optional<Integer>> observableObserveOn = this.resIdSubject.observeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(observableObserveOn, "observeOn(...)");
        Completable completableSwitchMapCompletable = ObservablesKt.filterIsPresent(observableObserveOn).distinctUntilChanged().switchMapCompletable(new Function() { // from class: com.robinhood.shared.common.agreementview.RdsAgreementView.onAttachedToWindow.1
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(Integer it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TextViewsKt.loadMarkdownFromRawResource$default(RdsAgreementView.this.agreementTxt, it.intValue(), null, 2, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableSwitchMapCompletable, "switchMapCompletable(...)");
        ViewScopedCompletable.subscribe$default(ViewDisposerKt.bindTo(completableSwitchMapCompletable, this), null, null, 3, null);
    }

    private final void refreshUi() {
        TransitionManager.beginDelayedTransition(this, new AutoTransition());
        this.titleTxt.setText(this.titleTxtText);
        TextView textView = this.titleTxt;
        CharSequence text = textView.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        textView.setVisibility(text.length() > 0 ? 0 : 8);
        this.headerTxt.setText(this.headerTxtText);
        TextView textView2 = this.headerTxt;
        CharSequence text2 = textView2.getText();
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        textView2.setVisibility(text2.length() > 0 ? 0 : 8);
        this.descriptionTxt.setText(this.descriptionTxtText);
        this.additionalCheckboxesComposeView.setVisibility(!this.additionalCheckboxes.isEmpty() ? 0 : 8);
        this.additionalCheckboxesComposeView.setContent(ComposableLambda3.composableLambdaInstance(31989903, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.common.agreementview.RdsAgreementView.refreshUi.1
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
                    ComposerKt.traceEventStart(31989903, i, -1, "com.robinhood.shared.common.agreementview.RdsAgreementView.refreshUi.<anonymous> (RdsAgreementView.kt:155)");
                }
                if (!RdsAgreementView.this.getAdditionalCheckboxes().isEmpty()) {
                    Context context = RdsAgreementView.this.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(ScarletManager2.getScarletManager(Contexts7.requireBaseActivityBaseContext(context)));
                    composer.startReplaceGroup(1849434622);
                    Object objRememberedValue = composer.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function() { // from class: com.robinhood.shared.common.agreementview.RdsAgreementView$refreshUi$1$1$1
                            @Override // io.reactivex.functions.Function
                            public final ThemesFromScarlet apply(ThemesFromScarlet it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                return ThemesFromScarlet.copy$default(it, false, false, false, true, false, null, 55, null);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    Observable<R> map = observableThemeChangesForCompose.map((Function) objRememberedValue);
                    Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                    BentoTheme2.BentoTheme(map, null, ComposableLambda3.rememberComposableLambda(-1554236004, true, new AnonymousClass2(RdsAgreementView.this), composer, 54), composer, 384, 2);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* compiled from: RdsAgreementView.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.shared.common.agreementview.RdsAgreementView$refreshUi$1$2, reason: invalid class name */
            static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ RdsAgreementView this$0;

                AnonymousClass2(RdsAgreementView rdsAgreementView) {
                    this.this$0 = rdsAgreementView;
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
                        ComposerKt.traceEventStart(-1554236004, i, -1, "com.robinhood.shared.common.agreementview.RdsAgreementView.refreshUi.<anonymous>.<anonymous> (RdsAgreementView.kt:159)");
                    }
                    ImmutableList immutableList = extensions2.toImmutableList(this.this$0.getAdditionalCheckboxes());
                    composer.startReplaceGroup(5004770);
                    boolean zChangedInstance = composer.changedInstance(this.this$0);
                    final RdsAgreementView rdsAgreementView = this.this$0;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.shared.common.agreementview.RdsAgreementView$refreshUi$1$2$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return RdsAgreementView.C374031.AnonymousClass2.invoke$lambda$1$lambda$0(rdsAgreementView, ((Boolean) obj).booleanValue());
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    AgreementAdditionalCheckboxes.AgreementAdditionalCheckboxes(immutableList, null, null, (Function1) objRememberedValue, false, composer, 0, 22);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$1$lambda$0(RdsAgreementView rdsAgreementView, boolean z) {
                    rdsAgreementView.setAreAllCheckboxesChecked(z);
                    return Unit.INSTANCE;
                }
            }
        }));
        int i = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
        if (i == 1) {
            this.descriptionTxt.setVisibility(8);
            RdsButton rdsButton = this.acceptBtn;
            rdsButton.setText(this.reviewButtonText);
            rdsButton.setEnabled(this.areAllCheckboxesChecked);
            rdsButton.setLoading(false);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            TextView textView3 = this.descriptionTxt;
            CharSequence text3 = textView3.getText();
            Intrinsics.checkNotNullExpressionValue(text3, "getText(...)");
            textView3.setVisibility(text3.length() > 0 ? 0 : 8);
            RdsButton rdsButton2 = this.acceptBtn;
            rdsButton2.setText(this.acceptButtonText);
            rdsButton2.setEnabled(true);
            rdsButton2.setLoading(true);
            return;
        }
        TextView textView4 = this.descriptionTxt;
        CharSequence text4 = textView4.getText();
        Intrinsics.checkNotNullExpressionValue(text4, "getText(...)");
        textView4.setVisibility(text4.length() > 0 ? 0 : 8);
        RdsButton rdsButton3 = this.acceptBtn;
        rdsButton3.setText(this.acceptButtonText);
        rdsButton3.setEnabled(this.areAllCheckboxesChecked);
        rdsButton3.setLoading(false);
        if (this.autoScrollingTriggered) {
            IdlingResourceCounters2.decrement(IdlingResourceType.BASE_AGREEMENT_SCROLL_TO_BOTTOM);
            this.autoScrollingTriggered = false;
        }
    }

    public final void updateAcceptButtonLoading(boolean isLoading) {
        this.acceptBtn.setLoading(isLoading);
    }

    private final void scrollToBottom() {
        IdlingResourceCounters2.increment(IdlingResourceType.BASE_AGREEMENT_SCROLL_TO_BOTTOM);
        this.autoScrollingTriggered = true;
        Animators animators = Animators.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (animators.animationsEnabled(context)) {
            NestedScrollView nestedScrollView = this.scrollView;
            View childAt = nestedScrollView.getChildAt(0);
            Intrinsics.checkNotNull(childAt);
            nestedScrollView.smoothScrollTo(0, childAt.getBottom());
            return;
        }
        NestedScrollView nestedScrollView2 = this.scrollView;
        View childAt2 = nestedScrollView2.getChildAt(0);
        Intrinsics.checkNotNull(childAt2);
        nestedScrollView2.scrollTo(0, childAt2.getBottom());
    }

    private final void scrollToTop() {
        this.scrollView.scrollTo(0, 0);
    }

    @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
    public void onScrollChange(NestedScrollView view, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.percentScrolledDownSubject.onNext(Float.valueOf(view.getScrollY() / (view.getChildAt(0).getBottom() - view.getHeight())));
        if (this.state != State.REVIEWING || this.scrollView.canScrollVertically(1)) {
            return;
        }
        setState(State.ACCEPTING);
    }

    @Override // com.robinhood.android.designsystem.textinput.TextWatcherAdapter, android.text.TextWatcher
    public void onTextChanged(CharSequence text, int start, int before, int count) {
        Intrinsics.checkNotNullParameter(text, "text");
        final TextView textView = this.agreementTxt;
        OneShotPreDrawListener.add(textView, new Runnable() { // from class: com.robinhood.shared.common.agreementview.RdsAgreementView$onTextChanged$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                this.reset();
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        int i = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
        if (i == 1) {
            scrollToBottom();
            return;
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        setState(State.ACCEPTED);
        OnAgreementAcceptedListener onAgreementAcceptedListener = this.listener;
        if (onAgreementAcceptedListener != null) {
            onAgreementAcceptedListener.onAgreementAccepted(this);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewsKt.setBottomPadding(this.scrollView, bottom - top);
        if (this.state == State.ACCEPTING) {
            scrollToBottom();
            refreshUi();
        }
    }

    public final void setOnAgreementAcceptedListener(OnAgreementAcceptedListener listener) {
        this.listener = listener;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RdsAgreementView.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/shared/common/agreementview/RdsAgreementView$State;", "", "<init>", "(Ljava/lang/String;I)V", "REVIEWING", "ACCEPTING", "ACCEPTED", "lib-agreement-view_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class State {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State REVIEWING = new State("REVIEWING", 0);
        public static final State ACCEPTING = new State("ACCEPTING", 1);
        public static final State ACCEPTED = new State("ACCEPTED", 2);

        private static final /* synthetic */ State[] $values() {
            return new State[]{REVIEWING, ACCEPTING, ACCEPTED};
        }

        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }

        private State(String str, int i) {
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(stateArr$values);
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public final State getState() {
        return this.state;
    }

    private final void setState(State state) {
        if (this.state == state) {
            return;
        }
        this.state = state;
        refreshUi();
        this.stateSubject.onNext(state);
    }

    public final Integer getEffectiveDateTextResId() {
        return this.effectiveDateTextResId;
    }

    public final void setEffectiveDateTextResId(Integer num) {
        if (num == null) {
            this.effectiveDateTxt.setVisibility(8);
            return;
        }
        this.effectiveDateTextResId = num;
        TextView textView = this.effectiveDateTxt;
        textView.setVisibility(0);
        textView.setText(ViewsKt.getString(textView, num.intValue(), LocalDateFormatter.MEDIUM.format((LocalDateFormatter) LocalDate.now())));
    }

    public final void reset() {
        setState(State.REVIEWING);
        if (!this.scrollView.canScrollVertically(1) && !this.scrollView.canScrollVertically(-1)) {
            CharSequence text = this.agreementTxt.getText();
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            if (!StringsKt.isBlank(text)) {
                setState(State.ACCEPTING);
            }
        }
        scrollToTop();
    }

    public final int getGravity() {
        return this.gravity;
    }

    public final void setGravity(int i) {
        this.gravity = i;
        this.titleTxt.setGravity(i);
        this.headerTxt.setGravity(this.gravity);
    }

    public final CharSequence getTitleTxtText() {
        return this.titleTxtText;
    }

    public final void setTitleTxtText(CharSequence value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.titleTxtText = value;
        refreshUi();
    }

    public final CharSequence getHeaderTxtText() {
        return this.headerTxtText;
    }

    public final void setHeaderTxtText(CharSequence value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.headerTxtText = value;
        refreshUi();
    }

    public final CharSequence getDescriptionTxtText() {
        return this.descriptionTxtText;
    }

    public final void setDescriptionTxtText(CharSequence value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.descriptionTxtText = value;
        refreshUi();
    }

    public final String getReviewButtonText() {
        return this.reviewButtonText;
    }

    public final void setReviewButtonText(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.reviewButtonText = value;
        refreshUi();
    }

    public final String getAcceptButtonText() {
        return this.acceptButtonText;
    }

    public final void setAcceptButtonText(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.acceptButtonText = value;
        refreshUi();
    }

    public final List<String> getAdditionalCheckboxes() {
        return this.additionalCheckboxes;
    }

    public final void setAdditionalCheckboxes(List<String> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.additionalCheckboxes = value;
        refreshUi();
    }

    public final boolean getAreAllCheckboxesChecked() {
        return this.areAllCheckboxesChecked;
    }

    public final void setAreAllCheckboxesChecked(boolean z) {
        this.areAllCheckboxesChecked = z;
        refreshUi();
    }

    public final void loadFromRawResource(int resId) {
        this.resIdSubject.onNext(Optional3.asOptional(Integer.valueOf(resId)));
    }

    public final void loadFromString(PrecomputedTextCompat text) {
        Intrinsics.checkNotNullParameter(text, "text");
        getMarkwon().setParsedMarkdown(this.agreementTxt, text);
    }

    public final PrecomputedTextCompat.Params getTextMetricsParams() {
        PrecomputedTextCompat.Params textMetricsParams = TextViewCompat.getTextMetricsParams(this.agreementTxt);
        Intrinsics.checkNotNullExpressionValue(textMetricsParams, "getTextMetricsParams(...)");
        return textMetricsParams;
    }

    public final Observable<State> stateChanges() {
        return this.stateSubject;
    }

    public final Observable<Float> scrollDepthPercentChanges() {
        return this.percentScrolledDownSubject;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.checkNotNull(parcelableOnSaveInstanceState);
        State state = this.state;
        CharSequence charSequence = this.titleTxtText;
        CharSequence charSequence2 = this.headerTxtText;
        CharSequence charSequence3 = this.descriptionTxtText;
        String str = this.reviewButtonText;
        String str2 = this.acceptButtonText;
        Optional<Integer> value = this.resIdSubject.getValue();
        return new SavedState(parcelableOnSaveInstanceState, state, charSequence, charSequence2, charSequence3, str, str2, value != null ? value.getOrNull() : null, this.additionalCheckboxes);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable savedState) {
        Intrinsics.checkNotNullParameter(savedState, "savedState");
        SavedState savedState2 = (SavedState) savedState;
        super.onRestoreInstanceState(savedState2.getSuperState());
        setState(savedState2.getState());
        setTitleTxtText(savedState2.getTitleTxtText());
        setHeaderTxtText(savedState2.getHeaderTxtText());
        setDescriptionTxtText(savedState2.getDescriptionTxtText());
        setReviewButtonText(savedState2.getReviewButtonText());
        setAcceptButtonText(savedState2.getAcceptButtonText());
        setAdditionalCheckboxes(savedState2.getAdditionalCheckboxes());
        Integer rawResId = savedState2.getRawResId();
        if (rawResId != null) {
            loadFromRawResource(rawResId.intValue());
        }
    }

    /* compiled from: RdsAgreementView.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006("}, m3636d2 = {"Lcom/robinhood/shared/common/agreementview/RdsAgreementView$SavedState;", "Landroidx/customview/view/AbsSavedState;", "inSuperState", "Landroid/os/Parcelable;", "state", "Lcom/robinhood/shared/common/agreementview/RdsAgreementView$State;", "titleTxtText", "", "headerTxtText", "descriptionTxtText", "reviewButtonText", "", "acceptButtonText", "rawResId", "", "additionalCheckboxes", "", "<init>", "(Landroid/os/Parcelable;Lcom/robinhood/shared/common/agreementview/RdsAgreementView$State;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)V", "getInSuperState", "()Landroid/os/Parcelable;", "getState", "()Lcom/robinhood/shared/common/agreementview/RdsAgreementView$State;", "getTitleTxtText", "()Ljava/lang/CharSequence;", "getHeaderTxtText", "getDescriptionTxtText", "getReviewButtonText", "()Ljava/lang/String;", "getAcceptButtonText", "getRawResId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAdditionalCheckboxes", "()Ljava/util/List;", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-agreement-view_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SavedState extends AbsSavedState {
        public static final int $stable = 8;
        public static final Parcelable.Creator<SavedState> CREATOR = new Creator();
        private final String acceptButtonText;
        private final List<String> additionalCheckboxes;
        private final CharSequence descriptionTxtText;
        private final CharSequence headerTxtText;
        private final Parcelable inSuperState;
        private final Integer rawResId;
        private final String reviewButtonText;
        private final State state;
        private final CharSequence titleTxtText;

        /* compiled from: RdsAgreementView.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<SavedState> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Parcelable parcelable = parcel.readParcelable(SavedState.class.getClassLoader());
                State stateValueOf = State.valueOf(parcel.readString());
                Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
                return new SavedState(parcelable, stateValueOf, (CharSequence) creator.createFromParcel(parcel), (CharSequence) creator.createFromParcel(parcel), (CharSequence) creator.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.createStringArrayList());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            int iIntValue;
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.inSuperState, flags);
            dest.writeString(this.state.name());
            TextUtils.writeToParcel(this.titleTxtText, dest, flags);
            TextUtils.writeToParcel(this.headerTxtText, dest, flags);
            TextUtils.writeToParcel(this.descriptionTxtText, dest, flags);
            dest.writeString(this.reviewButtonText);
            dest.writeString(this.acceptButtonText);
            Integer num = this.rawResId;
            if (num == null) {
                iIntValue = 0;
            } else {
                dest.writeInt(1);
                iIntValue = num.intValue();
            }
            dest.writeInt(iIntValue);
            dest.writeStringList(this.additionalCheckboxes);
        }

        public final Parcelable getInSuperState() {
            return this.inSuperState;
        }

        public final State getState() {
            return this.state;
        }

        public final CharSequence getTitleTxtText() {
            return this.titleTxtText;
        }

        public final CharSequence getHeaderTxtText() {
            return this.headerTxtText;
        }

        public final CharSequence getDescriptionTxtText() {
            return this.descriptionTxtText;
        }

        public final String getReviewButtonText() {
            return this.reviewButtonText;
        }

        public final String getAcceptButtonText() {
            return this.acceptButtonText;
        }

        public final Integer getRawResId() {
            return this.rawResId;
        }

        public final List<String> getAdditionalCheckboxes() {
            return this.additionalCheckboxes;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(Parcelable inSuperState, State state, CharSequence titleTxtText, CharSequence headerTxtText, CharSequence descriptionTxtText, String reviewButtonText, String acceptButtonText, Integer num, List<String> additionalCheckboxes) {
            super(inSuperState);
            Intrinsics.checkNotNullParameter(inSuperState, "inSuperState");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(titleTxtText, "titleTxtText");
            Intrinsics.checkNotNullParameter(headerTxtText, "headerTxtText");
            Intrinsics.checkNotNullParameter(descriptionTxtText, "descriptionTxtText");
            Intrinsics.checkNotNullParameter(reviewButtonText, "reviewButtonText");
            Intrinsics.checkNotNullParameter(acceptButtonText, "acceptButtonText");
            Intrinsics.checkNotNullParameter(additionalCheckboxes, "additionalCheckboxes");
            this.inSuperState = inSuperState;
            this.state = state;
            this.titleTxtText = titleTxtText;
            this.headerTxtText = headerTxtText;
            this.descriptionTxtText = descriptionTxtText;
            this.reviewButtonText = reviewButtonText;
            this.acceptButtonText = acceptButtonText;
            this.rawResId = num;
            this.additionalCheckboxes = additionalCheckboxes;
        }
    }
}
