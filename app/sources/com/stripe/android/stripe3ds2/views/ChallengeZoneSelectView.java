package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.core.os.Bundle2;
import androidx.core.os.BundleCompat;
import androidx.core.widget.CompoundButtonCompat;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.stripe.android.stripe3ds2.R$dimen;
import com.stripe.android.stripe3ds2.R$id;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeZoneMultiSelectViewBinding;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeZoneSingleSelectViewBinding;
import com.stripe.android.stripe3ds2.init.p418ui.ButtonCustomization;
import com.stripe.android.stripe3ds2.init.p418ui.LabelCustomization;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.PrimitiveIterators6;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: ChallengeZoneSelectView.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 F2\u00020\u00012\u00020\u0002:\u0001FB1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0019\u001a\u00020\u00182\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00162\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001f\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0014¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00182\u0006\u0010'\u001a\u00020$H\u0014¢\u0006\u0004\b(\u0010)R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b\n\u0010+R\u001a\u0010-\u001a\u00020,8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u00102\u001a\u0002018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0014\u00106\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00108\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00107R\u0014\u00109\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00107R\u0014\u0010:\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00107R\u0014\u0010=\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u001b\u0010A\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010>\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0017\u0010C\u001a\b\u0012\u0004\u0012\u00020\r0\u00168F¢\u0006\u0006\u001a\u0004\bB\u0010@R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00070\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bD\u0010@¨\u0006G"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;", "Landroid/widget/FrameLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "", "isSingleSelectMode", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IZ)V", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption;", AnalyticsStrings.BUTTON_AUTOMATIC_DEPOSIT_FREQUENCY_SELECTION_OPTION, "Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;", "buttonCustomization", "lastButton", "Landroid/widget/CompoundButton;", "buildButton$3ds2sdk_release", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption;Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;Z)Landroid/widget/CompoundButton;", "buildButton", "", "options", "", "setChallengeSelectOptions", "(Ljava/util/List;Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;)V", "", AnnotatedPrivateKey.LABEL, "Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;", "labelCustomization", "setTextEntryLabel", "(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;)V", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "selectOption", "(I)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "Z", "()Z", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "infoLabel", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "getInfoLabel$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "Landroid/widget/LinearLayout;", "selectGroup", "Landroid/widget/LinearLayout;", "getSelectGroup$3ds2sdk_release", "()Landroid/widget/LinearLayout;", "buttonBottomMargin", "I", "buttonLabelPadding", "buttonOffsetMargin", "buttonMinHeight", "getUserEntry", "()Ljava/lang/String;", "userEntry", "Landroid/widget/CheckBox;", "getCheckBoxes", "()Ljava/util/List;", "checkBoxes", "getSelectedOptions", "selectedOptions", "getSelectedIndexes$3ds2sdk_release", "selectedIndexes", "Companion", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class ChallengeZoneSelectView extends FrameLayout {
    private static final Companion Companion = new Companion(null);
    private final int buttonBottomMargin;
    private final int buttonLabelPadding;
    private final int buttonMinHeight;
    private final int buttonOffsetMargin;
    private final ThreeDS2TextView infoLabel;
    private final boolean isSingleSelectMode;
    private final LinearLayout selectGroup;

    public /* synthetic */ ChallengeZoneSelectView(Context context, AttributeSet attributeSet, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? false : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ChallengeZoneSelectView(Context context, AttributeSet attributeSet, int i, boolean z) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isSingleSelectMode = z;
        if (getId() == -1) {
            setId(R$id.stripe_3ds2_default_challenge_zone_select_view_id);
        }
        this.buttonBottomMargin = context.getResources().getDimensionPixelSize(R$dimen.stripe_3ds2_challenge_zone_select_button_vertical_margin);
        this.buttonLabelPadding = context.getResources().getDimensionPixelSize(R$dimen.stripe_3ds2_challenge_zone_select_button_label_padding);
        this.buttonOffsetMargin = context.getResources().getDimensionPixelSize(R$dimen.stripe_3ds2_challenge_zone_select_button_offset_margin);
        this.buttonMinHeight = context.getResources().getDimensionPixelSize(R$dimen.stripe_3ds2_challenge_zone_select_button_min_height);
        if (z) {
            StripeChallengeZoneSingleSelectViewBinding stripeChallengeZoneSingleSelectViewBindingInflate = StripeChallengeZoneSingleSelectViewBinding.inflate(LayoutInflater.from(context), this, true);
            Intrinsics.checkNotNullExpressionValue(stripeChallengeZoneSingleSelectViewBindingInflate, "inflate(...)");
            ThreeDS2TextView label = stripeChallengeZoneSingleSelectViewBindingInflate.label;
            Intrinsics.checkNotNullExpressionValue(label, "label");
            this.infoLabel = label;
            RadioGroup selectGroup = stripeChallengeZoneSingleSelectViewBindingInflate.selectGroup;
            Intrinsics.checkNotNullExpressionValue(selectGroup, "selectGroup");
            this.selectGroup = selectGroup;
            return;
        }
        StripeChallengeZoneMultiSelectViewBinding stripeChallengeZoneMultiSelectViewBindingInflate = StripeChallengeZoneMultiSelectViewBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(stripeChallengeZoneMultiSelectViewBindingInflate, "inflate(...)");
        ThreeDS2TextView label2 = stripeChallengeZoneMultiSelectViewBindingInflate.label;
        Intrinsics.checkNotNullExpressionValue(label2, "label");
        this.infoLabel = label2;
        LinearLayout selectGroup2 = stripeChallengeZoneMultiSelectViewBindingInflate.selectGroup;
        Intrinsics.checkNotNullExpressionValue(selectGroup2, "selectGroup");
        this.selectGroup = selectGroup2;
    }

    /* renamed from: getInfoLabel$3ds2sdk_release, reason: from getter */
    public final ThreeDS2TextView getInfoLabel() {
        return this.infoLabel;
    }

    /* renamed from: getSelectGroup$3ds2sdk_release, reason: from getter */
    public final LinearLayout getSelectGroup() {
        return this.selectGroup;
    }

    public String getUserEntry() {
        return CollectionsKt.joinToString$default(getSelectedOptions(), ",", null, null, 0, null, new Function1<ChallengeResponseData.ChallengeSelectOption, CharSequence>() { // from class: com.stripe.android.stripe3ds2.views.ChallengeZoneSelectView$userEntry$1
            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(ChallengeResponseData.ChallengeSelectOption it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getName();
            }
        }, 30, null);
    }

    public final List<CheckBox> getCheckBoxes() {
        if (this.isSingleSelectMode) {
            return null;
        }
        PrimitiveRanges2 primitiveRanges2Until = RangesKt.until(0, this.selectGroup.getChildCount());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(primitiveRanges2Until, 10));
        Iterator<Integer> it = primitiveRanges2Until.iterator();
        while (it.hasNext()) {
            View childAt = this.selectGroup.getChildAt(((PrimitiveIterators6) it).nextInt());
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.CheckBox");
            arrayList.add((CheckBox) childAt);
        }
        return arrayList;
    }

    public final List<ChallengeResponseData.ChallengeSelectOption> getSelectedOptions() {
        List<Integer> selectedIndexes$3ds2sdk_release = getSelectedIndexes$3ds2sdk_release();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(selectedIndexes$3ds2sdk_release, 10));
        Iterator<T> it = selectedIndexes$3ds2sdk_release.iterator();
        while (it.hasNext()) {
            Object tag = this.selectGroup.getChildAt(((Number) it.next()).intValue()).getTag();
            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.stripe.android.stripe3ds2.transactions.ChallengeResponseData.ChallengeSelectOption");
            arrayList.add((ChallengeResponseData.ChallengeSelectOption) tag);
        }
        return arrayList;
    }

    public final List<Integer> getSelectedIndexes$3ds2sdk_release() {
        PrimitiveRanges2 primitiveRanges2Until = RangesKt.until(0, this.selectGroup.getChildCount());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = primitiveRanges2Until.iterator();
        while (it.hasNext()) {
            int iNextInt = ((PrimitiveIterators6) it).nextInt();
            View childAt = this.selectGroup.getChildAt(iNextInt);
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.CompoundButton");
            Integer numValueOf = ((CompoundButton) childAt).isChecked() ? Integer.valueOf(iNextInt) : null;
            if (numValueOf != null) {
                arrayList.add(numValueOf);
            }
        }
        return CollectionsKt.take(arrayList, this.isSingleSelectMode ? 1 : arrayList.size());
    }

    public final CompoundButton buildButton$3ds2sdk_release(ChallengeResponseData.ChallengeSelectOption option, ButtonCustomization buttonCustomization, boolean lastButton) {
        CompoundButton materialCheckBox;
        Intrinsics.checkNotNullParameter(option, "option");
        if (this.isSingleSelectMode) {
            materialCheckBox = new MaterialRadioButton(getContext());
        } else {
            materialCheckBox = new MaterialCheckBox(getContext());
        }
        if (buttonCustomization != null) {
            String backgroundColor = buttonCustomization.getBackgroundColor();
            if (backgroundColor != null && !StringsKt.isBlank(backgroundColor)) {
                CompoundButtonCompat.setButtonTintList(materialCheckBox, ColorStateList.valueOf(Color.parseColor(buttonCustomization.getBackgroundColor())));
            }
            String textColor = buttonCustomization.getTextColor();
            if (textColor != null && !StringsKt.isBlank(textColor)) {
                materialCheckBox.setTextColor(Color.parseColor(buttonCustomization.getTextColor()));
            }
        }
        materialCheckBox.setId(View.generateViewId());
        materialCheckBox.setTag(option);
        materialCheckBox.setText(option.getText());
        materialCheckBox.setPadding(this.buttonLabelPadding, materialCheckBox.getPaddingTop(), materialCheckBox.getPaddingRight(), materialCheckBox.getPaddingBottom());
        materialCheckBox.setMinimumHeight(this.buttonMinHeight);
        RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
        if (!lastButton) {
            layoutParams.bottomMargin = this.buttonBottomMargin;
        }
        layoutParams.leftMargin = this.buttonOffsetMargin;
        materialCheckBox.setLayoutParams(layoutParams);
        return materialCheckBox;
    }

    public final void setChallengeSelectOptions(List<ChallengeResponseData.ChallengeSelectOption> options, ButtonCustomization buttonCustomization) {
        if (options != null) {
            int size = options.size();
            Iterator<Integer> it = RangesKt.until(0, size).iterator();
            while (it.hasNext()) {
                int iNextInt = ((PrimitiveIterators6) it).nextInt();
                ChallengeResponseData.ChallengeSelectOption challengeSelectOption = options.get(iNextInt);
                boolean z = true;
                if (iNextInt != size - 1) {
                    z = false;
                }
                this.selectGroup.addView(buildButton$3ds2sdk_release(challengeSelectOption, buttonCustomization, z));
            }
        }
    }

    public final void setTextEntryLabel(String label, LabelCustomization labelCustomization) {
        if (label == null || StringsKt.isBlank(label)) {
            this.infoLabel.setVisibility(8);
        } else {
            this.infoLabel.setText(label, labelCustomization);
        }
    }

    public final void selectOption(int index) {
        View childAt = this.selectGroup.getChildAt(index);
        Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.CompoundButton");
        ((CompoundButton) childAt).setChecked(true);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return Bundle2.bundleOf(Tuples4.m3642to("state_super", super.onSaveInstanceState()), Tuples4.m3642to("state_selected_indexes", new ArrayList(getSelectedIndexes$3ds2sdk_release())));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof Bundle) {
            Bundle bundle = (Bundle) state;
            super.onRestoreInstanceState((Parcelable) BundleCompat.getParcelable(bundle, "state_super", Parcelable.class));
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("state_selected_indexes");
            if (integerArrayList != null) {
                for (Integer num : integerArrayList) {
                    Intrinsics.checkNotNull(num);
                    selectOption(num.intValue());
                }
                return;
            }
            return;
        }
        super.onRestoreInstanceState(state);
    }

    /* compiled from: ChallengeZoneSelectView.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView$Companion;", "", "()V", "STATE_SELECTED_INDEXED", "", "STATE_SUPER", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
