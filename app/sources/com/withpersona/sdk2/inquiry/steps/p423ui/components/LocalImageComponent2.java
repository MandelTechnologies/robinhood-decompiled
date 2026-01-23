package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieOnCompositionLoadedListener;
import com.google.android.material.R$attr;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.LocalImage;
import com.withpersona.sdk2.inquiry.resources.R$dimen;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.shared.R$drawable;
import com.withpersona.sdk2.inquiry.shared.R$raw;
import com.withpersona.sdk2.inquiry.shared.ResTools;
import com.withpersona.sdk2.inquiry.shared.databinding.Pi2UiImageLottieBinding;
import com.withpersona.sdk2.inquiry.shared.databinding.Pi2UiImageViewBinding;
import com.withpersona.sdk2.inquiry.shared.p422ui.ThemeableLottieAnimationView;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.ImageStyling;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LocalImageComponent.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001aO\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"makeView", "Landroid/view/View;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/LocalImageComponent;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentHelper;", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage;", "makeOptionView", "Landroidx/viewbinding/ViewBinding;", "lottieRes", "", "drawableRes", "originalStrokeColors", "", "", "originalFillColors", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/LocalImageComponent;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentHelper;II[Ljava/lang/String;[Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage;)Landroidx/viewbinding/ViewBinding;", "ui-step-renderer_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class LocalImageComponent2 {

    /* compiled from: LocalImageComponent.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LocalImage.Image.values().length];
            try {
                iArr[LocalImage.Image.START_HERO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LocalImage.Image.DOCUMENT_START_HERO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LocalImage.Image.ANIMATED_CHECK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LocalImage.Image.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LocalImage.Image.ID_FRONT_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LocalImage.Image.ID_BACK_FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[LocalImage.Image.SELFIE_FAILED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[LocalImage.Image.DOCUMENT_FAILED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[LocalImage.Image.PASSPORT_NFC_START_HERO.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[LocalImage.Image.PASSPORT_NFC_SCAN_HERO.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[LocalImage.Image.PASSPORT_NFC_SCAN_READY_HERO.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[LocalImage.Image.PASSPORT_NFC_CHECK.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[LocalImage.Image.GOVERNMENT_ID_NFC_SCAN_BACK_CLOSED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[LocalImage.Image.GOVERNMENT_ID_NFC_SCAN_FRONT_CLOSED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[LocalImage.Image.GOVERNMENT_ID_NFC_SCAN_PHOTO_PAGE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[LocalImage.Image.GOVERNMENT_ID_NFC_SCAN_ID_CARD.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[LocalImage.Image.GOVERNMENT_ID_NFC_SCAN_BACK_THEN_FRONT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[LocalImage.Image.CREATE_PERSONA_CTA_CARD_ICON.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[LocalImage.Image.OPTION_CHECK_ICON.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[LocalImage.Image.OPTION_CHEVRON_ICON.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[LocalImage.Image.OPTION_FLAG_ICON.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[LocalImage.Image.OPTION_GLOBE_ICON.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[LocalImage.Image.OPTION_HOME_ICON.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[LocalImage.Image.OPTION_ID_DOCUMENT_ICON.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[LocalImage.Image.OPTION_ID_ICON.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[LocalImage.Image.OPTION_PHONE_ICON.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[LocalImage.Image.OPTION_USER_ICON.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[LocalImage.Image.REUSABLE_PERSONA_LOGO.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x06a1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final View makeView(LocalImageComponent localImageComponent, UiComponentHelper uiComponentHelper, final LocalImage config) {
        ViewBinding viewBindingMakeOptionView;
        final Pi2UiImageViewBinding pi2UiImageViewBindingInflate;
        Intrinsics.checkNotNullParameter(localImageComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        Context context = uiComponentHelper.getContext();
        final int dimension = (int) context.getResources().getDimension(R$dimen.pi2_default_local_image_height);
        final int dimension2 = (int) context.getResources().getDimension(R$dimen.pi2_small_default_local_image_height);
        LocalImage.Attributes attributes = config.getAttributes();
        LocalImage.Image imageKey = attributes != null ? attributes.getImageKey() : null;
        switch (imageKey == null ? -1 : WhenMappings.$EnumSwitchMapping$0[imageKey.ordinal()]) {
            case -1:
                viewBindingMakeOptionView = null;
                if (viewBindingMakeOptionView != null) {
                    return viewBindingMakeOptionView.getRoot();
                }
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                if (config.getStyles() != null) {
                    final Pi2UiImageLottieBinding pi2UiImageLottieBindingInflate = Pi2UiImageLottieBinding.inflate(uiComponentHelper.getLayoutInflater());
                    pi2UiImageLottieBindingInflate.lottieView.setAnimation(R$raw.pi2_inquiry_start_hero);
                    uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LocalImageComponent2.makeView$lambda$1$lambda$0(pi2UiImageLottieBindingInflate, config);
                        }
                    });
                    Intrinsics.checkNotNull(pi2UiImageLottieBindingInflate);
                    viewBindingMakeOptionView = pi2UiImageLottieBindingInflate;
                    if (viewBindingMakeOptionView != null) {
                    }
                } else {
                    pi2UiImageViewBindingInflate = Pi2UiImageViewBinding.inflate(uiComponentHelper.getLayoutInflater());
                    pi2UiImageViewBindingInflate.imageView.setImageResource(R$drawable.pi2_inquiry_start_hero);
                    uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LocalImageComponent2.makeView$lambda$4$lambda$3(pi2UiImageViewBindingInflate, dimension);
                        }
                    });
                    Intrinsics.checkNotNull(pi2UiImageViewBindingInflate);
                    viewBindingMakeOptionView = pi2UiImageViewBindingInflate;
                    if (viewBindingMakeOptionView != null) {
                    }
                }
                break;
            case 2:
                if (config.getStyles() != null) {
                    final Pi2UiImageLottieBinding pi2UiImageLottieBindingInflate2 = Pi2UiImageLottieBinding.inflate(uiComponentHelper.getLayoutInflater());
                    pi2UiImageLottieBindingInflate2.lottieView.setAnimation(R$raw.pi2_document_start_hero);
                    uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda22
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LocalImageComponent2.makeView$lambda$6$lambda$5(pi2UiImageLottieBindingInflate2, config);
                        }
                    });
                    Intrinsics.checkNotNull(pi2UiImageLottieBindingInflate2);
                    viewBindingMakeOptionView = pi2UiImageLottieBindingInflate2;
                    if (viewBindingMakeOptionView != null) {
                    }
                } else {
                    pi2UiImageViewBindingInflate = Pi2UiImageViewBinding.inflate(uiComponentHelper.getLayoutInflater());
                    pi2UiImageViewBindingInflate.imageView.setImageResource(R$drawable.pi2_document_start_hero);
                    uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda28
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LocalImageComponent2.makeView$lambda$9$lambda$8(pi2UiImageViewBindingInflate, dimension);
                        }
                    });
                    Intrinsics.checkNotNull(pi2UiImageViewBindingInflate);
                    viewBindingMakeOptionView = pi2UiImageViewBindingInflate;
                    if (viewBindingMakeOptionView != null) {
                    }
                }
                break;
            case 3:
                final Pi2UiImageLottieBinding pi2UiImageLottieBindingInflate3 = Pi2UiImageLottieBinding.inflate(uiComponentHelper.getLayoutInflater());
                pi2UiImageLottieBindingInflate3.lottieView.setAnimation(R$raw.pi2_inquiry_successanimation);
                uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda29
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LocalImageComponent2.makeView$lambda$13$lambda$11(pi2UiImageLottieBindingInflate3);
                    }
                });
                pi2UiImageLottieBindingInflate3.lottieView.addLottieOnCompositionLoadedListener(new LottieOnCompositionLoadedListener() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda30
                    @Override // com.airbnb.lottie.LottieOnCompositionLoadedListener
                    public final void onCompositionLoaded(LottieComposition lottieComposition) {
                        LocalImageComponent2.makeView$lambda$13$lambda$12(pi2UiImageLottieBindingInflate3, lottieComposition);
                    }
                });
                viewBindingMakeOptionView = pi2UiImageLottieBindingInflate3;
                if (viewBindingMakeOptionView != null) {
                }
                break;
            case 4:
                if (config.getStyles() != null) {
                    final Pi2UiImageLottieBinding pi2UiImageLottieBindingInflate4 = Pi2UiImageLottieBinding.inflate(uiComponentHelper.getLayoutInflater());
                    pi2UiImageLottieBindingInflate4.lottieView.setAnimation(R$raw.pi2_inquiry_failed);
                    uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda31
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LocalImageComponent2.makeView$lambda$15$lambda$14(pi2UiImageLottieBindingInflate4, config);
                        }
                    });
                    Intrinsics.checkNotNull(pi2UiImageLottieBindingInflate4);
                    viewBindingMakeOptionView = pi2UiImageLottieBindingInflate4;
                } else {
                    final Pi2UiImageViewBinding pi2UiImageViewBindingInflate2 = Pi2UiImageViewBinding.inflate(uiComponentHelper.getLayoutInflater());
                    pi2UiImageViewBindingInflate2.imageView.setImageResource(R$drawable.pi2_inquiry_failed);
                    uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda32
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LocalImageComponent2.makeView$lambda$18$lambda$17(pi2UiImageViewBindingInflate2, dimension2);
                        }
                    });
                    Intrinsics.checkNotNull(pi2UiImageViewBindingInflate2);
                    viewBindingMakeOptionView = pi2UiImageViewBindingInflate2;
                }
                if (viewBindingMakeOptionView != null) {
                }
                break;
            case 5:
                if (config.getStyles() != null) {
                    final Pi2UiImageLottieBinding pi2UiImageLottieBindingInflate5 = Pi2UiImageLottieBinding.inflate(uiComponentHelper.getLayoutInflater());
                    pi2UiImageLottieBindingInflate5.lottieView.setAnimation(R$raw.pi2_id_front_fail);
                    uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda33
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LocalImageComponent2.makeView$lambda$20$lambda$19(pi2UiImageLottieBindingInflate5, config);
                        }
                    });
                    Intrinsics.checkNotNull(pi2UiImageLottieBindingInflate5);
                    viewBindingMakeOptionView = pi2UiImageLottieBindingInflate5;
                } else {
                    final Pi2UiImageViewBinding pi2UiImageViewBindingInflate3 = Pi2UiImageViewBinding.inflate(uiComponentHelper.getLayoutInflater());
                    pi2UiImageViewBindingInflate3.imageView.setImageResource(R$drawable.pi2_id_front_fail);
                    uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda34
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LocalImageComponent2.makeView$lambda$23$lambda$22(pi2UiImageViewBindingInflate3, dimension2);
                        }
                    });
                    Intrinsics.checkNotNull(pi2UiImageViewBindingInflate3);
                    viewBindingMakeOptionView = pi2UiImageViewBindingInflate3;
                }
                if (viewBindingMakeOptionView != null) {
                }
                break;
            case 6:
                if (config.getStyles() != null) {
                    final Pi2UiImageLottieBinding pi2UiImageLottieBindingInflate6 = Pi2UiImageLottieBinding.inflate(uiComponentHelper.getLayoutInflater());
                    pi2UiImageLottieBindingInflate6.lottieView.setAnimation(R$raw.pi2_id_back_fail);
                    uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LocalImageComponent2.makeView$lambda$25$lambda$24(pi2UiImageLottieBindingInflate6, config);
                        }
                    });
                    Intrinsics.checkNotNull(pi2UiImageLottieBindingInflate6);
                    viewBindingMakeOptionView = pi2UiImageLottieBindingInflate6;
                } else {
                    final Pi2UiImageViewBinding pi2UiImageViewBindingInflate4 = Pi2UiImageViewBinding.inflate(uiComponentHelper.getLayoutInflater());
                    pi2UiImageViewBindingInflate4.imageView.setImageResource(R$drawable.pi2_id_back_fail);
                    uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LocalImageComponent2.makeView$lambda$28$lambda$27(pi2UiImageViewBindingInflate4, dimension2);
                        }
                    });
                    Intrinsics.checkNotNull(pi2UiImageViewBindingInflate4);
                    viewBindingMakeOptionView = pi2UiImageViewBindingInflate4;
                }
                if (viewBindingMakeOptionView != null) {
                }
                break;
            case 7:
                if (config.getStyles() != null) {
                    final Pi2UiImageLottieBinding pi2UiImageLottieBindingInflate7 = Pi2UiImageLottieBinding.inflate(uiComponentHelper.getLayoutInflater());
                    pi2UiImageLottieBindingInflate7.lottieView.setAnimation(R$raw.pi2_selfie_fail);
                    uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LocalImageComponent2.makeView$lambda$30$lambda$29(pi2UiImageLottieBindingInflate7, config);
                        }
                    });
                    Intrinsics.checkNotNull(pi2UiImageLottieBindingInflate7);
                    viewBindingMakeOptionView = pi2UiImageLottieBindingInflate7;
                } else {
                    final Pi2UiImageViewBinding pi2UiImageViewBindingInflate5 = Pi2UiImageViewBinding.inflate(uiComponentHelper.getLayoutInflater());
                    pi2UiImageViewBindingInflate5.imageView.setImageResource(R$drawable.pi2_selfie_fail);
                    uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LocalImageComponent2.makeView$lambda$33$lambda$32(pi2UiImageViewBindingInflate5, dimension2);
                        }
                    });
                    Intrinsics.checkNotNull(pi2UiImageViewBindingInflate5);
                    viewBindingMakeOptionView = pi2UiImageViewBindingInflate5;
                }
                if (viewBindingMakeOptionView != null) {
                }
                break;
            case 8:
                if (config.getStyles() != null) {
                    final Pi2UiImageLottieBinding pi2UiImageLottieBindingInflate8 = Pi2UiImageLottieBinding.inflate(uiComponentHelper.getLayoutInflater());
                    pi2UiImageLottieBindingInflate8.lottieView.setAnimation(R$raw.pi2_document_failed);
                    uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LocalImageComponent2.makeView$lambda$35$lambda$34(pi2UiImageLottieBindingInflate8, config);
                        }
                    });
                    Intrinsics.checkNotNull(pi2UiImageLottieBindingInflate8);
                    viewBindingMakeOptionView = pi2UiImageLottieBindingInflate8;
                    if (viewBindingMakeOptionView != null) {
                    }
                } else {
                    pi2UiImageViewBindingInflate = Pi2UiImageViewBinding.inflate(uiComponentHelper.getLayoutInflater());
                    pi2UiImageViewBindingInflate.imageView.setImageResource(R$drawable.pi2_document_failed);
                    uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LocalImageComponent2.makeView$lambda$38$lambda$37(pi2UiImageViewBindingInflate, dimension);
                        }
                    });
                    Intrinsics.checkNotNull(pi2UiImageViewBindingInflate);
                    viewBindingMakeOptionView = pi2UiImageViewBindingInflate;
                    if (viewBindingMakeOptionView != null) {
                    }
                }
                break;
            case 9:
                if (config.getStyles() != null) {
                    final Pi2UiImageLottieBinding pi2UiImageLottieBindingInflate9 = Pi2UiImageLottieBinding.inflate(uiComponentHelper.getLayoutInflater());
                    pi2UiImageLottieBindingInflate9.lottieView.setAnimation(R$raw.pi2_passport_nfc_start_hero);
                    uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LocalImageComponent2.makeView$lambda$40$lambda$39(pi2UiImageLottieBindingInflate9, config);
                        }
                    });
                    Intrinsics.checkNotNull(pi2UiImageLottieBindingInflate9);
                    viewBindingMakeOptionView = pi2UiImageLottieBindingInflate9;
                    if (viewBindingMakeOptionView != null) {
                    }
                } else {
                    pi2UiImageViewBindingInflate = Pi2UiImageViewBinding.inflate(uiComponentHelper.getLayoutInflater());
                    pi2UiImageViewBindingInflate.imageView.setImageResource(R$drawable.pi2_passport_nfc_start_hero);
                    uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LocalImageComponent2.makeView$lambda$43$lambda$42(pi2UiImageViewBindingInflate, dimension);
                        }
                    });
                    Intrinsics.checkNotNull(pi2UiImageViewBindingInflate);
                    viewBindingMakeOptionView = pi2UiImageViewBindingInflate;
                    if (viewBindingMakeOptionView != null) {
                    }
                }
                break;
            case 10:
                final Pi2UiImageLottieBinding pi2UiImageLottieBindingInflate10 = Pi2UiImageLottieBinding.inflate(uiComponentHelper.getLayoutInflater());
                pi2UiImageLottieBindingInflate10.lottieView.setAnimation(R$raw.pi2_passport_nfc_scan_hero);
                pi2UiImageLottieBindingInflate10.lottieView.playAnimation();
                if (config.getStyles() != null) {
                    uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LocalImageComponent2.makeView$lambda$46$lambda$44(pi2UiImageLottieBindingInflate10, config);
                        }
                    });
                } else {
                    ThemeableLottieAnimationView lottieView = pi2UiImageLottieBindingInflate10.lottieView;
                    Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
                    ImageStyling.replaceColors(lottieView, Integer.valueOf(ResTools.getColorFromAttr$default(context, R$attr.colorPrimaryVariant, null, false, 6, null)), Integer.valueOf(ResTools.getColorFromAttr$default(context, R$attr.colorSecondary, null, false, 6, null)), null, new String[]{"#190052"}, new String[]{"#F1EBFF", "#8552FF"}, new String[]{"#FFFFFF"});
                }
                uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LocalImageComponent2.makeView$lambda$46$lambda$45(pi2UiImageLottieBindingInflate10);
                    }
                });
                viewBindingMakeOptionView = pi2UiImageLottieBindingInflate10;
                if (viewBindingMakeOptionView != null) {
                }
                break;
            case 11:
                final Pi2UiImageLottieBinding pi2UiImageLottieBindingInflate11 = Pi2UiImageLottieBinding.inflate(uiComponentHelper.getLayoutInflater());
                pi2UiImageLottieBindingInflate11.lottieView.setAnimation(R$raw.pi2_passport_nfc_scan_ready_hero);
                uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LocalImageComponent2.makeView$lambda$50$lambda$48(pi2UiImageLottieBindingInflate11);
                    }
                });
                if (config.getStyles() != null) {
                    uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LocalImageComponent2.makeView$lambda$50$lambda$49(pi2UiImageLottieBindingInflate11, config);
                        }
                    });
                    viewBindingMakeOptionView = pi2UiImageLottieBindingInflate11;
                } else {
                    ThemeableLottieAnimationView lottieView2 = pi2UiImageLottieBindingInflate11.lottieView;
                    Intrinsics.checkNotNullExpressionValue(lottieView2, "lottieView");
                    ImageStyling.replaceColors(lottieView2, Integer.valueOf(ResTools.getColorFromAttr$default(context, R$attr.colorPrimaryVariant, null, false, 6, null)), Integer.valueOf(ResTools.getColorFromAttr$default(context, R$attr.colorSecondary, null, false, 6, null)), null, new String[]{"#02214F", "#190051"}, new String[]{"#E5E5EA"}, new String[0]);
                    viewBindingMakeOptionView = pi2UiImageLottieBindingInflate11;
                }
                if (viewBindingMakeOptionView != null) {
                }
                break;
            case 12:
                final Pi2UiImageLottieBinding pi2UiImageLottieBindingInflate12 = Pi2UiImageLottieBinding.inflate(uiComponentHelper.getLayoutInflater());
                pi2UiImageLottieBindingInflate12.lottieView.setAnimation(R$raw.pi2_passport_nfc_check);
                if (config.getStyles() != null) {
                    uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LocalImageComponent2.makeView$lambda$54$lambda$51(pi2UiImageLottieBindingInflate12, config);
                        }
                    });
                } else {
                    ThemeableLottieAnimationView lottieView3 = pi2UiImageLottieBindingInflate12.lottieView;
                    Intrinsics.checkNotNullExpressionValue(lottieView3, "lottieView");
                    ImageStyling.replaceColors(lottieView3, Integer.valueOf(ResTools.getColorFromAttr$default(context, R$attr.colorPrimaryVariant, null, false, 6, null)), null, null, new String[]{"#280087"}, new String[0], new String[0]);
                }
                uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LocalImageComponent2.makeView$lambda$54$lambda$53(pi2UiImageLottieBindingInflate12);
                    }
                });
                viewBindingMakeOptionView = pi2UiImageLottieBindingInflate12;
                if (viewBindingMakeOptionView != null) {
                }
                break;
            case 13:
                final Pi2UiImageLottieBinding pi2UiImageLottieBindingInflate13 = Pi2UiImageLottieBinding.inflate(uiComponentHelper.getLayoutInflater());
                pi2UiImageLottieBindingInflate13.lottieView.setAnimation(R$raw.pi2_government_id_nfc_scan_back_closed);
                pi2UiImageLottieBindingInflate13.lottieView.playAnimation();
                if (config.getStyles() != null) {
                    uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda16
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LocalImageComponent2.makeView$lambda$57$lambda$55(pi2UiImageLottieBindingInflate13, config);
                        }
                    });
                } else {
                    ThemeableLottieAnimationView lottieView4 = pi2UiImageLottieBindingInflate13.lottieView;
                    Intrinsics.checkNotNullExpressionValue(lottieView4, "lottieView");
                    ImageStyling.replaceColors(lottieView4, Integer.valueOf(ResTools.getColorFromAttr$default(context, R$attr.colorPrimaryVariant, null, false, 6, null)), Integer.valueOf(ResTools.getColorFromAttr$default(context, R$attr.colorSecondary, null, false, 6, null)), null, new String[]{"#280087", "#322A7E"}, new String[]{"#CBB1FF"}, new String[]{"#F1EBFF"});
                }
                uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LocalImageComponent2.makeView$lambda$57$lambda$56(pi2UiImageLottieBindingInflate13);
                    }
                });
                viewBindingMakeOptionView = pi2UiImageLottieBindingInflate13;
                if (viewBindingMakeOptionView != null) {
                }
                break;
            case 14:
                final Pi2UiImageLottieBinding pi2UiImageLottieBindingInflate14 = Pi2UiImageLottieBinding.inflate(uiComponentHelper.getLayoutInflater());
                pi2UiImageLottieBindingInflate14.lottieView.setAnimation(R$raw.pi2_government_id_nfc_scan_front_closed);
                pi2UiImageLottieBindingInflate14.lottieView.playAnimation();
                if (config.getStyles() != null) {
                    uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda18
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LocalImageComponent2.makeView$lambda$60$lambda$58(pi2UiImageLottieBindingInflate14, config);
                        }
                    });
                } else {
                    ThemeableLottieAnimationView lottieView5 = pi2UiImageLottieBindingInflate14.lottieView;
                    Intrinsics.checkNotNullExpressionValue(lottieView5, "lottieView");
                    ImageStyling.replaceColors(lottieView5, Integer.valueOf(ResTools.getColorFromAttr$default(context, R$attr.colorPrimaryVariant, null, false, 6, null)), Integer.valueOf(ResTools.getColorFromAttr$default(context, R$attr.colorSecondary, null, false, 6, null)), null, new String[]{"#280087", "#322A7E"}, new String[]{"#CBB1FF"}, new String[]{"#F1EBFF"});
                }
                uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LocalImageComponent2.makeView$lambda$60$lambda$59(pi2UiImageLottieBindingInflate14);
                    }
                });
                viewBindingMakeOptionView = pi2UiImageLottieBindingInflate14;
                if (viewBindingMakeOptionView != null) {
                }
                break;
            case 15:
                final Pi2UiImageLottieBinding pi2UiImageLottieBindingInflate15 = Pi2UiImageLottieBinding.inflate(uiComponentHelper.getLayoutInflater());
                pi2UiImageLottieBindingInflate15.lottieView.setAnimation(R$raw.pi2_government_id_nfc_scan_photo_page);
                pi2UiImageLottieBindingInflate15.lottieView.playAnimation();
                if (config.getStyles() != null) {
                    uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda20
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LocalImageComponent2.makeView$lambda$63$lambda$61(pi2UiImageLottieBindingInflate15, config);
                        }
                    });
                } else {
                    ThemeableLottieAnimationView lottieView6 = pi2UiImageLottieBindingInflate15.lottieView;
                    Intrinsics.checkNotNullExpressionValue(lottieView6, "lottieView");
                    ImageStyling.replaceColors(lottieView6, Integer.valueOf(ResTools.getColorFromAttr$default(context, R$attr.colorPrimaryVariant, null, false, 6, null)), Integer.valueOf(ResTools.getColorFromAttr$default(context, R$attr.colorSecondary, null, false, 6, null)), null, new String[]{"#280087", "#322A7E"}, new String[]{"#CBB1FF"}, new String[]{"#F1EBFF"});
                }
                uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LocalImageComponent2.makeView$lambda$63$lambda$62(pi2UiImageLottieBindingInflate15);
                    }
                });
                viewBindingMakeOptionView = pi2UiImageLottieBindingInflate15;
                if (viewBindingMakeOptionView != null) {
                }
                break;
            case 16:
                final Pi2UiImageLottieBinding pi2UiImageLottieBindingInflate16 = Pi2UiImageLottieBinding.inflate(uiComponentHelper.getLayoutInflater());
                pi2UiImageLottieBindingInflate16.lottieView.setAnimation(R$raw.pi2_government_id_nfc_scan_id_card);
                pi2UiImageLottieBindingInflate16.lottieView.playAnimation();
                if (config.getStyles() != null) {
                    uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda23
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LocalImageComponent2.makeView$lambda$66$lambda$64(pi2UiImageLottieBindingInflate16, config);
                        }
                    });
                } else {
                    ThemeableLottieAnimationView lottieView7 = pi2UiImageLottieBindingInflate16.lottieView;
                    Intrinsics.checkNotNullExpressionValue(lottieView7, "lottieView");
                    ImageStyling.replaceColors(lottieView7, Integer.valueOf(ResTools.getColorFromAttr$default(context, R$attr.colorPrimaryVariant, null, false, 6, null)), Integer.valueOf(ResTools.getColorFromAttr$default(context, R$attr.colorSecondary, null, false, 6, null)), null, new String[]{"#280087", "#322A7E"}, new String[]{"#CBB1FF"}, new String[]{"#F1EBFF"});
                }
                uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda24
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LocalImageComponent2.makeView$lambda$66$lambda$65(pi2UiImageLottieBindingInflate16);
                    }
                });
                viewBindingMakeOptionView = pi2UiImageLottieBindingInflate16;
                if (viewBindingMakeOptionView != null) {
                }
                break;
            case 17:
                final Pi2UiImageLottieBinding pi2UiImageLottieBindingInflate17 = Pi2UiImageLottieBinding.inflate(uiComponentHelper.getLayoutInflater());
                pi2UiImageLottieBindingInflate17.lottieView.setAnimation(R$raw.pi2_government_id_nfc_scan_back_then_front);
                pi2UiImageLottieBindingInflate17.lottieView.playAnimation();
                if (config.getStyles() != null) {
                    uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda25
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LocalImageComponent2.makeView$lambda$69$lambda$67(pi2UiImageLottieBindingInflate17, config);
                        }
                    });
                } else {
                    ThemeableLottieAnimationView lottieView8 = pi2UiImageLottieBindingInflate17.lottieView;
                    Intrinsics.checkNotNullExpressionValue(lottieView8, "lottieView");
                    ImageStyling.replaceColors(lottieView8, Integer.valueOf(ResTools.getColorFromAttr$default(context, R$attr.colorPrimaryVariant, null, false, 6, null)), Integer.valueOf(ResTools.getColorFromAttr$default(context, R$attr.colorSecondary, null, false, 6, null)), null, new String[]{"#280087", "#322A7E"}, new String[]{"#CBB1FF"}, new String[]{"#F1EBFF"});
                }
                uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LocalImageComponent2.makeView$lambda$69$lambda$68(pi2UiImageLottieBindingInflate17);
                    }
                });
                viewBindingMakeOptionView = pi2UiImageLottieBindingInflate17;
                if (viewBindingMakeOptionView != null) {
                }
                break;
            case 18:
                final Pi2UiImageLottieBinding pi2UiImageLottieBindingInflate18 = Pi2UiImageLottieBinding.inflate(uiComponentHelper.getLayoutInflater());
                pi2UiImageLottieBindingInflate18.lottieView.setImageResource(com.withpersona.sdk2.inquiry.steps.p423ui.R$drawable.pi2_create_persona_cta_card_icon);
                if (config.getStyles() != null) {
                    ThemeableLottieAnimationView lottieView9 = pi2UiImageLottieBindingInflate18.lottieView;
                    Intrinsics.checkNotNullExpressionValue(lottieView9, "lottieView");
                    ImageStyling.applyStyle(lottieView9, config.getStyles(), new String[0], new String[0], new String[0]);
                    viewBindingMakeOptionView = pi2UiImageLottieBindingInflate18;
                } else {
                    uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda27
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LocalImageComponent2.makeView$lambda$72$lambda$71(pi2UiImageLottieBindingInflate18);
                        }
                    });
                    viewBindingMakeOptionView = pi2UiImageLottieBindingInflate18;
                }
                if (viewBindingMakeOptionView != null) {
                }
                break;
            case 19:
                viewBindingMakeOptionView = makeOptionView(localImageComponent, uiComponentHelper, R$raw.pi2_option_check_icon, R$drawable.p2_option_check_icon, new String[0], new String[0], config);
                if (viewBindingMakeOptionView != null) {
                }
                break;
            case 20:
                viewBindingMakeOptionView = makeOptionView(localImageComponent, uiComponentHelper, R$raw.pi2_option_chevron_icon, R$drawable.p2_option_chevron_icon, new String[]{"#000000"}, new String[0], config);
                if (viewBindingMakeOptionView != null) {
                }
                break;
            case 21:
                viewBindingMakeOptionView = makeOptionView(localImageComponent, uiComponentHelper, R$raw.pi2_option_flag_icon, R$drawable.p2_option_flag_icon, new String[]{"#FFFFFF"}, new String[]{"#000000"}, config);
                if (viewBindingMakeOptionView != null) {
                }
                break;
            case 22:
                viewBindingMakeOptionView = makeOptionView(localImageComponent, uiComponentHelper, R$raw.pi2_option_globe_icon, R$drawable.p2_option_globe_icon, new String[]{"#FFFFFF"}, new String[]{"#000000"}, config);
                if (viewBindingMakeOptionView != null) {
                }
                break;
            case 23:
                viewBindingMakeOptionView = makeOptionView(localImageComponent, uiComponentHelper, R$raw.pi2_option_home_icon, R$drawable.p2_option_home_icon, new String[]{"#FFFFFF"}, new String[]{"#000000"}, config);
                if (viewBindingMakeOptionView != null) {
                }
                break;
            case 24:
                viewBindingMakeOptionView = makeOptionView(localImageComponent, uiComponentHelper, R$raw.pi2_option_id_document_icon, R$drawable.p2_option_id_document_icon, new String[]{"#FFFFFF"}, new String[]{"#000000"}, config);
                if (viewBindingMakeOptionView != null) {
                }
                break;
            case 25:
                viewBindingMakeOptionView = makeOptionView(localImageComponent, uiComponentHelper, R$raw.pi2_option_id_icon, R$drawable.p2_option_id_icon, new String[]{"#FFFFFF"}, new String[]{"#000000"}, config);
                if (viewBindingMakeOptionView != null) {
                }
                break;
            case 26:
                viewBindingMakeOptionView = makeOptionView(localImageComponent, uiComponentHelper, R$raw.pi2_option_phone_icon, R$drawable.p2_option_phone_icon, new String[]{"#FFFFFF"}, new String[]{"#000000"}, config);
                if (viewBindingMakeOptionView != null) {
                }
                break;
            case 27:
                viewBindingMakeOptionView = makeOptionView(localImageComponent, uiComponentHelper, R$raw.pi2_option_user_icon, R$drawable.p2_option_user_icon, new String[]{"#FFFFFF"}, new String[]{"#000000"}, config);
                if (viewBindingMakeOptionView != null) {
                }
                break;
            case 28:
                Pi2UiImageLottieBinding pi2UiImageLottieBindingInflate19 = Pi2UiImageLottieBinding.inflate(uiComponentHelper.getLayoutInflater());
                pi2UiImageLottieBindingInflate19.lottieView.setImageResource(com.withpersona.sdk2.inquiry.steps.p423ui.R$drawable.pi2_reusable_persona_logo);
                viewBindingMakeOptionView = pi2UiImageLottieBindingInflate19;
                if (config.getStyles() != null) {
                    ThemeableLottieAnimationView lottieView10 = pi2UiImageLottieBindingInflate19.lottieView;
                    Intrinsics.checkNotNullExpressionValue(lottieView10, "lottieView");
                    ImageStyling.applyStyle(lottieView10, config.getStyles(), new String[0], new String[0], new String[0]);
                    viewBindingMakeOptionView = pi2UiImageLottieBindingInflate19;
                }
                if (viewBindingMakeOptionView != null) {
                }
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$1$lambda$0(Pi2UiImageLottieBinding pi2UiImageLottieBinding, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = pi2UiImageLottieBinding.lottieView;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        ImageStyling.applyStyle(lottieView, localImage.getStyles(), new String[]{"#02214F"}, new String[]{"#AA84FF", "#F2EAFF"}, new String[]{"#FFFFFF"});
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$4$lambda$3(Pi2UiImageViewBinding pi2UiImageViewBinding, int i) {
        ImageView imageView = pi2UiImageViewBinding.imageView;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i;
            imageView.setLayoutParams(layoutParams);
            return Unit.INSTANCE;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$6$lambda$5(Pi2UiImageLottieBinding pi2UiImageLottieBinding, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = pi2UiImageLottieBinding.lottieView;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        ImageStyling.applyStyle(lottieView, localImage.getStyles(), new String[]{"#190051"}, new String[]{"#AA84FF", "#F2EAFF"}, new String[]{"#FFFFFF"});
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$9$lambda$8(Pi2UiImageViewBinding pi2UiImageViewBinding, int i) {
        ImageView imageView = pi2UiImageViewBinding.imageView;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i;
            imageView.setLayoutParams(layoutParams);
            return Unit.INSTANCE;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$13$lambda$11(Pi2UiImageLottieBinding pi2UiImageLottieBinding) {
        ThemeableLottieAnimationView lottieView = pi2UiImageLottieBinding.lottieView;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        ViewGroup.LayoutParams layoutParams = lottieView.getLayoutParams();
        if (layoutParams != null) {
            if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                ((ConstraintLayout.LayoutParams) layoutParams).matchConstraintPercentWidth = 0.5f;
            }
            lottieView.setLayoutParams(layoutParams);
            return Unit.INSTANCE;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void makeView$lambda$13$lambda$12(Pi2UiImageLottieBinding pi2UiImageLottieBinding, LottieComposition lottieComposition) {
        pi2UiImageLottieBinding.lottieView.playAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$15$lambda$14(Pi2UiImageLottieBinding pi2UiImageLottieBinding, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = pi2UiImageLottieBinding.lottieView;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        ImageStyling.applyStyle(lottieView, localImage.getStyles(), new String[]{"#02214F"}, new String[]{"#AA84FF"}, new String[0]);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$18$lambda$17(Pi2UiImageViewBinding pi2UiImageViewBinding, int i) {
        ImageView imageView = pi2UiImageViewBinding.imageView;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i;
            imageView.setLayoutParams(layoutParams);
            return Unit.INSTANCE;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$20$lambda$19(Pi2UiImageLottieBinding pi2UiImageLottieBinding, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = pi2UiImageLottieBinding.lottieView;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        ImageStyling.applyStyle(lottieView, localImage.getStyles(), new String[]{"#190051"}, new String[]{"#AA84FF"}, new String[0]);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$23$lambda$22(Pi2UiImageViewBinding pi2UiImageViewBinding, int i) {
        ImageView imageView = pi2UiImageViewBinding.imageView;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i;
            imageView.setLayoutParams(layoutParams);
            return Unit.INSTANCE;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$25$lambda$24(Pi2UiImageLottieBinding pi2UiImageLottieBinding, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = pi2UiImageLottieBinding.lottieView;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        ImageStyling.applyStyle(lottieView, localImage.getStyles(), new String[]{"#190051"}, new String[]{"#AA84FF"}, new String[0]);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$28$lambda$27(Pi2UiImageViewBinding pi2UiImageViewBinding, int i) {
        ImageView imageView = pi2UiImageViewBinding.imageView;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i;
            imageView.setLayoutParams(layoutParams);
            return Unit.INSTANCE;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$30$lambda$29(Pi2UiImageLottieBinding pi2UiImageLottieBinding, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = pi2UiImageLottieBinding.lottieView;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        ImageStyling.applyStyle(lottieView, localImage.getStyles(), new String[]{"#190051"}, new String[]{"#AA84FF"}, new String[0]);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$33$lambda$32(Pi2UiImageViewBinding pi2UiImageViewBinding, int i) {
        ImageView imageView = pi2UiImageViewBinding.imageView;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i;
            imageView.setLayoutParams(layoutParams);
            return Unit.INSTANCE;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$35$lambda$34(Pi2UiImageLottieBinding pi2UiImageLottieBinding, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = pi2UiImageLottieBinding.lottieView;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        ImageStyling.applyStyle(lottieView, localImage.getStyles(), new String[]{"#4C4293"}, new String[]{"#B5B5CC"}, new String[0]);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$38$lambda$37(Pi2UiImageViewBinding pi2UiImageViewBinding, int i) {
        ImageView imageView = pi2UiImageViewBinding.imageView;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i;
            imageView.setLayoutParams(layoutParams);
            return Unit.INSTANCE;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$40$lambda$39(Pi2UiImageLottieBinding pi2UiImageLottieBinding, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = pi2UiImageLottieBinding.lottieView;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        ImageStyling.applyStyle(lottieView, localImage.getStyles(), new String[]{"#190051", "#02214F"}, new String[]{"#AA84FF"}, new String[]{"#AA84FF"});
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$43$lambda$42(Pi2UiImageViewBinding pi2UiImageViewBinding, int i) {
        ImageView imageView = pi2UiImageViewBinding.imageView;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i;
            imageView.setLayoutParams(layoutParams);
            return Unit.INSTANCE;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$46$lambda$44(Pi2UiImageLottieBinding pi2UiImageLottieBinding, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = pi2UiImageLottieBinding.lottieView;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        ImageStyling.applyStyle(lottieView, localImage.getStyles(), new String[]{"#190052"}, new String[]{"#F1EBFF", "#8552FF"}, new String[]{"#FFFFFF"});
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$46$lambda$45(Pi2UiImageLottieBinding pi2UiImageLottieBinding) {
        pi2UiImageLottieBinding.lottieView.setRepeatMode(1);
        pi2UiImageLottieBinding.lottieView.setRepeatCount(-1);
        pi2UiImageLottieBinding.lottieView.playAnimation();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$50$lambda$48(Pi2UiImageLottieBinding pi2UiImageLottieBinding) {
        ThemeableLottieAnimationView lottieView = pi2UiImageLottieBinding.lottieView;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        ViewGroup.LayoutParams layoutParams = lottieView.getLayoutParams();
        if (layoutParams != null) {
            if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                ((ConstraintLayout.LayoutParams) layoutParams).matchConstraintPercentWidth = 0.5f;
            }
            lottieView.setLayoutParams(layoutParams);
            return Unit.INSTANCE;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$50$lambda$49(Pi2UiImageLottieBinding pi2UiImageLottieBinding, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = pi2UiImageLottieBinding.lottieView;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        ImageStyling.applyStyle(lottieView, localImage.getStyles(), new String[]{"#02214F", "#190051"}, new String[]{"#E5E5EA"}, new String[0]);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$54$lambda$51(Pi2UiImageLottieBinding pi2UiImageLottieBinding, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = pi2UiImageLottieBinding.lottieView;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        ImageStyling.applyStyle(lottieView, localImage.getStyles(), new String[]{"#280087"}, new String[0], new String[0]);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$54$lambda$53(Pi2UiImageLottieBinding pi2UiImageLottieBinding) {
        ThemeableLottieAnimationView lottieView = pi2UiImageLottieBinding.lottieView;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        ViewGroup.LayoutParams layoutParams = lottieView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).matchConstraintPercentWidth = 0.5f;
        }
        lottieView.setLayoutParams(layoutParams);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$57$lambda$55(Pi2UiImageLottieBinding pi2UiImageLottieBinding, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = pi2UiImageLottieBinding.lottieView;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        ImageStyling.applyStyle(lottieView, localImage.getStyles(), new String[]{"#280087", "#322A7E"}, new String[]{"#CBB1FF"}, new String[]{"#F1EBFF"});
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$57$lambda$56(Pi2UiImageLottieBinding pi2UiImageLottieBinding) {
        pi2UiImageLottieBinding.lottieView.setRepeatMode(1);
        pi2UiImageLottieBinding.lottieView.setRepeatCount(-1);
        pi2UiImageLottieBinding.lottieView.playAnimation();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$60$lambda$58(Pi2UiImageLottieBinding pi2UiImageLottieBinding, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = pi2UiImageLottieBinding.lottieView;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        ImageStyling.applyStyle(lottieView, localImage.getStyles(), new String[]{"#280087", "#322A7E"}, new String[]{"#CBB1FF"}, new String[]{"#F1EBFF"});
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$60$lambda$59(Pi2UiImageLottieBinding pi2UiImageLottieBinding) {
        pi2UiImageLottieBinding.lottieView.setRepeatMode(1);
        pi2UiImageLottieBinding.lottieView.setRepeatCount(-1);
        pi2UiImageLottieBinding.lottieView.playAnimation();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$63$lambda$61(Pi2UiImageLottieBinding pi2UiImageLottieBinding, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = pi2UiImageLottieBinding.lottieView;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        ImageStyling.applyStyle(lottieView, localImage.getStyles(), new String[]{"#280087", "#322A7E"}, new String[]{"#CBB1FF"}, new String[]{"#F1EBFF"});
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$63$lambda$62(Pi2UiImageLottieBinding pi2UiImageLottieBinding) {
        pi2UiImageLottieBinding.lottieView.setRepeatMode(1);
        pi2UiImageLottieBinding.lottieView.setRepeatCount(-1);
        pi2UiImageLottieBinding.lottieView.playAnimation();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$66$lambda$64(Pi2UiImageLottieBinding pi2UiImageLottieBinding, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = pi2UiImageLottieBinding.lottieView;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        ImageStyling.applyStyle(lottieView, localImage.getStyles(), new String[]{"#280087", "#322A7E"}, new String[]{"#CBB1FF"}, new String[]{"#F1EBFF"});
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$66$lambda$65(Pi2UiImageLottieBinding pi2UiImageLottieBinding) {
        pi2UiImageLottieBinding.lottieView.setRepeatMode(1);
        pi2UiImageLottieBinding.lottieView.setRepeatCount(-1);
        pi2UiImageLottieBinding.lottieView.playAnimation();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$69$lambda$67(Pi2UiImageLottieBinding pi2UiImageLottieBinding, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = pi2UiImageLottieBinding.lottieView;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        ImageStyling.applyStyle(lottieView, localImage.getStyles(), new String[]{"#280087", "#322A7E"}, new String[]{"#CBB1FF"}, new String[]{"#F1EBFF"});
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$69$lambda$68(Pi2UiImageLottieBinding pi2UiImageLottieBinding) {
        pi2UiImageLottieBinding.lottieView.setRepeatMode(1);
        pi2UiImageLottieBinding.lottieView.setRepeatCount(-1);
        pi2UiImageLottieBinding.lottieView.playAnimation();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$72$lambda$71(Pi2UiImageLottieBinding pi2UiImageLottieBinding) {
        ThemeableLottieAnimationView lottieView = pi2UiImageLottieBinding.lottieView;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        ViewGroup.LayoutParams layoutParams = lottieView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = (int) ExtensionsKt.getDpToPx(44.0d);
        lottieView.setLayoutParams(layoutParams);
        return Unit.INSTANCE;
    }

    public static final ViewBinding makeOptionView(LocalImageComponent localImageComponent, UiComponentHelper uiComponentHelper, int i, int i2, final String[] originalStrokeColors, final String[] originalFillColors, final LocalImage config) {
        Intrinsics.checkNotNullParameter(localImageComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(originalStrokeColors, "originalStrokeColors");
        Intrinsics.checkNotNullParameter(originalFillColors, "originalFillColors");
        Intrinsics.checkNotNullParameter(config, "config");
        if (config.getStyles() != null) {
            final Pi2UiImageLottieBinding pi2UiImageLottieBindingInflate = Pi2UiImageLottieBinding.inflate(uiComponentHelper.getLayoutInflater());
            pi2UiImageLottieBindingInflate.lottieView.setAnimation(i);
            uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda35
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LocalImageComponent2.makeOptionView$lambda$75$lambda$74(pi2UiImageLottieBindingInflate, config, originalStrokeColors, originalFillColors);
                }
            });
            Intrinsics.checkNotNull(pi2UiImageLottieBindingInflate);
            return pi2UiImageLottieBindingInflate;
        }
        final int dimension = (int) uiComponentHelper.getContext().getResources().getDimension(R$dimen.pi2_small_default_option_local_image_height);
        final Pi2UiImageViewBinding pi2UiImageViewBindingInflate = Pi2UiImageViewBinding.inflate(uiComponentHelper.getLayoutInflater());
        pi2UiImageViewBindingInflate.imageView.setImageResource(i2);
        uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda36
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalImageComponent2.makeOptionView$lambda$78$lambda$77(pi2UiImageViewBindingInflate, dimension);
            }
        });
        Intrinsics.checkNotNull(pi2UiImageViewBindingInflate);
        return pi2UiImageViewBindingInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeOptionView$lambda$75$lambda$74(Pi2UiImageLottieBinding pi2UiImageLottieBinding, LocalImage localImage, String[] strArr, String[] strArr2) {
        ThemeableLottieAnimationView lottieView = pi2UiImageLottieBinding.lottieView;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        ImageStyling.applyStyle(lottieView, localImage.getStyles(), strArr, strArr2, new String[0]);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeOptionView$lambda$78$lambda$77(Pi2UiImageViewBinding pi2UiImageViewBinding, int i) {
        ImageView imageView = pi2UiImageViewBinding.imageView;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i;
        imageView.setLayoutParams(layoutParams);
        return Unit.INSTANCE;
    }
}
