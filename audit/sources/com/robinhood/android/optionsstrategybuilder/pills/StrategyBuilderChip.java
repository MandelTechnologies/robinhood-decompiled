package com.robinhood.android.optionsstrategybuilder.pills;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.core.content.res.ResourcesCompat;
import com.robinhood.android.designsystem.container.RdsRippleContainerView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.font.C16915R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.optionsstrategybuilder.C24876R;
import com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderViewState;
import com.robinhood.android.optionsstrategybuilder.databinding.MergeStrategyBuilderChipBinding;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.datetime.LocalDates;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.extensions.ViewsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: StrategyBuilderChip.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0006\u0010\u0018\u001a\u00020\u0019J(\u0010\u001a\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0 R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/pills/StrategyBuilderChip;", "Lcom/robinhood/android/designsystem/container/RdsRippleContainerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/optionsstrategybuilder/databinding/MergeStrategyBuilderChipBinding;", "value", "Landroid/graphics/drawable/Drawable;", "iconDrawable", "getIconDrawable", "()Landroid/graphics/drawable/Drawable;", "setIconDrawable", "(Landroid/graphics/drawable/Drawable;)V", "normalTypeface", "Landroid/graphics/Typeface;", "selectedTypeface", "setSelected", "", "selected", "", "getDropdownIcon", "Landroid/widget/ImageView;", "setText", "pillName", "", "selectedChoice", "Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$Choice;", "pillChoices", "", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class StrategyBuilderChip extends RdsRippleContainerView {
    public static final int $stable = 8;
    private final MergeStrategyBuilderChipBinding binding;
    private final Typeface normalTypeface;
    private final Typeface selectedTypeface;

    public /* synthetic */ StrategyBuilderChip(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrategyBuilderChip(Context context, AttributeSet attributeSet) {
        super(new ScarletContextWrapper(context, null, new ThemedResourceReference(ResourceType.STYLE.INSTANCE, C20690R.attr.surfaceTheme), 2, null), attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, C24876R.layout.merge_strategy_builder_chip, this);
        MergeStrategyBuilderChipBinding mergeStrategyBuilderChipBindingBind = MergeStrategyBuilderChipBinding.bind(this);
        Intrinsics.checkNotNullExpressionValue(mergeStrategyBuilderChipBindingBind, "bind(...)");
        this.binding = mergeStrategyBuilderChipBindingBind;
        mergeStrategyBuilderChipBindingBind.chipImageView.setClipToOutline(true);
        this.normalTypeface = ResourcesCompat.getFont(context, C16915R.font.capsule_sans_text_book);
        this.selectedTypeface = ResourcesCompat.getFont(context, C16915R.font.capsule_sans_text_bold);
    }

    public final Drawable getIconDrawable() {
        return this.binding.chipImageView.getDrawable();
    }

    public final void setIconDrawable(Drawable drawable) {
        ImageView chipImageView = this.binding.chipImageView;
        Intrinsics.checkNotNullExpressionValue(chipImageView, "chipImageView");
        chipImageView.setVisibility(drawable != null ? 0 : 8);
        this.binding.chipImageView.setImageDrawable(drawable);
    }

    @Override // android.view.View
    public void setSelected(boolean selected) {
        Typeface typeface;
        Typeface typeface2;
        super.setSelected(selected);
        RhTextView rhTextView = this.binding.chipTextView;
        if (selected) {
            typeface = this.selectedTypeface;
        } else {
            typeface = this.normalTypeface;
        }
        rhTextView.setTypeface(typeface);
        RhTextView rhTextView2 = this.binding.chipSpacerTextView;
        if (selected) {
            typeface2 = this.selectedTypeface;
        } else {
            typeface2 = this.normalTypeface;
        }
        rhTextView2.setTypeface(typeface2);
    }

    public final ImageView getDropdownIcon() {
        ImageView chipDropdownImageView = this.binding.chipDropdownImageView;
        Intrinsics.checkNotNullExpressionValue(chipDropdownImageView, "chipDropdownImageView");
        return chipDropdownImageView;
    }

    public final void setText(String pillName, OptionStrategyBuilderViewState.Choice selectedChoice, List<? extends OptionStrategyBuilderViewState.Choice> pillChoices) {
        Object next;
        Intrinsics.checkNotNullParameter(pillChoices, "pillChoices");
        String strNullIfEmpty = StringsKt.nullIfEmpty(pillName);
        if (selectedChoice == null) {
            this.binding.chipTextView.setText(strNullIfEmpty);
            this.binding.chipSpacerTextView.setText(strNullIfEmpty);
            return;
        }
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        String string2 = selectedChoice.toString(resources, true);
        if (strNullIfEmpty != null) {
            string2 = ViewsKt.getString(this, C24876R.string.option_strategy_filter_pill_name, pillName, string2);
        }
        this.binding.chipTextView.setText(string2);
        RhTextView rhTextView = this.binding.chipSpacerTextView;
        if (selectedChoice instanceof OptionStrategyBuilderViewState.Choice.DateChoice) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : pillChoices) {
                if (obj instanceof OptionStrategyBuilderViewState.Choice.DateChoice) {
                    arrayList.add(obj);
                }
            }
            ArrayList<OptionStrategyBuilderViewState.Choice.DateChoice> arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (true) {
                next = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next2 = it.next();
                OptionStrategyBuilderViewState.Choice.DateChoice dateChoice = (OptionStrategyBuilderViewState.Choice.DateChoice) next2;
                int year = LocalDates.currentDateInEst$default(null, 1, null).getYear();
                if ((((OptionStrategyBuilderViewState.Choice.DateChoice) selectedChoice).getDate().getYear() == year) == (dateChoice.getDate().getYear() == year)) {
                    arrayList2.add(next2);
                }
            }
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            for (OptionStrategyBuilderViewState.Choice.DateChoice dateChoice2 : arrayList2) {
                Resources resources2 = getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                arrayList3.add(dateChoice2.toString(resources2, true));
            }
            Iterator it2 = arrayList3.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    float fMeasureText = this.binding.chipTextView.getPaint().measureText((String) next);
                    do {
                        Object next3 = it2.next();
                        float fMeasureText2 = this.binding.chipTextView.getPaint().measureText((String) next3);
                        if (Float.compare(fMeasureText, fMeasureText2) < 0) {
                            next = next3;
                            fMeasureText = fMeasureText2;
                        }
                    } while (it2.hasNext());
                }
            }
            String str = (String) next;
            if (str != null) {
                string2 = str;
            }
        }
        rhTextView.setText(string2);
    }
}
