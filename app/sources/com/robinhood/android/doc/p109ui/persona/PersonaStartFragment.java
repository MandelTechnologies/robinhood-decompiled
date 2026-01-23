package com.robinhood.android.doc.p109ui.persona;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.extensions.TextViewsKt;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.doc.C14254R;
import com.robinhood.android.doc.databinding.FragmentPersonaStartBinding;
import com.robinhood.android.doc.event.DocUploadDestination;
import com.robinhood.android.doc.p109ui.persona.PersonaStartEvent;
import com.robinhood.android.doc.p109ui.persona.PersonaStartFragment;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.extensions.LottieAnimationViewsKt;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.common.strings.C32428R;
import com.robinhood.models.api.ColorTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.documents.lib.docupload.DocUploadEvent;
import com.robinhood.shared.documents.lib.docupload.DocUploadEventReceiver;
import com.robinhood.shared.documents.lib.docupload.DocumentBasedPersonaScreenContent;
import com.robinhood.shared.documents.lib.docupload.PersonaFlowStyle;
import com.robinhood.shared.documents.lib.docupload.PersonaScreenStyle;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: PersonaStartFragment.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 02\u00020\u00012\u00020\u0002:\u0002/0B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010&\u001a\u00020!2\u0006\u0010'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u0010,\u001a\u00020!2\u0006\u0010-\u001a\u00020.H\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u001d\u0010\u001e¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/persona/PersonaStartFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "setAppType", "(Lcom/robinhood/shared/app/type/AppType;)V", "duxo", "Lcom/robinhood/android/doc/ui/persona/PersonaStartDuxo;", "getDuxo", "()Lcom/robinhood/android/doc/ui/persona/PersonaStartDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/doc/databinding/FragmentPersonaStartBinding;", "getBinding", "()Lcom/robinhood/android/doc/databinding/FragmentPersonaStartBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEventReceiver;", "getCallbacks", "()Lcom/robinhood/shared/documents/lib/docupload/DocUploadEventReceiver;", "callbacks$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "bind", "state", "Lcom/robinhood/android/doc/ui/persona/PersonaStartViewState;", "handleEvent", "event", "Lcom/robinhood/android/doc/ui/persona/PersonaStartEvent;", "onLoading", "isLoading", "", "Args", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class PersonaStartFragment extends BaseFragment implements AutoLoggableFragment {
    public AppType appType;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final Screen eventScreen;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PersonaStartFragment.class, "binding", "getBinding()Lcom/robinhood/android/doc/databinding/FragmentPersonaStartBinding;", 0)), Reflection.property1(new PropertyReference1Impl(PersonaStartFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/documents/lib/docupload/DocUploadEventReceiver;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PersonaStartFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[PersonaStartStyle.values().length];
            try {
                iArr[PersonaStartStyle.PHOTO_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PersonaStartStyle.SELFIE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AppType.values().length];
            try {
                iArr2[AppType.NCW.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AppType.RHC.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AppType.TRADER.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[PersonaFlowStyle.values().length];
            try {
                iArr3[PersonaFlowStyle.BROKERAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[PersonaFlowStyle.BROKERAGE_V2.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[PersonaFlowStyle.CRYPTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public PersonaStartFragment() {
        super(C14254R.layout.fragment_persona_start);
        this.eventScreen = new Screen(Screen.Name.PERSONA_IDENTITY_VERIFICATION, null, null, null, 14, null);
        this.duxo = DuxosKt.duxo(this, PersonaStartDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, PersonaStartFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(DocUploadEventReceiver.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.doc.ui.persona.PersonaStartFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    public final AppType getAppType() {
        AppType appType = this.appType;
        if (appType != null) {
            return appType;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appType");
        return null;
    }

    public final void setAppType(AppType appType) {
        Intrinsics.checkNotNullParameter(appType, "<set-?>");
        this.appType = appType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PersonaStartDuxo getDuxo() {
        return (PersonaStartDuxo) this.duxo.getValue();
    }

    private final FragmentPersonaStartBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentPersonaStartBinding) value;
    }

    private final DocUploadEventReceiver getCallbacks() {
        return (DocUploadEventReceiver) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        DocumentBasedPersonaScreenContent photoIdContent;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Companion companion = INSTANCE;
        ColorTheme theme = ((Args) companion.getArgs((Fragment) this)).getTheme();
        ColorTheme colorTheme = ColorTheme.DARK;
        if (theme == colorTheme && ((Args) companion.getArgs((Fragment) this)).getPersonaFlowStyle() != PersonaFlowStyle.CRYPTO) {
            ScarletManager.putOverlay$default(getScarletManager(), DayNightOverlay.NIGHT, null, 2, null);
        }
        BaseFragment.collectDuxoState$default(this, null, new C143781(null), 1, null);
        boolean z = ((Args) companion.getArgs((Fragment) this)).getData().isGdpr() && ((Args) companion.getArgs((Fragment) this)).getStyle().getGdprContent() != null;
        if (z) {
            photoIdContent = ((Args) companion.getArgs((Fragment) this)).getStyle().getGdprContent();
            Intrinsics.checkNotNull(photoIdContent);
        } else {
            int i = WhenMappings.$EnumSwitchMapping$0[((Args) companion.getArgs((Fragment) this)).getData().getStyle().ordinal()];
            if (i == 1) {
                photoIdContent = ((Args) companion.getArgs((Fragment) this)).getStyle().getPhotoIdContent();
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                photoIdContent = ((Args) companion.getArgs((Fragment) this)).getStyle().getSelfieIdContent();
            }
        }
        getBinding().personaStartTitle.setText(photoIdContent.getTitle());
        getBinding().personaStartSubtitle.setText(photoIdContent.getSubtitle());
        getBinding().personaStartImage.setImageResource(photoIdContent.getAsset());
        getBinding().personaStartPrimaryCta.setText(photoIdContent.getCta());
        RdsButton personaStartPrimaryCta = getBinding().personaStartPrimaryCta;
        Intrinsics.checkNotNullExpressionValue(personaStartPrimaryCta, "personaStartPrimaryCta");
        OnClickListeners.onClick(personaStartPrimaryCta, new C143792(getDuxo()));
        boolean z2 = ((Args) companion.getArgs((Fragment) this)).getTheme() != ColorTheme.DEFAULT;
        AppCompatImageView personaStartImage = getBinding().personaStartImage;
        Intrinsics.checkNotNullExpressionValue(personaStartImage, "personaStartImage");
        personaStartImage.setVisibility(!z2 ? 0 : 8);
        LottieAnimationView personaStartAnimation = getBinding().personaStartAnimation;
        Intrinsics.checkNotNullExpressionValue(personaStartAnimation, "personaStartAnimation");
        personaStartAnimation.setVisibility(z2 ? 0 : 8);
        if (z2) {
            LottieAnimationView personaStartAnimation2 = getBinding().personaStartAnimation;
            Intrinsics.checkNotNullExpressionValue(personaStartAnimation2, "personaStartAnimation");
            LottieAnimationViewsKt.setRemoteUrl(personaStartAnimation2, ((Args) companion.getArgs((Fragment) this)).getTheme() == colorTheme ? LottieUrl.BRAND_REFRESH_UPLOAD_ID_DARK : LottieUrl.BRAND_REFRESH_UPLOAD_ID_LIGHT);
        }
        if (!z) {
            RdsButton personaStartPrimaryCta2 = getBinding().personaStartPrimaryCta;
            Intrinsics.checkNotNullExpressionValue(personaStartPrimaryCta2, "personaStartPrimaryCta");
            ViewsKt.eventData$default(personaStartPrimaryCta2, false, new Function0() { // from class: com.robinhood.android.doc.ui.persona.PersonaStartFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PersonaStartFragment.onViewCreated$lambda$5(this.f$0);
                }
            }, 1, null);
            Space personaFilledButtonSpace = getBinding().personaFilledButtonSpace;
            Intrinsics.checkNotNullExpressionValue(personaFilledButtonSpace, "personaFilledButtonSpace");
            personaFilledButtonSpace.setVisibility(0);
            RhTextView personaStartDisclosure = getBinding().personaStartDisclosure;
            Intrinsics.checkNotNullExpressionValue(personaStartDisclosure, "personaStartDisclosure");
            AppType appType = getAppType();
            AppType appType2 = AppType.RHC;
            TextViewsKt.setTextWithLearnMoreAndSuffix(personaStartDisclosure, appType == appType2 ? C14254R.string.gated_crypto_persona_disclosure_main_rhc : C14254R.string.persona_disclosure_main, getAppType() == appType2 ? C14254R.string.gated_crypto_persona_disclosure_privacy_policy_rhc : C14254R.string.persona_disclosure_privacy_policy, C14254R.string.persona_disclosure_suffix, true, true, new Function0() { // from class: com.robinhood.android.doc.ui.persona.PersonaStartFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PersonaStartFragment.onViewCreated$lambda$6(this.f$0);
                }
            });
            return;
        }
        RhTextView personaStartDisclosure2 = getBinding().personaStartDisclosure;
        Intrinsics.checkNotNullExpressionValue(personaStartDisclosure2, "personaStartDisclosure");
        int i2 = getAppType() == AppType.RHC ? C14254R.string.gated_crypto_persona_disclosure_gdpr_rhc : C14254R.string.persona_disclosure_gdpr;
        int i3 = C14254R.string.persona_disclosure_gdpr_privacy_policy;
        String string2 = com.robinhood.utils.extensions.ViewsKt.getString(personaStartDisclosure2, i2);
        Integer numValueOf = Integer.valueOf(i3);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        TextViewsKt.setTextWithLearnMore((TextView) personaStartDisclosure2, (CharSequence) string2, true, true, numValueOf != null ? com.robinhood.utils.extensions.ViewsKt.getString(personaStartDisclosure2, numValueOf.intValue()) : null, (ClickableSpan) new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.doc.ui.persona.PersonaStartFragment$onViewCreated$$inlined$setTextWithLearnMore$1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                int i4;
                android.content.Context contextRequireContext = this.this$0.requireContext();
                PersonaFlowStyle personaFlowStyle = ((PersonaStartFragment.Args) PersonaStartFragment.INSTANCE.getArgs((Fragment) this.this$0)).getPersonaFlowStyle();
                int i5 = personaFlowStyle == null ? -1 : PersonaStartFragment.WhenMappings.$EnumSwitchMapping$2[personaFlowStyle.ordinal()];
                if (i5 == -1) {
                    int i6 = PersonaStartFragment.WhenMappings.$EnumSwitchMapping$1[this.this$0.getAppType().ordinal()];
                    if (i6 == 1) {
                        Preconditions.INSTANCE.failUnexpectedItemKotlin(this.this$0.getAppType());
                        throw new ExceptionsH();
                    }
                    if (i6 == 2) {
                        i4 = C14254R.string.url_persona_privacy_policy_eu;
                    } else {
                        if (i6 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i4 = C14254R.string.url_persona_privacy_policy_gdpr;
                    }
                } else if (i5 == 1 || i5 == 2) {
                    i4 = C14254R.string.url_persona_privacy_policy_gdpr;
                } else {
                    if (i5 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i4 = C14254R.string.url_persona_privacy_policy_eu;
                }
                WebUtils.viewUrl$default(contextRequireContext, i4, 0, 4, (Object) null);
            }
        }, 1, (DefaultConstructorMarker) null));
        RdsButton personaStartPrimaryCta3 = getBinding().personaStartPrimaryCta;
        Intrinsics.checkNotNullExpressionValue(personaStartPrimaryCta3, "personaStartPrimaryCta");
        ViewsKt.eventData$default(personaStartPrimaryCta3, false, new Function0() { // from class: com.robinhood.android.doc.ui.persona.PersonaStartFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PersonaStartFragment.onViewCreated$lambda$1(this.f$0);
            }
        }, 1, null);
        RdsButton rdsButton = getBinding().personaStartSecondaryCta;
        Intrinsics.checkNotNull(rdsButton);
        ViewsKt.eventData$default(rdsButton, false, new Function0() { // from class: com.robinhood.android.doc.ui.persona.PersonaStartFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PersonaStartFragment.onViewCreated$lambda$4$lambda$2(this.f$0);
            }
        }, 1, null);
        OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.doc.ui.persona.PersonaStartFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PersonaStartFragment.onViewCreated$lambda$4$lambda$3(this.f$0);
            }
        });
        RdsButton personaStartSecondaryCta = getBinding().personaStartSecondaryCta;
        Intrinsics.checkNotNullExpressionValue(personaStartSecondaryCta, "personaStartSecondaryCta");
        personaStartSecondaryCta.setVisibility(0);
    }

    /* compiled from: PersonaStartFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.persona.PersonaStartFragment$onViewCreated$1", m3645f = "PersonaStartFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.doc.ui.persona.PersonaStartFragment$onViewCreated$1 */
    static final class C143781 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C143781(Continuation<? super C143781> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C143781 c143781 = PersonaStartFragment.this.new C143781(continuation);
            c143781.L$0 = obj;
            return c143781;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C143781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: PersonaStartFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.persona.PersonaStartFragment$onViewCreated$1$1", m3645f = "PersonaStartFragment.kt", m3646l = {64}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.doc.ui.persona.PersonaStartFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ PersonaStartFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PersonaStartFragment personaStartFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = personaStartFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: PersonaStartFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.doc.ui.persona.PersonaStartFragment$onViewCreated$1$1$1, reason: invalid class name and collision with other inner class name */
            /* synthetic */ class C498571 implements FlowCollector, FunctionAdapter {
                final /* synthetic */ PersonaStartFragment $tmp0;

                C498571(PersonaStartFragment personaStartFragment) {
                    this.$tmp0 = personaStartFragment;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final Function<?> getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.$tmp0, PersonaStartFragment.class, "bind", "bind(Lcom/robinhood/android/doc/ui/persona/PersonaStartViewState;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                public final Object emit(PersonaStartViewState personaStartViewState, Continuation<? super Unit> continuation) {
                    Object objInvokeSuspend$bind = AnonymousClass1.invokeSuspend$bind(this.$tmp0, personaStartViewState, continuation);
                    return objInvokeSuspend$bind == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bind : Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((PersonaStartViewState) obj, (Continuation<? super Unit>) continuation);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<PersonaStartViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    C498571 c498571 = new C498571(this.this$0);
                    this.label = 1;
                    if (stateFlow.collect(c498571, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new ExceptionsH();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object invokeSuspend$bind(PersonaStartFragment personaStartFragment, PersonaStartViewState personaStartViewState, Continuation continuation) {
                personaStartFragment.bind(personaStartViewState);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(PersonaStartFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(PersonaStartFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: PersonaStartFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.persona.PersonaStartFragment$onViewCreated$1$2", m3645f = "PersonaStartFragment.kt", m3646l = {67}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.doc.ui.persona.PersonaStartFragment$onViewCreated$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ PersonaStartFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(PersonaStartFragment personaStartFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = personaStartFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<Event<PersonaStartEvent>> eventFlow = this.this$0.getDuxo().getEventFlow();
                    final PersonaStartFragment personaStartFragment = this.this$0;
                    FlowCollector<? super Event<PersonaStartEvent>> flowCollector = new FlowCollector() { // from class: com.robinhood.android.doc.ui.persona.PersonaStartFragment.onViewCreated.1.2.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((Event<PersonaStartEvent>) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(final Event<PersonaStartEvent> event, Continuation<? super Unit> continuation) {
                            EventConsumer<PersonaStartEvent> eventConsumerInvoke;
                            if (event != null) {
                                final PersonaStartFragment personaStartFragment2 = personaStartFragment;
                                if ((event.getData() instanceof PersonaStartEvent) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                    eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.doc.ui.persona.PersonaStartFragment$onViewCreated$1$2$1$emit$$inlined$consumeIfType$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                            m13406invoke(obj2);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: collision with other method in class */
                                        public final void m13406invoke(Object it) {
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            personaStartFragment2.handleEvent((PersonaStartEvent) event.getData());
                                        }
                                    });
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (eventFlow.collect(flowCollector, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new ExceptionsH();
            }
        }
    }

    /* compiled from: PersonaStartFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.doc.ui.persona.PersonaStartFragment$onViewCreated$2 */
    /* synthetic */ class C143792 extends FunctionReferenceImpl implements Function0<Unit> {
        C143792(Object obj) {
            super(0, obj, PersonaStartDuxo.class, "submitAgreement", "submitAgreement()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((PersonaStartDuxo) this.receiver).submitAgreement();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$1(PersonaStartFragment personaStartFragment) {
        return new UserInteractionEventDescriptor(null, personaStartFragment.getEventScreen(), UserInteractionEventData.Action.VERIFY_ID_INSTANTLY, null, null, null, 57, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$4$lambda$2(PersonaStartFragment personaStartFragment) {
        return new UserInteractionEventDescriptor(null, personaStartFragment.getEventScreen(), UserInteractionEventData.Action.VERIFY_ID_MANUALLY, null, null, null, 57, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4$lambda$3(PersonaStartFragment personaStartFragment) {
        personaStartFragment.getDuxo().submitSkipBiometric();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$5(PersonaStartFragment personaStartFragment) {
        return new UserInteractionEventDescriptor(null, personaStartFragment.getEventScreen(), UserInteractionEventData.Action.CONTINUE, null, null, null, 57, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6(PersonaStartFragment personaStartFragment) {
        WebUtils.viewUrl$default(personaStartFragment.requireContext(), C32428R.string.url_privacy, 0, 4, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(PersonaStartViewState state) {
        onLoading(state.isLoading());
        CharSequence disclosureText = state.getDisclosureText();
        if (disclosureText != null) {
            getBinding().personaStartDisclosure.setText(disclosureText);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(PersonaStartEvent event) {
        if (event instanceof PersonaStartEvent.SubmitConsentToAgreementSuccess) {
            if (((Args) INSTANCE.getArgs((Fragment) this)).isVideoSelfie()) {
                DocUploadEventReceiver.DefaultImpls.onEvent$default(getCallbacks(), new DocUploadEvent.ActiveDocRequestEvent.StartPrism(false), false, 2, null);
                return;
            }
            PersonaStartEvent.SubmitConsentToAgreementSuccess submitConsentToAgreementSuccess = (PersonaStartEvent.SubmitConsentToAgreementSuccess) event;
            if (submitConsentToAgreementSuccess.isInPrismCollectionExperiment()) {
                DocUploadEventReceiver.DefaultImpls.onEvent$default(getCallbacks(), new DocUploadEvent.ActiveDocRequestEvent.StartPrism(true), false, 2, null);
                return;
            } else {
                DocUploadEventReceiver.DefaultImpls.onEvent$default(getCallbacks(), new DocUploadEvent.ActiveDocRequestEvent.PersonaStarted(submitConsentToAgreementSuccess.getSkipBiometric()), false, 2, null);
                return;
            }
        }
        if (!(event instanceof PersonaStartEvent.SubmitConsentToAgreementFailure)) {
            throw new NoWhenBranchMatchedException();
        }
        getCallbacks().onError(((PersonaStartEvent.SubmitConsentToAgreementFailure) event).getThrowable());
    }

    private final void onLoading(boolean isLoading) {
        requireToolbar().setLoadingViewVisible(isLoading);
        getBinding().personaStartPrimaryCta.setLoading(isLoading);
    }

    /* compiled from: PersonaStartFragment.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J3\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001dHÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/persona/PersonaStartFragment$Args;", "Landroid/os/Parcelable;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/doc/event/DocUploadDestination$PersonaStart;", "personaFlowStyle", "Lcom/robinhood/shared/documents/lib/docupload/PersonaFlowStyle;", "theme", "Lcom/robinhood/models/api/ColorTheme;", "isVideoSelfie", "", "<init>", "(Lcom/robinhood/android/doc/event/DocUploadDestination$PersonaStart;Lcom/robinhood/shared/documents/lib/docupload/PersonaFlowStyle;Lcom/robinhood/models/api/ColorTheme;Z)V", "getData", "()Lcom/robinhood/android/doc/event/DocUploadDestination$PersonaStart;", "getPersonaFlowStyle", "()Lcom/robinhood/shared/documents/lib/docupload/PersonaFlowStyle;", "getTheme", "()Lcom/robinhood/models/api/ColorTheme;", "()Z", ResourceTypes.STYLE, "Lcom/robinhood/shared/documents/lib/docupload/PersonaScreenStyle;", "getStyle", "()Lcom/robinhood/shared/documents/lib/docupload/PersonaScreenStyle;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final DocUploadDestination.PersonaStart data;
        private final boolean isVideoSelfie;
        private final PersonaFlowStyle personaFlowStyle;
        private final ColorTheme theme;

        /* compiled from: PersonaStartFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(DocUploadDestination.PersonaStart.CREATOR.createFromParcel(parcel), (PersonaFlowStyle) parcel.readParcelable(Args.class.getClassLoader()), ColorTheme.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, DocUploadDestination.PersonaStart personaStart, PersonaFlowStyle personaFlowStyle, ColorTheme colorTheme, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                personaStart = args.data;
            }
            if ((i & 2) != 0) {
                personaFlowStyle = args.personaFlowStyle;
            }
            if ((i & 4) != 0) {
                colorTheme = args.theme;
            }
            if ((i & 8) != 0) {
                z = args.isVideoSelfie;
            }
            return args.copy(personaStart, personaFlowStyle, colorTheme, z);
        }

        /* renamed from: component1, reason: from getter */
        public final DocUploadDestination.PersonaStart getData() {
            return this.data;
        }

        /* renamed from: component2, reason: from getter */
        public final PersonaFlowStyle getPersonaFlowStyle() {
            return this.personaFlowStyle;
        }

        /* renamed from: component3, reason: from getter */
        public final ColorTheme getTheme() {
            return this.theme;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsVideoSelfie() {
            return this.isVideoSelfie;
        }

        public final Args copy(DocUploadDestination.PersonaStart data, PersonaFlowStyle personaFlowStyle, ColorTheme theme, boolean isVideoSelfie) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(theme, "theme");
            return new Args(data, personaFlowStyle, theme, isVideoSelfie);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.data, args.data) && this.personaFlowStyle == args.personaFlowStyle && this.theme == args.theme && this.isVideoSelfie == args.isVideoSelfie;
        }

        public int hashCode() {
            int iHashCode = this.data.hashCode() * 31;
            PersonaFlowStyle personaFlowStyle = this.personaFlowStyle;
            return ((((iHashCode + (personaFlowStyle == null ? 0 : personaFlowStyle.hashCode())) * 31) + this.theme.hashCode()) * 31) + Boolean.hashCode(this.isVideoSelfie);
        }

        public String toString() {
            return "Args(data=" + this.data + ", personaFlowStyle=" + this.personaFlowStyle + ", theme=" + this.theme + ", isVideoSelfie=" + this.isVideoSelfie + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.data.writeToParcel(dest, flags);
            dest.writeParcelable(this.personaFlowStyle, flags);
            dest.writeString(this.theme.name());
            dest.writeInt(this.isVideoSelfie ? 1 : 0);
        }

        public Args(DocUploadDestination.PersonaStart data, PersonaFlowStyle personaFlowStyle, ColorTheme theme, boolean z) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(theme, "theme");
            this.data = data;
            this.personaFlowStyle = personaFlowStyle;
            this.theme = theme;
            this.isVideoSelfie = z;
        }

        public final DocUploadDestination.PersonaStart getData() {
            return this.data;
        }

        public final PersonaFlowStyle getPersonaFlowStyle() {
            return this.personaFlowStyle;
        }

        public final ColorTheme getTheme() {
            return this.theme;
        }

        public final boolean isVideoSelfie() {
            return this.isVideoSelfie;
        }

        public final PersonaScreenStyle getStyle() {
            PersonaFlowStyle personaFlowStyle = this.personaFlowStyle;
            if (personaFlowStyle == null) {
                personaFlowStyle = PersonaFlowStyle.BROKERAGE;
            }
            return personaFlowStyle.getPersonaScreenStyle();
        }
    }

    /* compiled from: PersonaStartFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/persona/PersonaStartFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/doc/ui/persona/PersonaStartFragment;", "Lcom/robinhood/android/doc/ui/persona/PersonaStartFragment$Args;", "<init>", "()V", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<PersonaStartFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(PersonaStartFragment personaStartFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, personaStartFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public PersonaStartFragment newInstance(Args args) {
            return (PersonaStartFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(PersonaStartFragment personaStartFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, personaStartFragment, args);
        }
    }
}
