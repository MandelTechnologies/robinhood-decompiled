package com.robinhood.android.pathfinder.corepages.multiselect;

import com.robinhood.models.p355ui.pathfinder.contexts.MultiSelectContext;
import com.robinhood.models.serverdriven.p347db.RichText;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MultiSelectViewState.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001#B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u001a\u001a\u00020\u0003HÂ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\bHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000eR\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\f¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/multiselect/MultiSelectViewState;", "", "context", "Lcom/robinhood/models/ui/pathfinder/contexts/MultiSelectContext;", "sendingInput", "", "selectedOptions", "", "", "<init>", "(Lcom/robinhood/models/ui/pathfinder/contexts/MultiSelectContext;ZLjava/util/List;)V", "getSendingInput", "()Z", "getSelectedOptions", "()Ljava/util/List;", "heading", "Lcom/robinhood/models/serverdriven/db/RichText;", "getHeading", "()Lcom/robinhood/models/serverdriven/db/RichText;", "subheading", "getSubheading", "options", "Lcom/robinhood/android/pathfinder/corepages/multiselect/MultiSelectViewState$Option;", "getOptions", "continueButtonEnabled", "getContinueButtonEnabled", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "Option", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final /* data */ class MultiSelectViewState {
    public static final int $stable = 8;
    private final MultiSelectContext context;
    private final boolean continueButtonEnabled;
    private final RichText heading;
    private final List<Option> options;
    private final List<String> selectedOptions;
    private final boolean sendingInput;
    private final RichText subheading;

    /* renamed from: component1, reason: from getter */
    private final MultiSelectContext getContext() {
        return this.context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MultiSelectViewState copy$default(MultiSelectViewState multiSelectViewState, MultiSelectContext multiSelectContext, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            multiSelectContext = multiSelectViewState.context;
        }
        if ((i & 2) != 0) {
            z = multiSelectViewState.sendingInput;
        }
        if ((i & 4) != 0) {
            list = multiSelectViewState.selectedOptions;
        }
        return multiSelectViewState.copy(multiSelectContext, z, list);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSendingInput() {
        return this.sendingInput;
    }

    public final List<String> component3() {
        return this.selectedOptions;
    }

    public final MultiSelectViewState copy(MultiSelectContext context, boolean sendingInput, List<String> selectedOptions) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(selectedOptions, "selectedOptions");
        return new MultiSelectViewState(context, sendingInput, selectedOptions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiSelectViewState)) {
            return false;
        }
        MultiSelectViewState multiSelectViewState = (MultiSelectViewState) other;
        return Intrinsics.areEqual(this.context, multiSelectViewState.context) && this.sendingInput == multiSelectViewState.sendingInput && Intrinsics.areEqual(this.selectedOptions, multiSelectViewState.selectedOptions);
    }

    public int hashCode() {
        return (((this.context.hashCode() * 31) + Boolean.hashCode(this.sendingInput)) * 31) + this.selectedOptions.hashCode();
    }

    public String toString() {
        return "MultiSelectViewState(context=" + this.context + ", sendingInput=" + this.sendingInput + ", selectedOptions=" + this.selectedOptions + ")";
    }

    public MultiSelectViewState(MultiSelectContext context, boolean z, List<String> selectedOptions) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(selectedOptions, "selectedOptions");
        this.context = context;
        this.sendingInput = z;
        this.selectedOptions = selectedOptions;
        this.heading = context.getHeading();
        this.subheading = context.getSubheading();
        List<String> options = context.getOptions();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(options, 10));
        for (String str : options) {
            arrayList.add(new Option(str, this.selectedOptions.contains(str)));
        }
        this.options = arrayList;
        this.continueButtonEnabled = !this.selectedOptions.isEmpty();
    }

    public final boolean getSendingInput() {
        return this.sendingInput;
    }

    public /* synthetic */ MultiSelectViewState(MultiSelectContext multiSelectContext, boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiSelectContext, (i & 2) != 0 ? false : z, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<String> getSelectedOptions() {
        return this.selectedOptions;
    }

    public final RichText getHeading() {
        return this.heading;
    }

    public final RichText getSubheading() {
        return this.subheading;
    }

    public final List<Option> getOptions() {
        return this.options;
    }

    public final boolean getContinueButtonEnabled() {
        return this.continueButtonEnabled;
    }

    /* compiled from: MultiSelectViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/multiselect/MultiSelectViewState$Option;", "", "title", "", "checked", "", "<init>", "(Ljava/lang/String;Z)V", "getTitle", "()Ljava/lang/String;", "getChecked", "()Z", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Option {
        public static final int $stable = 0;
        private final boolean checked;
        private final String title;

        public Option(String title, boolean z) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.checked = z;
        }

        public final boolean getChecked() {
            return this.checked;
        }

        public final String getTitle() {
            return this.title;
        }
    }
}
