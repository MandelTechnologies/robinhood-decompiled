package com.robinhood.android.common.history.p082ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.ViewGroup2;
import androidx.fragment.app.FragmentManager;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.history.C11183R;
import com.robinhood.android.common.history.p082ui.HistoryRowView;
import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.android.common.p088ui.BindViewDelegate2;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.Views;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.designsystem.text.ThemableColorSpans3;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.font.CustomTypefaceSpan;
import com.robinhood.android.font.RhTypeface;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.navigation.app.keys.data.DetailErrorType;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.rosetta.eventlogging.ComboOrderDetailContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.history.navigation.HistoryNavigator;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: HistoryRowView.kt */
@Metadata(m3635d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 m2\u00020\u00012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\u0004\u0018\u0001`\u00050\u0002:\u0002lmB\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010H\u001a\u00020IH\u0014J\u0010\u0010J\u001a\u00020I2\u0006\u0010K\u001a\u00020LH\u0002J*\u0010M\u001a\u00020I2\u0006\u0010N\u001a\u00020\u00122\u0006\u0010O\u001a\u00020P2\u0010\u0010Q\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005H\u0002J\u0010\u0010R\u001a\u00020I2\u0006\u0010O\u001a\u00020PH\u0002J\"\u0010S\u001a\u00020I2\u0006\u0010N\u001a\u00020\u00122\u0006\u0010T\u001a\u00020\r2\b\b\u0002\u0010U\u001a\u00020\rH\u0002J\u0018\u0010V\u001a\u00020I2\u0006\u0010N\u001a\u00020\u00122\u0006\u0010T\u001a\u00020\rH\u0002J(\u0010W\u001a\u00020I2\u0006\u0010N\u001a\u00020\u00122\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020\r2\u0006\u0010[\u001a\u00020\rH\u0002J$\u0010\\\u001a\u00020I2\u0006\u0010N\u001a\u00020\u00122\b\u0010]\u001a\u0004\u0018\u00010^2\b\u0010_\u001a\u0004\u0018\u00010`H\u0002J8\u0010a\u001a\u00020b2\u0006\u0010_\u001a\u00020`2\b\b\u0002\u0010c\u001a\u00020%2\b\b\u0002\u0010d\u001a\u00020%2\b\b\u0002\u0010e\u001a\u00020%2\b\b\u0002\u0010f\u001a\u00020%H\u0002J\u0018\u0010g\u001a\u00020I2\u0006\u0010N\u001a\u00020\u00122\u0006\u0010O\u001a\u00020hH\u0002J\u001a\u0010i\u001a\u00020I2\u0006\u0010j\u001a\u00020\r2\b\b\u0002\u0010U\u001a\u00020\rH\u0002J\u000e\u0010k\u001a\u00020I2\u0006\u0010(\u001a\u00020)J\u001e\u0010J\u001a\u00020I2\u0014\u0010K\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\u0004\u0018\u0001`\u0005H\u0016R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0018\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u000e\u0010(\u001a\u00020)X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010*\u001a\u00020+8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u000e\u00100\u001a\u000201X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u00102\u001a\u0002038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001e\u00108\u001a\u0002098\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001c\u0010>\u001a\u0004\u0018\u00010?X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\u000eR$\u0010F\u001a\u00020\r2\u0006\u0010E\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u0010\u000e\"\u0004\bG\u0010\u0010¨\u0006n"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/HistoryRowView;", "Landroid/widget/LinearLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "Lcom/robinhood/shared/models/history/shared/GenericStatefulHistoryEvent;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "isFromCryptoSource", "", "()Z", "setFromCryptoSource", "(Z)V", "primaryRow", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "getPrimaryRow", "()Lcom/robinhood/android/designsystem/row/RdsRowView;", "primaryRow$delegate", "Lkotlin/properties/ReadOnlyProperty;", "pendingCryptoOrderRow", "getPendingCryptoOrderRow", "pendingCryptoOrderRow$delegate", "loadingRow", "Landroid/view/View;", "getLoadingRow", "()Landroid/view/View;", "loadingRow$delegate", "primaryRows", "", "getPrimaryRows", "()Ljava/util/List;", "primaryRowIds", "", "", "getPrimaryRowIds", "()Ljava/util/Set;", "source", "", "duxo", "Lcom/robinhood/android/common/history/ui/HistoryRowDuxo;", "getDuxo", "()Lcom/robinhood/android/common/history/ui/HistoryRowDuxo;", "setDuxo", "(Lcom/robinhood/android/common/history/ui/HistoryRowDuxo;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "historyNavigator", "Lcom/robinhood/shared/history/navigation/HistoryNavigator;", "getHistoryNavigator", "()Lcom/robinhood/shared/history/navigation/HistoryNavigator;", "setHistoryNavigator", "(Lcom/robinhood/shared/history/navigation/HistoryNavigator;)V", "callbacks", "Lcom/robinhood/android/common/history/ui/HistoryRowView$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/common/history/ui/HistoryRowView$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/common/history/ui/HistoryRowView$Callbacks;)V", "isLast", "value", "isPlaceholder", "setPlaceholder", "onAttachedToWindow", "", "bind", "state", "Lcom/robinhood/android/common/history/ui/HistoryRowDataState;", "bindExpandableRows", "row", ErrorBundle.SUMMARY_ENTRY, "Lcom/robinhood/android/common/history/ui/format/TransactionSummary;", "statefulHistoryEvent", "bindLogging", "bindIsExpanded", "isExpanded", "animate", "bindExpandableIcon", "bindPrimaryMetadataText", "component", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$MetadataPrimaryComponent;", "enabled", "hasCompletedExceptionally", "bindSecondaryMetadataText", "secondaryMetadataText", "", "icon", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Icon;", "buildInlineImageSpan", "Landroid/text/style/ImageSpan;", "leftBound", "topBound", "rightBound", "bottomBound", "bindSecondaryRowIcon", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$SecondarySummary;", "setSecondaryRowVisibility", "isVisible", "bindSource", "Callbacks", "Companion", "lib-history-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class HistoryRowView extends Hammer_HistoryRowView implements Bindable<StatefulHistoryEvent<? extends HistoryEvent>> {
    private static final long ANIMATION_DURATION = 200;
    public AnalyticsLogger analytics;
    private Callbacks callbacks;
    public HistoryRowDuxo duxo;
    public HistoryNavigator historyNavigator;
    private boolean isFromCryptoSource;

    /* renamed from: loadingRow$delegate, reason: from kotlin metadata */
    private final Interfaces2 loadingRow;
    private final Navigator navigator;

    /* renamed from: pendingCryptoOrderRow$delegate, reason: from kotlin metadata */
    private final Interfaces2 pendingCryptoOrderRow;

    /* renamed from: primaryRow$delegate, reason: from kotlin metadata */
    private final Interfaces2 primaryRow;
    private String source;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(HistoryRowView.class, "primaryRow", "getPrimaryRow()Lcom/robinhood/android/designsystem/row/RdsRowView;", 0)), Reflection.property1(new PropertyReference1Impl(HistoryRowView.class, "pendingCryptoOrderRow", "getPendingCryptoOrderRow()Lcom/robinhood/android/designsystem/row/RdsRowView;", 0)), Reflection.property1(new PropertyReference1Impl(HistoryRowView.class, "loadingRow", "getLoadingRow()Landroid/view/View;", 0))};
    public static final int $stable = 8;

    /* compiled from: HistoryRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/HistoryRowView$Callbacks;", "", "doOnTransactionDetailRequested", "", "historyEvent", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "onSummaryBadgeClicked", "lib-history-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void doOnTransactionDetailRequested(HistoryEvent historyEvent);

        void onSummaryBadgeClicked(HistoryEvent historyEvent);
    }

    /* compiled from: HistoryRowView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TransactionSummary.LayoutType.values().length];
            try {
                iArr[TransactionSummary.LayoutType.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransactionSummary.LayoutType.PENDING_CRYPTO_ORDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TransactionSummary.SecondarySummaryState.values().length];
            try {
                iArr2[TransactionSummary.SecondarySummaryState.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[TransactionSummary.SecondarySummaryState.COMPLETED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TransactionSummary.SecondarySummaryState.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public /* synthetic */ HistoryRowView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoryRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(1);
        ViewGroups.inflate(this, C11183R.layout.merge_new_history_row, true);
        this.primaryRow = BindViewDelegate2.bindView$default(this, C11183R.id.new_history_primary_row, null, 2, null);
        this.pendingCryptoOrderRow = BindViewDelegate2.bindView$default(this, C11183R.id.new_history_pending_crypto_order_row, null, 2, null);
        this.loadingRow = BindViewDelegate2.bindView$default(this, C11183R.id.new_history_loading_row, null, 2, null);
        this.source = AnalyticsStrings.BUTTON_GROUP_TITLE_HISTORY;
        this.navigator = Views.baseActivity(this).getNavigator();
    }

    /* renamed from: isFromCryptoSource, reason: from getter */
    public final boolean getIsFromCryptoSource() {
        return this.isFromCryptoSource;
    }

    public final void setFromCryptoSource(boolean z) {
        this.isFromCryptoSource = z;
    }

    private final RdsRowView getPrimaryRow() {
        return (RdsRowView) this.primaryRow.getValue(this, $$delegatedProperties[0]);
    }

    private final RdsRowView getPendingCryptoOrderRow() {
        return (RdsRowView) this.pendingCryptoOrderRow.getValue(this, $$delegatedProperties[1]);
    }

    private final View getLoadingRow() {
        return (View) this.loadingRow.getValue(this, $$delegatedProperties[2]);
    }

    private final List<RdsRowView> getPrimaryRows() {
        return CollectionsKt.listOf((Object[]) new RdsRowView[]{getPrimaryRow(), getPendingCryptoOrderRow()});
    }

    private final Set<Integer> getPrimaryRowIds() {
        List<RdsRowView> primaryRows = getPrimaryRows();
        LinkedHashSet linkedHashSet = primaryRows instanceof Collection ? new LinkedHashSet(primaryRows.size()) : new LinkedHashSet();
        Iterator<T> it = primaryRows.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(Integer.valueOf(((RdsRowView) it.next()).getId()));
        }
        Set<Integer> setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(...)");
        return setUnmodifiableSet;
    }

    public final HistoryRowDuxo getDuxo() {
        HistoryRowDuxo historyRowDuxo = this.duxo;
        if (historyRowDuxo != null) {
            return historyRowDuxo;
        }
        Intrinsics.throwUninitializedPropertyAccessException("duxo");
        return null;
    }

    public final void setDuxo(HistoryRowDuxo historyRowDuxo) {
        Intrinsics.checkNotNullParameter(historyRowDuxo, "<set-?>");
        this.duxo = historyRowDuxo;
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    public final HistoryNavigator getHistoryNavigator() {
        HistoryNavigator historyNavigator = this.historyNavigator;
        if (historyNavigator != null) {
            return historyNavigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("historyNavigator");
        return null;
    }

    public final void setHistoryNavigator(HistoryNavigator historyNavigator) {
        Intrinsics.checkNotNullParameter(historyNavigator, "<set-?>");
        this.historyNavigator = historyNavigator;
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    private final boolean isLast() {
        int iIndexOfChild;
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null || (iIndexOfChild = viewGroup.indexOfChild(this)) < 0) {
            return false;
        }
        View childAt = viewGroup.getChildAt(iIndexOfChild + 1);
        return (childAt instanceof HistoryRowView ? (HistoryRowView) childAt : null) == null;
    }

    public final boolean isPlaceholder() {
        return isEnabled();
    }

    public final void setPlaceholder(boolean z) {
        getLoadingRow().setVisibility(z ? 0 : 8);
        if (z) {
            for (RdsRowView rdsRowView : getPrimaryRows()) {
                rdsRowView.setVisibility(8);
                rdsRowView.setPrimaryText(null);
                rdsRowView.setSecondaryText(null);
                rdsRowView.setMetadataPrimaryText(null);
                rdsRowView.setMetadataSecondaryText(null);
            }
        }
        setEnabled(!z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), this, false, 2, null).subscribeKotlin(new C112061(this));
    }

    /* compiled from: HistoryRowView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.history.ui.HistoryRowView$onAttachedToWindow$1 */
    /* synthetic */ class C112061 extends FunctionReferenceImpl implements Function1<HistoryRowDataState, Unit> {
        C112061(Object obj) {
            super(1, obj, HistoryRowView.class, "bind", "bind(Lcom/robinhood/android/common/history/ui/HistoryRowDataState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HistoryRowDataState historyRowDataState) {
            invoke2(historyRowDataState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(HistoryRowDataState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((HistoryRowView) this.receiver).bind(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(final HistoryRowDataState state) {
        final RdsRowView primaryRow;
        final TransactionSummary summary = state.getSummary();
        final StatefulHistoryEvent<HistoryEvent> statefulHistoryEvent = state.getStatefulHistoryEvent();
        boolean z = true;
        if (summary == null || statefulHistoryEvent == null) {
            setPlaceholder(true);
            Iterator<T> it = getPrimaryRows().iterator();
            while (it.hasNext()) {
                ((RdsRowView) it.next()).setOnClickListener(null);
            }
            return;
        }
        setPlaceholder(false);
        int i = WhenMappings.$EnumSwitchMapping$0[summary.getLayoutType().ordinal()];
        if (i == 1) {
            primaryRow = getPrimaryRow();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            primaryRow = getPendingCryptoOrderRow();
        }
        for (RdsRowView rdsRowView : getPrimaryRows()) {
            rdsRowView.setVisibility(rdsRowView.getId() == primaryRow.getId() ? 0 : 8);
        }
        primaryRow.setPrimaryText(summary.getPrimaryText());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(summary.getSecondaryText());
        TransactionSummary.Badge badge = summary.getBadge();
        if (badge != null) {
            CharSequence charSequenceComponent1 = badge.getText();
            TransactionSummary.Tint tintComponent2 = badge.getTint();
            final boolean zComponent3 = badge.getHighlight();
            spannableStringBuilder.append((CharSequence) ViewsKt.getString(primaryRow, C11183R.string.transaction_history_badge_separator));
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            RhTypeface rhTypeface = RhTypeface.BOLD;
            Context context = primaryRow.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            listCreateListBuilder.add(new CustomTypefaceSpan(rhTypeface.load(context)));
            listCreateListBuilder.add(new ThemableColorSpans3(tintComponent2.getColorReference()));
            if (this.callbacks != null) {
                listCreateListBuilder.add(new ClickableSpan() { // from class: com.robinhood.android.common.history.ui.HistoryRowView$bind$3$1$1$spans$1$1
                    @Override // android.text.style.ClickableSpan
                    public void onClick(View v) {
                        Intrinsics.checkNotNullParameter(v, "v");
                        HistoryRowView.Callbacks callbacks = this.this$0.getCallbacks();
                        if (callbacks != null) {
                            callbacks.onSummaryBadgeClicked(state.getStatefulHistoryEvent().getHistoryEvent());
                        }
                    }

                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public void updateDrawState(TextPaint ds) {
                        Intrinsics.checkNotNullParameter(ds, "ds");
                        ds.setFakeBoldText(zComponent3);
                        ds.setUnderlineText(zComponent3);
                    }
                });
            }
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) CollectionsKt.build(listCreateListBuilder).toArray(new CharacterStyle[0]);
            Object[] objArrCopyOf = Arrays.copyOf(characterStyleArr, characterStyleArr.length);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(charSequenceComponent1);
            for (Object obj : objArrCopyOf) {
                spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 17);
            }
        }
        primaryRow.setSecondaryText(new SpannedString(spannableStringBuilder));
        bindPrimaryMetadataText(primaryRow, summary.getMetadataPrimaryComponent(), !summary.getMetadataTextDisabled(), summary.getHasCompletedExceptionally());
        bindSecondaryMetadataText(primaryRow, summary.getMetadataSecondaryText(), summary.getMetadataSecondaryTextIcon());
        if (summary.getSecondarySummaryRows().isEmpty()) {
            OnClickListeners.onClick(primaryRow, new Function0() { // from class: com.robinhood.android.common.history.ui.HistoryRowView$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HistoryRowView.bind$lambda$10$lambda$9(summary, this, statefulHistoryEvent, primaryRow);
                }
            });
            primaryRow.setShowBottomDivider(!isLast());
        } else {
            if (!statefulHistoryEvent.isExpanded() && isLast()) {
                z = false;
            }
            primaryRow.setShowBottomDivider(z);
        }
        bindExpandableRows(primaryRow, summary, statefulHistoryEvent);
        bindLogging(summary);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$10$lambda$9(TransactionSummary transactionSummary, final HistoryRowView historyRowView, StatefulHistoryEvent historyEvent3, RdsRowView rdsRowView) {
        final TransactionReference transactionReference = transactionSummary.getTransactionReference();
        if (transactionReference != null) {
            Callbacks callbacks = historyRowView.callbacks;
            if (callbacks != null) {
                callbacks.doOnTransactionDetailRequested(historyEvent3.getHistoryEvent());
            }
            Navigator navigator = historyRowView.navigator;
            Context context = rdsRowView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            HistoryRowCallbackExtensions.navigateToTransactionDetails(navigator, context, historyRowView.getHistoryNavigator(), transactionReference, historyRowView.isFromCryptoSource, new Function0() { // from class: com.robinhood.android.common.history.ui.HistoryRowView$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HistoryRowView.bind$lambda$10$lambda$9$lambda$8(this.f$0, transactionReference);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$10$lambda$9$lambda$8(HistoryRowView historyRowView, TransactionReference transactionReference) {
        AnalyticsLogger analytics = historyRowView.getAnalytics();
        String str = historyRowView.source;
        String strName = transactionReference.getSourceType().name();
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = strName.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(analytics, str, lowerCase, transactionReference.getSourceId().toString(), null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
        com.robinhood.android.autoeventlogging.ViewsKt.logTap(historyRowView);
        return Unit.INSTANCE;
    }

    private final void bindExpandableRows(final RdsRowView row, TransactionSummary summary, final StatefulHistoryEvent<? extends HistoryEvent> statefulHistoryEvent) {
        List<TransactionSummary.SecondarySummary> secondarySummaryRows = summary.getSecondarySummaryRows();
        removeViews(getPrimaryRows().size(), getChildCount() - getPrimaryRows().size());
        if (secondarySummaryRows.isEmpty()) {
            row.setTrailingIconDrawable(null);
            return;
        }
        int size = secondarySummaryRows.size();
        for (int i = 0; i < size; i++) {
            ViewGroups.inflate(this, C11183R.layout.merge_new_history_secondary_row, true);
        }
        int i2 = 0;
        for (View view : ViewGroup2.getChildren(this)) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            View view2 = view;
            if (!getPrimaryRowIds().contains(Integer.valueOf(view2.getId()))) {
                final TransactionSummary.SecondarySummary secondarySummary = secondarySummaryRows.get(i2 - getPrimaryRows().size());
                Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type com.robinhood.android.designsystem.row.RdsRowView");
                final RdsRowView rdsRowView = (RdsRowView) view2;
                bindSecondaryRowIcon(rdsRowView, secondarySummary);
                rdsRowView.setPrimaryText(secondarySummary.getPrimaryText());
                bindPrimaryMetadataText(rdsRowView, secondarySummary.getMetadataPrimaryComponent(), !secondarySummary.getMetadataTextDisabled(), false);
                bindSecondaryMetadataText(rdsRowView, secondarySummary.getMetadataSecondaryText(), secondarySummary.getMetadataSecondaryTextIcon());
                OnClickListeners.onClick(rdsRowView, new Function0() { // from class: com.robinhood.android.common.history.ui.HistoryRowView$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HistoryRowView.bindExpandableRows$lambda$14$lambda$13$lambda$12(secondarySummary, this, statefulHistoryEvent, rdsRowView);
                    }
                });
            }
            i2 = i3;
        }
        bindIsExpanded$default(this, row, statefulHistoryEvent.isExpanded(), false, 4, null);
        OnClickListeners.onClick(row, new Function0() { // from class: com.robinhood.android.common.history.ui.HistoryRowView$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HistoryRowView.bindExpandableRows$lambda$15(statefulHistoryEvent, this, row);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindExpandableRows$lambda$14$lambda$13$lambda$12(TransactionSummary.SecondarySummary secondarySummary, HistoryRowView historyRowView, StatefulHistoryEvent historyEvent3, RdsRowView rdsRowView) {
        TransactionReference transactionReference = secondarySummary.getTransactionReference();
        DetailErrorType detailErrorType = secondarySummary.getDetailErrorType();
        if (transactionReference != null) {
            Callbacks callbacks = historyRowView.callbacks;
            if (callbacks != null) {
                callbacks.doOnTransactionDetailRequested(historyEvent3.getHistoryEvent());
            }
            FragmentKey fragmentKeyResolve$default = HistoryNavigator.resolve$default(historyRowView.getHistoryNavigator(), transactionReference, historyRowView.isFromCryptoSource, false, 4, null);
            Navigator navigator = historyRowView.navigator;
            Context context = rdsRowView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Navigator.DefaultImpls.showFragment$default(navigator, context, fragmentKeyResolve$default, false, false, false, null, false, null, false, false, null, null, 4092, null);
        } else if (detailErrorType != null) {
            FragmentManager supportFragmentManager = Views.baseActivity(rdsRowView).getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            Navigator navigator2 = historyRowView.navigator;
            Context context2 = rdsRowView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Navigator.DefaultImpls.createDialogFragment$default(navigator2, new LegacyDialogFragmentKey.DetailError(context2, supportFragmentManager, detailErrorType), null, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindExpandableRows$lambda$15(StatefulHistoryEvent historyEvent3, HistoryRowView historyRowView, RdsRowView rdsRowView) {
        historyEvent3.setExpanded(!historyEvent3.isExpanded());
        historyRowView.bindIsExpanded(rdsRowView, historyEvent3.isExpanded(), true);
        com.robinhood.android.autoeventlogging.ViewsKt.logTap(historyRowView);
        if (!historyEvent3.isExpanded()) {
            rdsRowView.animateMetadataIn();
        } else {
            rdsRowView.animateMetadataOut();
        }
        return Unit.INSTANCE;
    }

    private final void bindLogging(TransactionSummary summary) {
        final TransactionReference transactionReference = summary.getTransactionReference();
        if (transactionReference != null) {
            final boolean z = transactionReference.getSourceType() == HistoryTransactionType.COMBO_ORDER;
            com.robinhood.android.autoeventlogging.ViewsKt.eventData$default(this, false, new Function0() { // from class: com.robinhood.android.common.history.ui.HistoryRowView$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HistoryRowView.bindLogging$lambda$16(z, transactionReference);
                }
            }, 1, null);
            com.robinhood.android.autoeventlogging.ViewsKt.setLoggingConfig(this, new AutoLoggingConfig(false, false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor bindLogging$lambda$16(boolean z, TransactionReference transactionReference) {
        UserInteractionEventData.Action action;
        ComboOrderDetailContext comboOrderDetailContext;
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
        ComboOrderDetailContext comboOrderDetailContext2 = comboOrderDetailContext;
        return new UserInteractionEventDescriptor(null, null, action2, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, lowerCase, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, comboOrderDetailContext2, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16375, null), component, null, 35, null);
    }

    static /* synthetic */ void bindIsExpanded$default(HistoryRowView historyRowView, RdsRowView rdsRowView, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        historyRowView.bindIsExpanded(rdsRowView, z, z2);
    }

    private final void bindIsExpanded(RdsRowView row, boolean isExpanded, boolean animate) {
        bindExpandableIcon(row, isExpanded);
        setSecondaryRowVisibility(isExpanded, animate);
    }

    private final void bindExpandableIcon(RdsRowView row, boolean isExpanded) {
        int i;
        if (isExpanded) {
            i = C11183R.drawable.inset_caret_up_16dp;
        } else {
            i = C11183R.drawable.inset_caret_down_16dp;
        }
        row.setTrailingIconDrawable(ViewsKt.getDrawable(this, i));
    }

    private final void bindPrimaryMetadataText(RdsRowView row, TransactionSummary.MetadataPrimaryComponent component, boolean enabled, boolean hasCompletedExceptionally) {
        CharSequence spannedString;
        if (component instanceof TransactionSummary.Icon) {
            ImageSpan imageSpanBuildInlineImageSpan$default = buildInlineImageSpan$default(this, (TransactionSummary.Icon) component, 0, 0, getResources().getDimensionPixelOffset(C11183R.dimen.history_row_primary_metadata_icon_size), getResources().getDimensionPixelOffset(C11183R.dimen.history_row_primary_metadata_icon_size), 6, null);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) PlaceholderUtils.XXShortPlaceholderText);
            spannableStringBuilder.setSpan(imageSpanBuildInlineImageSpan$default, length, spannableStringBuilder.length(), 17);
            spannedString = new SpannedString(spannableStringBuilder);
        } else if (component instanceof TransactionSummary.MetadataPrimaryComponent.Text) {
            if (hasCompletedExceptionally) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                ThemableColorSpans3 themableColorSpans3 = new ThemableColorSpans3(ThemeAttributes.INSTANCE.getCOLOR_FOREGROUND_2());
                int length2 = spannableStringBuilder2.length();
                spannableStringBuilder2.append(((TransactionSummary.MetadataPrimaryComponent.Text) component).getText());
                spannableStringBuilder2.setSpan(themableColorSpans3, length2, spannableStringBuilder2.length(), 17);
                spannedString = new SpannedString(spannableStringBuilder2);
            } else {
                spannedString = ((TransactionSummary.MetadataPrimaryComponent.Text) component).getText();
            }
        } else {
            if (!(component instanceof TransactionSummary.MetadataPrimaryComponent.IconText)) {
                throw new NoWhenBranchMatchedException();
            }
            TransactionSummary.MetadataPrimaryComponent.IconText iconText = (TransactionSummary.MetadataPrimaryComponent.IconText) component;
            ImageSpan imageSpanBuildInlineImageSpan$default2 = buildInlineImageSpan$default(this, iconText.getIcon(), 0, 0, getResources().getDimensionPixelOffset(C11183R.dimen.history_row_primary_metadata_icon_size), getResources().getDimensionPixelOffset(C11183R.dimen.history_row_primary_metadata_icon_size), 6, null);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            int length3 = spannableStringBuilder3.length();
            spannableStringBuilder3.append((CharSequence) PlaceholderUtils.XXShortPlaceholderText);
            spannableStringBuilder3.setSpan(imageSpanBuildInlineImageSpan$default2, length3, spannableStringBuilder3.length(), 17);
            spannableStringBuilder3.append((CharSequence) (PlaceholderUtils.XXShortPlaceholderText + ((Object) iconText.getText())));
            spannedString = new SpannedString(spannableStringBuilder3);
        }
        row.setMetadataPrimaryText(spannedString);
        row.setMetadataEnabled(enabled);
    }

    private final void bindSecondaryMetadataText(RdsRowView row, CharSequence secondaryMetadataText, TransactionSummary.Icon icon) {
        if (icon != null) {
            ImageSpan imageSpanBuildInlineImageSpan$default = buildInlineImageSpan$default(this, icon, 0, 0, getResources().getDimensionPixelOffset(C11183R.dimen.history_row_secondary_metadata_icon_size), getResources().getDimensionPixelOffset(C11183R.dimen.history_row_secondary_metadata_icon_size), 6, null);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) PlaceholderUtils.XXShortPlaceholderText);
            spannableStringBuilder.setSpan(imageSpanBuildInlineImageSpan$default, length, spannableStringBuilder.length(), 17);
            spannableStringBuilder.append((CharSequence) (PlaceholderUtils.XXShortPlaceholderText + ((Object) secondaryMetadataText)));
            secondaryMetadataText = new SpannedString(spannableStringBuilder);
        }
        row.setMetadataSecondaryText(secondaryMetadataText);
    }

    static /* synthetic */ ImageSpan buildInlineImageSpan$default(HistoryRowView historyRowView, TransactionSummary.Icon icon, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i = 0;
        }
        if ((i5 & 4) != 0) {
            i2 = 0;
        }
        if ((i5 & 8) != 0) {
            i3 = 0;
        }
        if ((i5 & 16) != 0) {
            i4 = 0;
        }
        return historyRowView.buildInlineImageSpan(icon, i, i2, i3, i4);
    }

    private final ImageSpan buildInlineImageSpan(TransactionSummary.Icon icon, int leftBound, int topBound, int rightBound, int bottomBound) throws Resources.NotFoundException {
        Drawable drawable = getResources().getDrawable(icon.getAsset().getResourceId());
        drawable.setColorFilter(new PorterDuffColorFilter(getResources().getColor(icon.getTint().getRes()), PorterDuff.Mode.SRC_IN));
        drawable.setBounds(leftBound, topBound, rightBound, bottomBound);
        return new ImageSpan(drawable, Build.VERSION.SDK_INT >= 29 ? 2 : 0);
    }

    private final void bindSecondaryRowIcon(RdsRowView row, TransactionSummary.SecondarySummary summary) {
        int i = WhenMappings.$EnumSwitchMapping$1[summary.getState().ordinal()];
        if (i == 1) {
            row.setLeadingIconDrawable(ViewsKt.getDrawable(row, C11183R.drawable.inset_dot_16dp));
            Context context = row.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            row.setLeadingIconTint(ColorStateList.valueOf(ThemeColors.getThemeColor(context, C20690R.attr.colorBackground3)));
            return;
        }
        if (i == 2) {
            row.setLeadingIconDrawable(ViewsKt.getDrawable(row, C11183R.drawable.inset_checkmark_12dp));
            Context context2 = row.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            row.setLeadingIconTint(ColorStateList.valueOf(ThemeColors.getThemeColor(context2, C20690R.attr.colorPositive)));
            return;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        row.setLeadingIconDrawable(ViewsKt.getDrawable(row, C11183R.drawable.inset_exclamation_16dp));
        Context context3 = row.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        row.setLeadingIconTint(ColorStateList.valueOf(ThemeColors.getThemeColor(context3, C20690R.attr.colorNegative)));
    }

    static /* synthetic */ void setSecondaryRowVisibility$default(HistoryRowView historyRowView, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        historyRowView.setSecondaryRowVisibility(z, z2);
    }

    private final void setSecondaryRowVisibility(final boolean isVisible, boolean animate) {
        int i = 0;
        for (View view : ViewGroup2.getChildren(this)) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final View view2 = view;
            if (!getPrimaryRowIds().contains(Integer.valueOf(view2.getId()))) {
                if (!animate) {
                    view2.setVisibility(isVisible ? 0 : 8);
                } else {
                    view2.animate().alpha(isVisible ? 1.0f : 0.0f).setDuration(200L).withStartAction(new Runnable() { // from class: com.robinhood.android.common.history.ui.HistoryRowView$setSecondaryRowVisibility$1$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean z = isVisible;
                            if (z) {
                                view2.setVisibility(z ? 0 : 8);
                            }
                        }
                    }).withEndAction(new Runnable() { // from class: com.robinhood.android.common.history.ui.HistoryRowView$setSecondaryRowVisibility$1$2
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean z = isVisible;
                            if (z) {
                                return;
                            }
                            view2.setVisibility(z ? 0 : 8);
                        }
                    }).start();
                }
            }
            i = i2;
        }
    }

    public final void bindSource(String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(StatefulHistoryEvent<? extends HistoryEvent> state) {
        getDuxo().setTarget(state);
    }
}
