package com.robinhood.android.slip.onboarding.agreements;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.slip.C28532R;
import com.robinhood.android.slip.databinding.RowSlipAgreementBinding;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Inflater;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: SlipAgreementRow.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/agreements/SlipAgreementRow;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "binding", "Lcom/robinhood/android/slip/databinding/RowSlipAgreementBinding;", "getBinding", "()Lcom/robinhood/android/slip/databinding/RowSlipAgreementBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", "expandableAgreement", "Lcom/robinhood/android/slip/onboarding/agreements/ExpandableAgreement;", "Companion", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SlipAgreementRow extends Hammer_SlipAgreementRow {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public Markwon markwon;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SlipAgreementRow.class, "binding", "getBinding()Lcom/robinhood/android/slip/databinding/RowSlipAgreementBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlipAgreementRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewBinding5.viewBinding(this, SlipAgreementRow2.INSTANCE);
        ViewGroups.inflate(this, C28532R.layout.row_slip_agreement, true);
        setOrientation(1);
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

    private final RowSlipAgreementBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (RowSlipAgreementBinding) value;
    }

    public final void bind(ExpandableAgreement expandableAgreement) {
        Intrinsics.checkNotNullParameter(expandableAgreement, "expandableAgreement");
        RowSlipAgreementBinding binding = getBinding();
        binding.headerRow.setPogNumber(Integer.valueOf(expandableAgreement.getPogNumber()));
        binding.headerRow.setPrimaryText(expandableAgreement.getAgreement().getTitle());
        binding.body.setText(getMarkwon().toMarkdown(expandableAgreement.getAgreement().getBodyMarkdown()));
    }

    /* compiled from: SlipAgreementRow.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/agreements/SlipAgreementRow$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/slip/onboarding/agreements/SlipAgreementRow;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<SlipAgreementRow> {
        private final /* synthetic */ Inflater<SlipAgreementRow> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public SlipAgreementRow inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (SlipAgreementRow) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C28532R.layout.include_row_slip_agreement);
        }
    }
}
