package com.robinhood.android.expandablecontent.p136ui;

import android.animation.LayoutTransition;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.daynight.NightModeManager2;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.expandablecontent.C16618R;
import com.robinhood.android.expandablecontent.databinding.MergeExpandableContentSectionItemBinding;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.models.p355ui.UiExpandableContentSection;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.staticcontent.util.Markwons;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import okhttp3.HttpUrl;

/* compiled from: ExpandableContentSectionItemView.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 ?2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002>?B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u00102\u001a\u0002032\u0006\u0010\"\u001a\u00020\u0003H\u0016J\b\u00104\u001a\u000203H\u0014J\u0006\u00105\u001a\u000203J\u0010\u00106\u001a\u0002032\u0006\u00107\u001a\u000208H\u0002J\u0016\u00109\u001a\u0004\u0018\u00010:*\u00020\u00032\u0006\u00107\u001a\u000208H\u0002J\u0016\u0010;\u001a\u0004\u0018\u00010:*\u00020\u00032\u0006\u0010<\u001a\u00020=H\u0002R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010\"\u001a\u00020\u0003X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u00020$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010%\"\u0004\b&\u0010'R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010/\u001a\u00020$2\u0006\u0010.\u001a\u00020$@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010%\"\u0004\b1\u0010'¨\u0006@"}, m3636d2 = {"Lcom/robinhood/android/expandablecontent/ui/ExpandableContentSectionItemView;", "Landroid/widget/LinearLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/models/ui/UiExpandableContentSection;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "getAuthManager", "()Lcom/robinhood/shared/security/auth/AuthManager;", "setAuthManager", "(Lcom/robinhood/shared/security/auth/AuthManager;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "binding", "Lcom/robinhood/android/expandablecontent/databinding/MergeExpandableContentSectionItemBinding;", "getBinding", "()Lcom/robinhood/android/expandablecontent/databinding/MergeExpandableContentSectionItemBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "state", "isExpanded", "", "()Z", "setExpanded", "(Z)V", "callbacks", "Lcom/robinhood/android/expandablecontent/ui/ExpandableContentSectionItemView$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/expandablecontent/ui/ExpandableContentSectionItemView$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/expandablecontent/ui/ExpandableContentSectionItemView$Callbacks;)V", "value", "showBottomDivider", "getShowBottomDivider", "setShowBottomDivider", "bind", "", "onAttachedToWindow", "toggleContentSection", "setImage", "dayNightOverlay", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "assetForDayNightOverlay", "Lokhttp3/HttpUrl;", "assetForDayNightMode", "dayNightMode", "Lcom/robinhood/android/common/ui/daynight/DayNightMode;", "Callbacks", "Companion", "lib-expandable-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ExpandableContentSectionItemView extends Hammer_ExpandableContentSectionItemView implements Bindable<UiExpandableContentSection> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ExpandableContentSectionItemView.class, "binding", "getBinding()Lcom/robinhood/android/expandablecontent/databinding/MergeExpandableContentSectionItemBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public AuthManager authManager;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private Callbacks callbacks;
    public ImageLoader imageLoader;
    private boolean isExpanded;
    public Markwon markwon;
    private boolean showBottomDivider;
    private UiExpandableContentSection state;

    /* compiled from: ExpandableContentSectionItemView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/expandablecontent/ui/ExpandableContentSectionItemView$Callbacks;", "", "onContentSectionClicked", "", "section", "Lcom/robinhood/models/ui/UiExpandableContentSection;", "lib-expandable-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onContentSectionClicked(UiExpandableContentSection section);
    }

    /* compiled from: ExpandableContentSectionItemView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DayNightOverlay.values().length];
            try {
                iArr[DayNightOverlay.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DayNightOverlay.NIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[NightModeManager2.values().length];
            try {
                iArr2[NightModeManager2.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[NightModeManager2.NIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableContentSectionItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewBinding5.viewBinding(this, ExpandableContentSectionItemView2.INSTANCE);
        ViewGroups.inflate(this, C16618R.layout.merge_expandable_content_section_item, true);
        setLayoutTransition(new LayoutTransition());
        getLayoutTransition().enableTransitionType(4);
    }

    public final AuthManager getAuthManager() {
        AuthManager authManager = this.authManager;
        if (authManager != null) {
            return authManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("authManager");
        return null;
    }

    public final void setAuthManager(AuthManager authManager) {
        Intrinsics.checkNotNullParameter(authManager, "<set-?>");
        this.authManager = authManager;
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

    public final ImageLoader getImageLoader() {
        ImageLoader imageLoader = this.imageLoader;
        if (imageLoader != null) {
            return imageLoader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageLoader");
        return null;
    }

    public final void setImageLoader(ImageLoader imageLoader) {
        Intrinsics.checkNotNullParameter(imageLoader, "<set-?>");
        this.imageLoader = imageLoader;
    }

    private final MergeExpandableContentSectionItemBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeExpandableContentSectionItemBinding) value;
    }

    /* renamed from: isExpanded, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    public final void setExpanded(boolean z) {
        this.isExpanded = z;
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    public final boolean getShowBottomDivider() {
        return this.showBottomDivider;
    }

    public final void setShowBottomDivider(boolean z) {
        View sectionDivider = getBinding().sectionDivider;
        Intrinsics.checkNotNullExpressionValue(sectionDivider, "sectionDivider");
        sectionDivider.setVisibility(z ? 0 : 8);
        this.showBottomDivider = z;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(UiExpandableContentSection state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        MergeExpandableContentSectionItemBinding binding = getBinding();
        binding.sectionHeader.setPrimaryText(Markwons.toSpanned$default(getMarkwon(), state.getHeader(), null, 2, null));
        binding.sectionBody.setText(Markwons.toSpanned$default(getMarkwon(), state.getBody(), null, 2, null));
        RhTextView rhTextView = binding.sectionDisclosure;
        MarkdownContent disclosure = state.getDisclosure();
        rhTextView.setText(disclosure != null ? Markwons.toSpanned$default(getMarkwon(), disclosure, null, 2, null) : null);
        RhTextView sectionBody = binding.sectionBody;
        Intrinsics.checkNotNullExpressionValue(sectionBody, "sectionBody");
        sectionBody.setVisibility(this.isExpanded ? 0 : 8);
        RhTextView sectionDisclosure = binding.sectionDisclosure;
        Intrinsics.checkNotNullExpressionValue(sectionDisclosure, "sectionDisclosure");
        sectionDisclosure.setVisibility(state.getDisclosure() != null && this.isExpanded ? 0 : 8);
        binding.sectionToggleImage.setRotation(0.0f);
        View root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        OnClickListeners.onClick(root, new Function0() { // from class: com.robinhood.android.expandablecontent.ui.ExpandableContentSectionItemView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ExpandableContentSectionItemView.bind$lambda$2$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$2$lambda$1(ExpandableContentSectionItemView expandableContentSectionItemView) {
        expandableContentSectionItemView.toggleContentSection();
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ViewDisposerKt.bindTo$default(Contexts7.requireBaseActivityBaseContext(context).getDayNightStyleChanges(), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.expandablecontent.ui.ExpandableContentSectionItemView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ExpandableContentSectionItemView.onAttachedToWindow$lambda$3(this.f$0, (DayNightOverlay) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$3(ExpandableContentSectionItemView expandableContentSectionItemView, DayNightOverlay dayNightOverlay) {
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        expandableContentSectionItemView.setImage(dayNightOverlay);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void toggleContentSection() {
        UiExpandableContentSection uiExpandableContentSection;
        MarkdownContent header;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        NightModeManager2 dayNightMode = Contexts7.requireBaseActivityBaseContext(context).getNightModeManager().getDayNightMode();
        final MergeExpandableContentSectionItemBinding binding = getBinding();
        this.isExpanded = !this.isExpanded;
        binding.getRoot().setEnabled(false);
        UiExpandableContentSection uiExpandableContentSection2 = null;
        if (this.isExpanded) {
            UiExpandableContentSection uiExpandableContentSection3 = this.state;
            if (uiExpandableContentSection3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("state");
                uiExpandableContentSection3 = null;
            }
            header = uiExpandableContentSection3.getExpandedHeader();
            if (header == null) {
                uiExpandableContentSection = this.state;
                if (uiExpandableContentSection == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("state");
                    uiExpandableContentSection = null;
                }
                header = uiExpandableContentSection.getHeader();
            }
        } else {
            uiExpandableContentSection = this.state;
            if (uiExpandableContentSection == null) {
            }
            header = uiExpandableContentSection.getHeader();
        }
        binding.sectionHeader.setPrimaryText(Markwons.toSpanned$default(getMarkwon(), header, null, 2, null));
        binding.sectionToggleImage.animate().rotation(binding.sectionToggleImage.getRotation() + 180.0f).withEndAction(new Runnable() { // from class: com.robinhood.android.expandablecontent.ui.ExpandableContentSectionItemView$toggleContentSection$1$1
            @Override // java.lang.Runnable
            public final void run() {
                binding.getRoot().setEnabled(true);
            }
        }).setDuration(500L);
        UiExpandableContentSection uiExpandableContentSection4 = this.state;
        if (uiExpandableContentSection4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("state");
            uiExpandableContentSection4 = null;
        }
        if (assetForDayNightMode(uiExpandableContentSection4, dayNightMode) != null) {
            ImageView sectionImage = binding.sectionImage;
            Intrinsics.checkNotNullExpressionValue(sectionImage, "sectionImage");
            sectionImage.setVisibility(this.isExpanded ? 0 : 8);
        }
        UiExpandableContentSection uiExpandableContentSection5 = this.state;
        if (uiExpandableContentSection5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("state");
            uiExpandableContentSection5 = null;
        }
        if (uiExpandableContentSection5.getDisclosure() != null) {
            RhTextView sectionDisclosure = binding.sectionDisclosure;
            Intrinsics.checkNotNullExpressionValue(sectionDisclosure, "sectionDisclosure");
            sectionDisclosure.setVisibility(this.isExpanded ? 0 : 8);
        }
        RhTextView sectionBody = binding.sectionBody;
        Intrinsics.checkNotNullExpressionValue(sectionBody, "sectionBody");
        sectionBody.setVisibility(this.isExpanded ? 0 : 8);
        Callbacks callbacks = this.callbacks;
        if (callbacks != null) {
            UiExpandableContentSection uiExpandableContentSection6 = this.state;
            if (uiExpandableContentSection6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("state");
            } else {
                uiExpandableContentSection2 = uiExpandableContentSection6;
            }
            callbacks.onContentSectionClicked(uiExpandableContentSection2);
        }
    }

    private final void setImage(DayNightOverlay dayNightOverlay) {
        UiExpandableContentSection uiExpandableContentSection = this.state;
        if (uiExpandableContentSection == null) {
            Intrinsics.throwUninitializedPropertyAccessException("state");
            uiExpandableContentSection = null;
        }
        HttpUrl httpUrlAssetForDayNightOverlay = assetForDayNightOverlay(uiExpandableContentSection, dayNightOverlay);
        if (httpUrlAssetForDayNightOverlay != null) {
            ImageLoader.ImageRequest imageRequestLoad = getImageLoader().load(httpUrlAssetForDayNightOverlay);
            ImageView sectionImage = getBinding().sectionImage;
            Intrinsics.checkNotNullExpressionValue(sectionImage, "sectionImage");
            ImageLoader.ImageRequest.DefaultImpls.into$default(imageRequestLoad, sectionImage, null, null, 6, null);
        }
    }

    private final HttpUrl assetForDayNightOverlay(UiExpandableContentSection uiExpandableContentSection, DayNightOverlay dayNightOverlay) {
        int i = WhenMappings.$EnumSwitchMapping$0[dayNightOverlay.ordinal()];
        if (i == 1) {
            return uiExpandableContentSection.getLightModeAsset();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return uiExpandableContentSection.getDarkModeAsset();
    }

    private final HttpUrl assetForDayNightMode(UiExpandableContentSection uiExpandableContentSection, NightModeManager2 nightModeManager2) {
        int i = WhenMappings.$EnumSwitchMapping$1[nightModeManager2.ordinal()];
        if (i == 1) {
            return uiExpandableContentSection.getLightModeAsset();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return uiExpandableContentSection.getDarkModeAsset();
    }

    /* compiled from: ExpandableContentSectionItemView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/expandablecontent/ui/ExpandableContentSectionItemView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/expandablecontent/ui/ExpandableContentSectionItemView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "lib-expandable-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<ExpandableContentSectionItemView> {
        private final /* synthetic */ Inflater<ExpandableContentSectionItemView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public ExpandableContentSectionItemView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (ExpandableContentSectionItemView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C16618R.layout.include_expandable_content_section_item);
        }
    }
}
