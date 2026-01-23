package com.robinhood.android.account.naming.common;

import com.robinhood.android.account.store.naming.NicknameValidationResult;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.HasSavedState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: BaseAccountNicknameDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b'\u0018\u0000 \u00132\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u0013B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0010H&¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/account/naming/common/BaseAccountNicknameDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/account/naming/common/AccountNicknameDataState;", "Lcom/robinhood/android/account/naming/common/AccountNicknameViewState;", "Lcom/robinhood/android/account/naming/common/AccountNicknameEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "initialDataState", "stateProvider", "Lcom/robinhood/android/account/naming/common/AccountNicknameStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/account/naming/common/AccountNicknameDataState;Lcom/robinhood/android/account/naming/common/AccountNicknameStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onNicknameChanged", "", "newNickname", "", "onSaveClicked", "nickname", "Companion", "feature-account-naming_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public abstract class BaseAccountNicknameDuxo extends BaseDuxo3<AccountNicknameDataState, AccountNicknameViewState, AccountNicknameEvent> implements HasSavedState {
    public static final int $stable = BaseDuxo3.$stable;
    private static final Regex VALID_NICKNAME_CHARS_REGEX = new Regex("^[A-Za-z0-9&'‘’_ .-]+$");
    private static final Regex MIN_THREE_LETTERS_REGEX = new Regex("^(?=(?:[\\s\\S]*[A-Za-z]){3,}).*");

    public abstract void onSaveClicked(String nickname);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAccountNicknameDuxo(AccountNicknameDataState initialDataState, AccountNicknameStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(initialDataState, stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(initialDataState, "initialDataState");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
    }

    public final void onNicknameChanged(String newNickname) {
        NicknameValidationResult valid;
        Intrinsics.checkNotNullParameter(newNickname, "newNickname");
        String strTake = StringsKt.take(newNickname, 14);
        if (strTake.length() > 0 && !VALID_NICKNAME_CHARS_REGEX.matches(strTake)) {
            valid = NicknameValidationResult.InvalidCharacters.INSTANCE;
        } else {
            valid = !MIN_THREE_LETTERS_REGEX.matches(strTake) ? NicknameValidationResult.NotEnoughLetters.INSTANCE : new NicknameValidationResult.Valid(strTake);
        }
        applyMutation(new C81231(strTake, valid, null));
    }

    /* compiled from: BaseAccountNicknameDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/account/naming/common/AccountNicknameDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.account.naming.common.BaseAccountNicknameDuxo$onNicknameChanged$1", m3645f = "BaseAccountNicknameDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.account.naming.common.BaseAccountNicknameDuxo$onNicknameChanged$1 */
    static final class C81231 extends ContinuationImpl7 implements Function2<AccountNicknameDataState, Continuation<? super AccountNicknameDataState>, Object> {
        final /* synthetic */ String $trimmed;
        final /* synthetic */ NicknameValidationResult $validation;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C81231(String str, NicknameValidationResult nicknameValidationResult, Continuation<? super C81231> continuation) {
            super(2, continuation);
            this.$trimmed = str;
            this.$validation = nicknameValidationResult;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C81231 c81231 = new C81231(this.$trimmed, this.$validation, continuation);
            c81231.L$0 = obj;
            return c81231;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccountNicknameDataState accountNicknameDataState, Continuation<? super AccountNicknameDataState> continuation) {
            return ((C81231) create(accountNicknameDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AccountNicknameDataState.copy$default((AccountNicknameDataState) this.L$0, this.$trimmed, this.$validation, false, 0, null, null, 60, null);
        }
    }
}
