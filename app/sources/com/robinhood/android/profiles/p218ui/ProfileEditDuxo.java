package com.robinhood.android.profiles.p218ui;

import android.graphics.Bitmap;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.store.margin.MarginSubscriptionStore;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.profiles.extensions.ProfileColors;
import com.robinhood.android.profiles.p218ui.ProfileEditDuxo;
import com.robinhood.android.profiles.p218ui.ProfileEditViewState3;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.ProfileStore;
import com.robinhood.models.api.ApiProfile;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.GenericAlertErrorResponse;
import com.robinhood.models.api.media.ApiMediaMetadata;
import com.robinhood.models.p320db.Profile;
import com.robinhood.models.p320db.Profile2;
import com.robinhood.models.subscription.p352db.MarginSubscription;
import com.robinhood.p370rx.delay.CompletableDelay2;
import com.robinhood.shared.common.store.media.MediaStore;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.SinglesKt;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Singles;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ProfileEditDuxo.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001*B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u0006\u0010\u0013\u001a\u00020\u0011J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u0011J\u0012\u0010\u001e\u001a\u00020\u00112\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0019J\u001e\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0!2\b\u0010$\u001a\u0004\u0018\u00010\u001cH\u0002J(\u0010%\u001a\u00020&2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010'\u001a\u0004\u0018\u00010#2\u0006\u0010(\u001a\u00020)H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/profiles/ui/ProfileEditDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/profiles/ui/ProfileEditViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "profileStore", "Lcom/robinhood/librobinhood/data/store/ProfileStore;", "marginSubscriptionStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "mediaStore", "Lcom/robinhood/shared/common/store/media/MediaStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/ProfileStore;Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;Lcom/robinhood/shared/common/store/media/MediaStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onStart", "fetchProfile", "changeColorSelection", "selectedColor", "Lcom/robinhood/models/db/ProfileColor;", "changeUsername", "editedUsername", "", "changePicture", "editedPicture", "Landroid/graphics/Bitmap;", "removePicture", "updateProfile", "newUsername", "uploadEditedPicture", "Lio/reactivex/Single;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/api/media/ApiMediaMetadata;", "bitmap", "createEditRequest", "Lcom/robinhood/models/api/ApiProfile$Request;", "newPicture", "profile", "Lcom/robinhood/android/profiles/ui/ProfileEditState;", "Companion", "feature-profiles_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class ProfileEditDuxo extends OldBaseDuxo<ProfileEditViewState> implements HasSavedState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long MIN_LOADING_DELAY = 500;
    private final MarginSubscriptionStore marginSubscriptionStore;
    private final MediaStore mediaStore;
    private final ProfileStore profileStore;
    private final SavedStateHandle savedStateHandle;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ProfileEditDuxo(ProfileStore profileStore, MarginSubscriptionStore marginSubscriptionStore, MediaStore mediaStore, SavedStateHandle savedStateHandle) {
        super(new ProfileEditViewState(((LegacyFragmentKey.ProfileEdit) INSTANCE.getArgs(savedStateHandle)).getContext(), null, null, null, null, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(profileStore, "profileStore");
        Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
        Intrinsics.checkNotNullParameter(mediaStore, "mediaStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.profileStore = profileStore;
        this.marginSubscriptionStore = marginSubscriptionStore;
        this.mediaStore = mediaStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        fetchProfile();
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        MarginSubscriptionStore.refreshCurrentMarginSubscription$default(this.marginSubscriptionStore, false, 1, null);
        LifecycleHost.DefaultImpls.bind$default(this, this.marginSubscriptionStore.getCurrentMarginSubscriptionOptional(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.profiles.ui.ProfileEditDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileEditDuxo.onStart$lambda$1(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(ProfileEditDuxo profileEditDuxo, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        final MarginSubscription marginSubscription = (MarginSubscription) optional.component1();
        profileEditDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.profiles.ui.ProfileEditDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileEditDuxo.onStart$lambda$1$lambda$0(marginSubscription, (ProfileEditViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProfileEditViewState onStart$lambda$1$lambda$0(MarginSubscription marginSubscription, ProfileEditViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ProfileEditViewState.copy$default(applyMutation, null, null, null, null, null, false, null, marginSubscription, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public final void fetchProfile() {
        Singles singles = Singles.INSTANCE;
        Single<Optional<MarginSubscription>> singleFirst = this.marginSubscriptionStore.getCurrentMarginSubscriptionOptional().first(Optional2.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(singleFirst, "first(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singles.zip(singleFirst, this.profileStore.fetchProfile()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.profiles.ui.ProfileEditDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileEditDuxo.fetchProfile$lambda$3(this.f$0, (Tuples2) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.profiles.ui.ProfileEditDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileEditDuxo.fetchProfile$lambda$5(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchProfile$lambda$3(ProfileEditDuxo profileEditDuxo, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        Optional optional = (Optional) tuples2.component1();
        final Profile profile = (Profile) tuples2.component2();
        final MarginSubscription marginSubscription = (MarginSubscription) optional.getOrNull();
        profileEditDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.profiles.ui.ProfileEditDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileEditDuxo.fetchProfile$lambda$3$lambda$2(profile, marginSubscription, (ProfileEditViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProfileEditViewState fetchProfile$lambda$3$lambda$2(Profile profile, MarginSubscription marginSubscription, ProfileEditViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ProfileEditViewState.copy$default(applyMutation, null, profile.getId(), new ProfileEditState(profile.getUsername(), ProfileColors.withFixedColor(profile.getColor(), marginSubscription), profile.getMedia(), profile.getUsername(), ProfileColors.withFixedColor(profile.getColor(), marginSubscription), null, false), new UiEvent(Unit.INSTANCE), null, true, null, null, EnumC7081g.SDK_ASSET_ICON_INCOMPLETE_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchProfile$lambda$5(ProfileEditDuxo profileEditDuxo, final Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        if (Throwables.isNetworkRelated(t)) {
            profileEditDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.profiles.ui.ProfileEditDuxo$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ProfileEditDuxo.fetchProfile$lambda$5$lambda$4(t, (ProfileEditViewState) obj);
                }
            });
            return Unit.INSTANCE;
        }
        throw t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProfileEditViewState fetchProfile$lambda$5$lambda$4(Throwable th, ProfileEditViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ProfileEditViewState.copy$default(applyMutation, null, null, null, null, th, true, null, null, EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE, null);
    }

    public final void changeColorSelection(final Profile2 selectedColor) {
        Intrinsics.checkNotNullParameter(selectedColor, "selectedColor");
        applyMutation(new Function1() { // from class: com.robinhood.android.profiles.ui.ProfileEditDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileEditDuxo.changeColorSelection$lambda$6(selectedColor, (ProfileEditViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProfileEditViewState changeColorSelection$lambda$6(Profile2 profile2, ProfileEditViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        ProfileEditState profile = applyMutation.getProfile();
        return ProfileEditViewState.copy$default(applyMutation, null, null, profile != null ? ProfileEditState.copy$default(profile, null, null, null, null, profile2, null, false, 111, null) : null, null, null, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, null);
    }

    public final void changeUsername(final String editedUsername) {
        Intrinsics.checkNotNullParameter(editedUsername, "editedUsername");
        applyMutation(new Function1() { // from class: com.robinhood.android.profiles.ui.ProfileEditDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileEditDuxo.changeUsername$lambda$7(editedUsername, (ProfileEditViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProfileEditViewState changeUsername$lambda$7(String str, ProfileEditViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        ProfileEditState profile = applyMutation.getProfile();
        return ProfileEditViewState.copy$default(applyMutation, null, null, profile != null ? ProfileEditState.copy$default(profile, null, null, null, str, null, null, false, 119, null) : null, null, null, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, null);
    }

    public final void changePicture(final Bitmap editedPicture) {
        Intrinsics.checkNotNullParameter(editedPicture, "editedPicture");
        applyMutation(new Function1() { // from class: com.robinhood.android.profiles.ui.ProfileEditDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileEditDuxo.changePicture$lambda$8(editedPicture, (ProfileEditViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProfileEditViewState changePicture$lambda$8(Bitmap bitmap, ProfileEditViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        ProfileEditState profile = applyMutation.getProfile();
        return ProfileEditViewState.copy$default(applyMutation, null, null, profile != null ? ProfileEditState.copy$default(profile, null, null, null, null, null, bitmap, false, 31, null) : null, null, null, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, null);
    }

    public final void removePicture() {
        applyMutation(new Function1() { // from class: com.robinhood.android.profiles.ui.ProfileEditDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileEditDuxo.removePicture$lambda$9((ProfileEditViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProfileEditViewState removePicture$lambda$9(ProfileEditViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        ProfileEditState profile = applyMutation.getProfile();
        return ProfileEditViewState.copy$default(applyMutation, null, null, profile != null ? ProfileEditState.copy$default(profile, null, null, null, null, null, null, true, 31, null) : null, null, null, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, null);
    }

    public static /* synthetic */ void updateProfile$default(ProfileEditDuxo profileEditDuxo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        profileEditDuxo.updateProfile(str);
    }

    public final void updateProfile(final String newUsername) {
        Observable<R> map = getStates().map(new Function() { // from class: com.robinhood.android.profiles.ui.ProfileEditDuxo$updateProfile$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((ProfileEditViewState) it).getProfile());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((ProfileEditDuxo$updateProfile$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Completable completableDoOnSubscribe = ObservablesKt.filterIsPresent(map).take(1L).switchMapSingle(new Function() { // from class: com.robinhood.android.profiles.ui.ProfileEditDuxo.updateProfile.2
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Tuples2<ProfileEditState, Optional<ApiMediaMetadata>>> apply(final ProfileEditState profile) {
                Intrinsics.checkNotNullParameter(profile, "profile");
                return ProfileEditDuxo.this.uploadEditedPicture(profile.getEditedPicture()).map(new Function() { // from class: com.robinhood.android.profiles.ui.ProfileEditDuxo.updateProfile.2.1
                    @Override // io.reactivex.functions.Function
                    public final Tuples2<ProfileEditState, Optional<ApiMediaMetadata>> apply(Optional<ApiMediaMetadata> apiMediaMetadataOptional) {
                        Intrinsics.checkNotNullParameter(apiMediaMetadataOptional, "apiMediaMetadataOptional");
                        return Tuples4.m3642to(profile, apiMediaMetadataOptional);
                    }
                });
            }
        }).map(new Function() { // from class: com.robinhood.android.profiles.ui.ProfileEditDuxo.updateProfile.3
            @Override // io.reactivex.functions.Function
            public final ApiProfile.Request apply(Tuples2<ProfileEditState, ? extends Optional<ApiMediaMetadata>> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                ProfileEditState profileEditStateComponent1 = tuples2.component1();
                Intrinsics.checkNotNullExpressionValue(profileEditStateComponent1, "component1(...)");
                Optional<ApiMediaMetadata> optionalComponent2 = tuples2.component2();
                Intrinsics.checkNotNullExpressionValue(optionalComponent2, "component2(...)");
                return ProfileEditDuxo.this.createEditRequest(newUsername, optionalComponent2.getOrNull(), profileEditStateComponent1);
            }
        }).switchMapCompletable(new Function() { // from class: com.robinhood.android.profiles.ui.ProfileEditDuxo.updateProfile.4
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(ApiProfile.Request request) {
                Intrinsics.checkNotNullParameter(request, "request");
                if (!request.isEmptyRequest()) {
                    return CompletableDelay2.minTimeInFlight$default(ProfileEditDuxo.this.profileStore.updateProfile(request), 500L, null, 2, null);
                }
                return Completable.complete();
            }
        }).doOnSubscribe(new C259025());
        Intrinsics.checkNotNullExpressionValue(completableDoOnSubscribe, "doOnSubscribe(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.profiles.ui.ProfileEditDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfileEditDuxo.updateProfile$lambda$12(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.profiles.ui.ProfileEditDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileEditDuxo.updateProfile$lambda$14(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: ProfileEditDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.profiles.ui.ProfileEditDuxo$updateProfile$5 */
    static final class C259025<T> implements Consumer {
        C259025() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ProfileEditViewState accept$lambda$0(ProfileEditViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return ProfileEditViewState.copy$default(applyMutation, null, null, null, null, null, false, ProfileEditViewState3.Saving.INSTANCE, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null);
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            ProfileEditDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.profiles.ui.ProfileEditDuxo$updateProfile$5$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ProfileEditDuxo.C259025.accept$lambda$0((ProfileEditViewState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateProfile$lambda$12(ProfileEditDuxo profileEditDuxo) {
        profileEditDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.profiles.ui.ProfileEditDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileEditDuxo.updateProfile$lambda$12$lambda$11((ProfileEditViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProfileEditViewState updateProfile$lambda$12$lambda$11(ProfileEditViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ProfileEditViewState.copy$default(applyMutation, null, null, null, null, null, false, new ProfileEditViewState3.Success(new UiEvent(Unit.INSTANCE)), null, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateProfile$lambda$14(ProfileEditDuxo profileEditDuxo, Throwable t) throws Throwable {
        final ProfileEditViewState3 error;
        Intrinsics.checkNotNullParameter(t, "t");
        if (Throwables.isNetworkRelated(t)) {
            ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(t);
            GenericAlertErrorResponse genericAlertErrorResponse = errorResponseExtractErrorResponse instanceof GenericAlertErrorResponse ? (GenericAlertErrorResponse) errorResponseExtractErrorResponse : null;
            if (genericAlertErrorResponse == null) {
                error = new ProfileEditViewState3.LegacyError(t);
            } else {
                error = new ProfileEditViewState3.Error(new UiEvent(genericAlertErrorResponse.getAlert()));
            }
            profileEditDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.profiles.ui.ProfileEditDuxo$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ProfileEditDuxo.updateProfile$lambda$14$lambda$13(error, (ProfileEditViewState) obj);
                }
            });
            return Unit.INSTANCE;
        }
        throw t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProfileEditViewState updateProfile$lambda$14$lambda$13(ProfileEditViewState3 profileEditViewState3, ProfileEditViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ProfileEditViewState.copy$default(applyMutation, null, null, null, null, null, false, profileEditViewState3, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Single<Optional<ApiMediaMetadata>> uploadEditedPicture(Bitmap bitmap) {
        Single<Optional<ApiMediaMetadata>> singleFlatMap = Single.just(Optional3.asOptional(bitmap)).flatMap(new Function() { // from class: com.robinhood.android.profiles.ui.ProfileEditDuxo.uploadEditedPicture.1

            /* compiled from: ProfileEditDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/media/ApiMediaMetadata;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.profiles.ui.ProfileEditDuxo$uploadEditedPicture$1$1", m3645f = "ProfileEditDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.profiles.ui.ProfileEditDuxo$uploadEditedPicture$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiMediaMetadata>, Object> {
                final /* synthetic */ Bitmap $bitmap;
                int label;
                final /* synthetic */ ProfileEditDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ProfileEditDuxo profileEditDuxo, Bitmap bitmap, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = profileEditDuxo;
                    this.$bitmap = bitmap;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$bitmap, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiMediaMetadata> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    ResultKt.throwOnFailure(obj);
                    MediaStore mediaStore = this.this$0.mediaStore;
                    Bitmap bitmap = this.$bitmap;
                    this.label = 1;
                    Object objUploadImage = mediaStore.uploadImage(bitmap, this);
                    return objUploadImage == coroutine_suspended ? coroutine_suspended : objUploadImage;
                }
            }

            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Optional<ApiMediaMetadata>> apply(Optional<Bitmap> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                Bitmap bitmapComponent1 = optional.component1();
                if (bitmapComponent1 != null) {
                    ProfileEditDuxo profileEditDuxo = ProfileEditDuxo.this;
                    return SinglesKt.mapToOptional(RxFactory.DefaultImpls.rxSingle$default(profileEditDuxo, null, new AnonymousClass1(profileEditDuxo, bitmapComponent1, null), 1, null));
                }
                Single singleJust = Single.just(Optional2.INSTANCE);
                Intrinsics.checkNotNull(singleJust);
                return singleJust;
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        return singleFlatMap;
    }

    static /* synthetic */ ApiProfile.Request createEditRequest$default(ProfileEditDuxo profileEditDuxo, String str, ApiMediaMetadata apiMediaMetadata, ProfileEditState profileEditState, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            apiMediaMetadata = null;
        }
        return profileEditDuxo.createEditRequest(str, apiMediaMetadata, profileEditState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ApiProfile.Request createEditRequest(String newUsername, ApiMediaMetadata newPicture, ProfileEditState profile) {
        ApiProfile.Request request = new ApiProfile.Request(null, null, null, false, 15, null);
        if (profile.getColor() != profile.getEditedColor()) {
            request.setColor(profile.getEditedColor());
        }
        if (!Intrinsics.areEqual(profile.getUsername(), newUsername)) {
            request.setUsername(newUsername);
        }
        request.setMedia_id(newPicture != null ? newPicture.getId() : null);
        if (profile.getRemovePicture() && profile.getPicture() != null) {
            request.setRemove_media(true);
        }
        return request;
    }

    /* compiled from: ProfileEditDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/profiles/ui/ProfileEditDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/profiles/ui/ProfileEditDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ProfileEdit;", "<init>", "()V", "MIN_LOADING_DELAY", "", "feature-profiles_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<ProfileEditDuxo, LegacyFragmentKey.ProfileEdit> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.ProfileEdit getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyFragmentKey.ProfileEdit) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.ProfileEdit getArgs(ProfileEditDuxo profileEditDuxo) {
            return (LegacyFragmentKey.ProfileEdit) DuxoCompanion.DefaultImpls.getArgs(this, profileEditDuxo);
        }
    }
}
