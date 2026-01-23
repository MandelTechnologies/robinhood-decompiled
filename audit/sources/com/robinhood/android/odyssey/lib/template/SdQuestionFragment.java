package com.robinhood.android.odyssey.lib.template;

import android.telephony.PhoneNumberUtils;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.lib.odyssey.databinding.FragmentSdQuestionBinding;
import com.robinhood.android.odyssey.lib.Constants4;
import com.robinhood.android.odyssey.lib.view.SdButton;
import com.robinhood.android.odyssey.lib.view.SdTextView;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.serverdrivenui.page.ApiSdQuestionPage;
import com.robinhood.utils.extensions.StringsKt;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: SdQuestionFragment.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0014J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0014J\f\u0010\u0017\u001a\u00020\u0018*\u00020\u0018H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/SdQuestionFragment;", "Lcom/robinhood/android/odyssey/lib/template/BaseSdTemplateFragment;", "Lcom/robinhood/models/api/serverdrivenui/page/ApiSdQuestionPage;", "<init>", "()V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "binding", "Lcom/robinhood/android/lib/odyssey/databinding/FragmentSdQuestionBinding;", "getBinding", "()Lcom/robinhood/android/lib/odyssey/databinding/FragmentSdQuestionBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", "pageData", "onLoading", "loading", "", "fromE164ToNanpPhoneNumberWithCountryCode", "", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class SdQuestionFragment extends BaseSdTemplateFragment<ApiSdQuestionPage> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SdQuestionFragment.class, "binding", "getBinding()Lcom/robinhood/android/lib/odyssey/databinding/FragmentSdQuestionBinding;", 0))};
    public static final int $stable = 8;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public ExperimentsStore experimentsStore;

    public SdQuestionFragment() {
        super(C20335R.layout.fragment_sd_question);
        this.binding = ViewBinding5.viewBinding(this, SdQuestionFragment2.INSTANCE);
    }

    public final ExperimentsStore getExperimentsStore() {
        ExperimentsStore experimentsStore = this.experimentsStore;
        if (experimentsStore != null) {
            return experimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentsStore");
        return null;
    }

    public final void setExperimentsStore(ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "<set-?>");
        this.experimentsStore = experimentsStore;
    }

    private final FragmentSdQuestionBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentSdQuestionBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment
    public void bind(ApiSdQuestionPage pageData) {
        String phoneNumberOverride;
        Intrinsics.checkNotNullParameter(pageData, "pageData");
        ApiSdQuestionPage.Components components = pageData.getComponents();
        FragmentSdQuestionBinding binding = getBinding();
        TemplateUtil.bindOnNotNull(binding.sdQuestionTitle, components.getTitle());
        TemplateUtil.bindOnNotNull(binding.sdQuestionSubtitle, components.getSubtitle());
        TemplateUtil.bindOnNotNull(binding.sdQuestionDisclosure, components.getDisclosure());
        TemplateUtil.bindOnNotNull(binding.sdQuestionPrimaryCta, components.getPrimary_cta());
        TemplateUtil.bindOnNotNull(binding.sdQuestionSecondaryCta, components.getSecondary_cta());
        TemplateUtil.bindOnNotNull(binding.sdQuestionBodyBtn, components.getBody_button());
        TemplateUtil.bindOnNotNull(binding.sdQuestionBodyText, components.getBody_text());
        TemplateUtil.bindOnNotNull(binding.sdQuestionAlert, components.getAlert());
        if (!Intrinsics.areEqual(getPageKey(), Constants4.PAGE_KEY_CONFIRM_PHONE_NUMBER) || getPhoneNumberOverride() == null) {
            return;
        }
        SdTextView sdTextView = binding.sdQuestionBodyText;
        String phoneNumberOverride2 = getPhoneNumberOverride();
        Intrinsics.checkNotNull(phoneNumberOverride2);
        String numberToE164 = PhoneNumberUtils.formatNumberToE164(phoneNumberOverride2, Locale.US.getCountry());
        if (numberToE164 == null || (phoneNumberOverride = fromE164ToNanpPhoneNumberWithCountryCode(numberToE164)) == null) {
            phoneNumberOverride = getPhoneNumberOverride();
            Intrinsics.checkNotNull(phoneNumberOverride);
        }
        sdTextView.setText(phoneNumberOverride);
    }

    @Override // com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment
    protected void onLoading(boolean loading) {
        FragmentSdQuestionBinding binding = getBinding();
        super.onLoading(loading);
        SdButton sdQuestionPrimaryCta = binding.sdQuestionPrimaryCta;
        Intrinsics.checkNotNullExpressionValue(sdQuestionPrimaryCta, "sdQuestionPrimaryCta");
        SdButton sdQuestionSecondaryCta = binding.sdQuestionSecondaryCta;
        Intrinsics.checkNotNullExpressionValue(sdQuestionSecondaryCta, "sdQuestionSecondaryCta");
        CtaLoadingUtils.configCtasOnLoading(sdQuestionPrimaryCta, sdQuestionSecondaryCta, loading);
    }

    private final String fromE164ToNanpPhoneNumberWithCountryCode(String str) {
        String strSubstring = str.substring(0, 2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring + PlaceholderUtils.XXShortPlaceholderText + StringsKt.fromE164ToNanpPhoneNumber(str);
    }
}
