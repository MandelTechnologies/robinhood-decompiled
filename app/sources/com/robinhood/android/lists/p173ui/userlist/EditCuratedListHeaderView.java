package com.robinhood.android.lists.p173ui.userlist;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.robinhood.android.common.p088ui.BindViewDelegate2;
import com.robinhood.android.common.util.extensions.Views;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.android.lists.C20839R;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.UUID;
import kotlin.Metadata;
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

/* compiled from: EditCuratedListHeaderView.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0002!\"B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\b\u0010\u001f\u001a\u00020\u001cH\u0014J\b\u0010 \u001a\u00020\u001cH\u0014R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/userlist/EditCuratedListHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "listId", "Ljava/util/UUID;", "emojiTxt", "Lcom/robinhood/android/designsystem/text/RhTextView;", "getEmojiTxt", "()Lcom/robinhood/android/designsystem/text/RhTextView;", "emojiTxt$delegate", "Lkotlin/properties/ReadOnlyProperty;", "titleInput", "Lcom/robinhood/android/designsystem/textinput/RdsTextInputEditText;", "getTitleInput", "()Lcom/robinhood/android/designsystem/textinput/RdsTextInputEditText;", "titleInput$delegate", "callbacks", "Lcom/robinhood/android/lists/ui/userlist/EditCuratedListHeaderView$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/lists/ui/userlist/EditCuratedListHeaderView$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/lists/ui/userlist/EditCuratedListHeaderView$Callbacks;)V", "bind", "", "state", "Lcom/robinhood/android/lists/ui/userlist/CuratedListUserListViewState;", "onAttachedToWindow", "onDetachedFromWindow", "Callbacks", "Companion", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class EditCuratedListHeaderView extends ConstraintLayout {
    public Callbacks callbacks;

    /* renamed from: emojiTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 emojiTxt;
    private UUID listId;

    /* renamed from: titleInput$delegate, reason: from kotlin metadata */
    private final Interfaces2 titleInput;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EditCuratedListHeaderView.class, "emojiTxt", "getEmojiTxt()Lcom/robinhood/android/designsystem/text/RhTextView;", 0)), Reflection.property1(new PropertyReference1Impl(EditCuratedListHeaderView.class, "titleInput", "getTitleInput()Lcom/robinhood/android/designsystem/textinput/RdsTextInputEditText;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EditCuratedListHeaderView.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/userlist/EditCuratedListHeaderView$Callbacks;", "", "onEmojiEditClick", "", "listId", "Ljava/util/UUID;", "currentEmoji", "", "onTitleChanged", "title", "onTitleInputClicked", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onEmojiEditClick(UUID listId, String currentEmoji);

        void onTitleChanged(String title);

        void onTitleInputClicked(UUID listId);
    }

    public /* synthetic */ EditCuratedListHeaderView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditCuratedListHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C20839R.layout.merge_edit_curated_list_header_view, true);
        this.emojiTxt = BindViewDelegate2.bindView$default(this, C20839R.id.edit_curated_list_header_emoji_box, null, 2, null);
        this.titleInput = BindViewDelegate2.bindView$default(this, C20839R.id.edit_curated_list_header_title_input, null, 2, null);
    }

    private final RhTextView getEmojiTxt() {
        return (RhTextView) this.emojiTxt.getValue(this, $$delegatedProperties[0]);
    }

    private final RdsTextInputEditText getTitleInput() {
        return (RdsTextInputEditText) this.titleInput.getValue(this, $$delegatedProperties[1]);
    }

    public final Callbacks getCallbacks() {
        Callbacks callbacks = this.callbacks;
        if (callbacks != null) {
            return callbacks;
        }
        Intrinsics.throwUninitializedPropertyAccessException("callbacks");
        return null;
    }

    public final void setCallbacks(Callbacks callbacks) {
        Intrinsics.checkNotNullParameter(callbacks, "<set-?>");
        this.callbacks = callbacks;
    }

    public final void bind(CuratedListUserListViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        final CuratedList curatedList = state.getCuratedList();
        if (curatedList != null) {
            this.listId = curatedList.getId();
            RdsTextInputEditText titleInput = getTitleInput();
            String editedTitle = state.getEditedTitle();
            if (editedTitle == null) {
                editedTitle = curatedList.getDisplayName();
            }
            titleInput.setText(editedTitle);
            RdsTextInputEditText titleInput2 = getTitleInput();
            Editable text = getTitleInput().getText();
            titleInput2.setSelection(text != null ? text.length() : 0);
            RhTextView emojiTxt = getEmojiTxt();
            String editedEmoji = state.getEditedEmoji();
            if (editedEmoji == null) {
                editedEmoji = curatedList.getIconEmoji();
            }
            emojiTxt.setText(editedEmoji);
            OnClickListeners.onClick(getEmojiTxt(), new Function0() { // from class: com.robinhood.android.lists.ui.userlist.EditCuratedListHeaderView$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EditCuratedListHeaderView.bind$lambda$0(this.f$0, curatedList);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$0(EditCuratedListHeaderView editCuratedListHeaderView, CuratedList curatedList) {
        editCuratedListHeaderView.getTitleInput().clearFocus();
        editCuratedListHeaderView.getCallbacks().onEmojiEditClick(curatedList.getId(), editCuratedListHeaderView.getEmojiTxt().getText().toString());
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewDisposerKt.bindTo$default(getTitleInput().focusChanges(), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lists.ui.userlist.EditCuratedListHeaderView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EditCuratedListHeaderView.onAttachedToWindow$lambda$1(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        ViewDisposerKt.bindTo$default(RxTextView.textChanges(getTitleInput()), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lists.ui.userlist.EditCuratedListHeaderView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EditCuratedListHeaderView.onAttachedToWindow$lambda$2(this.f$0, (CharSequence) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$1(EditCuratedListHeaderView editCuratedListHeaderView, boolean z) {
        if (z && editCuratedListHeaderView.listId != null) {
            Callbacks callbacks = editCuratedListHeaderView.getCallbacks();
            UUID uuid = editCuratedListHeaderView.listId;
            Intrinsics.checkNotNull(uuid);
            callbacks.onTitleInputClicked(uuid);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$2(EditCuratedListHeaderView editCuratedListHeaderView, CharSequence it) {
        Intrinsics.checkNotNullParameter(it, "it");
        editCuratedListHeaderView.getCallbacks().onTitleChanged(it.toString());
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Activity.hideKeyboard$default(Views.baseActivity(this), false, 1, null);
        getTitleInput().clearFocus();
    }

    /* compiled from: EditCuratedListHeaderView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/userlist/EditCuratedListHeaderView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/lists/ui/userlist/EditCuratedListHeaderView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<EditCuratedListHeaderView> {
        private final /* synthetic */ Inflater<EditCuratedListHeaderView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public EditCuratedListHeaderView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (EditCuratedListHeaderView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C20839R.layout.include_edit_curated_list_header_view);
        }
    }
}
