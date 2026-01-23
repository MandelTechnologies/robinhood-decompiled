package com.robinhood.android.graph;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.transition.AutoTransition;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.OneShotPreDrawListener;
import androidx.tracing.Trace;
import com.jakewharton.rxbinding3.view.RxView;
import com.jakewharton.rxbinding3.view.ViewLayoutChangeEvent;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.jakewharton.rxbinding3.widget.TextViewTextChangeEvent;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.util.UiCallbacks;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.view.AnimatedRhTextView;
import com.robinhood.android.common.view.CandlestickChartView;
import com.robinhood.android.common.view.CandlestickDetailView;
import com.robinhood.android.designsystem.style.DirectionOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.viewstubholder.ViewStubHolder;
import com.robinhood.android.educationtour.EducationTourElementIds;
import com.robinhood.android.educationtour.extensions.ViewsKt;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.font.CustomTypefaceSpan;
import com.robinhood.android.font.RhTypeface;
import com.robinhood.android.graph.GraphLayoutViewModel;
import com.robinhood.android.graph.spark.GraphData;
import com.robinhood.android.graph.spark.GraphView;
import com.robinhood.android.lib.formats.C20282R;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.disposer.ViewScopedObservable;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p355ui.DataPoint;
import com.robinhood.models.p355ui.GraphSelection;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.dagger.SharedPreferencesModule;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.LocalDateTimes;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.Transitions2;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import p479j$.time.Duration;
import p479j$.time.Instant;
import p479j$.time.LocalDateTime;
import p479j$.time.ZoneOffset;

/* compiled from: GraphLayout.kt */
@Metadata(m3635d1 = {"\u0000\u0092\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \u0080\u00022\u00020\u00012\u00020\u0002:\u0002\u0080\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000bJ/\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u000bJ+\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010\u000bJ\u000f\u0010&\u001a\u00020\tH\u0014¢\u0006\u0004\b&\u0010\u000bJ\u0017\u0010(\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u0012H\u0014¢\u0006\u0004\b(\u0010)J!\u0010+\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u00122\b\b\u0002\u0010*\u001a\u00020\u0012H\u0014¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\tH\u0014¢\u0006\u0004\b-\u0010\u000bJ\u000f\u0010.\u001a\u00020\tH\u0016¢\u0006\u0004\b.\u0010\u000bJ\u001f\u00100\u001a\u00020\t2\u0006\u0010/\u001a\u00020\u00122\b\b\u0002\u0010*\u001a\u00020\u0012¢\u0006\u0004\b0\u0010,J\u0017\u00101\u001a\u00020\t2\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0004¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001bH\u0004¢\u0006\u0004\b7\u00106J\u000f\u00108\u001a\u00020\tH\u0016¢\u0006\u0004\b8\u0010\u000bJ\u000f\u00109\u001a\u00020\tH\u0014¢\u0006\u0004\b9\u0010\u000bJ\u000f\u0010:\u001a\u00020\tH\u0015¢\u0006\u0004\b:\u0010\u000bJ\u0017\u0010<\u001a\u00020\t2\u0006\u0010;\u001a\u00020\u0012H\u0014¢\u0006\u0004\b<\u0010)J\u0019\u0010>\u001a\u00020\t2\b\u0010=\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b>\u0010?J\u001f\u0010B\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010A\u001a\u00020@H\u0014¢\u0006\u0004\bB\u0010CJ=\u0010F\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010D\u001a\u00020@2\b\u0010E\u001a\u0004\u0018\u00010@H\u0014¢\u0006\u0004\bF\u0010GJ\u001f\u0010I\u001a\u00020H2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0005¢\u0006\u0004\bI\u0010JJ\u0017\u0010M\u001a\u00020L2\u0006\u0010K\u001a\u00020!H\u0014¢\u0006\u0004\bM\u0010NJ'\u0010R\u001a\u00020L2\u0006\u0010P\u001a\u00020O2\u0006\u0010Q\u001a\u00020O2\u0006\u0010K\u001a\u00020!H\u0014¢\u0006\u0004\bR\u0010SJ#\u0010\u001f\u001a\u00020\t2\b\u0010T\u001a\u0004\u0018\u00010\u00152\b\u0010U\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001f\u0010VJ!\u0010W\u001a\u00020\u000f2\u0006\u0010D\u001a\u00020@2\b\u0010E\u001a\u0004\u0018\u00010@H\u0004¢\u0006\u0004\bW\u0010XJ#\u0010Y\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0014¢\u0006\u0004\bY\u0010ZJ\u0015\u0010[\u001a\u00020\t2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b[\u00102R\"\u0010]\u001a\u00020\\8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010d\u001a\u00020c8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\b>\u0010hR\"\u0010j\u001a\u00020i8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bB\u0010nR\"\u0010o\u001a\u00020c8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\bo\u0010e\u001a\u0004\bp\u0010g\"\u0004\bq\u0010hR$\u0010r\u001a\u0004\u0018\u00010c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\br\u0010e\u001a\u0004\bs\u0010g\"\u0004\bt\u0010hR\"\u0010v\u001a\u00020u8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R'\u0010}\u001a\u0004\u0018\u00010|8\u0004@\u0004X\u0084\u000e¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R,\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0083\u00018\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R,\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0083\u00018\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010\u0085\u0001\u001a\u0006\b\u008b\u0001\u0010\u0087\u0001\"\u0006\b\u008c\u0001\u0010\u0089\u0001R(\u0010\u008d\u0001\u001a\u0004\u0018\u00010c8\u0004@\u0004X\u0084\u000e¢\u0006\u0015\n\u0005\b\u008d\u0001\u0010e\u001a\u0005\b\u008e\u0001\u0010g\"\u0005\b\u008f\u0001\u0010hR3\u0010\u0092\u0001\u001a\f\u0012\u0005\u0012\u00030\u0091\u0001\u0018\u00010\u0090\u00018\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R \u0010\u0099\u0001\u001a\u00030\u0098\u00018\u0014X\u0094\u0004¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R \u0010\u009d\u0001\u001a\u00030\u0098\u00018\u0014X\u0094\u0004¢\u0006\u0010\n\u0006\b\u009d\u0001\u0010\u009a\u0001\u001a\u0006\b\u009e\u0001\u0010\u009c\u0001R \u0010\u009f\u0001\u001a\u00030\u0098\u00018\u0014X\u0094\u0004¢\u0006\u0010\n\u0006\b\u009f\u0001\u0010\u009a\u0001\u001a\u0006\b \u0001\u0010\u009c\u0001R\u0017\u0010¡\u0001\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0017\u0010£\u0001\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¢\u0001R\u0018\u0010¥\u0001\u001a\u00030¤\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0018\u0010§\u0001\u001a\u00030¤\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¦\u0001R\u0018\u0010¨\u0001\u001a\u00030¤\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010¦\u0001R!\u0010®\u0001\u001a\u00030©\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u001f\u0010¯\u0001\u001a\u00020H8\u0014X\u0094\u0004¢\u0006\u0010\n\u0006\b¯\u0001\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001R,\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\t\u0010³\u0001\u001a\u0004\u0018\u00010\u001b8\u0004@BX\u0084\u000e¢\u0006\u000f\n\u0005\b\u001c\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001R\u0019\u0010·\u0001\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010°\u0001R,\u0010\u001a\u001a\u0004\u0018\u00010\u00192\t\u0010³\u0001\u001a\u0004\u0018\u00010\u00198\u0004@BX\u0084\u000e¢\u0006\u000f\n\u0005\b\u001a\u0010¸\u0001\u001a\u0006\b¹\u0001\u0010º\u0001R(\u0010\"\u001a\u00020!2\u0007\u0010³\u0001\u001a\u00020!8\u0004@BX\u0084\u000e¢\u0006\u000f\n\u0005\b\"\u0010»\u0001\u001a\u0006\b¼\u0001\u0010½\u0001R'\u0010À\u0001\u001a\n\u0012\u0005\u0012\u00030¿\u00010¾\u00018\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\bÀ\u0001\u0010Á\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001R.\u0010Å\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030¿\u00010Ä\u00010¾\u00018\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\bÅ\u0001\u0010Á\u0001\u001a\u0006\bÆ\u0001\u0010Ã\u0001R\u0019\u0010Ç\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÇ\u0001\u0010È\u0001R\u001b\u0010É\u0001\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÉ\u0001\u0010Ê\u0001R\"\u0010Ð\u0001\u001a\u00030Ë\u00018&@&X¦\u000e¢\u0006\u0010\u001a\u0006\bÌ\u0001\u0010Í\u0001\"\u0006\bÎ\u0001\u0010Ï\u0001R\"\u0010Ö\u0001\u001a\u00030Ñ\u00018&@&X¦\u000e¢\u0006\u0010\u001a\u0006\bÒ\u0001\u0010Ó\u0001\"\u0006\bÔ\u0001\u0010Õ\u0001R\"\u0010Ü\u0001\u001a\u00030×\u00018&@&X¦\u000e¢\u0006\u0010\u001a\u0006\bØ\u0001\u0010Ù\u0001\"\u0006\bÚ\u0001\u0010Û\u0001R\"\u0010â\u0001\u001a\u00030Ý\u00018&@&X¦\u000e¢\u0006\u0010\u001a\u0006\bÞ\u0001\u0010ß\u0001\"\u0006\bà\u0001\u0010á\u0001R\"\u0010è\u0001\u001a\u00030ã\u00018&@&X¦\u000e¢\u0006\u0010\u001a\u0006\bä\u0001\u0010å\u0001\"\u0006\bæ\u0001\u0010ç\u0001R\u0017\u0010ê\u0001\u001a\u00020H8TX\u0094\u0004¢\u0006\b\u001a\u0006\bé\u0001\u0010²\u0001R\u0017\u0010ì\u0001\u001a\u00020H8TX\u0094\u0004¢\u0006\b\u001a\u0006\bë\u0001\u0010²\u0001R\u0017\u0010î\u0001\u001a\u00020H8TX\u0094\u0004¢\u0006\b\u001a\u0006\bí\u0001\u0010²\u0001R\u0017\u0010ð\u0001\u001a\u00020H8TX\u0094\u0004¢\u0006\b\u001a\u0006\bï\u0001\u0010²\u0001R,\u0010ó\u0001\u001a\u0004\u0018\u00010\u00152\t\u0010³\u0001\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u000e¢\u0006\u000e\u001a\u0006\bñ\u0001\u0010ò\u0001\"\u0004\bF\u0010?R\u001c\u0010÷\u0001\u001a\n\u0012\u0005\u0012\u00030¿\u00010ô\u00018F¢\u0006\b\u001a\u0006\bõ\u0001\u0010ö\u0001R#\u0010ù\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030¿\u00010Ä\u00010ô\u00018F¢\u0006\b\u001a\u0006\bø\u0001\u0010ö\u0001R\u001b\u0010û\u0001\u001a\t\u0012\u0004\u0012\u00020!0ô\u00018F¢\u0006\b\u001a\u0006\bú\u0001\u0010ö\u0001R\u0018\u0010ÿ\u0001\u001a\u00030ü\u00018$X¤\u0004¢\u0006\b\u001a\u0006\bý\u0001\u0010þ\u0001¨\u0006\u0081\u0002"}, m3636d2 = {"Lcom/robinhood/android/graph/GraphLayout;", "Landroid/widget/FrameLayout;", "Lcom/robinhood/android/common/util/UiCallbacks$Clearable;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "adjustHeaderTextSize", "()V", "updateChartSettingsButtonVisibility", "updateCandlestickSpacing", "refreshCandlestickScrubbing", "", "deltaText", "timeFrameText", "", "isUpOrFlat", "isStale", "", "getDeltaSummaryText", "(Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/CharSequence;", "resetDeltaText", "Lcom/robinhood/android/graph/GraphLayoutViewModel;", "viewModel", "Lcom/robinhood/android/graph/spark/GraphData;", "graphData", "Lcom/robinhood/models/ui/DataPoint;", "selectedDataPoint", "setAfterHoursText", "(Lcom/robinhood/android/graph/GraphLayoutViewModel;Lcom/robinhood/android/graph/spark/GraphData;Lcom/robinhood/models/ui/DataPoint;)V", "Lcom/robinhood/models/ui/GraphSelection;", "graphSelection", "getGraphSelectionDisplayStrings", "(Lcom/robinhood/models/ui/GraphSelection;)Ljava/lang/String;", "onInitialized", "onAttachedToWindow", "show", "updateCandlestickChartVisibility", "(Z)V", "forceRefresh", "showCandlestickChart", "(ZZ)V", "onClickChartSettings", "setChartSettingsEnabled", "enable", "setCandlestickChartEnabled", "onGraphSelectionChanged", "(Lcom/robinhood/models/ui/GraphSelection;)V", "setData", "(Lcom/robinhood/android/graph/GraphLayoutViewModel;)V", "onGraphDataSet", "(Lcom/robinhood/android/graph/spark/GraphData;)V", "setGraphData", "clear", "refreshUi", "refreshGraphViewScrubbing", "scrubbing", "onCandlestickScrubStateChanged", "title", "setHeaderTitleTxt", "(Ljava/lang/CharSequence;)V", "Ljava/math/BigDecimal;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "setTotalMoneyTxt", "(Lcom/robinhood/android/graph/GraphLayoutViewModel;Ljava/math/BigDecimal;)V", "deltaValue", "deltaPercent", "setDeltaInfoText", "(Lcom/robinhood/android/graph/GraphLayoutViewModel;Lcom/robinhood/android/graph/spark/GraphData;Lcom/robinhood/models/ui/DataPoint;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "", "getDeltaColor", "(ZZ)I", "selection", "Lcom/robinhood/utils/datetime/format/InstantFormatter;", "getInstantFormatter", "(Lcom/robinhood/models/ui/GraphSelection;)Lcom/robinhood/utils/datetime/format/InstantFormatter;", "j$/time/Instant", "start", "end", "getStartInstantFormatter", "(Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/models/ui/GraphSelection;)Lcom/robinhood/utils/datetime/format/InstantFormatter;", "text", "isUp", "(Ljava/lang/CharSequence;Ljava/lang/Boolean;)V", "getDeltaText", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/String;", "getTimeFrameText", "(Lcom/robinhood/android/graph/spark/GraphData;Lcom/robinhood/models/ui/DataPoint;)Ljava/lang/String;", "setGraphSelectionFromAdapterOnly", "Lcom/robinhood/android/graph/spark/GraphView;", "graphView", "Lcom/robinhood/android/graph/spark/GraphView;", "getGraphView", "()Lcom/robinhood/android/graph/spark/GraphView;", "setGraphView", "(Lcom/robinhood/android/graph/spark/GraphView;)V", "Lcom/robinhood/android/designsystem/text/RhTextView;", "headerTitleTxt", "Lcom/robinhood/android/designsystem/text/RhTextView;", "getHeaderTitleTxt", "()Lcom/robinhood/android/designsystem/text/RhTextView;", "(Lcom/robinhood/android/designsystem/text/RhTextView;)V", "Lcom/robinhood/android/common/view/AnimatedRhTextView;", "totalMoneyTxt", "Lcom/robinhood/android/common/view/AnimatedRhTextView;", "getTotalMoneyTxt", "()Lcom/robinhood/android/common/view/AnimatedRhTextView;", "(Lcom/robinhood/android/common/view/AnimatedRhTextView;)V", "deltaInfoTxt", "getDeltaInfoTxt", "setDeltaInfoTxt", "afterHoursTxt", "getAfterHoursTxt", "setAfterHoursTxt", "Lcom/robinhood/android/graph/IntervalSelectorLayout;", "intervalSelector", "Lcom/robinhood/android/graph/IntervalSelectorLayout;", "getIntervalSelector", "()Lcom/robinhood/android/graph/IntervalSelectorLayout;", "setIntervalSelector", "(Lcom/robinhood/android/graph/IntervalSelectorLayout;)V", "Lcom/robinhood/android/common/view/CandlestickChartView;", "candlestickChartView", "Lcom/robinhood/android/common/view/CandlestickChartView;", "getCandlestickChartView", "()Lcom/robinhood/android/common/view/CandlestickChartView;", "setCandlestickChartView", "(Lcom/robinhood/android/common/view/CandlestickChartView;)V", "Landroid/widget/ImageView;", "toggleChartBtn", "Landroid/widget/ImageView;", "getToggleChartBtn", "()Landroid/widget/ImageView;", "setToggleChartBtn", "(Landroid/widget/ImageView;)V", "chartSettingsButton", "getChartSettingsButton", "setChartSettingsButton", "candlestickScrubbedTxt", "getCandlestickScrubbedTxt", "setCandlestickScrubbedTxt", "Lcom/robinhood/android/designsystem/viewstubholder/ViewStubHolder;", "Lcom/robinhood/android/common/view/CandlestickDetailView;", "candlestickDetailViewStubHolder", "Lcom/robinhood/android/designsystem/viewstubholder/ViewStubHolder;", "getCandlestickDetailViewStubHolder", "()Lcom/robinhood/android/designsystem/viewstubholder/ViewStubHolder;", "setCandlestickDetailViewStubHolder", "(Lcom/robinhood/android/designsystem/viewstubholder/ViewStubHolder;)V", "Lcom/robinhood/android/lib/formats/NumberFormatter;", "priceFormat", "Lcom/robinhood/android/lib/formats/NumberFormatter;", "getPriceFormat", "()Lcom/robinhood/android/lib/formats/NumberFormatter;", "priceDeltaFormat", "getPriceDeltaFormat", "percentDeltaFormat", "getPercentDeltaFormat", "preMarketLabel", "Ljava/lang/String;", "afterHoursLabel", "", "defaultCandlestickWidth", "F", "thinCandlestickWidth", "thinCandlestickSpacingThreshold", "Lcom/robinhood/android/font/CustomTypefaceSpan;", "deltaTextTypefaceSpan$delegate", "Lkotlin/Lazy;", "getDeltaTextTypefaceSpan", "()Lcom/robinhood/android/font/CustomTypefaceSpan;", "deltaTextTypefaceSpan", "toggleCandlestickIconRes", "I", "getToggleCandlestickIconRes", "()I", "value", "Lcom/robinhood/android/graph/spark/GraphData;", "getGraphData", "()Lcom/robinhood/android/graph/spark/GraphData;", "selectedCandlestickIndex", "Lcom/robinhood/android/graph/GraphLayoutViewModel;", "getViewModel", "()Lcom/robinhood/android/graph/GraphLayoutViewModel;", "Lcom/robinhood/models/ui/GraphSelection;", "getGraphSelection", "()Lcom/robinhood/models/ui/GraphSelection;", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/android/designsystem/style/DirectionOverlay;", "directionStyleRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "getDirectionStyleRelay", "()Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/utils/Optional;", "optionalDirectionStyleRelay", "getOptionalDirectionStyleRelay", "allowCandlestickToggle", "Z", "scrubStartTimeForLogging", "Lj$/time/Instant;", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "analytics", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "eventLogger", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "getMarketHoursManager", "()Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "setMarketHoursManager", "(Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;)V", "marketHoursManager", "Landroid/content/SharedPreferences;", "getUserPrefs", "()Landroid/content/SharedPreferences;", "setUserPrefs", "(Landroid/content/SharedPreferences;)V", SharedPreferencesModule.USER_PREFS_NAME, "Lcom/robinhood/prefs/BooleanPreference;", "getShowCandlestickChartPref", "()Lcom/robinhood/prefs/BooleanPreference;", "setShowCandlestickChartPref", "(Lcom/robinhood/prefs/BooleanPreference;)V", "showCandlestickChartPref", "getHeaderTitleTextAppearance", "headerTitleTextAppearance", "getDeltaTextPositiveColor", "deltaTextPositiveColor", "getDeltaTextNegativeColor", "deltaTextNegativeColor", "getDeltaTextStaleColor", "deltaTextStaleColor", "getDeltaInfoText", "()Ljava/lang/CharSequence;", "deltaInfoText", "Lio/reactivex/Observable;", "getDirectionStyleObservable", "()Lio/reactivex/Observable;", "directionStyleObservable", "getOptionalDirectionStyleObservable", "optionalDirectionStyleObservable", "getGraphSelectionChangedObservable", "graphSelectionChangedObservable", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getLoggingEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "loggingEventScreen", "Companion", "lib-graph_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public abstract class GraphLayout extends FrameLayout implements UiCallbacks.Clearable {
    public static final int DEFAULT_HEADER_MAX_LINES = 2;
    private final String afterHoursLabel;
    private RhTextView afterHoursTxt;
    private boolean allowCandlestickToggle;
    private CandlestickChartView candlestickChartView;
    private ViewStubHolder<CandlestickDetailView> candlestickDetailViewStubHolder;
    private RhTextView candlestickScrubbedTxt;
    private ImageView chartSettingsButton;
    private final float defaultCandlestickWidth;
    protected RhTextView deltaInfoTxt;

    /* renamed from: deltaTextTypefaceSpan$delegate, reason: from kotlin metadata */
    private final Lazy deltaTextTypefaceSpan;
    private final BehaviorRelay<DirectionOverlay> directionStyleRelay;
    private GraphData graphData;
    private GraphSelection graphSelection;
    protected GraphView graphView;
    protected RhTextView headerTitleTxt;
    protected IntervalSelectorLayout intervalSelector;
    private final BehaviorRelay<Optional<DirectionOverlay>> optionalDirectionStyleRelay;
    private final NumberFormatter percentDeltaFormat;
    private final String preMarketLabel;
    private final NumberFormatter priceDeltaFormat;
    private final NumberFormatter priceFormat;
    private Instant scrubStartTimeForLogging;
    private int selectedCandlestickIndex;
    private final float thinCandlestickSpacingThreshold;
    private final float thinCandlestickWidth;
    private final int toggleCandlestickIconRes;
    private ImageView toggleChartBtn;
    public AnimatedRhTextView totalMoneyTxt;
    private GraphLayoutViewModel viewModel;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: GraphLayout.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GraphSelection.values().length];
            try {
                iArr[GraphSelection.HOUR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GraphSelection.DAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GraphSelection.ALL_DAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GraphSelection.TWENTY_FOUR_HOURS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GraphSelection.WEEK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[GraphSelection.WEEK_CRYPTO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[GraphSelection.MONTH_HOURLY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[GraphSelection.MONTH_CRYPTO_HOURLY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[GraphSelection.MONTH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[GraphSelection.MONTH_CRYPTO.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[GraphSelection.THREE_MONTHS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[GraphSelection.THREE_MONTHS_CRYPTO.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[GraphSelection.YEAR_TO_DATE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[GraphSelection.YEAR.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[GraphSelection.YEAR_CRYPTO.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[GraphSelection.FIVE_YEARS.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[GraphSelection.FIVE_YEARS_CRYPTO.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[GraphSelection.MAX.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[GraphSelection.MAX_CRYPTO.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[GraphSelection.ALL.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[GraphSelection.ALL_CRYPTO.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public abstract AnalyticsLogger getAnalytics();

    public abstract EventLogger getEventLogger();

    protected abstract Screen getLoggingEventScreen();

    public abstract TraderMarketHoursManager getMarketHoursManager();

    public abstract BooleanPreference getShowCandlestickChartPref();

    public abstract SharedPreferences getUserPrefs();

    protected void onClickChartSettings() {
    }

    public void onGraphDataSet(GraphData graphData) {
        Intrinsics.checkNotNullParameter(graphData, "graphData");
    }

    protected void refreshGraphViewScrubbing() {
    }

    public abstract void setAnalytics(AnalyticsLogger analyticsLogger);

    public abstract void setEventLogger(EventLogger eventLogger);

    public abstract void setMarketHoursManager(TraderMarketHoursManager traderMarketHoursManager);

    public abstract void setShowCandlestickChartPref(BooleanPreference booleanPreference);

    public abstract void setUserPrefs(SharedPreferences sharedPreferences);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphLayout(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.priceFormat = Formats.getPriceFormat();
        this.priceDeltaFormat = Formats.getPriceDeltaFormat();
        this.percentDeltaFormat = Formats.getAbsPercentDeltaFormat();
        String string2 = context.getString(C18339R.string.graph_scrub_pre_market_label);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        this.preMarketLabel = string2;
        String string3 = context.getString(C18339R.string.graph_scrub_after_hours_label);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        this.afterHoursLabel = string3;
        this.defaultCandlestickWidth = context.getResources().getDimension(C11048R.dimen.default_candlestick_width);
        this.thinCandlestickWidth = context.getResources().getDimension(C11048R.dimen.thin_candlestick_width);
        this.thinCandlestickSpacingThreshold = context.getResources().getDimension(C11048R.dimen.thin_candlestick_spacing_threshold);
        this.deltaTextTypefaceSpan = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.graph.GraphLayout$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GraphLayout.deltaTextTypefaceSpan_delegate$lambda$0(context);
            }
        });
        this.toggleCandlestickIconRes = C11048R.drawable.svg_ic_candlestick;
        this.selectedCandlestickIndex = -1;
        this.graphSelection = GraphSelection.DAY;
        BehaviorRelay<DirectionOverlay> behaviorRelayCreateDefault = BehaviorRelay.createDefault(DirectionOverlay.POSITIVE);
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.directionStyleRelay = behaviorRelayCreateDefault;
        BehaviorRelay<Optional<DirectionOverlay>> behaviorRelayCreateDefault2 = BehaviorRelay.createDefault(Optional2.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault2, "createDefault(...)");
        this.optionalDirectionStyleRelay = behaviorRelayCreateDefault2;
    }

    protected final GraphView getGraphView() {
        GraphView graphView = this.graphView;
        if (graphView != null) {
            return graphView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("graphView");
        return null;
    }

    protected final void setGraphView(GraphView graphView) {
        Intrinsics.checkNotNullParameter(graphView, "<set-?>");
        this.graphView = graphView;
    }

    protected final RhTextView getHeaderTitleTxt() {
        RhTextView rhTextView = this.headerTitleTxt;
        if (rhTextView != null) {
            return rhTextView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("headerTitleTxt");
        return null;
    }

    protected final void setHeaderTitleTxt(RhTextView rhTextView) {
        Intrinsics.checkNotNullParameter(rhTextView, "<set-?>");
        this.headerTitleTxt = rhTextView;
    }

    public final AnimatedRhTextView getTotalMoneyTxt() {
        AnimatedRhTextView animatedRhTextView = this.totalMoneyTxt;
        if (animatedRhTextView != null) {
            return animatedRhTextView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("totalMoneyTxt");
        return null;
    }

    public final void setTotalMoneyTxt(AnimatedRhTextView animatedRhTextView) {
        Intrinsics.checkNotNullParameter(animatedRhTextView, "<set-?>");
        this.totalMoneyTxt = animatedRhTextView;
    }

    protected final RhTextView getDeltaInfoTxt() {
        RhTextView rhTextView = this.deltaInfoTxt;
        if (rhTextView != null) {
            return rhTextView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deltaInfoTxt");
        return null;
    }

    protected final void setDeltaInfoTxt(RhTextView rhTextView) {
        Intrinsics.checkNotNullParameter(rhTextView, "<set-?>");
        this.deltaInfoTxt = rhTextView;
    }

    public final RhTextView getAfterHoursTxt() {
        return this.afterHoursTxt;
    }

    public final void setAfterHoursTxt(RhTextView rhTextView) {
        this.afterHoursTxt = rhTextView;
    }

    protected final IntervalSelectorLayout getIntervalSelector() {
        IntervalSelectorLayout intervalSelectorLayout = this.intervalSelector;
        if (intervalSelectorLayout != null) {
            return intervalSelectorLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("intervalSelector");
        return null;
    }

    protected final void setIntervalSelector(IntervalSelectorLayout intervalSelectorLayout) {
        Intrinsics.checkNotNullParameter(intervalSelectorLayout, "<set-?>");
        this.intervalSelector = intervalSelectorLayout;
    }

    protected final CandlestickChartView getCandlestickChartView() {
        return this.candlestickChartView;
    }

    protected final void setCandlestickChartView(CandlestickChartView candlestickChartView) {
        this.candlestickChartView = candlestickChartView;
    }

    protected final ImageView getToggleChartBtn() {
        return this.toggleChartBtn;
    }

    protected final void setToggleChartBtn(ImageView imageView) {
        this.toggleChartBtn = imageView;
    }

    protected final ImageView getChartSettingsButton() {
        return this.chartSettingsButton;
    }

    protected final void setChartSettingsButton(ImageView imageView) {
        this.chartSettingsButton = imageView;
    }

    protected final RhTextView getCandlestickScrubbedTxt() {
        return this.candlestickScrubbedTxt;
    }

    protected final void setCandlestickScrubbedTxt(RhTextView rhTextView) {
        this.candlestickScrubbedTxt = rhTextView;
    }

    protected final ViewStubHolder<CandlestickDetailView> getCandlestickDetailViewStubHolder() {
        return this.candlestickDetailViewStubHolder;
    }

    protected final void setCandlestickDetailViewStubHolder(ViewStubHolder<CandlestickDetailView> viewStubHolder) {
        this.candlestickDetailViewStubHolder = viewStubHolder;
    }

    protected NumberFormatter getPriceFormat() {
        return this.priceFormat;
    }

    protected NumberFormatter getPriceDeltaFormat() {
        return this.priceDeltaFormat;
    }

    protected NumberFormatter getPercentDeltaFormat() {
        return this.percentDeltaFormat;
    }

    protected int getHeaderTitleTextAppearance() {
        return C20690R.attr.textAppearanceDisplayLarge;
    }

    protected int getDeltaTextPositiveColor() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return ThemeColors.getThemeColor(context, C20690R.attr.colorPositive);
    }

    protected int getDeltaTextNegativeColor() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return ThemeColors.getThemeColor(context, C20690R.attr.colorNegative);
    }

    protected int getDeltaTextStaleColor() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return ThemeColors.getThemeColor(context, C20690R.attr.colorForeground3);
    }

    public CustomTypefaceSpan getDeltaTextTypefaceSpan() {
        return (CustomTypefaceSpan) this.deltaTextTypefaceSpan.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CustomTypefaceSpan deltaTextTypefaceSpan_delegate$lambda$0(Context context) {
        return new CustomTypefaceSpan(RhTypeface.MEDIUM.load(context));
    }

    public final CharSequence getDeltaInfoText() {
        if (this.deltaInfoTxt == null) {
            return null;
        }
        return getDeltaInfoTxt().getText();
    }

    public final void setDeltaInfoText(CharSequence charSequence) {
        if (this.deltaInfoTxt == null) {
            return;
        }
        getDeltaInfoTxt().setText(charSequence);
        getDeltaInfoTxt().setContentDescription(charSequence != null ? new Regex("[()]").replace(charSequence, "") : null);
    }

    protected int getToggleCandlestickIconRes() {
        return this.toggleCandlestickIconRes;
    }

    protected final GraphData getGraphData() {
        return this.graphData;
    }

    protected final GraphLayoutViewModel getViewModel() {
        return this.viewModel;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final GraphSelection getGraphSelection() {
        return this.graphSelection;
    }

    protected final BehaviorRelay<DirectionOverlay> getDirectionStyleRelay() {
        return this.directionStyleRelay;
    }

    protected final BehaviorRelay<Optional<DirectionOverlay>> getOptionalDirectionStyleRelay() {
        return this.optionalDirectionStyleRelay;
    }

    public final Observable<DirectionOverlay> getDirectionStyleObservable() {
        Observable<DirectionOverlay> observableShare = this.directionStyleRelay.distinctUntilChanged().share();
        Intrinsics.checkNotNullExpressionValue(observableShare, "share(...)");
        return observableShare;
    }

    public final Observable<Optional<DirectionOverlay>> getOptionalDirectionStyleObservable() {
        Observable<Optional<DirectionOverlay>> observableShare = this.optionalDirectionStyleRelay.distinctUntilChanged().share();
        Intrinsics.checkNotNullExpressionValue(observableShare, "share(...)");
        return observableShare;
    }

    public final Observable<GraphSelection> getGraphSelectionChangedObservable() {
        return getIntervalSelector().getGraphSelectionObservable();
    }

    public void onInitialized() {
        Observable<ViewLayoutChangeEvent> observableLayoutChangeEvents;
        setGraphView((GraphView) findViewById(C11048R.id.graph_layout_graph_view));
        this.candlestickChartView = (CandlestickChartView) findViewById(C11048R.id.graph_layout_candlestick_view);
        setHeaderTitleTxt((RhTextView) findViewById(C11048R.id.graph_header_title_txt));
        setTotalMoneyTxt((AnimatedRhTextView) findViewById(C11048R.id.graph_layout_total_money_txt));
        setDeltaInfoTxt((RhTextView) findViewById(C11048R.id.graph_layout_change_info_txt));
        this.afterHoursTxt = (RhTextView) findViewById(C11048R.id.graph_layout_after_hours_txt);
        this.toggleChartBtn = (ImageView) findViewById(C11048R.id.graph_layout_toggle_chart_btn);
        this.chartSettingsButton = (ImageView) findViewById(C11048R.id.graph_layout_settings_chart_btn);
        this.candlestickScrubbedTxt = (RhTextView) findViewById(C11048R.id.graph_layout_candlestick_scrubbed_txt);
        ViewStub viewStub = (ViewStub) findViewById(C11048R.id.graph_layout_candlestick_detail);
        this.candlestickDetailViewStubHolder = viewStub != null ? new ViewStubHolder<>(viewStub) : null;
        setIntervalSelector((IntervalSelectorLayout) findViewById(C11048R.id.interval_selector_layout));
        resetDeltaText();
        CandlestickChartView candlestickChartView = this.candlestickChartView;
        if (candlestickChartView == null || (observableLayoutChangeEvents = RxView.layoutChangeEvents(candlestickChartView)) == null) {
            return;
        }
        observableLayoutChangeEvents.subscribe(new Consumer() { // from class: com.robinhood.android.graph.GraphLayout.onInitialized.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(ViewLayoutChangeEvent viewLayoutChangeEvent) {
                if (viewLayoutChangeEvent.getRight() - viewLayoutChangeEvent.getLeft() != viewLayoutChangeEvent.getOldRight() - viewLayoutChangeEvent.getOldLeft()) {
                    GraphLayout.this.updateCandlestickSpacing();
                }
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        Observable<Integer> scrubbedObservable;
        Observable observableObserveOnMainThread;
        ViewScopedObservable viewScopedObservableBindTo$default;
        super.onAttachedToWindow();
        ViewsKt.setEducationTourId(getGraphView(), EducationTourElementIds.PRICE_CHART_GRAPH_ELEMENT_ID);
        CandlestickChartView candlestickChartView = this.candlestickChartView;
        if (candlestickChartView != null) {
            ViewsKt.setEducationTourId(candlestickChartView, EducationTourElementIds.PRICE_CHART_GRAPH_ELEMENT_ID);
        }
        ImageView imageView = this.toggleChartBtn;
        if (imageView != null) {
            ViewsKt.setEducationTourId(imageView, EducationTourElementIds.PRICE_CHART_MODE_ELEMENT_ID);
        }
        ImageView imageView2 = this.chartSettingsButton;
        if (imageView2 != null) {
            ViewsKt.setEducationTourId(imageView2, EducationTourElementIds.PRICE_CHART_SETTINGS_ELEMENT_ID);
        }
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(getGraphView().getHistoricalScrubbedObservable()), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.graph.GraphLayout$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GraphLayout.onAttachedToWindow$lambda$2(this.f$0, (Optional) obj);
            }
        });
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(getGraphView().isPrimaryLineOnTopObservable()), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.graph.GraphLayout$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GraphLayout.onAttachedToWindow$lambda$3(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        CandlestickChartView candlestickChartView2 = this.candlestickChartView;
        if (candlestickChartView2 != null && (scrubbedObservable = candlestickChartView2.getScrubbedObservable()) != null && (observableObserveOnMainThread = ObservablesAndroid.observeOnMainThread(scrubbedObservable)) != null && (viewScopedObservableBindTo$default = ViewDisposerKt.bindTo$default(observableObserveOnMainThread, this, false, 2, null)) != null) {
            viewScopedObservableBindTo$default.subscribeKotlin(new Function1() { // from class: com.robinhood.android.graph.GraphLayout$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GraphLayout.onAttachedToWindow$lambda$4(this.f$0, ((Integer) obj).intValue());
                }
            });
        }
        Observable<GraphSelection> observableFilter = getIntervalSelector().getGraphSelectionObservable().filter(new Predicate() { // from class: com.robinhood.android.graph.GraphLayout.onAttachedToWindow.4
            @Override // io.reactivex.functions.Predicate
            public final boolean test(GraphSelection graphSelection) {
                Intrinsics.checkNotNullParameter(graphSelection, "graphSelection");
                return GraphLayout.this.getGraphSelection() != graphSelection;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFilter, "filter(...)");
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(observableFilter), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.graph.GraphLayout$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GraphLayout.onAttachedToWindow$lambda$5(this.f$0, (GraphSelection) obj);
            }
        });
        ImageView imageView3 = this.toggleChartBtn;
        if (imageView3 != null) {
            OnClickListeners.onClick(imageView3, new Function0() { // from class: com.robinhood.android.graph.GraphLayout$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GraphLayout.onAttachedToWindow$lambda$6(this.f$0);
                }
            });
        }
        ImageView imageView4 = this.chartSettingsButton;
        if (imageView4 != null) {
            OnClickListeners.onClick(imageView4, new C183357(this));
        }
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(getShowCandlestickChartPref().getChanges()), this, false, 2, null).subscribeKotlin(new C183368(this));
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(RxTextView.textChangeEvents(getHeaderTitleTxt())), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.graph.GraphLayout$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GraphLayout.onAttachedToWindow$lambda$7(this.f$0, (TextViewTextChangeEvent) obj);
            }
        });
        updateChartSettingsButtonVisibility();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$2(GraphLayout graphLayout, Optional optional) throws Throwable {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        Integer num = (Integer) optional.component1();
        Instant instant = graphLayout.scrubStartTimeForLogging;
        if (instant == null && num != null) {
            graphLayout.scrubStartTimeForLogging = Instant.now();
        } else if (instant != null && num == null) {
            EventLogger.DefaultImpls.logDrag$default(graphLayout.getEventLogger(), UserInteractionEventData.Action.SCRUB_LINE_CHART, graphLayout.getLoggingEventScreen(), null, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, (int) Duration.between(instant, Instant.now()).getSeconds(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -257, -1, -1, -1, -1, -1, 16383, null), false, 44, null);
            graphLayout.scrubStartTimeForLogging = null;
        }
        graphLayout.refreshUi();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$3(GraphLayout graphLayout, boolean z) {
        EventLogger.DefaultImpls.logAppear$default(graphLayout.getEventLogger(), UserInteractionEventData.Action.CHANGE_PRIMARY_OPTION_CHART_LINE, graphLayout.getLoggingEventScreen(), null, null, null, 28, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$4(GraphLayout graphLayout, int i) throws Throwable {
        if (graphLayout.selectedCandlestickIndex == -1 && i >= 0) {
            graphLayout.getAnalytics().logUserAction(AnalyticsStrings.USER_ACTION_SCRUB_CANDLESTICK_CHART);
        }
        graphLayout.selectedCandlestickIndex = i;
        graphLayout.refreshUi();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$5(GraphLayout graphLayout, GraphSelection graphSelection) {
        Intrinsics.checkNotNull(graphSelection);
        graphLayout.onGraphSelectionChanged(graphSelection);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$6(GraphLayout graphLayout) {
        String str;
        CandlestickChartView candlestickChartView = graphLayout.candlestickChartView;
        Intrinsics.checkNotNull(candlestickChartView);
        boolean z = candlestickChartView.getVisibility() == 0;
        boolean z2 = !z;
        if (!z) {
            str = AnalyticsStrings.BUTTON_CHART_TO_CANDLESTICKS;
        } else {
            str = AnalyticsStrings.BUTTON_CHART_TO_LINE_CHART;
        }
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(graphLayout.getAnalytics(), AnalyticsStrings.BUTTON_GROUP_CHART_TOGGLE, str, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        Transitions2.beginDelayedTransition(graphLayout, new AutoTransition());
        graphLayout.getShowCandlestickChartPref().set(z2);
        return Unit.INSTANCE;
    }

    /* compiled from: GraphLayout.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.graph.GraphLayout$onAttachedToWindow$7 */
    /* synthetic */ class C183357 extends FunctionReferenceImpl implements Function0<Unit> {
        C183357(Object obj) {
            super(0, obj, GraphLayout.class, "onClickChartSettings", "onClickChartSettings()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((GraphLayout) this.receiver).onClickChartSettings();
        }
    }

    /* compiled from: GraphLayout.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.graph.GraphLayout$onAttachedToWindow$8 */
    /* synthetic */ class C183368 extends AdaptedFunctionReference implements Function1<Boolean, Unit> {
        C183368(Object obj) {
            super(1, obj, GraphLayout.class, "showCandlestickChart", "showCandlestickChart(ZZ)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            GraphLayout.showCandlestickChart$default((GraphLayout) this.receiver, z, false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$7(GraphLayout graphLayout, TextViewTextChangeEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getBefore() != it.getText().length()) {
            graphLayout.adjustHeaderTextSize();
        }
        return Unit.INSTANCE;
    }

    private final void adjustHeaderTextSize() {
        getHeaderTitleTxt().setMaxLines(2);
        TextViewsKt.setTextAppearanceAttr(getHeaderTitleTxt(), getHeaderTitleTextAppearance());
        final RhTextView headerTitleTxt = getHeaderTitleTxt();
        OneShotPreDrawListener.add(headerTitleTxt, new Runnable() { // from class: com.robinhood.android.graph.GraphLayout$adjustHeaderTextSize$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                int lineCount = this.getHeaderTitleTxt().getLineCount() - 1;
                Layout layout = this.getHeaderTitleTxt().getLayout();
                if (layout != null) {
                    if (layout.getEllipsisCount(lineCount) > 0 || this.getHeaderTitleTxt().getLineCount() > 2) {
                        this.getHeaderTitleTxt().setMaxLines(Integer.MAX_VALUE);
                        TextViewsKt.setTextAppearanceAttr(this.getHeaderTitleTxt(), C20690R.attr.textAppearanceDisplayMedium);
                    }
                    this.getTotalMoneyTxt().setTextSize(this.getHeaderTitleTxt().getTextSize());
                }
            }
        });
    }

    private final void updateChartSettingsButtonVisibility() {
        ImageView imageView = this.toggleChartBtn;
        if (imageView != null) {
            imageView.setVisibility(this.allowCandlestickToggle ? 0 : 8);
        }
    }

    protected void updateCandlestickChartVisibility(boolean show) {
        CandlestickChartView candlestickChartView = this.candlestickChartView;
        Intrinsics.checkNotNull(candlestickChartView);
        if ((candlestickChartView.getVisibility() == 0) == show) {
            return;
        }
        getGraphView().setVisibility(!show ? 0 : 8);
        candlestickChartView.setVisibility(show ? 0 : 8);
        GraphData graphData = this.graphData;
        if (graphData != null) {
            if (getGraphView().getVisibility() == 0) {
                getGraphView().setData(graphData);
            }
            if (candlestickChartView.getVisibility() == 0) {
                candlestickChartView.setData(CandlestickMappers.deriveCandlestickData(graphData));
                updateCandlestickSpacing();
            }
        }
    }

    public static /* synthetic */ void showCandlestickChart$default(GraphLayout graphLayout, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showCandlestickChart");
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        graphLayout.showCandlestickChart(z, z2);
    }

    protected void showCandlestickChart(boolean show, boolean forceRefresh) {
        int toggleCandlestickIconRes;
        ImageView imageView = this.toggleChartBtn;
        if ((imageView == null || imageView.getVisibility() != 0) && !forceRefresh) {
            return;
        }
        ImageView imageView2 = this.toggleChartBtn;
        if (imageView2 != null) {
            imageView2.setSelected(show && this.allowCandlestickToggle);
        }
        ImageView imageView3 = this.toggleChartBtn;
        if (imageView3 != null) {
            if (show) {
                toggleCandlestickIconRes = C11048R.drawable.svg_ic_graph;
            } else {
                toggleCandlestickIconRes = getToggleCandlestickIconRes();
            }
            imageView3.setImageResource(toggleCandlestickIconRes);
        }
        updateCandlestickChartVisibility(show);
    }

    public void setChartSettingsEnabled() {
        ImageView imageView = this.chartSettingsButton;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = this.toggleChartBtn;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        updateCandlestickChartVisibility(getShowCandlestickChartPref().get());
    }

    public static /* synthetic */ void setCandlestickChartEnabled$default(GraphLayout graphLayout, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setCandlestickChartEnabled");
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        graphLayout.setCandlestickChartEnabled(z, z2);
    }

    public final void setCandlestickChartEnabled(boolean enable, boolean forceRefresh) {
        Boolean boolValueOf;
        ImageView imageView;
        this.allowCandlestickToggle = enable;
        ImageView imageView2 = this.chartSettingsButton;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        ImageView imageView3 = this.toggleChartBtn;
        boolean z = false;
        if (imageView3 != null) {
            boolValueOf = Boolean.valueOf(imageView3.getVisibility() == 0);
        } else {
            boolValueOf = null;
        }
        updateChartSettingsButtonVisibility();
        if (!Intrinsics.areEqual(boolValueOf, Boolean.TRUE) && (imageView = this.toggleChartBtn) != null && imageView.getVisibility() == 0) {
            AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_CHART_TOGGLE, AnalyticsStrings.BUTTON_CHART_TO_CANDLESTICKS, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        }
        if (enable && getShowCandlestickChartPref().get()) {
            z = true;
        }
        showCandlestickChart(z, forceRefresh);
    }

    protected void onGraphSelectionChanged(GraphSelection graphSelection) {
        Intrinsics.checkNotNullParameter(graphSelection, "graphSelection");
        this.graphSelection = graphSelection;
        this.graphData = null;
        resetDeltaText();
        RhTextView rhTextView = this.afterHoursTxt;
        if (rhTextView != null) {
            rhTextView.setText((CharSequence) null);
        }
        RhTextView rhTextView2 = this.afterHoursTxt;
        if (rhTextView2 != null) {
            rhTextView2.setContentDescription(null);
        }
        getGraphView().clear();
        CandlestickChartView candlestickChartView = this.candlestickChartView;
        if (candlestickChartView != null) {
            candlestickChartView.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setData(GraphLayoutViewModel viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Trace.beginSection("GraphLayout.setData");
        try {
            this.viewModel = viewModel;
            refreshUi();
            Unit unit = Unit.INSTANCE;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setGraphData(GraphData graphData) {
        Intrinsics.checkNotNullParameter(graphData, "graphData");
        Trace.beginSection("GraphLayout.setGraphData");
        try {
            this.graphData = graphData;
            if (getGraphView().getVisibility() == 0) {
                getGraphView().setData(graphData);
            }
            CandlestickChartView candlestickChartView = getCandlestickChartView();
            if (candlestickChartView != null && candlestickChartView.getVisibility() == 0) {
                CandlestickChartView candlestickChartView2 = getCandlestickChartView();
                Intrinsics.checkNotNull(candlestickChartView2);
                candlestickChartView2.setData(CandlestickMappers.deriveCandlestickData(graphData));
                updateCandlestickSpacing();
            }
            onGraphDataSet(graphData);
            refreshUi();
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCandlestickSpacing() {
        CandlestickChartView candlestickChartView = this.candlestickChartView;
        if (candlestickChartView == null) {
            return;
        }
        candlestickChartView.setCandleWidth(this.defaultCandlestickWidth);
        if (candlestickChartView.getSpacing() <= this.thinCandlestickSpacingThreshold) {
            candlestickChartView.setCandleWidth(this.thinCandlestickWidth);
        }
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.Clearable
    public void clear() {
        this.viewModel = null;
        this.scrubStartTimeForLogging = null;
        getTotalMoneyTxt().setText(null);
        RhTextView rhTextView = this.afterHoursTxt;
        if (rhTextView != null) {
            rhTextView.setText((CharSequence) null);
        }
        RhTextView rhTextView2 = this.afterHoursTxt;
        if (rhTextView2 != null) {
            rhTextView2.setContentDescription(null);
        }
        resetDeltaText();
        getGraphView().clear();
        getIntervalSelector().clear();
        showCandlestickChart$default(this, getShowCandlestickChartPref().get(), false, 2, null);
    }

    protected void refreshUi() throws Throwable {
        BigDecimal deltaValue;
        BigDecimal deltaPercent;
        BigDecimal totalValue;
        Money totalValue2;
        List<DataPoint> dataPoints;
        Trace.beginSection("GraphLayout.refreshUi");
        try {
            GraphLayoutViewModel viewModel = getViewModel();
            if (viewModel != null) {
                GraphData graphData = getGraphData();
                DataPoint dataPoint = null;
                BigDecimal fromPrice = graphData != null ? graphData.getFromPrice() : null;
                BigDecimal mostRecentPoint = viewModel.getMostRecentPoint();
                Integer scrubbedIndex = getGraphView().getScrubbedIndex();
                if (scrubbedIndex != null) {
                    int iIntValue = scrubbedIndex.intValue();
                    GraphData graphData2 = getGraphData();
                    if (graphData2 != null && (dataPoints = graphData2.getDataPoints()) != null) {
                        dataPoint = (DataPoint) CollectionsKt.getOrNull(dataPoints, iIntValue);
                    }
                }
                BigDecimal regularHoursPrice = (dataPoint != null && getGraphSelection().isOneDay() && dataPoint.getSession() == DataPoint.Session.AFTER_HOURS && (viewModel instanceof GraphLayoutViewModel.Asset)) ? ((GraphLayoutViewModel.Asset) viewModel).getRegularHoursPrice() : fromPrice;
                boolean z = false;
                boolean z2 = scrubbedIndex != null && scrubbedIndex.intValue() == 0;
                if (fromPrice != null) {
                    getDirectionStyleRelay().accept(mostRecentPoint.compareTo(fromPrice) >= 0 ? DirectionOverlay.POSITIVE : DirectionOverlay.NEGATIVE);
                    getOptionalDirectionStyleRelay().accept(Optional3.asOptional(mostRecentPoint.compareTo(fromPrice) >= 0 ? DirectionOverlay.POSITIVE : DirectionOverlay.NEGATIVE));
                }
                if (dataPoint == null || (deltaValue = dataPoint.getDeltaValue(z2, regularHoursPrice)) == null) {
                    deltaValue = viewModel.getDeltaValue(regularHoursPrice, getGraphSelection().isOneDay());
                }
                if (dataPoint == null) {
                    deltaPercent = viewModel.getDeltaPercent(regularHoursPrice, getGraphSelection().isOneDay());
                } else {
                    deltaPercent = dataPoint.getDeltaPercent(z2, regularHoursPrice);
                }
                BigDecimal bigDecimal = deltaPercent;
                if (dataPoint == null || (totalValue2 = dataPoint.getTotalValue(z2)) == null || (totalValue = Money3.getBigDecimalCompat(totalValue2)) == null) {
                    totalValue = viewModel.getTotalValue();
                }
                setTotalMoneyTxt(viewModel, totalValue);
                DataPoint dataPoint2 = dataPoint;
                try {
                    setDeltaInfoText(viewModel, getGraphData(), dataPoint2, deltaValue, bigDecimal);
                    setAfterHoursText(viewModel, getGraphData(), dataPoint2);
                    ImageView toggleChartBtn = getToggleChartBtn();
                    if (toggleChartBtn != null) {
                        if (getGraphView().getScrubbedIndex() == null) {
                            CandlestickChartView candlestickChartView = getCandlestickChartView();
                            Intrinsics.checkNotNull(candlestickChartView);
                            if (candlestickChartView.getScrubbedIndex() == -1) {
                                z = true;
                            }
                        }
                        toggleChartBtn.setEnabled(z);
                    }
                    if (getGraphView().getVisibility() != 0) {
                        refreshCandlestickScrubbing();
                    } else {
                        refreshGraphViewScrubbing();
                    }
                } catch (Throwable th) {
                    th = th;
                    Trace.endSection();
                    throw th;
                }
            }
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshCandlestickScrubbing() {
        String str;
        CandlestickChartView candlestickChartView = this.candlestickChartView;
        if (candlestickChartView != null) {
            int scrubbedIndex = candlestickChartView.getScrubbedIndex();
            boolean z = scrubbedIndex != -1;
            onCandlestickScrubStateChanged(z);
            GraphData graphData = this.graphData;
            if (graphData != null && z) {
                RhTextView rhTextView = this.candlestickScrubbedTxt;
                Intrinsics.checkNotNull(rhTextView);
                CandlestickChartView candlestickChartView2 = this.candlestickChartView;
                Intrinsics.checkNotNull(candlestickChartView2);
                CandlestickChartView.DataPoint dataPoint = candlestickChartView2.getDataPoint(scrubbedIndex);
                InstantFormatter instantFormatter = getInstantFormatter(graphData.getSelection());
                Duration durationBetween = Duration.between(dataPoint.getBeginAt(), dataPoint.getEndAt());
                Intrinsics.checkNotNullExpressionValue(durationBetween, "between(...)");
                if (!Intrinsics.areEqual(durationBetween, Durations.INSTANCE.getONE_DAY())) {
                    str = getStartInstantFormatter(dataPoint.getBeginAt(), dataPoint.getEndAt(), graphData.getSelection()).format((InstantFormatter) dataPoint.getBeginAt()) + " - " + getInstantFormatter(graphData.getSelection()).format((InstantFormatter) dataPoint.getEndAt());
                } else {
                    str = instantFormatter.format(dataPoint.getBeginAt());
                }
                rhTextView.setText(str);
                rhTextView.measure(View.MeasureSpec.makeMeasureSpec(candlestickChartView2.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(candlestickChartView2.getHeight(), Integer.MIN_VALUE));
                Float centerXValueForIndex = candlestickChartView2.getCenterXValueForIndex(scrubbedIndex);
                Intrinsics.checkNotNull(centerXValueForIndex);
                float fFloatValue = centerXValueForIndex.floatValue() - (rhTextView.getMeasuredWidth() / 2);
                float width = candlestickChartView2.getWidth() - rhTextView.getMeasuredWidth();
                ViewGroup.LayoutParams layoutParams = rhTextView.getLayoutParams();
                float f = width - ((layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null) != null ? r4.leftMargin : 0);
                ViewGroup.LayoutParams layoutParams2 = rhTextView.getLayoutParams();
                rhTextView.setTranslationX(RangesKt.coerceIn(fFloatValue, 0.0f, Math.max(0.0f, f - ((layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null) != null ? r7.rightMargin : 0))));
                ViewStubHolder<CandlestickDetailView> viewStubHolder = this.candlestickDetailViewStubHolder;
                Intrinsics.checkNotNull(viewStubHolder);
                ((CandlestickDetailView) viewStubHolder.get()).bind(new CandlestickDetailView.ViewModel(dataPoint.getOpenPrice(), dataPoint.getClosePrice(), dataPoint.getHighPrice(), dataPoint.getLowPrice(), dataPoint.getVolume()), getPriceFormat());
            }
        }
    }

    protected void onCandlestickScrubStateChanged(boolean scrubbing) {
        RhTextView rhTextView = this.candlestickScrubbedTxt;
        Intrinsics.checkNotNull(rhTextView);
        rhTextView.setVisibility(scrubbing ? 0 : 8);
        ViewStubHolder<CandlestickDetailView> viewStubHolder = this.candlestickDetailViewStubHolder;
        Intrinsics.checkNotNull(viewStubHolder);
        viewStubHolder.setVisible(scrubbing);
        getTotalMoneyTxt().setVisibility(scrubbing ? 4 : 0);
        getDeltaInfoTxt().setVisibility(scrubbing ? 4 : 0);
        RhTextView rhTextView2 = this.afterHoursTxt;
        if (rhTextView2 != null) {
            rhTextView2.setVisibility(scrubbing ? 4 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setHeaderTitleTxt(CharSequence title) {
        getHeaderTitleTxt().setText(title);
    }

    protected void setTotalMoneyTxt(GraphLayoutViewModel viewModel, BigDecimal price) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(price, "price");
        getTotalMoneyTxt().setStale(viewModel.isStale());
        getTotalMoneyTxt().setText(getPriceFormat().format(price));
    }

    protected void setDeltaInfoText(GraphLayoutViewModel viewModel, GraphData graphData, DataPoint selectedDataPoint, BigDecimal deltaValue, BigDecimal deltaPercent) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(deltaValue, "deltaValue");
        getDeltaInfoTxt().setStale(viewModel.isStale());
        setDeltaInfoText(getDeltaSummaryText(getDeltaText(deltaValue, deltaPercent), getTimeFrameText(graphData, selectedDataPoint), !BigDecimals7.isNegative(deltaValue), viewModel.isStale()));
    }

    protected final int getDeltaColor(boolean isUpOrFlat, boolean isStale) {
        if (isStale) {
            return getDeltaTextStaleColor();
        }
        if (isUpOrFlat) {
            return getDeltaTextPositiveColor();
        }
        return getDeltaTextNegativeColor();
    }

    private final CharSequence getDeltaSummaryText(String deltaText, String timeFrameText, boolean isUpOrFlat, boolean isStale) {
        int deltaColor = getDeltaColor(isUpOrFlat, isStale);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Object[] objArr = {getDeltaTextTypefaceSpan(), new ForegroundColorSpan(deltaColor)};
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) deltaText);
        for (int i = 0; i < 2; i++) {
            spannableStringBuilder.setSpan(objArr[i], length, spannableStringBuilder.length(), 17);
        }
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) timeFrameText);
        return new SpannedString(spannableStringBuilder);
    }

    private final void resetDeltaText() {
        setDeltaInfoText(PlaceholderUtils.XXShortPlaceholderText);
    }

    protected InstantFormatter getInstantFormatter(GraphSelection selection) {
        Intrinsics.checkNotNullParameter(selection, "selection");
        switch (WhenMappings.$EnumSwitchMapping$0[selection.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return InstantFormatter.SHORT_TIME_IN_SYSTEM_ZONE;
            case 5:
            case 6:
            case 7:
            case 8:
                return InstantFormatter.DATETIME_IN_SYSTEM_ZONE;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                return InstantFormatter.DATE_IN_UTC;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    protected InstantFormatter getStartInstantFormatter(Instant start, Instant end, GraphSelection selection) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        Intrinsics.checkNotNullParameter(selection, "selection");
        switch (WhenMappings.$EnumSwitchMapping$0[selection.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                LocalDateTime localDateTime$default = Instants.toLocalDateTime$default(start, null, 1, null);
                LocalDateTime localDateTime$default2 = Instants.toLocalDateTime$default(end, null, 1, null);
                if (Intrinsics.areEqual(localDateTime$default.mo3394a(), localDateTime$default2.mo3394a())) {
                    if (LocalDateTimes.getAmPm(localDateTime$default) == LocalDateTimes.getAmPm(localDateTime$default2)) {
                        return InstantFormatter.SHORT_TIME_IN_SYSTEM_ZONE_NO_AM_PM;
                    }
                    return InstantFormatter.SHORT_TIME_IN_SYSTEM_ZONE;
                }
                return getInstantFormatter(selection);
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                ZoneOffset UTC = ZoneOffset.UTC;
                Intrinsics.checkNotNullExpressionValue(UTC, "UTC");
                LocalDateTime localDateTime = Instants.toLocalDateTime(start, UTC);
                Intrinsics.checkNotNullExpressionValue(UTC, "UTC");
                if (localDateTime.getYear() == Instants.toLocalDateTime(end, UTC).getYear()) {
                    return InstantFormatter.DATE_NO_YEAR_IN_UTC;
                }
                return getInstantFormatter(selection);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAfterHoursText(GraphLayoutViewModel viewModel, GraphData graphData, DataPoint selectedDataPoint) {
        String str;
        RhTextView rhTextView = this.afterHoursTxt;
        if (rhTextView != null) {
            rhTextView.setStale(viewModel.isStale());
        }
        setAfterHoursText(null, null);
        if (graphData != null && graphData.getShowAfterHours() && this.graphSelection.isIntraday()) {
            BigDecimal afterHoursDeltaValue = viewModel.getAfterHoursDeltaValue();
            if (selectedDataPoint != null) {
                Instant time = selectedDataPoint.getTime(graphData.getInterval());
                if (getMarketHoursManager().isPreMarket(time)) {
                    str = this.preMarketLabel;
                } else {
                    str = INSTANCE.shouldShowAfterHoursLabel(getMarketHoursManager(), time, graphData) ? this.afterHoursLabel : null;
                }
                setAfterHoursText(str, null);
                return;
            }
            if (afterHoursDeltaValue != null) {
                String deltaText = getDeltaText(afterHoursDeltaValue, viewModel.getAfterHoursDeltaPercent());
                boolean z = !BigDecimals7.isNegative(afterHoursDeltaValue);
                setAfterHoursText(getDeltaSummaryText(deltaText, getMarketHoursManager().isPreMarket() ? this.preMarketLabel : this.afterHoursLabel, z, viewModel.isStale()), Boolean.valueOf(z));
            }
        }
    }

    public void setAfterHoursText(CharSequence text, Boolean isUp) {
        RhTextView rhTextView = this.afterHoursTxt;
        if (rhTextView != null) {
            rhTextView.setText(text);
        }
        RhTextView rhTextView2 = this.afterHoursTxt;
        if (rhTextView2 != null) {
            rhTextView2.setContentDescription(text != null ? new Regex("[()]").replace(text, "") : null);
        }
    }

    protected final String getDeltaText(BigDecimal deltaValue, BigDecimal deltaPercent) {
        Intrinsics.checkNotNullParameter(deltaValue, "deltaValue");
        if (deltaPercent == null) {
            return getPriceDeltaFormat().format(deltaValue);
        }
        return com.robinhood.utils.extensions.ViewsKt.getString(this, C20282R.string.delta_with_percent_change, getPriceDeltaFormat().format(deltaValue), getPercentDeltaFormat().format(deltaPercent));
    }

    protected String getTimeFrameText(GraphData graphData, DataPoint selectedDataPoint) {
        DataPoint firstHistorical;
        if (selectedDataPoint != null) {
            return getInstantFormatter(this.graphSelection).format(selectedDataPoint.getTime(graphData != null ? graphData.getInterval() : null));
        }
        switch (WhenMappings.$EnumSwitchMapping$0[this.graphSelection.ordinal()]) {
            case 1:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                return getGraphSelectionDisplayStrings(this.graphSelection);
            case 2:
            case 3:
            case 4:
                DataPoint lastHistorical = graphData != null ? graphData.getLastHistorical() : null;
                if (lastHistorical != null && !DataPoint.INSTANCE.isDataPointToday(lastHistorical, graphData.getInterval())) {
                    return InstantFormatter.DATE_IN_SYSTEM_ZONE.format((InstantFormatter) lastHistorical.getTime(graphData.getInterval()));
                }
                return getGraphSelectionDisplayStrings(this.graphSelection);
            case 18:
            case 19:
            case 20:
            case 21:
                if (graphData != null && (firstHistorical = graphData.getFirstHistorical()) != null) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String str = String.format(getGraphSelectionDisplayStrings(this.graphSelection), Arrays.copyOf(new Object[]{InstantFormatter.DATE_IN_UTC.format((InstantFormatter) firstHistorical.getTime(graphData.getInterval()))}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    return str;
                }
                return "";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final String getGraphSelectionDisplayStrings(GraphSelection graphSelection) throws Resources.NotFoundException {
        int i;
        Resources resources = getResources();
        switch (WhenMappings.$EnumSwitchMapping$0[graphSelection.ordinal()]) {
            case 1:
                i = C18339R.string.graph_interval_selection_summary_h;
                break;
            case 2:
            case 3:
            case 4:
                i = C18339R.string.graph_interval_selection_summary_d;
                break;
            case 5:
            case 6:
                i = C18339R.string.graph_interval_selection_summary_w;
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                i = C18339R.string.graph_interval_selection_summary_m;
                break;
            case 11:
            case 12:
                i = C18339R.string.graph_interval_selection_summary_3m;
                break;
            case 13:
                i = C18339R.string.graph_interval_selection_summary_ytd;
                break;
            case 14:
            case 15:
                i = C18339R.string.graph_interval_selection_summary_y;
                break;
            case 16:
            case 17:
                i = C18339R.string.graph_interval_selection_summary_5y;
                break;
            case 18:
            case 19:
            case 20:
            case 21:
                i = C18339R.string.graph_interval_selection_summary_other;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        String string2 = resources.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public final void setGraphSelectionFromAdapterOnly(GraphSelection graphSelection) {
        Intrinsics.checkNotNullParameter(graphSelection, "graphSelection");
        this.graphSelection = graphSelection;
        getIntervalSelector().setGraphSelectionFromAdapterOnly(graphSelection);
    }

    /* compiled from: GraphLayout.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/graph/GraphLayout$Companion;", "", "<init>", "()V", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "j$/time/Instant", "time", "Lcom/robinhood/android/graph/spark/GraphData;", "graphData", "", "shouldShowAfterHoursLabel", "(Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;Lj$/time/Instant;Lcom/robinhood/android/graph/spark/GraphData;)Z", "", "DEFAULT_HEADER_MAX_LINES", "I", "lib-graph_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean shouldShowAfterHoursLabel(TraderMarketHoursManager traderMarketHoursManager, Instant instant, GraphData graphData) {
            Instant regularClosesAt;
            MarketHours currentMarketHours = traderMarketHoursManager.getCurrentMarketHours();
            if (!currentMarketHours.isOpen()) {
                return false;
            }
            if (!graphData.getShouldUseLateCloseTimeForAfterHours() || (regularClosesAt = currentMarketHours.getLateOptionClosesAt()) == null) {
                regularClosesAt = currentMarketHours.getRegularClosesAt();
            }
            return regularClosesAt.compareTo(instant) < 0 && instant.compareTo(currentMarketHours.getExtendedClosesAt()) < 0;
        }
    }
}
