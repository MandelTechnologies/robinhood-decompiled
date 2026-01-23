package com.stripe.android.view;

import android.R;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.Interfaces3;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* compiled from: BecsDebitMandateAcceptanceTextView.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR+\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m3636d2 = {"Lcom/stripe/android/view/BecsDebitMandateAcceptanceTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/stripe/android/view/BecsDebitMandateAcceptanceTextFactory;", "factory", "Lcom/stripe/android/view/BecsDebitMandateAcceptanceTextFactory;", "", "<set-?>", "companyName$delegate", "Lkotlin/properties/ReadWriteProperty;", "getCompanyName", "()Ljava/lang/String;", "setCompanyName", "(Ljava/lang/String;)V", "companyName", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class BecsDebitMandateAcceptanceTextView extends AppCompatTextView {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(BecsDebitMandateAcceptanceTextView.class, "companyName", "getCompanyName()Ljava/lang/String;", 0))};
    public static final int $stable = 8;

    /* renamed from: companyName$delegate, reason: from kotlin metadata */
    private final Interfaces3 companyName;
    private final BecsDebitMandateAcceptanceTextFactory factory;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BecsDebitMandateAcceptanceTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BecsDebitMandateAcceptanceTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.textViewStyle : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BecsDebitMandateAcceptanceTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.factory = new BecsDebitMandateAcceptanceTextFactory(context);
        setMovementMethod(LinkMovementMethod.getInstance());
        Delegates delegates = Delegates.INSTANCE;
        final String str = "";
        this.companyName = new ObservableProperty<String>(str) { // from class: com.stripe.android.view.BecsDebitMandateAcceptanceTextView$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, String oldValue, String newValue) {
                CharSequence charSequenceCreate;
                Intrinsics.checkNotNullParameter(property, "property");
                String str2 = newValue;
                BecsDebitMandateAcceptanceTextView becsDebitMandateAcceptanceTextView = this;
                if (StringsKt.isBlank(str2)) {
                    str2 = null;
                }
                if (str2 == null || (charSequenceCreate = this.factory.create(str2)) == null) {
                    charSequenceCreate = "";
                }
                becsDebitMandateAcceptanceTextView.setText(charSequenceCreate);
            }
        };
    }

    public final String getCompanyName() {
        return (String) this.companyName.getValue(this, $$delegatedProperties[0]);
    }

    public final void setCompanyName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.companyName.setValue(this, $$delegatedProperties[0], str);
    }
}
