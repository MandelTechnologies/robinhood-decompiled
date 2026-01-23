package com.robinhood.android.common.p088ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.rxjava2.RxJava2Adapter;
import androidx.fragment.app.Fragment;
import androidx.view.result.ActivityResultCaller;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.designsystem.pog.RdsPogView;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.style.DesignSystemOverlay;
import com.robinhood.android.designsystem.style.GoldOverlay;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.DirectResourceReference;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.StyleResource;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* compiled from: RhBottomSheetDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\b\u0017\u0018\u0000 \u0094\u00012\u00020\u0001:\b\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0083\u0001\u001a\u00020z2\b\u0010\u0084\u0001\u001a\u00030\u0085\u0001H\u0016J\u001e\u0010\u0086\u0001\u001a\u00020z2\b\u0010\u0087\u0001\u001a\u00030\u0088\u00012\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010cH\u0016J\t\u0010\u008a\u0001\u001a\u00020zH\u0002J\u001d\u0010\u008b\u0001\u001a\u00020\u000f2\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010S2\u0007\u0010\u008d\u0001\u001a\u00020\u000fH\u0002J\t\u0010\u008e\u0001\u001a\u00020zH\u0014J\t\u0010\u008f\u0001\u001a\u00020zH\u0014J\t\u0010\u0090\u0001\u001a\u00020zH\u0014R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u0007\u0010\bR(\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\t@DX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000f@BX\u0082\u000e¢\u0006\n\n\u0002\u0010\u0013\"\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u000f8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\u001f\u0010 R\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b$\u0010%R\u001b\u0010'\u001a\u00020(8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u001c\u001a\u0004\b)\u0010*R\u001b\u0010,\u001a\u00020(8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u001c\u001a\u0004\b-\u0010*R\u001b\u0010/\u001a\u00020(8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u001c\u001a\u0004\b0\u0010*R\u001b\u00102\u001a\u0002038DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u001c\u001a\u0004\b4\u00105R\u001b\u00107\u001a\u0002088DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\u001c\u001a\u0004\b9\u0010:R\u001b\u0010<\u001a\u00020=8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b@\u0010\u001c\u001a\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020\u000f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0016\u0010D\u001a\u0004\u0018\u00010E8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0016\u0010H\u001a\u0004\u0018\u00010E8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bI\u0010GR\u0016\u0010J\u001a\u0004\u0018\u00010E8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bK\u0010GR\u0016\u0010L\u001a\u0004\u0018\u00010M8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0016\u0010P\u001a\u0004\u0018\u00010E8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010GR\u0016\u0010R\u001a\u0004\u0018\u00010S8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0016\u0010V\u001a\u0004\u0018\u00010E8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bW\u0010GR\u0016\u0010X\u001a\u0004\u0018\u00010Y8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0016\u0010\\\u001a\u0004\u0018\u00010]8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0016\u0010`\u001a\u0004\u0018\u00010Y8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\ba\u0010[R\u0016\u0010b\u001a\u0004\u0018\u00010c8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0016\u0010f\u001a\u0004\u0018\u00010\u000f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bg\u0010\u0016R\u0014\u0010h\u001a\u00020Y8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0014\u0010k\u001a\u00020Y8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bl\u0010jR\u0014\u0010m\u001a\u00020Y8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bn\u0010jR\u0014\u0010o\u001a\u00020Y8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bp\u0010jR\u0016\u0010q\u001a\u0004\u0018\u00010\u000f8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\br\u0010\u0016R\u001c\u0010s\u001a\n\u0012\u0004\u0012\u00020u\u0018\u00010t8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bv\u0010wR\u001c\u0010x\u001a\n\u0012\u0004\u0012\u00020z\u0018\u00010yX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b{\u0010|R\u0014\u0010}\u001a\u00020]8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b~\u0010_R\u0017\u0010\u007f\u001a\u00030\u0080\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001¨\u0006\u0095\u0001²\u0006\f\u0010\u0096\u0001\u001a\u00030\u0097\u0001X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "<init>", "()V", "value", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragment$SheetDrawable;", "sheetDrawable", "setSheetDrawable", "(Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragment$SheetDrawable;)V", "Landroid/graphics/drawable/Drawable;", "iconDrawable", "getIconDrawable", "()Landroid/graphics/drawable/Drawable;", "setIconDrawable", "(Landroid/graphics/drawable/Drawable;)V", "", "drawableRes", "setDrawableRes", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "iconDrawableRes", "getIconDrawableRes", "()Ljava/lang/Integer;", "iconContainer", "Landroid/view/ViewGroup;", "getIconContainer", "()Landroid/view/ViewGroup;", "iconContainer$delegate", "Lkotlin/properties/ReadOnlyProperty;", "iconImg", "Landroid/widget/ImageView;", "getIconImg", "()Landroid/widget/ImageView;", "iconImg$delegate", "pog", "Lcom/robinhood/android/designsystem/pog/RdsPogView;", "getPog", "()Lcom/robinhood/android/designsystem/pog/RdsPogView;", "pog$delegate", "titleTxt", "Landroid/widget/TextView;", "getTitleTxt", "()Landroid/widget/TextView;", "titleTxt$delegate", "subtitleTxt", "getSubtitleTxt", "subtitleTxt$delegate", "descriptionTxt", "getDescriptionTxt", "descriptionTxt$delegate", "composableView", "Landroidx/compose/ui/platform/ComposeView;", "getComposableView", "()Landroidx/compose/ui/platform/ComposeView;", "composableView$delegate", "primaryButtonViewStub", "Landroid/view/ViewStub;", "getPrimaryButtonViewStub", "()Landroid/view/ViewStub;", "primaryButtonViewStub$delegate", "secondaryBtn", "Landroid/widget/Button;", "getSecondaryBtn", "()Landroid/widget/Button;", "secondaryBtn$delegate", "dialogId", "getDialogId", "()I", "titleTextLabel", "", "getTitleTextLabel", "()Ljava/lang/CharSequence;", "subtitleTextLabel", "getSubtitleTextLabel", "descriptionTextLabel", "getDescriptionTextLabel", "bodyComposable", "Lcom/robinhood/android/common/ui/ParcelableComposable;", "getBodyComposable", "()Lcom/robinhood/android/common/ui/ParcelableComposable;", "primaryButtonLabel", "getPrimaryButtonLabel", "overridePrimaryButtonType", "Lcom/robinhood/android/common/ui/RhButtonType;", "getOverridePrimaryButtonType", "()Lcom/robinhood/android/common/ui/RhButtonType;", "secondaryButtonLabel", "getSecondaryButtonLabel", "showLearnMore", "", "getShowLearnMore", "()Ljava/lang/Boolean;", "learnMoreStr", "", "getLearnMoreStr", "()Ljava/lang/String;", "dismissOnLearnMore", "getDismissOnLearnMore", "passthroughArgs", "Landroid/os/Bundle;", "getPassthroughArgs", "()Landroid/os/Bundle;", "descriptionGravity", "getDescriptionGravity", "forCrypto", "getForCrypto", "()Z", "forAchromatic", "getForAchromatic", "forGold", "getForGold", "forNight", "getForNight", "customThemeId", "getCustomThemeId", "customTheme", "Lcom/robinhood/scarlet/util/resource/DirectResourceReference;", "Lcom/robinhood/scarlet/util/resource/StyleResource;", "getCustomTheme", "()Lcom/robinhood/scarlet/util/resource/DirectResourceReference;", "descriptionLearnMoreAction", "Lkotlin/Function0;", "", "getDescriptionLearnMoreAction", "()Lkotlin/jvm/functions/Function0;", "screenName", "getScreenName", "scarletManager", "Lcom/robinhood/scarlet/ScarletManager;", "getScarletManager", "()Lcom/robinhood/scarlet/ScarletManager;", "onAttach", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "updateDayNightOverlay", "determineButtonInflateLayout", "buttonTypeOverride", "defaultButtonLayout", "onPrimaryButtonClicked", "onSecondaryButtonClicked", "onLearnMoreActionClicked", "OnClickListener", "SheetDrawable", "Args", "Companion", "lib-common_externalRelease", "themesFromScarlet", "Lcom/robinhood/android/designsystem/compose/ThemesFromScarlet;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public class RhBottomSheetDialogFragment extends BaseBottomSheetDialogFragment {

    /* renamed from: composableView$delegate, reason: from kotlin metadata */
    private final Interfaces2 composableView;
    private final Function0<Unit> descriptionLearnMoreAction;

    /* renamed from: descriptionTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 descriptionTxt;
    private Integer drawableRes;

    /* renamed from: iconContainer$delegate, reason: from kotlin metadata */
    private final Interfaces2 iconContainer;
    private Drawable iconDrawable;

    /* renamed from: iconImg$delegate, reason: from kotlin metadata */
    private final Interfaces2 iconImg;

    /* renamed from: pog$delegate, reason: from kotlin metadata */
    private final Interfaces2 pog;

    /* renamed from: primaryButtonViewStub$delegate, reason: from kotlin metadata */
    private final Interfaces2 primaryButtonViewStub;

    /* renamed from: secondaryBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 secondaryBtn;
    private SheetDrawable sheetDrawable;

    /* renamed from: subtitleTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 subtitleTxt;

    /* renamed from: titleTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 titleTxt;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RhBottomSheetDialogFragment.class, "iconContainer", "getIconContainer()Landroid/view/ViewGroup;", 0)), Reflection.property1(new PropertyReference1Impl(RhBottomSheetDialogFragment.class, "iconImg", "getIconImg()Landroid/widget/ImageView;", 0)), Reflection.property1(new PropertyReference1Impl(RhBottomSheetDialogFragment.class, "pog", "getPog()Lcom/robinhood/android/designsystem/pog/RdsPogView;", 0)), Reflection.property1(new PropertyReference1Impl(RhBottomSheetDialogFragment.class, "titleTxt", "getTitleTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(RhBottomSheetDialogFragment.class, "subtitleTxt", "getSubtitleTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(RhBottomSheetDialogFragment.class, "descriptionTxt", "getDescriptionTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(RhBottomSheetDialogFragment.class, "composableView", "getComposableView()Landroidx/compose/ui/platform/ComposeView;", 0)), Reflection.property1(new PropertyReference1Impl(RhBottomSheetDialogFragment.class, "primaryButtonViewStub", "getPrimaryButtonViewStub()Landroid/view/ViewStub;", 0)), Reflection.property1(new PropertyReference1Impl(RhBottomSheetDialogFragment.class, "secondaryBtn", "getSecondaryBtn()Landroid/widget/Button;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RhBottomSheetDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u001c\u0010\b\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u001c\u0010\t\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragment$OnClickListener;", "", "onPrimaryButtonClicked", "", "dialogId", "", "passthroughArgs", "Landroid/os/Bundle;", "onSecondaryButtonClicked", "onLearnMoreActionClicked", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public interface OnClickListener {

        /* compiled from: RhBottomSheetDialogFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes2.dex */
        public static final class DefaultImpls {
            public static boolean onLearnMoreActionClicked(OnClickListener onClickListener, int i, Bundle bundle) {
                return false;
            }
        }

        boolean onLearnMoreActionClicked(int dialogId, Bundle passthroughArgs);

        boolean onPrimaryButtonClicked(int dialogId, Bundle passthroughArgs);

        boolean onSecondaryButtonClicked(int dialogId, Bundle passthroughArgs);
    }

    /* compiled from: RhBottomSheetDialogFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RhButtonType.values().length];
            try {
                iArr[RhButtonType.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RhButtonType.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RhBottomSheetDialogFragment() {
        super(C11048R.layout.fragment_bottom_sheet);
        this.iconContainer = bindView(C11048R.id.bottom_sheet_img_container);
        this.iconImg = bindView(C11048R.id.bottom_sheet_icon_img);
        this.pog = bindView(C11048R.id.bottom_sheet_pictogram);
        this.titleTxt = bindView(C11048R.id.bottom_sheet_title_txt);
        this.subtitleTxt = bindView(C11048R.id.bottom_sheet_subtitle_txt);
        this.descriptionTxt = bindView(C11048R.id.bottom_sheet_description_txt);
        this.composableView = bindView(C11048R.id.composable_view);
        this.primaryButtonViewStub = bindView(C11048R.id.bottom_sheet_primary_btn);
        this.secondaryBtn = bindView(C11048R.id.bottom_sheet_secondary_btn);
        if (getArguments() == null) {
            setArguments(new Bundle());
        }
    }

    /* compiled from: RhBottomSheetDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\b\tB\u0013\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragment$SheetDrawable;", "", ResourceTypes.DRAWABLE, "Landroid/graphics/drawable/Drawable;", "<init>", "(Landroid/graphics/drawable/Drawable;)V", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "Icon", "Pog", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragment$SheetDrawable$Icon;", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragment$SheetDrawable$Pog;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static abstract class SheetDrawable {
        private final Drawable drawable;

        public /* synthetic */ SheetDrawable(Drawable drawable, DefaultConstructorMarker defaultConstructorMarker) {
            this(drawable);
        }

        /* compiled from: RhBottomSheetDialogFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragment$SheetDrawable$Icon;", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragment$SheetDrawable;", ResourceTypes.DRAWABLE, "Landroid/graphics/drawable/Drawable;", "<init>", "(Landroid/graphics/drawable/Drawable;)V", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Icon extends SheetDrawable {
            public static final int $stable = 8;

            public Icon(Drawable drawable) {
                super(drawable, null);
            }
        }

        private SheetDrawable(Drawable drawable) {
            this.drawable = drawable;
        }

        public final Drawable getDrawable() {
            return this.drawable;
        }

        /* compiled from: RhBottomSheetDialogFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragment$SheetDrawable$Pog;", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragment$SheetDrawable;", ResourceTypes.DRAWABLE, "Landroid/graphics/drawable/Drawable;", "<init>", "(Landroid/graphics/drawable/Drawable;)V", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Pog extends SheetDrawable {
            public static final int $stable = 8;

            public Pog(Drawable drawable) {
                super(drawable, null);
            }
        }
    }

    private final void setSheetDrawable(SheetDrawable sheetDrawable) {
        this.sheetDrawable = sheetDrawable;
        getIconContainer().setVisibility(sheetDrawable != null ? 0 : 8);
        if (sheetDrawable != null) {
            if (sheetDrawable instanceof SheetDrawable.Icon) {
                getIconImg().setVisibility(0);
                getPog().setVisibility(8);
                getIconImg().setImageDrawable(((SheetDrawable.Icon) sheetDrawable).getDrawable());
            } else {
                if (!(sheetDrawable instanceof SheetDrawable.Pog)) {
                    throw new NoWhenBranchMatchedException();
                }
                getIconImg().setVisibility(8);
                getPog().setVisibility(0);
                getPog().setPictogram(((SheetDrawable.Pog) sheetDrawable).getDrawable());
            }
        }
    }

    protected final Drawable getIconDrawable() {
        return this.iconDrawable;
    }

    protected final void setIconDrawable(Drawable drawable) {
        setSheetDrawable(new SheetDrawable.Icon(drawable));
    }

    private final void setDrawableRes(Integer num) throws Resources.NotFoundException {
        SheetDrawable icon;
        SheetDrawable sheetDrawable = null;
        if (num != null) {
            String resourceEntryName = getResources().getResourceEntryName(num.intValue());
            Intrinsics.checkNotNullExpressionValue(resourceEntryName, "getResourceEntryName(...)");
            if (StringsKt.startsWith$default(resourceEntryName, "pict_", false, 2, (Object) null)) {
                Resources resources = getResources();
                int iIntValue = num.intValue();
                Context context = getContext();
                icon = new SheetDrawable.Pog(resources.getDrawable(iIntValue, context != null ? context.getTheme() : null));
            } else {
                Resources resources2 = getResources();
                int iIntValue2 = num.intValue();
                Context context2 = getContext();
                icon = new SheetDrawable.Icon(resources2.getDrawable(iIntValue2, context2 != null ? context2.getTheme() : null));
            }
            sheetDrawable = icon;
        }
        setSheetDrawable(sheetDrawable);
    }

    protected Integer getIconDrawableRes() {
        Args args = (Args) INSTANCE.getArgs((Fragment) this);
        if (args != null) {
            return args.getIconDrawableRes();
        }
        return null;
    }

    private final ViewGroup getIconContainer() {
        return (ViewGroup) this.iconContainer.getValue(this, $$delegatedProperties[0]);
    }

    private final ImageView getIconImg() {
        return (ImageView) this.iconImg.getValue(this, $$delegatedProperties[1]);
    }

    private final RdsPogView getPog() {
        return (RdsPogView) this.pog.getValue(this, $$delegatedProperties[2]);
    }

    protected final TextView getTitleTxt() {
        return (TextView) this.titleTxt.getValue(this, $$delegatedProperties[3]);
    }

    protected final TextView getSubtitleTxt() {
        return (TextView) this.subtitleTxt.getValue(this, $$delegatedProperties[4]);
    }

    protected final TextView getDescriptionTxt() {
        return (TextView) this.descriptionTxt.getValue(this, $$delegatedProperties[5]);
    }

    protected final ComposeView getComposableView() {
        return (ComposeView) this.composableView.getValue(this, $$delegatedProperties[6]);
    }

    protected final ViewStub getPrimaryButtonViewStub() {
        return (ViewStub) this.primaryButtonViewStub.getValue(this, $$delegatedProperties[7]);
    }

    protected final Button getSecondaryBtn() {
        return (Button) this.secondaryBtn.getValue(this, $$delegatedProperties[8]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment
    public int getDialogId() {
        Args args = (Args) INSTANCE.getArgs((Fragment) this);
        if (args != null) {
            return args.getId();
        }
        return 0;
    }

    protected CharSequence getTitleTextLabel() {
        Args args = (Args) INSTANCE.getArgs((Fragment) this);
        if (args != null) {
            return args.getTitle();
        }
        return null;
    }

    protected CharSequence getSubtitleTextLabel() {
        Args args = (Args) INSTANCE.getArgs((Fragment) this);
        if (args != null) {
            return args.getSubtitle();
        }
        return null;
    }

    protected CharSequence getDescriptionTextLabel() {
        Args args = (Args) INSTANCE.getArgs((Fragment) this);
        if (args != null) {
            return args.getDescription();
        }
        return null;
    }

    protected RhBottomSheetDialogFragment2 getBodyComposable() {
        Args args = (Args) INSTANCE.getArgs((Fragment) this);
        if (args != null) {
            return args.getBodyComposable();
        }
        return null;
    }

    protected CharSequence getPrimaryButtonLabel() {
        Args args = (Args) INSTANCE.getArgs((Fragment) this);
        if (args != null) {
            return args.getPrimaryButtonLabel();
        }
        return null;
    }

    protected RhButtonType getOverridePrimaryButtonType() {
        Args args = (Args) INSTANCE.getArgs((Fragment) this);
        if (args != null) {
            return args.getOverridePrimaryButtonType();
        }
        return null;
    }

    protected CharSequence getSecondaryButtonLabel() {
        Args args = (Args) INSTANCE.getArgs((Fragment) this);
        if (args != null) {
            return args.getSecondaryButtonLabel();
        }
        return null;
    }

    protected Boolean getShowLearnMore() {
        Args args = (Args) INSTANCE.getArgs((Fragment) this);
        if (args != null) {
            return Boolean.valueOf(args.getShowLearnMore());
        }
        return null;
    }

    protected String getLearnMoreStr() {
        Args args = (Args) INSTANCE.getArgs((Fragment) this);
        if (args != null) {
            return args.getLearnMoreStr();
        }
        return null;
    }

    protected Boolean getDismissOnLearnMore() {
        Args args = (Args) INSTANCE.getArgs((Fragment) this);
        if (args != null) {
            return Boolean.valueOf(args.getDismissOnLearnMore());
        }
        return null;
    }

    protected Bundle getPassthroughArgs() {
        Args args = (Args) INSTANCE.getArgs((Fragment) this);
        if (args != null) {
            return args.getPassthroughArgs();
        }
        return null;
    }

    protected Integer getDescriptionGravity() {
        Args args = (Args) INSTANCE.getArgs((Fragment) this);
        if (args != null) {
            return args.getDescriptionGravity();
        }
        return null;
    }

    protected boolean getForCrypto() {
        Args args = (Args) INSTANCE.getArgs((Fragment) this);
        if (args != null) {
            return args.getForCrypto();
        }
        return false;
    }

    protected boolean getForAchromatic() {
        Args args = (Args) INSTANCE.getArgs((Fragment) this);
        if (args != null) {
            return args.getForAchromatic();
        }
        return false;
    }

    protected boolean getForGold() {
        Args args = (Args) INSTANCE.getArgs((Fragment) this);
        if (args != null) {
            return args.getForGold();
        }
        return false;
    }

    protected boolean getForNight() {
        Args args = (Args) INSTANCE.getArgs((Fragment) this);
        if (args != null) {
            return args.getForNight();
        }
        return false;
    }

    protected Integer getCustomThemeId() {
        Args args = (Args) INSTANCE.getArgs((Fragment) this);
        if (args != null) {
            return args.getThemeId();
        }
        return null;
    }

    protected DirectResourceReference<StyleResource> getCustomTheme() {
        Integer themeId;
        Args args = (Args) INSTANCE.getArgs((Fragment) this);
        if (args == null || (themeId = args.getThemeId()) == null) {
            return null;
        }
        return new DirectResourceReference<>(ResourceType.STYLE.INSTANCE, themeId.intValue());
    }

    protected Function0<Unit> getDescriptionLearnMoreAction() {
        return this.descriptionLearnMoreAction;
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        String screenName;
        Args args = (Args) INSTANCE.getArgs((Fragment) this);
        return (args == null || (screenName = args.getScreenName()) == null) ? super.getScreenName() : screenName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ScarletManager getScarletManager() {
        ScarletManager scarletManager;
        ScarletContextWrapper scarletContextWrapper = getScarletContextWrapper();
        if (scarletContextWrapper != null && (scarletManager = ScarletManager2.getScarletManager(scarletContextWrapper)) != null) {
            return scarletManager;
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return ScarletManager2.getScarletManager(contextRequireContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ad  */
    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttach(Context context) {
        ScarletManager scarletManager;
        ScarletManager scarletManager2;
        ScarletManager scarletManager3;
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        LifecycleHost.DefaultImpls.bind$default(this, Fragments2.getBaseActivity(this).getDayNightStyleChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.ui.RhBottomSheetDialogFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhBottomSheetDialogFragment.onAttach$lambda$1(this.f$0, (DayNightOverlay) obj);
            }
        });
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, getCustomTheme(), 2, null);
        if (getCustomThemeId() == null) {
            putDesignSystemOverlay(scarletContextWrapper);
        }
        if (!getForAchromatic()) {
            Fragment parentFragment = getParentFragment();
            BaseFragment baseFragment = parentFragment instanceof BaseFragment ? (BaseFragment) parentFragment : null;
            if (baseFragment != null && (scarletManager3 = baseFragment.getScarletManager()) != null && scarletManager3.contains(AchromaticOverlay.INSTANCE)) {
                ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), AchromaticOverlay.INSTANCE, null, 2, null);
            }
        }
        if (!getForGold()) {
            Fragment parentFragment2 = getParentFragment();
            BaseFragment baseFragment2 = parentFragment2 instanceof BaseFragment ? (BaseFragment) parentFragment2 : null;
            if (baseFragment2 != null && (scarletManager2 = baseFragment2.getScarletManager()) != null && scarletManager2.contains(GoldOverlay.INSTANCE)) {
                ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), GoldOverlay.INSTANCE, null, 2, null);
            }
        }
        if (!getForNight()) {
            Fragment parentFragment3 = getParentFragment();
            BaseFragment baseFragment3 = parentFragment3 instanceof BaseFragment ? (BaseFragment) parentFragment3 : null;
            if (baseFragment3 != null && (scarletManager = baseFragment3.getScarletManager()) != null && scarletManager.contains(DayNightOverlay.NIGHT)) {
                ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), DayNightOverlay.NIGHT, null, 2, null);
            }
        }
        setScarletContextWrapper(scarletContextWrapper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttach$lambda$1(RhBottomSheetDialogFragment rhBottomSheetDialogFragment, DayNightOverlay overlay) {
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        if (rhBottomSheetDialogFragment.getScarletManager().contains(DesignSystemOverlay.INSTANCE)) {
            rhBottomSheetDialogFragment.getScarletManager().putOverlay(overlay, Boolean.FALSE);
            rhBottomSheetDialogFragment.updateDayNightOverlay();
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) throws Resources.NotFoundException {
        Boolean isCancelable;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        view.setId(getDialogId());
        Integer iconDrawableRes = getIconDrawableRes();
        if (iconDrawableRes == null) {
            Args args = (Args) INSTANCE.getArgs((Fragment) this);
            iconDrawableRes = args != null ? args.getIconDrawableRes() : null;
        }
        setDrawableRes(iconDrawableRes);
        TextViewsKt.setVisibilityText(getTitleTxt(), getTitleTextLabel());
        TextViewsKt.setVisibilityText(getSubtitleTxt(), getSubtitleTextLabel());
        if (Intrinsics.areEqual(getShowLearnMore(), Boolean.TRUE)) {
            CharSequence descriptionTextLabel = getDescriptionTextLabel();
            if (descriptionTextLabel != null) {
                com.robinhood.android.common.util.extensions.TextViewsKt.setTextWithLearnMore(getDescriptionTxt(), descriptionTextLabel, true, true, getLearnMoreStr(), (ClickableSpan) new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.common.ui.RhBottomSheetDialogFragment$onViewCreated$lambda$3$$inlined$setTextWithLearnMore$1
                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        this.$receiver$inlined.onLearnMoreActionClicked();
                    }
                }, 1, (DefaultConstructorMarker) null));
            }
        } else {
            TextViewsKt.setVisibilityText(getDescriptionTxt(), getDescriptionTextLabel());
        }
        if (getBodyComposable() != null) {
            ComposeView composableView = getComposableView();
            composableView.setVisibility(0);
            composableView.setContent(ComposableLambda3.composableLambdaInstance(1600381227, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.ui.RhBottomSheetDialogFragment$onViewCreated$2$1
                private static final ThemesFromScarlet invoke$lambda$0(SnapshotState4<ThemesFromScarlet> snapshotState4) {
                    return snapshotState4.getValue();
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    if ((i & 3) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1600381227, i, -1, "com.robinhood.android.common.ui.RhBottomSheetDialogFragment.onViewCreated.<anonymous>.<anonymous> (RhBottomSheetDialogFragment.kt:242)");
                    }
                    SnapshotState4 snapshotState4SubscribeAsState = RxJava2Adapter.subscribeAsState(ScarletComposeInterop.themeChangesForCompose(this.this$0.getScarletManager()), ScarletComposeInterop.themesForCompose(this.this$0.getScarletManager()), composer, 0);
                    RhBottomSheetDialogFragment2 bodyComposable = this.this$0.getBodyComposable();
                    if (bodyComposable != null) {
                        bodyComposable.Content(invoke$lambda$0(snapshotState4SubscribeAsState), composer, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        }
        Integer descriptionGravity = getDescriptionGravity();
        if (descriptionGravity != null) {
            getDescriptionTxt().setGravity(descriptionGravity.intValue());
        }
        CharSequence primaryButtonLabel = getPrimaryButtonLabel();
        if (primaryButtonLabel != null && primaryButtonLabel.length() != 0) {
            getPrimaryButtonViewStub().setLayoutResource(determineButtonInflateLayout(getOverridePrimaryButtonType(), C11048R.layout.fragment_bottom_sheet_primary_button));
            View viewInflate = getPrimaryButtonViewStub().inflate();
            Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.Button");
            Button button = (Button) viewInflate;
            TextViewsKt.setVisibilityText(button, getPrimaryButtonLabel());
            OnClickListeners.onClick(button, new Function0() { // from class: com.robinhood.android.common.ui.RhBottomSheetDialogFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RhBottomSheetDialogFragment.onViewCreated$lambda$7$lambda$6(this.f$0);
                }
            });
        }
        TextViewsKt.setVisibilityText(getSecondaryBtn(), getSecondaryButtonLabel());
        OnClickListeners.onClick(getSecondaryBtn(), new Function0() { // from class: com.robinhood.android.common.ui.RhBottomSheetDialogFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhBottomSheetDialogFragment.onViewCreated$lambda$8(this.f$0);
            }
        });
        Args args2 = (Args) INSTANCE.getArgs((Fragment) this);
        if (args2 == null || (isCancelable = args2.getIsCancelable()) == null) {
            return;
        }
        setCancelable(isCancelable.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7$lambda$6(RhBottomSheetDialogFragment rhBottomSheetDialogFragment) {
        rhBottomSheetDialogFragment.onPrimaryButtonClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$8(RhBottomSheetDialogFragment rhBottomSheetDialogFragment) {
        rhBottomSheetDialogFragment.onSecondaryButtonClicked();
        return Unit.INSTANCE;
    }

    private final void updateDayNightOverlay() {
        ScarletManager scarletManager = getScarletManager();
        DayNightOverlay dayNightOverlay = DayNightOverlay.NIGHT;
        if (!scarletManager.contains(dayNightOverlay)) {
            dayNightOverlay = DayNightOverlay.DAY;
        }
        getScarletManager().putOverlay(dayNightOverlay, Boolean.FALSE);
    }

    private final int determineButtonInflateLayout(RhButtonType buttonTypeOverride, int defaultButtonLayout) {
        int i = buttonTypeOverride == null ? -1 : WhenMappings.$EnumSwitchMapping$0[buttonTypeOverride.ordinal()];
        if (i != 1) {
            return i != 2 ? defaultButtonLayout : C11048R.layout.fragment_bottom_sheet_secondary_button;
        }
        return C11048R.layout.fragment_bottom_sheet_primary_button;
    }

    protected void onPrimaryButtonClicked() {
        dismiss();
        ActivityResultCaller currentFragment = Fragments2.getBaseActivity(this).getCurrentFragment();
        if (currentFragment instanceof OnClickListener ? ((OnClickListener) currentFragment).onPrimaryButtonClicked(getDialogId(), getPassthroughArgs()) : false) {
            return;
        }
        Fragments2.getBaseActivity(this).onPrimaryButtonClicked(getDialogId(), getPassthroughArgs());
    }

    protected void onSecondaryButtonClicked() {
        dismiss();
        ActivityResultCaller currentFragment = Fragments2.getBaseActivity(this).getCurrentFragment();
        if (currentFragment instanceof OnClickListener ? ((OnClickListener) currentFragment).onSecondaryButtonClicked(getDialogId(), getPassthroughArgs()) : false) {
            return;
        }
        Fragments2.getBaseActivity(this).onSecondaryButtonClicked(getDialogId(), getPassthroughArgs());
    }

    protected void onLearnMoreActionClicked() {
        if (Intrinsics.areEqual(getDismissOnLearnMore(), Boolean.TRUE)) {
            dismiss();
        }
        Function0<Unit> descriptionLearnMoreAction = getDescriptionLearnMoreAction();
        if (descriptionLearnMoreAction != null) {
            descriptionLearnMoreAction.invoke();
        }
        ActivityResultCaller currentFragment = Fragments2.getBaseActivity(this).getCurrentFragment();
        if (currentFragment instanceof OnClickListener ? ((OnClickListener) currentFragment).onLearnMoreActionClicked(getDialogId(), getPassthroughArgs()) : false) {
            return;
        }
        Fragments2.getBaseActivity(this).onLearnMoreActionClicked(getDialogId(), getPassthroughArgs());
    }

    /* compiled from: RhBottomSheetDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001Bõ\u0001\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0010\u0012\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010?\u001a\u00020\u0003H\u0016J\u0018\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010#R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b1\u00100R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010.\u001a\u0004\b6\u0010-R\u0011\u0010\u0017\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b7\u00100R\u0011\u0010\u0018\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b8\u00100R\u0011\u0010\u0019\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b9\u00100R\u0011\u0010\u001a\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b:\u00100R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010.\u001a\u0004\b;\u0010-R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010=\u001a\u0004\b\u001c\u0010<R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b>\u00103¨\u0006E"}, m3636d2 = {"Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragment$Args;", "Landroid/os/Parcelable;", "id", "", "title", "", "subtitle", "description", "bodyComposable", "Lcom/robinhood/android/common/ui/ParcelableComposable;", "primaryButtonLabel", "overridePrimaryButtonType", "Lcom/robinhood/android/common/ui/RhButtonType;", "secondaryButtonLabel", "iconDrawableRes", "showLearnMore", "", "dismissOnLearnMore", "learnMoreStr", "", "passthroughArgs", "Landroid/os/Bundle;", "descriptionGravity", "forCrypto", "forAchromatic", "forGold", "forNight", "themeId", "isCancelable", "screenName", "<init>", "(ILjava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lcom/robinhood/android/common/ui/ParcelableComposable;Ljava/lang/CharSequence;Lcom/robinhood/android/common/ui/RhButtonType;Ljava/lang/CharSequence;Ljava/lang/Integer;ZZLjava/lang/String;Landroid/os/Bundle;Ljava/lang/Integer;ZZZZLjava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;)V", "getId", "()I", "getTitle", "()Ljava/lang/CharSequence;", "getSubtitle", "getDescription", "getBodyComposable", "()Lcom/robinhood/android/common/ui/ParcelableComposable;", "getPrimaryButtonLabel", "getOverridePrimaryButtonType", "()Lcom/robinhood/android/common/ui/RhButtonType;", "getSecondaryButtonLabel", "getIconDrawableRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getShowLearnMore", "()Z", "getDismissOnLearnMore", "getLearnMoreStr", "()Ljava/lang/String;", "getPassthroughArgs", "()Landroid/os/Bundle;", "getDescriptionGravity", "getForCrypto", "getForAchromatic", "getForGold", "getForNight", "getThemeId", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getScreenName", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final RhBottomSheetDialogFragment2 bodyComposable;
        private final CharSequence description;
        private final Integer descriptionGravity;
        private final boolean dismissOnLearnMore;
        private final boolean forAchromatic;
        private final boolean forCrypto;
        private final boolean forGold;
        private final boolean forNight;
        private final Integer iconDrawableRes;
        private final int id;
        private final Boolean isCancelable;
        private final String learnMoreStr;
        private final RhButtonType overridePrimaryButtonType;
        private final Bundle passthroughArgs;
        private final CharSequence primaryButtonLabel;
        private final String screenName;
        private final CharSequence secondaryButtonLabel;
        private final boolean showLearnMore;
        private final CharSequence subtitle;
        private final Integer themeId;
        private final CharSequence title;

        /* compiled from: RhBottomSheetDialogFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Integer num;
                Integer num2;
                boolean z;
                Integer num3;
                boolean z2;
                boolean z3;
                boolean z4;
                Integer num4;
                Integer num5;
                boolean z5;
                boolean z6;
                Integer num6;
                boolean z7;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
                CharSequence charSequence = (CharSequence) creator.createFromParcel(parcel);
                CharSequence charSequence2 = (CharSequence) creator.createFromParcel(parcel);
                CharSequence charSequence3 = (CharSequence) creator.createFromParcel(parcel);
                RhBottomSheetDialogFragment2 rhBottomSheetDialogFragment2 = (RhBottomSheetDialogFragment2) parcel.readParcelable(Args.class.getClassLoader());
                CharSequence charSequence4 = (CharSequence) creator.createFromParcel(parcel);
                RhButtonType rhButtonTypeValueOf = parcel.readInt() == 0 ? null : RhButtonType.valueOf(parcel.readString());
                CharSequence charSequence5 = (CharSequence) creator.createFromParcel(parcel);
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() != 0) {
                    num = null;
                    num2 = numValueOf;
                    z = true;
                } else {
                    num = null;
                    num2 = numValueOf;
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    num3 = num;
                    z3 = false;
                    z2 = true;
                } else {
                    num3 = num;
                    z2 = false;
                    z3 = false;
                }
                String string2 = parcel.readString();
                Bundle bundle = parcel.readBundle(Args.class.getClassLoader());
                Integer numValueOf2 = parcel.readInt() == 0 ? num3 : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() != 0) {
                    z4 = z3;
                    z3 = true;
                } else {
                    z4 = z3;
                }
                if (parcel.readInt() != 0) {
                    num4 = num3;
                    num5 = numValueOf2;
                    z5 = true;
                } else {
                    num4 = num3;
                    num5 = numValueOf2;
                    z5 = z4;
                }
                if (parcel.readInt() != 0) {
                    z6 = z4;
                    z4 = true;
                } else {
                    z6 = z4;
                }
                if (parcel.readInt() != 0) {
                    num6 = num4;
                    z7 = true;
                } else {
                    num6 = num4;
                    z7 = z6;
                }
                Integer numValueOf3 = parcel.readInt() == 0 ? num6 : Integer.valueOf(parcel.readInt());
                Boolean boolValueOf = num6;
                if (parcel.readInt() != 0) {
                    boolValueOf = Boolean.valueOf(parcel.readInt() == 0 ? z6 : true);
                }
                return new Args(i, charSequence, charSequence2, charSequence3, rhBottomSheetDialogFragment2, charSequence4, rhButtonTypeValueOf, charSequence5, num2, z, z2, string2, bundle, num5, z3, z5, z4, z7, numValueOf3, boolValueOf, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public Args() {
            this(0, null, null, null, null, null, null, null, null, false, false, null, null, null, false, false, false, false, null, null, null, 2097151, null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.id);
            TextUtils.writeToParcel(this.title, dest, flags);
            TextUtils.writeToParcel(this.subtitle, dest, flags);
            TextUtils.writeToParcel(this.description, dest, flags);
            dest.writeParcelable(this.bodyComposable, flags);
            TextUtils.writeToParcel(this.primaryButtonLabel, dest, flags);
            RhButtonType rhButtonType = this.overridePrimaryButtonType;
            if (rhButtonType == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(rhButtonType.name());
            }
            TextUtils.writeToParcel(this.secondaryButtonLabel, dest, flags);
            Integer num = this.iconDrawableRes;
            if (num == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num.intValue());
            }
            dest.writeInt(this.showLearnMore ? 1 : 0);
            dest.writeInt(this.dismissOnLearnMore ? 1 : 0);
            dest.writeString(this.learnMoreStr);
            dest.writeBundle(this.passthroughArgs);
            Integer num2 = this.descriptionGravity;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num2.intValue());
            }
            dest.writeInt(this.forCrypto ? 1 : 0);
            dest.writeInt(this.forAchromatic ? 1 : 0);
            dest.writeInt(this.forGold ? 1 : 0);
            dest.writeInt(this.forNight ? 1 : 0);
            Integer num3 = this.themeId;
            if (num3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num3.intValue());
            }
            Boolean bool = this.isCancelable;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool.booleanValue() ? 1 : 0);
            }
            dest.writeString(this.screenName);
        }

        public Args(int i, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RhBottomSheetDialogFragment2 rhBottomSheetDialogFragment2, CharSequence charSequence4, RhButtonType rhButtonType, CharSequence charSequence5, Integer num, boolean z, boolean z2, String str, Bundle bundle, Integer num2, boolean z3, boolean z4, boolean z5, boolean z6, Integer num3, Boolean bool, String str2) {
            this.id = i;
            this.title = charSequence;
            this.subtitle = charSequence2;
            this.description = charSequence3;
            this.bodyComposable = rhBottomSheetDialogFragment2;
            this.primaryButtonLabel = charSequence4;
            this.overridePrimaryButtonType = rhButtonType;
            this.secondaryButtonLabel = charSequence5;
            this.iconDrawableRes = num;
            this.showLearnMore = z;
            this.dismissOnLearnMore = z2;
            this.learnMoreStr = str;
            this.passthroughArgs = bundle;
            this.descriptionGravity = num2;
            this.forCrypto = z3;
            this.forAchromatic = z4;
            this.forGold = z5;
            this.forNight = z6;
            this.themeId = num3;
            this.isCancelable = bool;
            this.screenName = str2;
        }

        public /* synthetic */ Args(int i, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RhBottomSheetDialogFragment2 rhBottomSheetDialogFragment2, CharSequence charSequence4, RhButtonType rhButtonType, CharSequence charSequence5, Integer num, boolean z, boolean z2, String str, Bundle bundle, Integer num2, boolean z3, boolean z4, boolean z5, boolean z6, Integer num3, Boolean bool, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : charSequence, (i2 & 4) != 0 ? null : charSequence2, (i2 & 8) != 0 ? null : charSequence3, (i2 & 16) != 0 ? null : rhBottomSheetDialogFragment2, (i2 & 32) != 0 ? null : charSequence4, (i2 & 64) != 0 ? null : rhButtonType, (i2 & 128) != 0 ? null : charSequence5, (i2 & 256) != 0 ? null : num, (i2 & 512) != 0 ? false : z, (i2 & 1024) != 0 ? false : z2, (i2 & 2048) != 0 ? null : str, (i2 & 4096) != 0 ? null : bundle, (i2 & 8192) != 0 ? null : num2, (i2 & 16384) != 0 ? false : z3, (i2 & 32768) != 0 ? false : z4, (i2 & 65536) != 0 ? false : z5, (i2 & 131072) != 0 ? false : z6, (i2 & 262144) != 0 ? null : num3, (i2 & 524288) != 0 ? null : bool, (i2 & 1048576) != 0 ? null : str2);
        }

        public final int getId() {
            return this.id;
        }

        public final CharSequence getTitle() {
            return this.title;
        }

        public final CharSequence getSubtitle() {
            return this.subtitle;
        }

        public final CharSequence getDescription() {
            return this.description;
        }

        public final RhBottomSheetDialogFragment2 getBodyComposable() {
            return this.bodyComposable;
        }

        public final CharSequence getPrimaryButtonLabel() {
            return this.primaryButtonLabel;
        }

        public final RhButtonType getOverridePrimaryButtonType() {
            return this.overridePrimaryButtonType;
        }

        public final CharSequence getSecondaryButtonLabel() {
            return this.secondaryButtonLabel;
        }

        public final Integer getIconDrawableRes() {
            return this.iconDrawableRes;
        }

        public final boolean getShowLearnMore() {
            return this.showLearnMore;
        }

        public final boolean getDismissOnLearnMore() {
            return this.dismissOnLearnMore;
        }

        public final String getLearnMoreStr() {
            return this.learnMoreStr;
        }

        public final Bundle getPassthroughArgs() {
            return this.passthroughArgs;
        }

        public final Integer getDescriptionGravity() {
            return this.descriptionGravity;
        }

        public final boolean getForCrypto() {
            return this.forCrypto;
        }

        public final boolean getForAchromatic() {
            return this.forAchromatic;
        }

        public final boolean getForGold() {
            return this.forGold;
        }

        public final boolean getForNight() {
            return this.forNight;
        }

        public final Integer getThemeId() {
            return this.themeId;
        }

        /* renamed from: isCancelable, reason: from getter */
        public final Boolean getIsCancelable() {
            return this.isCancelable;
        }

        public final String getScreenName() {
            return this.screenName;
        }
    }

    /* compiled from: RhBottomSheetDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragment;", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragment$Args;", "<init>", "()V", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RhBottomSheetDialogFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RhBottomSheetDialogFragment rhBottomSheetDialogFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, rhBottomSheetDialogFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RhBottomSheetDialogFragment newInstance(Args args) {
            return (RhBottomSheetDialogFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RhBottomSheetDialogFragment rhBottomSheetDialogFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, rhBottomSheetDialogFragment, args);
        }
    }
}
