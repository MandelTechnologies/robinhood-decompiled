package com.robinhood.android.doc.p109ui.persona;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.doc.p109ui.persona.DocUploadPersonaSubmittedReportViewState;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.shared.documents.lib.docupload.DocUploadEvent;
import com.robinhood.shared.documents.lib.docupload.DocUploadEventReceiver;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: DocUploadPersonaSubmittedReportFragment.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0002\u0017\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0010\u001a\u00020\u0011H\u0017¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/persona/DocUploadPersonaSubmittedReportFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/doc/ui/persona/DocUploadPersonaSubmittedReportDuxo;", "getDuxo", "()Lcom/robinhood/android/doc/ui/persona/DocUploadPersonaSubmittedReportDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEventReceiver;", "getCallbacks", "()Lcom/robinhood/shared/documents/lib/docupload/DocUploadEventReceiver;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onStart", "bind", "state", "Lcom/robinhood/android/doc/ui/persona/DocUploadPersonaSubmittedReportViewState;", "Args", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DocUploadPersonaSubmittedReportFragment extends GenericComposeFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DocUploadPersonaSubmittedReportFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/documents/lib/docupload/DocUploadEventReceiver;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, DocUploadPersonaSubmittedReportDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(DocUploadEventReceiver.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.doc.ui.persona.DocUploadPersonaSubmittedReportFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(DocUploadPersonaSubmittedReportFragment docUploadPersonaSubmittedReportFragment, int i, Composer composer, int i2) {
        docUploadPersonaSubmittedReportFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private final DocUploadPersonaSubmittedReportDuxo getDuxo() {
        return (DocUploadPersonaSubmittedReportDuxo) this.duxo.getValue();
    }

    private final DocUploadEventReceiver getCallbacks() {
        return (DocUploadEventReceiver) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(653617751);
        if ((i & 1) != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(653617751, i, -1, "com.robinhood.android.doc.ui.persona.DocUploadPersonaSubmittedReportFragment.ComposeContent (DocUploadPersonaSubmittedReportFragment.kt:23)");
            }
            LoadingScreenComposablesKt.GenericBoxesLoadingScreenComposable(null, composerStartRestartGroup, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.doc.ui.persona.DocUploadPersonaSubmittedReportFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DocUploadPersonaSubmittedReportFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C143621(this));
    }

    /* compiled from: DocUploadPersonaSubmittedReportFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.doc.ui.persona.DocUploadPersonaSubmittedReportFragment$onStart$1 */
    /* synthetic */ class C143621 extends FunctionReferenceImpl implements Function1<DocUploadPersonaSubmittedReportViewState, Unit> {
        C143621(Object obj) {
            super(1, obj, DocUploadPersonaSubmittedReportFragment.class, "bind", "bind(Lcom/robinhood/android/doc/ui/persona/DocUploadPersonaSubmittedReportViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DocUploadPersonaSubmittedReportViewState docUploadPersonaSubmittedReportViewState) {
            invoke2(docUploadPersonaSubmittedReportViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DocUploadPersonaSubmittedReportViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((DocUploadPersonaSubmittedReportFragment) this.receiver).bind(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(DocUploadPersonaSubmittedReportViewState state) {
        if (Intrinsics.areEqual(state, DocUploadPersonaSubmittedReportViewState.Loaded.INSTANCE)) {
            DocUploadEventReceiver.DefaultImpls.onEvent$default(getCallbacks(), new DocUploadEvent.WizardMutator.Submission.Success(false, 1, null), false, 2, null);
        } else if (!Intrinsics.areEqual(state, DocUploadPersonaSubmittedReportViewState.Loading.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: DocUploadPersonaSubmittedReportFragment.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/persona/DocUploadPersonaSubmittedReportFragment$Args;", "Landroid/os/Parcelable;", "documentRequestIds", "", "Ljava/util/UUID;", "<init>", "(Ljava/util/List;)V", "getDocumentRequestIds", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final List<UUID> documentRequestIds;

        /* compiled from: DocUploadPersonaSubmittedReportFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readSerializable());
                }
                return new Args(arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Args copy$default(Args args, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = args.documentRequestIds;
            }
            return args.copy(list);
        }

        public final List<UUID> component1() {
            return this.documentRequestIds;
        }

        public final Args copy(List<UUID> documentRequestIds) {
            Intrinsics.checkNotNullParameter(documentRequestIds, "documentRequestIds");
            return new Args(documentRequestIds);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.documentRequestIds, ((Args) other).documentRequestIds);
        }

        public int hashCode() {
            return this.documentRequestIds.hashCode();
        }

        public String toString() {
            return "Args(documentRequestIds=" + this.documentRequestIds + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<UUID> list = this.documentRequestIds;
            dest.writeInt(list.size());
            Iterator<UUID> it = list.iterator();
            while (it.hasNext()) {
                dest.writeSerializable(it.next());
            }
        }

        public Args(List<UUID> documentRequestIds) {
            Intrinsics.checkNotNullParameter(documentRequestIds, "documentRequestIds");
            this.documentRequestIds = documentRequestIds;
        }

        public final List<UUID> getDocumentRequestIds() {
            return this.documentRequestIds;
        }
    }

    /* compiled from: DocUploadPersonaSubmittedReportFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/persona/DocUploadPersonaSubmittedReportFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/doc/ui/persona/DocUploadPersonaSubmittedReportFragment;", "Lcom/robinhood/android/doc/ui/persona/DocUploadPersonaSubmittedReportFragment$Args;", "<init>", "()V", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DocUploadPersonaSubmittedReportFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(DocUploadPersonaSubmittedReportFragment docUploadPersonaSubmittedReportFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, docUploadPersonaSubmittedReportFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DocUploadPersonaSubmittedReportFragment newInstance(Args args) {
            return (DocUploadPersonaSubmittedReportFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DocUploadPersonaSubmittedReportFragment docUploadPersonaSubmittedReportFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, docUploadPersonaSubmittedReportFragment, args);
        }
    }
}
