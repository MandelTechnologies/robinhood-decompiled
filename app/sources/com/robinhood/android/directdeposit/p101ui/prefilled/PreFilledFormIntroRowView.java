package com.robinhood.android.directdeposit.p101ui.prefilled;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.directdeposit.C14044R;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PreFilledFormIntroRowView.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormIntroRowView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "numberTxt", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getNumberTxt$feature_direct_deposit_externalDebug", "()Landroid/widget/TextView;", "titleTxt", "getTitleTxt$feature_direct_deposit_externalDebug", "descriptionTxt", "getDescriptionTxt$feature_direct_deposit_externalDebug", "Companion", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class PreFilledFormIntroRowView extends ConstraintLayout {
    private final TextView descriptionTxt;
    private final TextView numberTxt;
    private final TextView titleTxt;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ PreFilledFormIntroRowView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreFilledFormIntroRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C14044R.layout.merge_pre_filled_form_intro_row, true);
        this.numberTxt = (TextView) findViewById(C14044R.id.number_txt);
        this.titleTxt = (TextView) findViewById(C14044R.id.title_txt);
        this.descriptionTxt = (TextView) findViewById(C14044R.id.description_txt);
    }

    /* renamed from: getNumberTxt$feature_direct_deposit_externalDebug, reason: from getter */
    public final TextView getNumberTxt() {
        return this.numberTxt;
    }

    /* renamed from: getTitleTxt$feature_direct_deposit_externalDebug, reason: from getter */
    public final TextView getTitleTxt() {
        return this.titleTxt;
    }

    /* renamed from: getDescriptionTxt$feature_direct_deposit_externalDebug, reason: from getter */
    public final TextView getDescriptionTxt() {
        return this.descriptionTxt;
    }

    /* compiled from: PreFilledFormIntroRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormIntroRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormIntroRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<PreFilledFormIntroRowView> {
        private final /* synthetic */ Inflater<PreFilledFormIntroRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public PreFilledFormIntroRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (PreFilledFormIntroRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C14044R.layout.include_pre_filled_form_intro_row);
        }
    }
}
