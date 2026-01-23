package com.robinhood.android.optionsstrategybuilder.pickers;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.robinhood.android.common.p088ui.view.RhTabLayout;
import com.robinhood.android.optionsstrategybuilder.C24876R;
import com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderViewState;
import com.robinhood.android.optionsstrategybuilder.pills.PillView;
import com.robinhood.utils.p409ui.view.Inflater;
import com.truelayer.payments.p419ui.components.inputs.form.models.Fields4;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DatePickerTabLayout.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/pickers/DatePickerTabLayout;", "Lcom/robinhood/android/common/ui/view/RhTabLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "selectedTabText", "", "getSelectedTabText", "()Ljava/lang/String;", "selectTab", "", "tab", "Lcom/google/android/material/tabs/TabLayout$Tab;", "updateIndicator", "", Fields4.TYPE, "selectorArgs", "Lcom/robinhood/android/optionsstrategybuilder/pills/PillView$SelectorArgs;", "initialize", "Companion", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class DatePickerTabLayout extends RhTabLayout {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = RhTabLayout.$stable;

    /* compiled from: DatePickerTabLayout.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PillView.DisabledMode.values().length];
            try {
                iArr[PillView.DisabledMode.FIRST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PillView.DisabledMode.LAST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ DatePickerTabLayout(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final String getSelectedTabText() {
        CharSequence text;
        TabLayout.Tab tabAt = getTabAt(getSelectedTabPosition());
        if (tabAt == null || (text = tabAt.getText()) == null) {
            return null;
        }
        return text.toString();
    }

    @Override // com.google.android.material.tabs.TabLayout
    public void selectTab(final TabLayout.Tab tab, final boolean updateIndicator) {
        TabLayout.Tab tabAt = getTabAt(getSelectedTabPosition());
        final boolean z = false;
        if (tabAt != null) {
            INSTANCE.setTextUsingTag(tabAt, false);
        }
        if (tab != null) {
            INSTANCE.setTextUsingTag(tab, true);
        }
        if (tabAt != null && !Intrinsics.areEqual(tabAt, tab)) {
            z = true;
        }
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.robinhood.android.optionsstrategybuilder.pickers.DatePickerTabLayout$selectTab$listener$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                this.this$0.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                super/*com.google.android.material.tabs.TabLayout*/.selectTab(tab, updateIndicator);
                if (z) {
                    this.this$0.performHapticFeedback(1);
                }
            }
        });
    }

    public final void select(PillView.SelectorArgs selectorArgs) {
        Intrinsics.checkNotNullParameter(selectorArgs, "selectorArgs");
        OptionStrategyBuilderViewState.Choice selectedChoice = selectorArgs.getSelectedChoice();
        if (selectedChoice instanceof OptionStrategyBuilderViewState.Choice.DateChoice) {
            Iterator<OptionStrategyBuilderViewState.Choice> it = selectorArgs.getChoices().iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (Intrinsics.areEqual(it.next(), selectedChoice)) {
                    break;
                } else {
                    i++;
                }
            }
            selectTab(getTabAt(i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void initialize(PillView.SelectorArgs selectorArgs) {
        Intrinsics.checkNotNullParameter(selectorArgs, "selectorArgs");
        int i = 0;
        for (Object obj : selectorArgs.getChoices()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            OptionStrategyBuilderViewState.Choice choice = (OptionStrategyBuilderViewState.Choice) obj;
            PillView.DisabledMode disabledIndex = selectorArgs.getDisabledIndex();
            int i3 = disabledIndex == null ? -1 : WhenMappings.$EnumSwitchMapping$0[disabledIndex.ordinal()];
            final boolean z = true;
            if (i3 != -1) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (i == CollectionsKt.getLastIndex(selectorArgs.getChoices())) {
                        z = false;
                    }
                } else if (i != 0) {
                }
            }
            TabLayout.Tab tabNewTab = newTab();
            Intrinsics.checkNotNullExpressionValue(tabNewTab, "newTab(...)");
            tabNewTab.setTag(choice);
            INSTANCE.setTextUsingTag(tabNewTab, false);
            tabNewTab.view.setEnabled(z);
            RhTabLayout.INSTANCE.updateTabTextView(tabNewTab, new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.pickers.DatePickerTabLayout$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return DatePickerTabLayout.initialize$lambda$2$lambda$1(z, (TextView) obj2);
                }
            });
            addTab(tabNewTab, Intrinsics.areEqual(choice, selectorArgs.getSelectedChoice()));
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initialize$lambda$2$lambda$1(boolean z, TextView it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setEnabled(z);
        return Unit.INSTANCE;
    }

    /* compiled from: DatePickerTabLayout.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0011\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0096\u0001¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/pickers/DatePickerTabLayout$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/optionsstrategybuilder/pickers/DatePickerTabLayout;", "<init>", "()V", "setTextUsingTag", "", "Lcom/google/android/material/tabs/TabLayout$Tab;", "includeTimeToExp", "", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<DatePickerTabLayout> {
        private final /* synthetic */ Inflater<DatePickerTabLayout> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public DatePickerTabLayout inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (DatePickerTabLayout) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C24876R.layout.include_date_picker_tab_layout);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void setTextUsingTag(TabLayout.Tab tab, boolean z) {
            Object tag = tab.getTag();
            OptionStrategyBuilderViewState.Choice choice = tag instanceof OptionStrategyBuilderViewState.Choice ? (OptionStrategyBuilderViewState.Choice) tag : null;
            if (choice == null) {
                return;
            }
            Resources resources = tab.view.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            tab.setText(choice.toString(resources, z));
        }
    }
}
