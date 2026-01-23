package com.robinhood.android.settings.p254ui.notification;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.core.view.ViewGroup2;
import com.robinhood.android.settings.C28315R;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Inflater;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: NotificationSingleChoiceView.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0003\u0014\u0015\u0016B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/NotificationSingleChoiceView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "titleTxt", "Landroid/widget/TextView;", "choiceContainer", "Landroid/widget/RadioGroup;", "selectedIndex", "", "getSelectedIndex", "()I", "bind", "", "viewModel", "Lcom/robinhood/android/settings/ui/notification/NotificationSingleChoiceView$ViewModel;", "ViewModel", "Choice", "Companion", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class NotificationSingleChoiceView extends LinearLayout {
    private final RadioGroup choiceContainer;
    private final TextView titleTxt;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ NotificationSingleChoiceView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationSingleChoiceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C28315R.layout.merge_notification_single_choice, true);
        View viewFindViewById = findViewById(C28315R.id.notification_title_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.titleTxt = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(C28315R.id.notification_choice_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.choiceContainer = (RadioGroup) viewFindViewById2;
    }

    public final int getSelectedIndex() {
        int i = 0;
        for (View view : ViewGroup2.getChildren(this.choiceContainer)) {
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (view.getId() == this.choiceContainer.getCheckedRadioButtonId()) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final void bind(ViewModel viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.titleTxt.setText(viewModel.getTitle());
        this.choiceContainer.removeAllViews();
        int i = -1;
        for (Choice choice : viewModel.getChoices()) {
            int iGenerateViewId = View.generateViewId();
            if (choice.getSelected()) {
                i = iGenerateViewId;
            }
            View viewInflate = ViewGroups.inflate(this.choiceContainer, C28315R.layout.include_notification_radio_button, false);
            Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.RadioButton");
            RadioButton radioButton = (RadioButton) viewInflate;
            radioButton.setId(iGenerateViewId);
            radioButton.setText(choice.getTitle());
            this.choiceContainer.addView(radioButton);
        }
        this.choiceContainer.check(i);
    }

    /* compiled from: NotificationSingleChoiceView.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/NotificationSingleChoiceView$ViewModel;", "", "title", "", InquiryField.ChoicesField.TYPE, "", "Lcom/robinhood/android/settings/ui/notification/NotificationSingleChoiceView$Choice;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getChoices", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ViewModel {
        public static final int $stable = 8;
        private final List<Choice> choices;
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ViewModel copy$default(ViewModel viewModel, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = viewModel.title;
            }
            if ((i & 2) != 0) {
                list = viewModel.choices;
            }
            return viewModel.copy(str, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final List<Choice> component2() {
            return this.choices;
        }

        public final ViewModel copy(String title, List<Choice> choices) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(choices, "choices");
            return new ViewModel(title, choices);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewModel)) {
                return false;
            }
            ViewModel viewModel = (ViewModel) other;
            return Intrinsics.areEqual(this.title, viewModel.title) && Intrinsics.areEqual(this.choices, viewModel.choices);
        }

        public int hashCode() {
            return (this.title.hashCode() * 31) + this.choices.hashCode();
        }

        public String toString() {
            return "ViewModel(title=" + this.title + ", choices=" + this.choices + ")";
        }

        public ViewModel(String title, List<Choice> choices) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(choices, "choices");
            this.title = title;
            this.choices = choices;
        }

        public final List<Choice> getChoices() {
            return this.choices;
        }

        public final String getTitle() {
            return this.title;
        }
    }

    /* compiled from: NotificationSingleChoiceView.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/NotificationSingleChoiceView$Choice;", "", "title", "", "selected", "", "<init>", "(Ljava/lang/String;Z)V", "getTitle", "()Ljava/lang/String;", "getSelected", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Choice {
        public static final int $stable = 0;
        private final boolean selected;
        private final String title;

        public static /* synthetic */ Choice copy$default(Choice choice, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = choice.title;
            }
            if ((i & 2) != 0) {
                z = choice.selected;
            }
            return choice.copy(str, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getSelected() {
            return this.selected;
        }

        public final Choice copy(String title, boolean selected) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new Choice(title, selected);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Choice)) {
                return false;
            }
            Choice choice = (Choice) other;
            return Intrinsics.areEqual(this.title, choice.title) && this.selected == choice.selected;
        }

        public int hashCode() {
            return (this.title.hashCode() * 31) + Boolean.hashCode(this.selected);
        }

        public String toString() {
            return "Choice(title=" + this.title + ", selected=" + this.selected + ")";
        }

        public Choice(String title, boolean z) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.selected = z;
        }

        public final boolean getSelected() {
            return this.selected;
        }

        public final String getTitle() {
            return this.title;
        }
    }

    /* compiled from: NotificationSingleChoiceView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/NotificationSingleChoiceView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/settings/ui/notification/NotificationSingleChoiceView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<NotificationSingleChoiceView> {
        private final /* synthetic */ Inflater<NotificationSingleChoiceView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public NotificationSingleChoiceView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (NotificationSingleChoiceView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C28315R.layout.include_notification_single_choice);
        }
    }
}
