package com.robinhood.android.securitycenter.p251ui.data.personal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.securitycenter.C28186R;
import com.robinhood.android.securitycenter.databinding.ItemPersonalDataRequestDetailsBinding;
import com.robinhood.models.p355ui.UiPersonalDataRequestDetailsItem;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: PersonalDataRequestDetailsItemView.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u000fR\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataRequestDetailsItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/securitycenter/databinding/ItemPersonalDataRequestDetailsBinding;", "getBinding", "()Lcom/robinhood/android/securitycenter/databinding/ItemPersonalDataRequestDetailsBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", "content", "Lcom/robinhood/models/ui/UiPersonalDataRequestDetailsItem;", "isExpanded", "", "flipToggleImage", "Companion", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class PersonalDataRequestDetailsItemView extends ConstraintLayout {
    public static final float IMAGE_ROTATION_DEGREES = 180.0f;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PersonalDataRequestDetailsItemView.class, "binding", "getBinding()Lcom/robinhood/android/securitycenter/databinding/ItemPersonalDataRequestDetailsBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalDataRequestDetailsItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.binding = ViewBinding5.viewBinding(this, PersonalDataRequestDetailsItemView2.INSTANCE);
    }

    private final ItemPersonalDataRequestDetailsBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ItemPersonalDataRequestDetailsBinding) value;
    }

    public final void bind(UiPersonalDataRequestDetailsItem content, boolean isExpanded) {
        Intrinsics.checkNotNullParameter(content, "content");
        ItemPersonalDataRequestDetailsBinding binding = getBinding();
        binding.detailsHeader.setPrimaryText(isExpanded ? content.getBoldedHeader() : content.getHeader());
        binding.detailsBody.setText(content.getBody());
        binding.detailsBody.setVisibility(isExpanded ? 0 : 8);
        binding.detailsToggleImage.setRotation(isExpanded ? 180.0f : 0.0f);
    }

    public final void flipToggleImage() {
        getBinding().detailsToggleImage.animate().rotation(getBinding().detailsToggleImage.getRotation() + 180.0f).setDuration(500L);
    }

    /* compiled from: PersonalDataRequestDetailsItemView.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0096\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataRequestDetailsItemView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataRequestDetailsItemView;", "<init>", "()V", "IMAGE_ROTATION_DEGREES", "", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<PersonalDataRequestDetailsItemView> {
        private final /* synthetic */ Inflater<PersonalDataRequestDetailsItemView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public PersonalDataRequestDetailsItemView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (PersonalDataRequestDetailsItemView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C28186R.layout.item_personal_data_request_details);
        }
    }
}
