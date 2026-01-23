package com.robinhood.android.doc.p109ui.photo;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.extensions.BaseBottomSheetDialogFragments;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.doc.C14254R;
import com.robinhood.android.doc.databinding.FragmentDocUploadRequirementsBottomSheetBinding;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiComponent3;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RequirementsBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0016\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/photo/RequirementsBottomSheetFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "<init>", "()V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "binding", "Lcom/robinhood/android/doc/databinding/FragmentDocUploadRequirementsBottomSheetBinding;", "getBinding", "()Lcom/robinhood/android/doc/databinding/FragmentDocUploadRequirementsBottomSheetBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Args", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class RequirementsBottomSheetFragment extends BaseBottomSheetDialogFragment {
    public static final String TAG = "requirementsBottomSheet";

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public Markwon markwon;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RequirementsBottomSheetFragment.class, "binding", "getBinding()Lcom/robinhood/android/doc/databinding/FragmentDocUploadRequirementsBottomSheetBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public RequirementsBottomSheetFragment() {
        super(C14254R.layout.fragment_doc_upload_requirements_bottom_sheet);
        this.binding = ViewBinding5.viewBinding(this, RequirementsBottomSheetFragment2.INSTANCE);
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

    private final FragmentDocUploadRequirementsBottomSheetBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentDocUploadRequirementsBottomSheetBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        LinearLayout docUploadRequirementsOuterContainer = getBinding().docUploadRequirementsOuterContainer;
        Intrinsics.checkNotNullExpressionValue(docUploadRequirementsOuterContainer, "docUploadRequirementsOuterContainer");
        BaseBottomSheetDialogFragments.enforceMaxHeight$default(this, docUploadRequirementsOuterContainer, 0.0f, 2, null);
        final Args args = (Args) INSTANCE.getArgs((Fragment) this);
        if (args instanceof Args.Markdown) {
            getBinding().docUploadRequirementsSduiScrollView.setVisibility(8);
            Args.Markdown markdown = (Args.Markdown) args;
            getBinding().docUploadRequirementsTitle.setText(markdown.getTitle());
            getMarkwon().mo17580setMarkdown(getBinding().docUploadRequirementsBody, markdown.getBody());
        } else {
            if (!(args instanceof Args.Sdui)) {
                throw new NoWhenBranchMatchedException();
            }
            getBinding().docUploadRequirementsScrollView.setVisibility(8);
            getBinding().docUploadRequirementsSduiComposeView.setContent(ComposableLambda3.composableLambdaInstance(-1940559466, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.doc.ui.photo.RequirementsBottomSheetFragment.onViewCreated.1
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
                        ComposerKt.traceEventStart(-1940559466, i, -1, "com.robinhood.android.doc.ui.photo.RequirementsBottomSheetFragment.onViewCreated.<anonymous> (RequirementsBottomSheetFragment.kt:45)");
                    }
                    final Args args2 = args;
                    BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(284937550, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.doc.ui.photo.RequirementsBottomSheetFragment.onViewCreated.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i2) {
                            if ((i2 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(284937550, i2, -1, "com.robinhood.android.doc.ui.photo.RequirementsBottomSheetFragment.onViewCreated.<anonymous>.<anonymous> (RequirementsBottomSheetFragment.kt:46)");
                            }
                            SduiComponent3.SduiComponent(((Args.Sdui) args2).getContent(), null, HorizontalPadding.Default, composer2, 384, 2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer, 54), composer, 100663296, 255);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        }
        RdsButton docUploadRequirementsPrimaryCta = getBinding().docUploadRequirementsPrimaryCta;
        Intrinsics.checkNotNullExpressionValue(docUploadRequirementsPrimaryCta, "docUploadRequirementsPrimaryCta");
        OnClickListeners.onClick(docUploadRequirementsPrimaryCta, new C144122(this));
    }

    /* compiled from: RequirementsBottomSheetFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.doc.ui.photo.RequirementsBottomSheetFragment$onViewCreated$2 */
    /* synthetic */ class C144122 extends FunctionReferenceImpl implements Function0<Unit> {
        C144122(Object obj) {
            super(0, obj, RequirementsBottomSheetFragment.class, "dismiss", "dismiss()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((RequirementsBottomSheetFragment) this.receiver).dismiss();
        }
    }

    /* compiled from: RequirementsBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/photo/RequirementsBottomSheetFragment$Args;", "Landroid/os/Parcelable;", "Markdown", "Sdui", "Lcom/robinhood/android/doc/ui/photo/RequirementsBottomSheetFragment$Args$Markdown;", "Lcom/robinhood/android/doc/ui/photo/RequirementsBottomSheetFragment$Args$Sdui;", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Args extends Parcelable {

        /* compiled from: RequirementsBottomSheetFragment.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/photo/RequirementsBottomSheetFragment$Args$Markdown;", "Lcom/robinhood/android/doc/ui/photo/RequirementsBottomSheetFragment$Args;", "title", "", CarResultComposable2.BODY, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getBody", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Markdown implements Args {
            public static final int $stable = 0;
            public static final Parcelable.Creator<Markdown> CREATOR = new Creator();
            private final String body;
            private final String title;

            /* compiled from: RequirementsBottomSheetFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Markdown> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Markdown createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Markdown(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Markdown[] newArray(int i) {
                    return new Markdown[i];
                }
            }

            public static /* synthetic */ Markdown copy$default(Markdown markdown, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = markdown.title;
                }
                if ((i & 2) != 0) {
                    str2 = markdown.body;
                }
                return markdown.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final String getBody() {
                return this.body;
            }

            public final Markdown copy(String title, String body) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(body, "body");
                return new Markdown(title, body);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Markdown)) {
                    return false;
                }
                Markdown markdown = (Markdown) other;
                return Intrinsics.areEqual(this.title, markdown.title) && Intrinsics.areEqual(this.body, markdown.body);
            }

            public int hashCode() {
                return (this.title.hashCode() * 31) + this.body.hashCode();
            }

            public String toString() {
                return "Markdown(title=" + this.title + ", body=" + this.body + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.title);
                dest.writeString(this.body);
            }

            public Markdown(String title, String body) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(body, "body");
                this.title = title;
                this.body = body;
            }

            public final String getBody() {
                return this.body;
            }

            public final String getTitle() {
                return this.title;
            }
        }

        /* compiled from: RequirementsBottomSheetFragment.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/photo/RequirementsBottomSheetFragment$Args$Sdui;", "Lcom/robinhood/android/doc/ui/photo/RequirementsBottomSheetFragment$Args;", "content", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;)V", "getContent", "()Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Sdui implements Args {
            public static final int $stable = 8;
            public static final Parcelable.Creator<Sdui> CREATOR = new Creator();
            private final UIComponent<GenericAction> content;

            /* compiled from: RequirementsBottomSheetFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Sdui> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Sdui createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Sdui((UIComponent) parcel.readParcelable(Sdui.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Sdui[] newArray(int i) {
                    return new Sdui[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Sdui copy$default(Sdui sdui, UIComponent uIComponent, int i, Object obj) {
                if ((i & 1) != 0) {
                    uIComponent = sdui.content;
                }
                return sdui.copy(uIComponent);
            }

            public final UIComponent<GenericAction> component1() {
                return this.content;
            }

            public final Sdui copy(UIComponent<? extends GenericAction> content) {
                Intrinsics.checkNotNullParameter(content, "content");
                return new Sdui(content);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Sdui) && Intrinsics.areEqual(this.content, ((Sdui) other).content);
            }

            public int hashCode() {
                return this.content.hashCode();
            }

            public String toString() {
                return "Sdui(content=" + this.content + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.content, flags);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Sdui(UIComponent<? extends GenericAction> content) {
                Intrinsics.checkNotNullParameter(content, "content");
                this.content = content;
            }

            public final UIComponent<GenericAction> getContent() {
                return this.content;
            }
        }
    }

    /* compiled from: RequirementsBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/photo/RequirementsBottomSheetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/doc/ui/photo/RequirementsBottomSheetFragment;", "Lcom/robinhood/android/doc/ui/photo/RequirementsBottomSheetFragment$Args;", "<init>", "()V", "TAG", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RequirementsBottomSheetFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RequirementsBottomSheetFragment requirementsBottomSheetFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, requirementsBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RequirementsBottomSheetFragment newInstance(Args args) {
            return (RequirementsBottomSheetFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RequirementsBottomSheetFragment requirementsBottomSheetFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, requirementsBottomSheetFragment, args);
        }
    }
}
