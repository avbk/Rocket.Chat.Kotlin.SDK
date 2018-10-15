package chat.rocket.core.internal.model

import chat.rocket.common.model.User

data class UserResponse(
        val user: User?,
        val success: Boolean
)