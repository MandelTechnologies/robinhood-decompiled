package com.robinhood.android.educationtour;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import android.transition.AutoTransition;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.appcompat.R$attr;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.ViewGroup2;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.jakewharton.rxbinding3.view.RxView;
import com.jakewharton.rxbinding3.view.ViewScrollChangeEvent;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.Snackbars;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.tooltip.RdsTooltipView;
import com.robinhood.android.educationtour.compose.ComposeEducationTourElementData;
import com.robinhood.android.educationtour.compose.ComposeEducationTourHighlightData;
import com.robinhood.android.educationtour.compose.ComposeEducationTourManager;
import com.robinhood.android.educationtour.databinding.FragmentEducationTourOverlayBinding;
import com.robinhood.android.educationtour.extensions.BaseFragments3;
import com.robinhood.android.educationtour.interfaces.EducationTourAdapter;
import com.robinhood.android.educationtour.interfaces.EducationTourCallbacks;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.compose.app.GenericComposeView;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.rosetta.eventlogging.Asset;
import com.robinhood.rosetta.eventlogging.CXIssue;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.DirectDepositContext;
import com.robinhood.rosetta.eventlogging.DirectDepositSwitcherContext;
import com.robinhood.rosetta.eventlogging.EducationTour;
import com.robinhood.rosetta.eventlogging.Feedback;
import com.robinhood.rosetta.eventlogging.InAppComm;
import com.robinhood.rosetta.eventlogging.InAppSurvey;
import com.robinhood.rosetta.eventlogging.LearningAnswer;
import com.robinhood.rosetta.eventlogging.LearningLesson;
import com.robinhood.rosetta.eventlogging.LearningMatchingExercise;
import com.robinhood.rosetta.eventlogging.LearningMatchingExerciseBucket;
import com.robinhood.rosetta.eventlogging.LearningMatchingExerciseEntity;
import com.robinhood.rosetta.eventlogging.LearningSection;
import com.robinhood.rosetta.eventlogging.ListsContext;
import com.robinhood.rosetta.eventlogging.NewsFeedItem;
import com.robinhood.rosetta.eventlogging.OrderKind;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import com.robinhood.rosetta.eventlogging.SafetyLabelInfoTag;
import com.robinhood.rosetta.eventlogging.SafetyLabelLesson;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.models.api.bonfire.education.tour.EducationTourSection;
import com.robinhood.shared.models.p387db.bonfire.education.tour.EducationTourOutro;
import com.robinhood.staticcontent.util.Markwons;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.tooltips.TooltipActivity;
import com.robinhood.tooltips.TooltipData;
import com.robinhood.tooltips.TooltipData2;
import com.robinhood.tooltips.TooltipManager;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.Transitions2;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.SmoothTopScroller;
import io.noties.markwon.Markwon;
import io.reactivex.Observable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: EducationTourOverlayFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0098\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ¬\u00012\u00020\u00012\u00020\u0002:\u0004¬\u0001\u00ad\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010j\u001a\u00020k2\u0006\u0010l\u001a\u00020mH\u0016J\u001a\u0010n\u001a\u00020k2\u0006\u0010o\u001a\u00020R2\b\u0010p\u001a\u0004\u0018\u00010qH\u0016J\b\u0010r\u001a\u00020kH\u0016J\u0010\u0010s\u001a\u00020k2\u0006\u0010t\u001a\u00020uH\u0016J\b\u0010v\u001a\u00020kH\u0016J\u0006\u0010w\u001a\u00020kJ\b\u0010x\u001a\u00020kH\u0003J\u0010\u0010y\u001a\u00020k2\u0006\u0010z\u001a\u00020{H\u0002J\u0010\u0010|\u001a\u00020k2\u0006\u0010z\u001a\u00020{H\u0002J\u0010\u0010}\u001a\u00020k2\u0006\u0010z\u001a\u00020{H\u0002J\u0010\u0010~\u001a\u00020k2\u0006\u0010z\u001a\u00020{H\u0003J\u0010\u0010\u007f\u001a\u00020k2\u0006\u0010z\u001a\u00020{H\u0002J\u0011\u0010\u0080\u0001\u001a\u00020k2\u0006\u0010z\u001a\u00020{H\u0003J\u0018\u0010\u0081\u0001\u001a\u00020k2\r\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020^0QH\u0003J\u0018\u0010\u0083\u0001\u001a\u00020k2\r\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020^0QH\u0003J!\u0010\u0084\u0001\u001a\u00020k2\r\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020^0Q2\u0007\u0010\u0086\u0001\u001a\u00020RH\u0002J\u0018\u0010\u0087\u0001\u001a\u00020k2\r\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020^0QH\u0003J\u0012\u0010\u0088\u0001\u001a\u00020k2\u0007\u0010\u0089\u0001\u001a\u00020RH\u0002J\u000b\u0010\u008a\u0001\u001a\u0004\u0018\u00010LH\u0002J\u001a\u0010\u008b\u0001\u001a\u0004\u0018\u00010R2\r\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020^0QH\u0003J\u0018\u0010\u008c\u0001\u001a\u00020k2\r\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020^0QH\u0003J/\u0010\u008d\u0001\u001a\u00020k*\u00030\u008e\u00012\r\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020^0Q2\u0007\u0010\u008f\u0001\u001a\u00020V2\u0007\u0010\u0090\u0001\u001a\u00020(H\u0003J\u0013\u0010\u0091\u0001\u001a\u00020k2\b\u0010\u0092\u0001\u001a\u00030\u0093\u0001H\u0002J\u0018\u0010\u0094\u0001\u001a\u00020k2\r\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020^0QH\u0003J\u0012\u0010\u0095\u0001\u001a\u00020k2\u0007\u0010\u0096\u0001\u001a\u00020(H\u0002J\u001f\u0010\u0097\u0001\u001a\u00020k2\b\u0010\u0098\u0001\u001a\u00030\u0099\u00012\n\u00105\u001a\u000606j\u0002`7H\u0002J\u001f\u0010\u009a\u0001\u001a\u00020k2\b\u0010\u009b\u0001\u001a\u00030\u009c\u00012\n\u00105\u001a\u000606j\u0002`7H\u0002JN\u0010\u009d\u0001\u001a\u00020k2\r\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020^0Q2\b\u0010\u009e\u0001\u001a\u00030\u009f\u00012\u000f\u0010 \u0001\u001a\n\u0018\u000106j\u0004\u0018\u0001`72\u0007\u0010¡\u0001\u001a\u00020(2\u0010\b\u0002\u0010¢\u0001\u001a\t\u0012\u0004\u0012\u00020k0£\u0001H\u0003J\u0012\u0010¤\u0001\u001a\u00020k2\u0007\u0010¥\u0001\u001a\u00020(H\u0002J\t\u0010¦\u0001\u001a\u00020kH\u0002J\t\u0010§\u0001\u001a\u00020kH\u0002J\u0011\u0010¨\u0001\u001a\u00020k2\u0006\u0010z\u001a\u00020{H\u0002J)\u0010©\u0001\u001a\u0013\u0012\u0004\u0012\u00020^\u0012\u0006\u0012\u0004\u0018\u00010c\u0018\u00010ª\u00012\r\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020^0QH\u0002J\r\u0010«\u0001\u001a\u00020(*\u00020RH\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010)\"\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020(X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b-\u0010)R\u0014\u0010.\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010)R\u0014\u0010/\u001a\u000200X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0010\u00103\u001a\u0004\u0018\u000104X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u00105\u001a\n\u0018\u000106j\u0004\u0018\u0001`7X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00108\u001a\u0004\u0018\u000109X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u0004\u0018\u00010;X\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010<\u001a\n >*\u0004\u0018\u00010=0=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010\u0014\u001a\u0004\b?\u0010@R#\u0010B\u001a\n >*\u0004\u0018\u00010=0=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010\u0014\u001a\u0004\bC\u0010@R#\u0010E\u001a\n >*\u0004\u0018\u00010=0=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010\u0014\u001a\u0004\bF\u0010@R#\u0010H\u001a\n >*\u0004\u0018\u00010=0=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010\u0014\u001a\u0004\bI\u0010@R\u001d\u0010K\u001a\u0004\u0018\u00010L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010\u0014\u001a\u0004\bM\u0010NR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020R0Q8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u001b\u0010U\u001a\u00020V8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010\u0014\u001a\u0004\bW\u0010XR\u0010\u0010Z\u001a\u0004\u0018\u00010RX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010[\u001a\b\u0012\u0004\u0012\u00020(0\\X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010]\u001a\b\u0012\u0004\u0012\u00020^0QX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010_\u001a\b\u0012\u0004\u0012\u00020R0QX\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010`\u001a\u0014\u0012\u0004\u0012\u00020^\u0012\n\u0012\b\u0012\u0004\u0012\u00020c0b0a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0014\u0010f\u001a\b\u0012\u0004\u0012\u00020g0QX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010h\u001a\u00020iX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006®\u0001"}, m3636d2 = {"Lcom/robinhood/android/educationtour/EducationTourOverlayFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/educationtour/databinding/FragmentEducationTourOverlayBinding;", "getBinding", "()Lcom/robinhood/android/educationtour/databinding/FragmentEducationTourOverlayBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "tooltipManager", "Lcom/robinhood/tooltips/TooltipManager;", "getTooltipManager", "()Lcom/robinhood/tooltips/TooltipManager;", "duxo", "Lcom/robinhood/android/educationtour/EducationTourOverlayDuxo;", "getDuxo", "()Lcom/robinhood/android/educationtour/EducationTourOverlayDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/educationtour/interfaces/EducationTourCallbacks;", "getCallbacks", "()Lcom/robinhood/android/educationtour/interfaces/EducationTourCallbacks;", "setCallbacks", "(Lcom/robinhood/android/educationtour/interfaces/EducationTourCallbacks;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "isShowingOutro", "", "()Z", "setShowingOutro", "(Z)V", "useDesignSystemToolbar", "getUseDesignSystemToolbar", "isCrypto", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventTour", "Lcom/robinhood/rosetta/eventlogging/EducationTour;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "savedToolbarState", "Lcom/robinhood/android/educationtour/ToolbarState;", "toolbarTextSwitcher", "Landroid/widget/TextSwitcher;", "toolbarSlideInBottomAnimation", "Landroid/view/animation/Animation;", "kotlin.jvm.PlatformType", "getToolbarSlideInBottomAnimation", "()Landroid/view/animation/Animation;", "toolbarSlideInBottomAnimation$delegate", "toolbarSlideInTopAnimation", "getToolbarSlideInTopAnimation", "toolbarSlideInTopAnimation$delegate", "toolbarSlideOutTopAnimation", "getToolbarSlideOutTopAnimation", "toolbarSlideOutTopAnimation$delegate", "toolbarSlideOutBottomAnimation", "getToolbarSlideOutBottomAnimation", "toolbarSlideOutBottomAnimation$delegate", "rootScreenView", "Landroid/view/ViewGroup;", "getRootScreenView", "()Landroid/view/ViewGroup;", "rootScreenView$delegate", "rootScreenAndDescendantViews", "", "Landroid/view/View;", "getRootScreenAndDescendantViews", "()Ljava/util/List;", "rootScreenTopMargin", "", "getRootScreenTopMargin", "()I", "rootScreenTopMargin$delegate", "previousScrollToView", "verticalScrollingStateRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "previousScrollToElementIds", "", "previousHighlightedViews", "composeElements", "", "Ljava/lang/ref/SoftReference;", "Lcom/robinhood/android/educationtour/compose/ComposeEducationTourElementData;", "getComposeElements", "()Ljava/util/Map;", "previousHighlightedComposables", "Lcom/robinhood/android/educationtour/compose/ComposeEducationTourHighlightData;", "highlightedComposablesViewLocation", "", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onDetach", "logBackPressed", "updateAvailableElements", "setViewState", "state", "Lcom/robinhood/android/educationtour/EducationTourOverlayViewState;", "bindLoading", "bindError", "bindContent", "consumeExitTourEvent", "consumeShowOutroEvent", "maybeFocusComposeElement", "elementIds", "scrollToSection", "scrollRootScreenViewToSection", "scrollToElementIds", "scrollToElementView", "scrollRootRecyclerViewToElementView", "scrollGenericRootViewToElementView", "elementView", "findRootScreenView", "findFirstVisibleElementView", "scrollRecyclerViewToElementViewIfExists", "smoothScrollToElementView", "Landroidx/recyclerview/widget/RecyclerView;", "elementPosition", "isFinalScroll", "updatePreviousHighlightedViews", "section", "Lcom/robinhood/shared/models/api/bonfire/education/tour/EducationTourSection;", "updateCurrentHighlightedViews", "setButtonsClickable", "isClickable", "showOutroTooltip", "tooltip", "Lcom/robinhood/shared/models/db/bonfire/education/tour/EducationTourOutro$Tooltip;", "showOutroToast", "toast", "Lcom/robinhood/shared/models/db/bonfire/education/tour/EducationTourOutro$Toast;", "addToolTip", "tooltipContent", "Lcom/robinhood/contentful/markdown/MarkdownContent;", "tooltipEventContext", "shouldClickTooltipElement", "onDisplayed", "Lkotlin/Function0;", "updateToolbarAnimations", "shouldAnimateToNextSection", "restoreTooltipManager", "restoreToolbarState", "updateEventContext", "findFirstElementData", "Lkotlin/Pair;", "isRootComposeView", "Companion", "Args", "lib-education-tour_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class EducationTourOverlayFragment extends BaseFragment implements AutoLoggableFragment {
    public static final String EDUCATION_TOUR_OVERLAY_TAG = "educationTourOverlayFragment";
    private static final long OVERLAY_FADE_DURATION = 150;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private EducationTourCallbacks callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private Context eventContext;
    public EventLogger eventLogger;
    private final Screen eventScreen;
    private EducationTour eventTour;
    private final int[] highlightedComposablesViewLocation;
    private boolean isShowingOutro;
    public Markwon markwon;
    private List<ComposeEducationTourHighlightData> previousHighlightedComposables;
    private List<? extends View> previousHighlightedViews;
    private List<String> previousScrollToElementIds;
    private View previousScrollToView;

    /* renamed from: rootScreenTopMargin$delegate, reason: from kotlin metadata */
    private final Lazy rootScreenTopMargin;

    /* renamed from: rootScreenView$delegate, reason: from kotlin metadata */
    private final Lazy rootScreenView;
    private ToolbarState savedToolbarState;

    /* renamed from: toolbarSlideInBottomAnimation$delegate, reason: from kotlin metadata */
    private final Lazy toolbarSlideInBottomAnimation;

    /* renamed from: toolbarSlideInTopAnimation$delegate, reason: from kotlin metadata */
    private final Lazy toolbarSlideInTopAnimation;

    /* renamed from: toolbarSlideOutBottomAnimation$delegate, reason: from kotlin metadata */
    private final Lazy toolbarSlideOutBottomAnimation;

    /* renamed from: toolbarSlideOutTopAnimation$delegate, reason: from kotlin metadata */
    private final Lazy toolbarSlideOutTopAnimation;
    private TextSwitcher toolbarTextSwitcher;
    private final boolean useDesignSystemToolbar;
    private final BehaviorRelay<Boolean> verticalScrollingStateRelay;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EducationTourOverlayFragment.class, "binding", "getBinding()Lcom/robinhood/android/educationtour/databinding/FragmentEducationTourOverlayBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor addToolTip$lambda$56$lambda$55(UserInteractionEventDescriptor userInteractionEventDescriptor) {
        return userInteractionEventDescriptor;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public EducationTourOverlayFragment() {
        super(C14469R.layout.fragment_education_tour_overlay);
        this.binding = ViewBinding5.viewBinding(this, EducationTourOverlayFragment3.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, EducationTourOverlayDuxo.class);
        this.useDesignSystemToolbar = true;
        this.eventScreen = new Screen(Screen.Name.EDUCATION_TOUR, null, null, null, 14, null);
        this.toolbarSlideInBottomAnimation = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.educationtour.EducationTourOverlayFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EducationTourOverlayFragment.toolbarSlideInBottomAnimation_delegate$lambda$0(this.f$0);
            }
        });
        this.toolbarSlideInTopAnimation = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.educationtour.EducationTourOverlayFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EducationTourOverlayFragment.toolbarSlideInTopAnimation_delegate$lambda$1(this.f$0);
            }
        });
        this.toolbarSlideOutTopAnimation = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.educationtour.EducationTourOverlayFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EducationTourOverlayFragment.toolbarSlideOutTopAnimation_delegate$lambda$2(this.f$0);
            }
        });
        this.toolbarSlideOutBottomAnimation = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.educationtour.EducationTourOverlayFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EducationTourOverlayFragment.toolbarSlideOutBottomAnimation_delegate$lambda$3(this.f$0);
            }
        });
        this.rootScreenView = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.educationtour.EducationTourOverlayFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.findRootScreenView();
            }
        });
        this.rootScreenTopMargin = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.educationtour.EducationTourOverlayFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(EducationTourOverlayFragment.rootScreenTopMargin_delegate$lambda$5(this.f$0));
            }
        });
        BehaviorRelay<Boolean> behaviorRelayCreateDefault = BehaviorRelay.createDefault(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.verticalScrollingStateRelay = behaviorRelayCreateDefault;
        this.previousScrollToElementIds = CollectionsKt.emptyList();
        this.previousHighlightedViews = CollectionsKt.emptyList();
        this.previousHighlightedComposables = CollectionsKt.emptyList();
        this.highlightedComposablesViewLocation = new int[2];
    }

    private final FragmentEducationTourOverlayBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentEducationTourOverlayBinding) value;
    }

    private final TooltipManager getTooltipManager() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        Intrinsics.checkNotNull(componentRequireActivity, "null cannot be cast to non-null type com.robinhood.tooltips.TooltipActivity");
        return ((TooltipActivity) componentRequireActivity).getTooltipManager();
    }

    private final EducationTourOverlayDuxo getDuxo() {
        return (EducationTourOverlayDuxo) this.duxo.getValue();
    }

    public final EducationTourCallbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(EducationTourCallbacks educationTourCallbacks) {
        this.callbacks = educationTourCallbacks;
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

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    /* renamed from: isShowingOutro, reason: from getter */
    public final boolean getIsShowingOutro() {
        return this.isShowingOutro;
    }

    public final void setShowingOutro(boolean z) {
        this.isShowingOutro = z;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    /* renamed from: isCrypto */
    public boolean get_isCrypto() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).isCrypto();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    private final Animation getToolbarSlideInBottomAnimation() {
        return (Animation) this.toolbarSlideInBottomAnimation.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Animation toolbarSlideInBottomAnimation_delegate$lambda$0(EducationTourOverlayFragment educationTourOverlayFragment) {
        return AnimationUtils.loadAnimation(educationTourOverlayFragment.requireContext(), C14469R.anim.slide_in_bottom);
    }

    private final Animation getToolbarSlideInTopAnimation() {
        return (Animation) this.toolbarSlideInTopAnimation.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Animation toolbarSlideInTopAnimation_delegate$lambda$1(EducationTourOverlayFragment educationTourOverlayFragment) {
        return AnimationUtils.loadAnimation(educationTourOverlayFragment.requireContext(), C14469R.anim.slide_in_top);
    }

    private final Animation getToolbarSlideOutTopAnimation() {
        return (Animation) this.toolbarSlideOutTopAnimation.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Animation toolbarSlideOutTopAnimation_delegate$lambda$2(EducationTourOverlayFragment educationTourOverlayFragment) {
        return AnimationUtils.loadAnimation(educationTourOverlayFragment.requireContext(), C14469R.anim.slide_out_top);
    }

    private final Animation getToolbarSlideOutBottomAnimation() {
        return (Animation) this.toolbarSlideOutBottomAnimation.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Animation toolbarSlideOutBottomAnimation_delegate$lambda$3(EducationTourOverlayFragment educationTourOverlayFragment) {
        return AnimationUtils.loadAnimation(educationTourOverlayFragment.requireContext(), C14469R.anim.slide_out_bottom);
    }

    private final ViewGroup getRootScreenView() {
        return (ViewGroup) this.rootScreenView.getValue();
    }

    private final List<View> getRootScreenAndDescendantViews() {
        ViewGroup rootScreenView = getRootScreenView();
        return rootScreenView == null ? CollectionsKt.emptyList() : CollectionsKt.plus((Collection) CollectionsKt.listOf(rootScreenView), (Sequence) ViewGroup2.getDescendants(rootScreenView));
    }

    private final int getRootScreenTopMargin() {
        return ((Number) this.rootScreenTopMargin.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int rootScreenTopMargin_delegate$lambda$5(EducationTourOverlayFragment educationTourOverlayFragment) {
        return educationTourOverlayFragment.getResources().getDimensionPixelSize(C13997R.dimen.rds_spacing_default);
    }

    private final Map<String, SoftReference<ComposeEducationTourElementData>> getComposeElements() {
        return ComposeEducationTourManager.INSTANCE.getScreenElements$lib_education_tour_externalDebug(((Args) INSTANCE.getArgs((Fragment) this)).getScreenName());
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        getTooltipManager().pause();
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
        EducationTourCallbacks educationTourCallbacks = this.callbacks;
        if (educationTourCallbacks != null) {
            educationTourCallbacks.onShowEducationTour();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (!isInTabFragment()) {
            ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        }
        RdsButton rdsButton = getBinding().educationTourBackBtn;
        Intrinsics.checkNotNull(rdsButton);
        ViewsKt.setLoggingConfig(rdsButton, new AutoLoggingConfig(false, false, 1, null));
        OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.educationtour.EducationTourOverlayFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EducationTourOverlayFragment.onViewCreated$lambda$8$lambda$7(this.f$0);
            }
        });
        RdsButton rdsButton2 = getBinding().educationTourNextBtn;
        Intrinsics.checkNotNull(rdsButton2);
        ViewsKt.setLoggingConfig(rdsButton2, new AutoLoggingConfig(false, false, 1, null));
        OnClickListeners.onClick(rdsButton2, new Function0() { // from class: com.robinhood.android.educationtour.EducationTourOverlayFragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EducationTourOverlayFragment.onViewCreated$lambda$10$lambda$9(this.f$0);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.educationtour.EducationTourOverlayFragment$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationTourOverlayFragment.onViewCreated$lambda$11(this.f$0, (EducationTourOverlayViewState) obj);
            }
        });
        Observable observableCombineLatest = Observable.combineLatest(ComposeEducationTourManager.INSTANCE.m1940x3081b74d(), getDuxo().getStates(), new BiFunction() { // from class: com.robinhood.android.educationtour.EducationTourOverlayFragment.onViewCreated.4
            @Override // io.reactivex.functions.BiFunction
            public final Optional<EducationTourSection> apply(String str, EducationTourOverlayViewState state) {
                Intrinsics.checkNotNullParameter(str, "<unused var>");
                Intrinsics.checkNotNullParameter(state, "state");
                return Optional3.asOptional(state.getCurrentSection());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableCombineLatest, "combineLatest(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(ObservablesKt.filterIsPresent(observableCombineLatest)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.educationtour.EducationTourOverlayFragment$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationTourOverlayFragment.onViewCreated$lambda$12(this.f$0, (EducationTourSection) obj);
            }
        });
        Observable<R> map = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.educationtour.EducationTourOverlayFragment$onViewCreated$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((EducationTourOverlayViewState) it).getCurrentSection());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((EducationTourOverlayFragment$onViewCreated$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableDistinctUntilChanged = ObservablesKt.filterIsPresent(map).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.educationtour.EducationTourOverlayFragment$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationTourOverlayFragment.onViewCreated$lambda$13(this.f$0, (EducationTourSection) obj);
            }
        });
        Observable observableObserveOnMainThread = ObservablesAndroid.observeOnMainThread(getDuxo().getStates());
        Observable<R> map2 = this.verticalScrollingStateRelay.map(new Function() { // from class: com.robinhood.android.educationtour.EducationTourOverlayFragment.onViewCreated.8
            @Override // io.reactivex.functions.Function
            public final Boolean apply(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!it.booleanValue());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.connectWhen$default(observableObserveOnMainThread, map2, null, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.educationtour.EducationTourOverlayFragment$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationTourOverlayFragment.onViewCreated$lambda$17(this.f$0, (EducationTourOverlayViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$8$lambda$7(EducationTourOverlayFragment educationTourOverlayFragment) {
        educationTourOverlayFragment.getDuxo().previousSection();
        educationTourOverlayFragment.setButtonsClickable(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$10$lambda$9(EducationTourOverlayFragment educationTourOverlayFragment) {
        educationTourOverlayFragment.getDuxo().nextSection();
        educationTourOverlayFragment.setButtonsClickable(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$11(EducationTourOverlayFragment educationTourOverlayFragment, EducationTourOverlayViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        educationTourOverlayFragment.setViewState(state);
        educationTourOverlayFragment.updateEventContext(state);
        educationTourOverlayFragment.isShowingOutro = state.getShowOutro();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$12(EducationTourOverlayFragment educationTourOverlayFragment, EducationTourSection section) {
        Intrinsics.checkNotNullParameter(section, "section");
        List<String> highlightedElementIds = section.getHighlightedElementIds();
        if (highlightedElementIds == null) {
            highlightedElementIds = CollectionsKt.emptyList();
        }
        educationTourOverlayFragment.updateCurrentHighlightedViews(highlightedElementIds);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$13(EducationTourOverlayFragment educationTourOverlayFragment, EducationTourSection educationTourSection) {
        Intrinsics.checkNotNull(educationTourSection);
        educationTourOverlayFragment.updatePreviousHighlightedViews(educationTourSection);
        educationTourOverlayFragment.scrollToSection(educationTourSection.getScrollToElementIds());
        educationTourOverlayFragment.maybeFocusComposeElement(educationTourSection.getTooltipElementIds());
        educationTourOverlayFragment.previousScrollToElementIds = educationTourSection.getScrollToElementIds();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$17(final EducationTourOverlayFragment educationTourOverlayFragment, final EducationTourOverlayViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.getCurrentSection() != null) {
            final EducationTourSection currentSection = state.getCurrentSection();
            educationTourOverlayFragment.setButtonsClickable(true);
            FragmentEducationTourOverlayBinding binding = educationTourOverlayFragment.getBinding();
            RdsButton educationTourBackBtn = binding.educationTourBackBtn;
            Intrinsics.checkNotNullExpressionValue(educationTourBackBtn, "educationTourBackBtn");
            ViewsKt.logAppear$default(educationTourBackBtn, null, false, 3, null);
            RdsButton educationTourNextBtn = binding.educationTourNextBtn;
            Intrinsics.checkNotNullExpressionValue(educationTourNextBtn, "educationTourNextBtn");
            ViewsKt.logAppear$default(educationTourNextBtn, null, false, 3, null);
            educationTourOverlayFragment.addToolTip(currentSection.getTooltipElementIds(), currentSection.getTooltip().getContent(), educationTourOverlayFragment.eventContext, currentSection.getShouldPerformAction(), new Function0() { // from class: com.robinhood.android.educationtour.EducationTourOverlayFragment$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EducationTourOverlayFragment.onViewCreated$lambda$17$lambda$15(this.f$0, currentSection);
                }
            });
        } else if (state.getShowOutro()) {
            educationTourOverlayFragment.getTooltipManager().dismissActiveTooltip(new Function1() { // from class: com.robinhood.android.educationtour.EducationTourOverlayFragment$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EducationTourOverlayFragment.onViewCreated$lambda$17$lambda$16(state, educationTourOverlayFragment, (TooltipData) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$17$lambda$15(EducationTourOverlayFragment educationTourOverlayFragment, EducationTourSection educationTourSection) {
        List<String> highlightedElementIds = educationTourSection.getHighlightedElementIds();
        if (highlightedElementIds == null) {
            highlightedElementIds = CollectionsKt.emptyList();
        }
        educationTourOverlayFragment.updateCurrentHighlightedViews(highlightedElementIds);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Context onViewCreated$lambda$17$lambda$16$outroEventContext(EducationTourOutro educationTourOutro, EducationTourOverlayFragment educationTourOverlayFragment) {
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, educationTourOverlayFragment.eventTour, null, null, new com.robinhood.rosetta.eventlogging.EducationTourOutro(educationTourOutro.getAnalyticsId(), null, 2, 0 == true ? 1 : 0), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -73, -1, -1, -1, -1, 16383, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$17$lambda$16(EducationTourOverlayViewState educationTourOverlayViewState, EducationTourOverlayFragment educationTourOverlayFragment, TooltipData tooltipData) {
        EducationTourOutro displayedOutro = educationTourOverlayViewState.getDisplayedOutro();
        if (displayedOutro instanceof EducationTourOutro.Tooltip) {
            educationTourOverlayFragment.showOutroTooltip((EducationTourOutro.Tooltip) displayedOutro, onViewCreated$lambda$17$lambda$16$outroEventContext(displayedOutro, educationTourOverlayFragment));
        } else if (displayedOutro instanceof EducationTourOutro.Toast) {
            educationTourOverlayFragment.showOutroToast((EducationTourOutro.Toast) displayedOutro, onViewCreated$lambda$17$lambda$16$outroEventContext(displayedOutro, educationTourOverlayFragment));
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        updateAvailableElements();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(final RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        if (this.savedToolbarState == null) {
            this.savedToolbarState = new ToolbarState(toolbar.getTitle(), toolbar.getSubtitle(), toolbar.getToolbar().getNavigationIcon());
        }
        super.configureToolbar(toolbar);
        Transitions2.beginDelayedTransition(toolbar, new AutoTransition());
        Toolbar toolbar2 = toolbar.getToolbar();
        Drawable drawable = toolbar.getContext().getDrawable(C20690R.drawable.ic_rds_close_24dp);
        if (drawable == null) {
            drawable = null;
        } else if (get_isCrypto()) {
            drawable.setTint(ContextCompat.getColor(toolbar.getContext(), C11048R.color.text_color_primary_inverse));
        }
        toolbar2.setNavigationIcon(drawable);
        RhToolbar.addCustomView$default(toolbar, C14469R.layout.include_education_tour_toolbar_txt_switcher, true, 0, 4, null);
        if (!get_isCrypto()) {
            ScarletManager2.overrideAttribute(toolbar.getToolbar(), R$attr.colorControlNormal, ThemeAttributes.INSTANCE.getCOLOR_FOREGROUND_1());
        }
        RhToolbar rhToolbar = getRhToolbar();
        TextSwitcher textSwitcher = rhToolbar != null ? (TextSwitcher) rhToolbar.findViewById(C14469R.id.education_tour_toolbar_txt_switcher) : null;
        this.toolbarTextSwitcher = textSwitcher;
        if (textSwitcher != null) {
            textSwitcher.setFactory(new ViewSwitcher.ViewFactory() { // from class: com.robinhood.android.educationtour.EducationTourOverlayFragment$configureToolbar$1$2
                @Override // android.widget.ViewSwitcher.ViewFactory
                public final View makeView() {
                    View viewInflate = ViewGroups.inflate(toolbar, C14469R.layout.include_education_tour_toolbar_txt, false);
                    Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type com.robinhood.android.designsystem.text.RhTextView");
                    RhTextView rhTextView = (RhTextView) viewInflate;
                    rhTextView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    return rhTextView;
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        restoreToolbarState();
        restoreTooltipManager();
    }

    public final void logBackPressed() {
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.DISMISS, getEventScreen(), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, this.eventContext, false, 40, null);
    }

    private final void updateAvailableElements() {
        List<String> availableElementIds;
        HashSet hashSet = new HashSet();
        for (View view : getRootScreenAndDescendantViews()) {
            String educationTourId = com.robinhood.android.educationtour.extensions.ViewsKt.getEducationTourId(view);
            if (educationTourId != null) {
                hashSet.add(educationTourId);
            }
            if (view instanceof RecyclerView) {
                Object adapter = ((RecyclerView) view).getAdapter();
                EducationTourAdapter educationTourAdapter = adapter instanceof EducationTourAdapter ? (EducationTourAdapter) adapter : null;
                if (educationTourAdapter != null && (availableElementIds = educationTourAdapter.getAvailableElementIds()) != null) {
                    hashSet.addAll(availableElementIds);
                }
            } else if (view instanceof GenericComposeView) {
                List<String> educationTourIds = com.robinhood.android.educationtour.extensions.ViewsKt.getEducationTourIds((GenericComposeView) view);
                if (educationTourIds == null) {
                    educationTourIds = CollectionsKt.emptyList();
                }
                hashSet.addAll(educationTourIds);
            } else if ((view instanceof ComposeView) && isRootComposeView(view)) {
                hashSet.addAll(ComposeEducationTourManager.INSTANCE.getAvailableElementIds());
            }
        }
        getDuxo().updateAvailableElementIds(hashSet);
    }

    private final void setViewState(EducationTourOverlayViewState state) {
        bindLoading(state);
        bindError(state);
        bindContent(state);
        consumeExitTourEvent(state);
        consumeShowOutroEvent(state);
    }

    private final void bindLoading(EducationTourOverlayViewState state) {
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null) {
            rhToolbar.setLoadingViewVisible(state.getShowLoading());
        }
    }

    private final void bindError(EducationTourOverlayViewState state) {
        if (state.getShowErrorEvent()) {
            RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
            View viewRequireView = requireView();
            Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
            companion.make(viewRequireView, C11048R.string.error_description, 0).show();
            requireActivity().onBackPressed();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void bindContent(final EducationTourOverlayViewState state) {
        TextSwitcher textSwitcher;
        FragmentEducationTourOverlayBinding binding = getBinding();
        FrameLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        Fade fade = new Fade();
        fade.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.educationtour.EducationTourOverlayFragment$bindContent$lambda$24$$inlined$beginDelayedTransition$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
                IdlingResourceCounters2.increment(IdlingResourceType.DELAYED_TRANSITION);
            }
        });
        fade.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.educationtour.EducationTourOverlayFragment$bindContent$lambda$24$$inlined$beginDelayedTransition$2
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                IdlingResourceCounters2.decrement(IdlingResourceType.DELAYED_TRANSITION);
            }
        });
        fade.addTarget(binding.educationTourContent);
        fade.setDuration(150L);
        TransitionManager.beginDelayedTransition(root, fade);
        binding.getRoot().setOnTouchListener(new View.OnTouchListener() { // from class: com.robinhood.android.educationtour.EducationTourOverlayFragment$bindContent$1$2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (!state.getShowOutro() || motionEvent.getAction() != 0) {
                    return true;
                }
                BaseFragments3.hideEducationTour(this);
                return true;
            }
        });
        ConstraintLayout educationTourContent = binding.educationTourContent;
        Intrinsics.checkNotNullExpressionValue(educationTourContent, "educationTourContent");
        educationTourContent.setVisibility(state.getShowContent() ? 0 : 8);
        EducationTourSection currentSection = state.getCurrentSection();
        if (currentSection == null) {
            return;
        }
        updateToolbarAnimations(state.getShouldAnimateToNextSection());
        TextSwitcher textSwitcher2 = this.toolbarTextSwitcher;
        View currentView = textSwitcher2 != null ? textSwitcher2.getCurrentView() : null;
        TextView textView = currentView instanceof TextView ? (TextView) currentView : null;
        if (!Intrinsics.areEqual(currentSection.getTitle(), textView != null ? textView.getText() : null) && (textSwitcher = this.toolbarTextSwitcher) != null) {
            textSwitcher.setText(currentSection.getTitle());
        }
        binding.educationTourProgressBar.setMax(state.getSectionsSize());
        binding.educationTourProgressBar.setProgress(state.getCurrentSectionIndex() + 1, true);
    }

    private final void consumeExitTourEvent(EducationTourOverlayViewState state) {
        UiEvent<Unit> exitEducationTourEvent = state.getExitEducationTourEvent();
        if ((exitEducationTourEvent != null ? exitEducationTourEvent.consume() : null) != null) {
            EducationTourCallbacks educationTourCallbacks = this.callbacks;
            if (educationTourCallbacks != null) {
                educationTourCallbacks.onHideEducationTour();
            }
            requireActivity().onBackPressed();
            restoreTooltipManager();
        }
    }

    private final void consumeShowOutroEvent(EducationTourOverlayViewState state) {
        UiEvent<Unit> showOutroUiEvent = state.getShowOutroUiEvent();
        if ((showOutroUiEvent != null ? showOutroUiEvent.consume() : null) != null) {
            EducationTourCallbacks educationTourCallbacks = this.callbacks;
            if (educationTourCallbacks != null) {
                educationTourCallbacks.onHideEducationTour();
            }
            getBinding().highlightCutoutsView.resetHighlights();
            restoreTooltipManager();
            restoreToolbarState();
            EducationTourOutro displayedOutro = state.getDisplayedOutro();
            if (displayedOutro != null) {
                if (displayedOutro instanceof EducationTourOutro.Tooltip) {
                    scrollToSection(displayedOutro.getScrollToElementIds());
                } else if (displayedOutro instanceof EducationTourOutro.Toast) {
                    scrollToSection(displayedOutro.getScrollToElementIds());
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void maybeFocusComposeElement(List<String> elementIds) {
        Function0<Unit> onFocus;
        View viewFindFirstVisibleElementView = findFirstVisibleElementView(elementIds);
        if ((viewFindFirstVisibleElementView instanceof GenericComposeView) || (viewFindFirstVisibleElementView instanceof ComposeView)) {
            Iterator<T> it = ComposeEducationTourManager.INSTANCE.getScreenRegistry$lib_education_tour_externalDebug().values().iterator();
            while (it.hasNext()) {
                ((ComposeEducationTourScreen) it.next()).getOnFocus().invoke(CollectionsKt.first((List) elementIds));
            }
            Tuples2<String, ComposeEducationTourElementData> tuples2FindFirstElementData = findFirstElementData(elementIds);
            ComposeEducationTourElementData second = tuples2FindFirstElementData != null ? tuples2FindFirstElementData.getSecond() : null;
            if (second == null || (onFocus = second.getOnFocus()) == null) {
                return;
            }
            onFocus.invoke();
        }
    }

    private final void scrollToSection(List<String> elementIds) {
        this.verticalScrollingStateRelay.accept(Boolean.TRUE);
        View viewFindFirstVisibleElementView = findFirstVisibleElementView(elementIds);
        if (viewFindFirstVisibleElementView != null) {
            scrollRootScreenViewToSection(elementIds, viewFindFirstVisibleElementView);
        } else {
            scrollRecyclerViewToElementViewIfExists(elementIds);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scrollRootScreenViewToSection(List<String> scrollToElementIds, View scrollToElementView) {
        if (getRootScreenView() instanceof RecyclerView) {
            scrollRootRecyclerViewToElementView(scrollToElementIds);
        } else {
            scrollGenericRootViewToElementView(scrollToElementView);
        }
    }

    private final void scrollRootRecyclerViewToElementView(List<String> scrollToElementIds) {
        ViewGroup rootScreenView = getRootScreenView();
        Intrinsics.checkNotNull(rootScreenView, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) rootScreenView;
        Object adapter = recyclerView.getAdapter();
        Integer num = null;
        EducationTourAdapter educationTourAdapter = adapter instanceof EducationTourAdapter ? (EducationTourAdapter) adapter : null;
        int elementScrollPosition = educationTourAdapter != null ? educationTourAdapter.getElementScrollPosition(scrollToElementIds) : -1;
        if (elementScrollPosition != -1) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null) {
                return;
            }
            Iterator<Integer> it = new PrimitiveRanges2(linearLayoutManager.findFirstCompletelyVisibleItemPosition(), linearLayoutManager.getItemCount()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Integer next = it.next();
                View viewFindViewByPosition = linearLayoutManager.findViewByPosition(next.intValue());
                if (viewFindViewByPosition != null && viewFindViewByPosition.getHeight() > 0 && viewFindViewByPosition.getWidth() > 0) {
                    num = next;
                    break;
                }
            }
            Integer num2 = num;
            if (num2 != null && num2.intValue() == elementScrollPosition) {
                this.verticalScrollingStateRelay.accept(Boolean.FALSE);
            } else {
                smoothScrollToElementView(recyclerView, scrollToElementIds, elementScrollPosition, true);
            }
        }
    }

    private final void scrollGenericRootViewToElementView(View elementView) {
        final ViewGroup rootScreenView = getRootScreenView();
        if (rootScreenView == null) {
            return;
        }
        if (Intrinsics.areEqual(elementView, this.previousScrollToView)) {
            this.verticalScrollingStateRelay.accept(Boolean.FALSE);
            return;
        }
        this.previousScrollToView = elementView;
        Rect rect = new Rect();
        elementView.getDrawingRect(rect);
        rootScreenView.offsetDescendantRectToMyCoords(elementView, rect);
        final int iCoerceAtLeast = RangesKt.coerceAtLeast(rect.top - getRootScreenTopMargin(), 0);
        if (rootScreenView instanceof NestedScrollView) {
            ((NestedScrollView) rootScreenView).smoothScrollTo(0, iCoerceAtLeast);
        } else if (rootScreenView instanceof ScrollView) {
            ((ScrollView) rootScreenView).smoothScrollTo(0, iCoerceAtLeast);
        } else {
            rootScreenView.scrollTo(0, iCoerceAtLeast);
        }
        if (rootScreenView.getScrollY() == iCoerceAtLeast) {
            this.verticalScrollingStateRelay.accept(Boolean.FALSE);
            return;
        }
        Observable<ViewScrollChangeEvent> observableTake = RxView.scrollChangeEvents(rootScreenView).filter(new Predicate() { // from class: com.robinhood.android.educationtour.EducationTourOverlayFragment.scrollGenericRootViewToElementView.1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(ViewScrollChangeEvent it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getScrollY() == iCoerceAtLeast || !rootScreenView.canScrollVertically(1);
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.educationtour.EducationTourOverlayFragment$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationTourOverlayFragment.scrollGenericRootViewToElementView$lambda$29(this.f$0, (ViewScrollChangeEvent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit scrollGenericRootViewToElementView$lambda$29(EducationTourOverlayFragment educationTourOverlayFragment, ViewScrollChangeEvent viewScrollChangeEvent) {
        educationTourOverlayFragment.verticalScrollingStateRelay.accept(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final ViewGroup findRootScreenView() {
        Sequence<View> descendants;
        Sequence sequenceMapNotNull;
        View decorView = requireActivity().getWindow().getDecorView();
        ViewGroup viewGroup = null;
        ViewGroup viewGroup2 = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup2 != null && (descendants = ViewGroup2.getDescendants(viewGroup2)) != null && (sequenceMapNotNull = SequencesKt.mapNotNull(descendants, new Function1() { // from class: com.robinhood.android.educationtour.EducationTourOverlayFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationTourOverlayFragment.findRootScreenView$lambda$30((View) obj);
            }
        })) != null) {
            Iterator itIterator2 = sequenceMapNotNull.iterator2();
            while (true) {
                if (!itIterator2.hasNext()) {
                    break;
                }
                Object next = itIterator2.next();
                if (Intrinsics.areEqual(com.robinhood.android.educationtour.extensions.ViewsKt.getEducationTourScreenName((ViewGroup) next), ((Args) INSTANCE.getArgs((Fragment) this)).getScreenName())) {
                    viewGroup = next;
                    break;
                }
            }
            viewGroup = viewGroup;
        }
        if (viewGroup == null) {
            requireActivity().getSupportFragmentManager().beginTransaction().remove(this).commit();
            getDuxo().setEducationTourShouldHide(false);
        }
        return viewGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewGroup findRootScreenView$lambda$30(View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof ViewGroup) {
            return (ViewGroup) it;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View findFirstVisibleElementView(List<String> elementIds) {
        return (View) SequencesKt.firstOrNull(SequencesKt.mapNotNull(CollectionsKt.asSequence(elementIds), new Function1() { // from class: com.robinhood.android.educationtour.EducationTourOverlayFragment$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationTourOverlayFragment.findFirstVisibleElementView$lambda$33(this.f$0, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View findFirstVisibleElementView$lambda$33(EducationTourOverlayFragment educationTourOverlayFragment, String elementId) {
        Object next;
        List<String> educationTourIds;
        Intrinsics.checkNotNullParameter(elementId, "elementId");
        Iterator<T> it = educationTourOverlayFragment.getRootScreenAndDescendantViews().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            View view = (View) next;
            boolean zAreEqual = Intrinsics.areEqual(com.robinhood.android.educationtour.extensions.ViewsKt.getEducationTourId(view), elementId);
            boolean z = true;
            if ((!(view instanceof GenericComposeView) || (educationTourIds = com.robinhood.android.educationtour.extensions.ViewsKt.getEducationTourIds((GenericComposeView) view)) == null || !educationTourIds.contains(elementId)) && (!educationTourOverlayFragment.isRootComposeView(view) || !ComposeEducationTourManager.INSTANCE.getAvailableElementIds().contains(elementId))) {
                z = false;
            }
            if (zAreEqual || z) {
                break;
            }
        }
        return (View) next;
    }

    private final void scrollRecyclerViewToElementViewIfExists(List<String> elementIds) {
        for (View view : getRootScreenAndDescendantViews()) {
            if (view instanceof RecyclerView) {
                RecyclerView recyclerView = (RecyclerView) view;
                Object adapter = recyclerView.getAdapter();
                EducationTourAdapter educationTourAdapter = adapter instanceof EducationTourAdapter ? (EducationTourAdapter) adapter : null;
                int elementScrollPosition = educationTourAdapter != null ? educationTourAdapter.getElementScrollPosition(elementIds) : -1;
                if (elementScrollPosition != -1) {
                    smoothScrollToElementView(recyclerView, elementIds, elementScrollPosition, false);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.recyclerview.widget.RecyclerView$OnScrollListener, com.robinhood.android.educationtour.EducationTourOverlayFragment$smoothScrollToElementView$scrollListener$1] */
    private final void smoothScrollToElementView(final RecyclerView recyclerView, final List<String> list, int i, final boolean z) {
        final ?? r0 = new RecyclerView.OnScrollListener() { // from class: com.robinhood.android.educationtour.EducationTourOverlayFragment$smoothScrollToElementView$scrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView2, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                if (newState == 0) {
                    if (z) {
                        this.verticalScrollingStateRelay.accept(Boolean.FALSE);
                        recyclerView.removeOnScrollListener(this);
                        return;
                    }
                    View viewFindFirstVisibleElementView = this.findFirstVisibleElementView(list);
                    if (viewFindFirstVisibleElementView != null) {
                        this.scrollRootScreenViewToSection(list, viewFindFirstVisibleElementView);
                        recyclerView.removeOnScrollListener(this);
                    }
                }
            }
        };
        recyclerView.addOnScrollListener(r0);
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        SmoothTopScroller smoothTopScroller = new SmoothTopScroller(contextRequireContext, 0.0f, 2, null);
        smoothTopScroller.setTargetPosition(i);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.startSmoothScroll(smoothTopScroller);
        }
        getBinding().getRoot().addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.robinhood.android.educationtour.EducationTourOverlayFragment.smoothScrollToElementView.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                Intrinsics.checkNotNullParameter(v, "v");
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
                Intrinsics.checkNotNullParameter(v, "v");
                recyclerView.removeOnScrollListener(r0);
            }
        });
    }

    private final void updatePreviousHighlightedViews(EducationTourSection section) {
        if (!Intrinsics.areEqual(this.previousScrollToElementIds, section.getScrollToElementIds())) {
            getBinding().highlightCutoutsView.resetHighlights();
            return;
        }
        List<? extends View> list = this.previousHighlightedViews;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            View view = (View) obj;
            List<String> highlightedElementIds = section.getHighlightedElementIds();
            if (highlightedElementIds == null) {
                highlightedElementIds = CollectionsKt.emptyList();
            }
            if (CollectionsKt.contains(highlightedElementIds, com.robinhood.android.educationtour.extensions.ViewsKt.getEducationTourId(view))) {
                arrayList.add(obj);
            }
        }
        getBinding().highlightCutoutsView.setHighlightedViews(arrayList);
        List<ComposeEducationTourHighlightData> list2 = this.previousHighlightedComposables;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            ComposeEducationTourHighlightData composeEducationTourHighlightData = (ComposeEducationTourHighlightData) obj2;
            List<String> highlightedElementIds2 = section.getHighlightedElementIds();
            if (highlightedElementIds2 == null) {
                highlightedElementIds2 = CollectionsKt.emptyList();
            }
            if (highlightedElementIds2.contains(composeEducationTourHighlightData.getElementId())) {
                arrayList2.add(obj2);
            }
        }
        getBinding().highlightCutoutsView.setHighlightedComposables(arrayList2);
    }

    private final void updateCurrentHighlightedViews(List<String> elementIds) {
        List<View> rootScreenAndDescendantViews = getRootScreenAndDescendantViews();
        ArrayList arrayList = new ArrayList();
        for (Object obj : rootScreenAndDescendantViews) {
            if (CollectionsKt.contains(elementIds, com.robinhood.android.educationtour.extensions.ViewsKt.getEducationTourId((View) obj))) {
                arrayList.add(obj);
            }
        }
        getBinding().highlightCutoutsView.setHighlightedViews(arrayList);
        this.previousHighlightedViews = arrayList;
        ArrayList arrayList2 = new ArrayList();
        List<View> rootScreenAndDescendantViews2 = getRootScreenAndDescendantViews();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : rootScreenAndDescendantViews2) {
            if (obj2 instanceof GenericComposeView) {
                arrayList3.add(obj2);
            }
        }
        ArrayList<GenericComposeView> arrayList4 = new ArrayList();
        for (Object obj3 : arrayList3) {
            List<String> educationTourIds = com.robinhood.android.educationtour.extensions.ViewsKt.getEducationTourIds((GenericComposeView) obj3);
            if (educationTourIds != null) {
                List<String> list = educationTourIds;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (elementIds.contains((String) it.next())) {
                                arrayList4.add(obj3);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
        }
        for (GenericComposeView genericComposeView : arrayList4) {
            genericComposeView.getLocationInWindow(this.highlightedComposablesViewLocation);
            Map<String, SoftReference<ComposeEducationTourElementData>> screenElements$lib_education_tour_externalDebug = ComposeEducationTourManager.INSTANCE.getScreenElements$lib_education_tour_externalDebug(((Args) INSTANCE.getArgs((Fragment) this)).getScreenName());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, SoftReference<ComposeEducationTourElementData>> entry : screenElements$lib_education_tour_externalDebug.entrySet()) {
                boolean zContains = elementIds.contains(entry.getKey());
                List<String> educationTourIds2 = com.robinhood.android.educationtour.extensions.ViewsKt.getEducationTourIds(genericComposeView);
                if (educationTourIds2 == null) {
                    educationTourIds2 = CollectionsKt.emptyList();
                }
                boolean zContains2 = educationTourIds2.contains(entry.getKey());
                if (zContains && zContains2) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                ComposeEducationTourElementData composeEducationTourElementData = (ComposeEducationTourElementData) ((SoftReference) entry2.getValue()).get();
                if (composeEducationTourElementData != null) {
                    arrayList2.add(new ComposeEducationTourHighlightData((String) entry2.getKey(), this.highlightedComposablesViewLocation, composeEducationTourElementData));
                }
            }
        }
        List<View> rootScreenAndDescendantViews3 = getRootScreenAndDescendantViews();
        ArrayList arrayList5 = new ArrayList();
        for (Object obj4 : rootScreenAndDescendantViews3) {
            if (obj4 instanceof ComposeView) {
                arrayList5.add(obj4);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj5 : arrayList5) {
            if (isRootComposeView((ComposeView) obj5)) {
                arrayList6.add(obj5);
            }
        }
        Iterator it2 = arrayList6.iterator();
        while (it2.hasNext()) {
            ((ComposeView) it2.next()).getLocationInWindow(this.highlightedComposablesViewLocation);
            Map<String, SoftReference<ComposeEducationTourElementData>> screenElements$lib_education_tour_externalDebug2 = ComposeEducationTourManager.INSTANCE.getScreenElements$lib_education_tour_externalDebug(((Args) INSTANCE.getArgs((Fragment) this)).getScreenName());
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry<String, SoftReference<ComposeEducationTourElementData>> entry3 : screenElements$lib_education_tour_externalDebug2.entrySet()) {
                if (elementIds.contains(entry3.getKey())) {
                    linkedHashMap2.put(entry3.getKey(), entry3.getValue());
                }
            }
            for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                ComposeEducationTourElementData composeEducationTourElementData2 = (ComposeEducationTourElementData) ((SoftReference) entry4.getValue()).get();
                if (composeEducationTourElementData2 != null) {
                    arrayList2.add(new ComposeEducationTourHighlightData((String) entry4.getKey(), this.highlightedComposablesViewLocation, composeEducationTourElementData2));
                }
            }
        }
        getBinding().highlightCutoutsView.setHighlightedComposables(arrayList2);
        this.previousHighlightedComposables = arrayList2;
    }

    private final void setButtonsClickable(boolean isClickable) {
        getBinding().educationTourBackBtn.setClickable(isClickable);
        getBinding().educationTourNextBtn.setClickable(isClickable);
    }

    private final void showOutroTooltip(EducationTourOutro.Tooltip tooltip, Context eventContext) {
        addToolTip$default(this, tooltip.getTooltipElementIds(), tooltip.getTooltip().getContent(), eventContext, tooltip.getShouldPerformAction(), null, 16, null);
        Observable<Long> observableTimer = Observable.timer(10L, TimeUnit.SECONDS);
        Intrinsics.checkNotNullExpressionValue(observableTimer, "timer(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTimer), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.educationtour.EducationTourOverlayFragment$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationTourOverlayFragment.showOutroTooltip$lambda$52(this.f$0, (Long) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showOutroTooltip$lambda$52(EducationTourOverlayFragment educationTourOverlayFragment, Long l) {
        BaseFragments3.hideEducationTour(educationTourOverlayFragment);
        return Unit.INSTANCE;
    }

    private final void showOutroToast(EducationTourOutro.Toast toast, Context eventContext) {
        UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, null, null, eventContext, null, null, 55, null);
        RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
        Snackbars snackbars = Snackbars.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        companion.make(snackbars.findRoot(fragmentActivityRequireActivity), Markwons.toSpanned$default(getMarkwon(), toast.getToast().getContent(), null, 2, null), 0).setEventData(userInteractionEventDescriptor, new AutoLoggingConfig(false, false, 2, null)).setLeadingIcon(C20690R.drawable.ic_rds_checkmark_24dp).show();
    }

    static /* synthetic */ void addToolTip$default(EducationTourOverlayFragment educationTourOverlayFragment, List list, MarkdownContent markdownContent, Context context, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 16) != 0) {
            function0 = new Function0() { // from class: com.robinhood.android.educationtour.EducationTourOverlayFragment$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
        }
        educationTourOverlayFragment.addToolTip(list, markdownContent, context, z, function0);
    }

    private final void addToolTip(List<String> elementIds, MarkdownContent tooltipContent, Context tooltipEventContext, boolean shouldClickTooltipElement, final Function0<Unit> onDisplayed) {
        Function0<Unit> onClick;
        Function0<Unit> onFocus;
        final View viewFindFirstVisibleElementView = findFirstVisibleElementView(elementIds);
        Tuples2<String, ComposeEducationTourElementData> tuples2FindFirstElementData = (viewFindFirstVisibleElementView == null || !((viewFindFirstVisibleElementView instanceof GenericComposeView) || isRootComposeView(viewFindFirstVisibleElementView))) ? null : findFirstElementData(elementIds);
        if (tuples2FindFirstElementData == null) {
            tuples2FindFirstElementData = new Tuples2<>(null, null);
        }
        String strComponent1 = tuples2FindFirstElementData.component1();
        final ComposeEducationTourElementData composeEducationTourElementDataComponent2 = tuples2FindFirstElementData.component2();
        if (strComponent1 == null) {
            strComponent1 = viewFindFirstVisibleElementView != null ? com.robinhood.android.educationtour.extensions.ViewsKt.getEducationTourId(viewFindFirstVisibleElementView) : null;
            if (strComponent1 == null && (strComponent1 = (String) CollectionsKt.firstOrNull((List) elementIds)) == null) {
                strComponent1 = "unknown";
            }
        }
        String str = strComponent1;
        if (composeEducationTourElementDataComponent2 == null || (onClick = composeEducationTourElementDataComponent2.getOnClick()) == null) {
            onClick = new Function0() { // from class: com.robinhood.android.educationtour.EducationTourOverlayFragment$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EducationTourOverlayFragment.addToolTip$lambda$54(viewFindFirstVisibleElementView);
                }
            };
        }
        final Spanned spanned$default = Markwons.toSpanned$default(getMarkwon(), tooltipContent, null, 2, null);
        final UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, null, null, tooltipEventContext, new Component(Component.ComponentType.TOOLTIP, null, null, 6, null), null, 39, null);
        final TooltipData.Behavior behavior = new TooltipData.Behavior(null, null, null, Boolean.FALSE, new Function1() { // from class: com.robinhood.android.educationtour.EducationTourOverlayFragment$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationTourOverlayFragment.addToolTip$lambda$56(this.f$0, onDisplayed, userInteractionEventDescriptor, (View) obj);
            }
        }, getLifecycle(), null, 71, null);
        if (composeEducationTourElementDataComponent2 != null && (onFocus = composeEducationTourElementDataComponent2.getOnFocus()) != null) {
            onFocus.invoke();
        }
        if (shouldClickTooltipElement) {
            onClick.invoke();
        }
        TooltipManager tooltipManager = getTooltipManager();
        if (tooltipManager.hasTooltip(str)) {
            tooltipManager.updateTooltip(str, true, new Function1() { // from class: com.robinhood.android.educationtour.EducationTourOverlayFragment$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EducationTourOverlayFragment.addToolTip$lambda$59$lambda$58(viewFindFirstVisibleElementView, spanned$default, behavior, composeEducationTourElementDataComponent2, (TooltipData) obj);
                }
            });
        } else {
            tooltipManager.addTooltip(true, new TooltipData(str, spanned$default, viewFindFirstVisibleElementView != null ? TooltipData2.toTarget(viewFindFirstVisibleElementView) : null, new TooltipData.Layout(RdsTooltipView.NibDirection.f4107UP, 0.0f, null, null, 14, null), behavior));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object addToolTip$lambda$54(View view) {
        if (view != null) {
            return Boolean.valueOf(view.performClick());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addToolTip$lambda$56(EducationTourOverlayFragment educationTourOverlayFragment, Function0 function0, final UserInteractionEventDescriptor userInteractionEventDescriptor, View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewsKt.eventData$default(view, false, new Function0() { // from class: com.robinhood.android.educationtour.EducationTourOverlayFragment$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EducationTourOverlayFragment.addToolTip$lambda$56$lambda$55(userInteractionEventDescriptor);
            }
        }, 1, null);
        educationTourOverlayFragment.getBinding().highlightCutoutsView.setTooltipView(TooltipData2.toTarget(view));
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TooltipData addToolTip$lambda$59$lambda$58(View view, Spanned spanned, TooltipData.Behavior behavior, ComposeEducationTourElementData composeEducationTourElementData, TooltipData updateTooltip) {
        Intrinsics.checkNotNullParameter(updateTooltip, "$this$updateTooltip");
        TooltipData.Target target = composeEducationTourElementData == null ? view != null ? TooltipData2.toTarget(view) : null : null;
        if (target == null) {
            target = updateTooltip.getTarget();
        }
        return TooltipData.copy$default(updateTooltip, null, spanned, target, null, behavior, 9, null);
    }

    private final void updateToolbarAnimations(boolean shouldAnimateToNextSection) {
        Animation toolbarSlideInBottomAnimation = shouldAnimateToNextSection ? getToolbarSlideInBottomAnimation() : getToolbarSlideInTopAnimation();
        Animation toolbarSlideOutTopAnimation = shouldAnimateToNextSection ? getToolbarSlideOutTopAnimation() : getToolbarSlideOutBottomAnimation();
        TextSwitcher textSwitcher = this.toolbarTextSwitcher;
        if (textSwitcher != null) {
            textSwitcher.setInAnimation(toolbarSlideInBottomAnimation);
        }
        TextSwitcher textSwitcher2 = this.toolbarTextSwitcher;
        if (textSwitcher2 != null) {
            textSwitcher2.setOutAnimation(toolbarSlideOutTopAnimation);
        }
    }

    private final void restoreTooltipManager() {
        TooltipManager tooltipManager = getTooltipManager();
        TooltipManager.DefaultImpls.dismissActiveTooltip$default(tooltipManager, null, 1, null);
        tooltipManager.resume();
    }

    private final void restoreToolbarState() {
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null) {
            rhToolbar.removeCustomView();
            rhToolbar.setLoadingViewVisible(false);
            Transitions2.beginDelayedTransition(rhToolbar, new Fade());
            ToolbarState toolbarState = this.savedToolbarState;
            if (toolbarState != null) {
                rhToolbar.setTitle(toolbarState.getTitle());
                rhToolbar.setSubtitle(toolbarState.getSubtitle());
                rhToolbar.getToolbar().setNavigationIcon(toolbarState.getNavIcon());
                if (!get_isCrypto()) {
                    ScarletManager2.overrideAttribute(rhToolbar.getToolbar(), R$attr.colorControlNormal, ThemeAttributes.INSTANCE.getCOLOR_FOREGROUND_1());
                }
            }
        }
        if (((Args) INSTANCE.getArgs((Fragment) this)).getUseTemporaryToolbar()) {
            requireBaseActivity().hideToolbar();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateEventContext(EducationTourOverlayViewState state) {
        Companion companion = INSTANCE;
        String screenName = ((Args) companion.getArgs((Fragment) this)).getScreenName();
        String screenUniqueId = ((Args) companion.getArgs((Fragment) this)).getScreenUniqueId();
        if (screenUniqueId == null) {
            screenUniqueId = "";
        }
        String str = screenUniqueId;
        this.eventTour = new EducationTour(screenName, str, state.getTourAnalyticsId(), null, 8, null);
        com.robinhood.rosetta.eventlogging.EducationTourSection educationTourSection = new com.robinhood.rosetta.eventlogging.EducationTourSection(state.getSectionAnalyticsId(), null, 2, 0 == true ? 1 : 0);
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Context.ProductTag productTag = null;
        int i2 = 0;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Screen screen = null;
        String str8 = null;
        Asset asset = null;
        com.robinhood.rosetta.eventlogging.List list = null;
        NewsFeedItem newsFeedItem = null;
        Feedback feedback = null;
        CXIssue cXIssue = null;
        InAppSurvey inAppSurvey = null;
        ListsContext listsContext = null;
        DirectDepositContext directDepositContext = null;
        DirectDepositSwitcherContext directDepositSwitcherContext = null;
        RecurringContext recurringContext = null;
        OrderKind orderKind = null;
        InAppComm inAppComm = null;
        LearningLesson learningLesson = null;
        LearningSection learningSection = null;
        LearningMatchingExercise learningMatchingExercise = null;
        LearningAnswer learningAnswer = null;
        LearningMatchingExerciseEntity learningMatchingExerciseEntity = null;
        LearningMatchingExerciseBucket learningMatchingExerciseBucket = null;
        SafetyLabelInfoTag safetyLabelInfoTag = null;
        SafetyLabelLesson safetyLabelLesson = null;
        String str9 = null;
        Object[] objArr = 0 == true ? 1 : 0;
        this.eventContext = new Context(state.getCurrentSectionIndex() + 1, state.getSectionsSize(), i, str2, objArr, str3, str4, productTag, i2, str5, str6, str7, screen, str8, asset, list, newsFeedItem, feedback, cXIssue, inAppSurvey, listsContext, directDepositContext, directDepositSwitcherContext, recurringContext, orderKind, inAppComm, learningLesson, learningSection, learningMatchingExercise, learningAnswer, learningMatchingExerciseEntity, learningMatchingExerciseBucket, safetyLabelInfoTag, safetyLabelLesson, str9, this.eventTour, educationTourSection, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4, -25, -1, -1, -1, -1, 16383, null);
        RdsButton educationTourBackBtn = getBinding().educationTourBackBtn;
        Intrinsics.checkNotNullExpressionValue(educationTourBackBtn, "educationTourBackBtn");
        ViewsKt.eventData$default(educationTourBackBtn, false, new Function0() { // from class: com.robinhood.android.educationtour.EducationTourOverlayFragment$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EducationTourOverlayFragment.updateEventContext$lambda$63(this.f$0);
            }
        }, 1, null);
        RdsButton educationTourNextBtn = getBinding().educationTourNextBtn;
        Intrinsics.checkNotNullExpressionValue(educationTourNextBtn, "educationTourNextBtn");
        ViewsKt.eventData$default(educationTourNextBtn, false, new Function0() { // from class: com.robinhood.android.educationtour.EducationTourOverlayFragment$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EducationTourOverlayFragment.updateEventContext$lambda$64(this.f$0);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor updateEventContext$lambda$63(EducationTourOverlayFragment educationTourOverlayFragment) {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.BACK, educationTourOverlayFragment.eventContext, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 35, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor updateEventContext$lambda$64(EducationTourOverlayFragment educationTourOverlayFragment) {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.CONTINUE, educationTourOverlayFragment.eventContext, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 35, null);
    }

    private final Tuples2<String, ComposeEducationTourElementData> findFirstElementData(List<String> elementIds) {
        Object next;
        String str;
        SoftReference<ComposeEducationTourElementData> softReference;
        if (!((Args) INSTANCE.getArgs((Fragment) this)).getNoSkip()) {
            Iterator<T> it = elementIds.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (getComposeElements().keySet().contains((String) next)) {
                    break;
                }
            }
            str = (String) next;
        } else {
            Object objFirstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) elementIds);
            if (!CollectionsKt.contains(getComposeElements().keySet(), (String) objFirstOrNull)) {
                objFirstOrNull = null;
            }
            str = (String) objFirstOrNull;
        }
        if (str == null || (softReference = getComposeElements().get(str)) == null) {
            return null;
        }
        return Tuples4.m3642to(str, softReference.get());
    }

    private final boolean isRootComposeView(View view) {
        return (view instanceof ComposeView) && com.robinhood.android.educationtour.extensions.ViewsKt.getEducationTourScreenName((ViewGroup) view) != null;
    }

    /* compiled from: EducationTourOverlayFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/educationtour/EducationTourOverlayFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/educationtour/EducationTourOverlayFragment;", "Lcom/robinhood/android/educationtour/EducationTourOverlayFragment$Args;", "<init>", "()V", "EDUCATION_TOUR_OVERLAY_TAG", "", "OVERLAY_FADE_DURATION", "", "lib-education-tour_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<EducationTourOverlayFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(EducationTourOverlayFragment educationTourOverlayFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, educationTourOverlayFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public EducationTourOverlayFragment newInstance(Args args) {
            return (EducationTourOverlayFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(EducationTourOverlayFragment educationTourOverlayFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, educationTourOverlayFragment, args);
        }
    }

    /* compiled from: EducationTourOverlayFragment.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/educationtour/EducationTourOverlayFragment$Args;", "Landroid/os/Parcelable;", "screenName", "", "screenUniqueId", "isCrypto", "", "useTemporaryToolbar", "noSkip", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZZ)V", "getScreenName", "()Ljava/lang/String;", "getScreenUniqueId", "()Z", "getUseTemporaryToolbar", "getNoSkip", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-education-tour_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean isCrypto;
        private final boolean noSkip;
        private final String screenName;
        private final String screenUniqueId;
        private final boolean useTemporaryToolbar;

        /* compiled from: EducationTourOverlayFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                boolean z3 = false;
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new Args(string2, string3, z3, z4, z2);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, String str2, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.screenName;
            }
            if ((i & 2) != 0) {
                str2 = args.screenUniqueId;
            }
            if ((i & 4) != 0) {
                z = args.isCrypto;
            }
            if ((i & 8) != 0) {
                z2 = args.useTemporaryToolbar;
            }
            if ((i & 16) != 0) {
                z3 = args.noSkip;
            }
            boolean z4 = z3;
            boolean z5 = z;
            return args.copy(str, str2, z5, z2, z4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getScreenName() {
            return this.screenName;
        }

        /* renamed from: component2, reason: from getter */
        public final String getScreenUniqueId() {
            return this.screenUniqueId;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsCrypto() {
            return this.isCrypto;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getUseTemporaryToolbar() {
            return this.useTemporaryToolbar;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getNoSkip() {
            return this.noSkip;
        }

        public final Args copy(String screenName, String screenUniqueId, boolean isCrypto, boolean useTemporaryToolbar, boolean noSkip) {
            Intrinsics.checkNotNullParameter(screenName, "screenName");
            return new Args(screenName, screenUniqueId, isCrypto, useTemporaryToolbar, noSkip);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.screenName, args.screenName) && Intrinsics.areEqual(this.screenUniqueId, args.screenUniqueId) && this.isCrypto == args.isCrypto && this.useTemporaryToolbar == args.useTemporaryToolbar && this.noSkip == args.noSkip;
        }

        public int hashCode() {
            int iHashCode = this.screenName.hashCode() * 31;
            String str = this.screenUniqueId;
            return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isCrypto)) * 31) + Boolean.hashCode(this.useTemporaryToolbar)) * 31) + Boolean.hashCode(this.noSkip);
        }

        public String toString() {
            return "Args(screenName=" + this.screenName + ", screenUniqueId=" + this.screenUniqueId + ", isCrypto=" + this.isCrypto + ", useTemporaryToolbar=" + this.useTemporaryToolbar + ", noSkip=" + this.noSkip + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.screenName);
            dest.writeString(this.screenUniqueId);
            dest.writeInt(this.isCrypto ? 1 : 0);
            dest.writeInt(this.useTemporaryToolbar ? 1 : 0);
            dest.writeInt(this.noSkip ? 1 : 0);
        }

        public Args(String screenName, String str, boolean z, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(screenName, "screenName");
            this.screenName = screenName;
            this.screenUniqueId = str;
            this.isCrypto = z;
            this.useTemporaryToolbar = z2;
            this.noSkip = z3;
        }

        public /* synthetic */ Args(String str, String str2, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, z, z2, z3);
        }

        public final String getScreenName() {
            return this.screenName;
        }

        public final String getScreenUniqueId() {
            return this.screenUniqueId;
        }

        public final boolean isCrypto() {
            return this.isCrypto;
        }

        public final boolean getUseTemporaryToolbar() {
            return this.useTemporaryToolbar;
        }

        public final boolean getNoSkip() {
            return this.noSkip;
        }
    }
}
