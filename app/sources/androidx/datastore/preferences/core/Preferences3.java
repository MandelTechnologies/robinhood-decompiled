package androidx.datastore.preferences.core;

import androidx.datastore.core.DataStore;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: Preferences.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a?\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00022\"\u0010\u0003\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, m3636d2 = {AnalyticsStrings.BUTTON_LIST_EDIT, "Landroidx/datastore/preferences/core/Preferences;", "Landroidx/datastore/core/DataStore;", "transform", "Lkotlin/Function2;", "Landroidx/datastore/preferences/core/MutablePreferences;", "Lkotlin/coroutines/Continuation;", "", "", "(Landroidx/datastore/core/DataStore;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-preferences-core"}, m3637k = 2, m3638mv = {1, 5, 1}, m3640xi = 48)
/* renamed from: androidx.datastore.preferences.core.PreferencesKt, reason: use source file name */
/* loaded from: classes.dex */
public final class Preferences3 {

    /* compiled from: Preferences.kt */
    @Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m3636d2 = {"<anonymous>", "Landroidx/datastore/preferences/core/Preferences;", "it"}, m3637k = 3, m3638mv = {1, 5, 1}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", m3645f = "Preferences.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_LIGHTNING_FILLED_BLUE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: androidx.datastore.preferences.core.PreferencesKt$edit$2 */
    static final class C22682 extends ContinuationImpl7 implements Function2<Preferences, Continuation<? super Preferences>, Object> {
        final /* synthetic */ Function2<Preferences2, Continuation<? super Unit>, Object> $transform;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C22682(Function2<? super Preferences2, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C22682> continuation) {
            super(2, continuation);
            this.$transform = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C22682 c22682 = new C22682(this.$transform, continuation);
            c22682.L$0 = obj;
            return c22682;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Preferences preferences, Continuation<? super Preferences> continuation) {
            return ((C22682) create(preferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Preferences2 preferences2 = (Preferences2) this.L$0;
                ResultKt.throwOnFailure(obj);
                return preferences2;
            }
            ResultKt.throwOnFailure(obj);
            Preferences2 mutablePreferences = ((Preferences) this.L$0).toMutablePreferences();
            Function2<Preferences2, Continuation<? super Unit>, Object> function2 = this.$transform;
            this.L$0 = mutablePreferences;
            this.label = 1;
            return function2.invoke(mutablePreferences, this) == coroutine_suspended ? coroutine_suspended : mutablePreferences;
        }
    }

    public static final Object edit(DataStore<Preferences> dataStore, Function2<? super Preferences2, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Preferences> continuation) {
        return dataStore.updateData(new C22682(function2, null), continuation);
    }
}
