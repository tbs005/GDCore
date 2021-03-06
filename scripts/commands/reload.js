importClass(org.graviton.database.repository.CommandRepository);
importClass(org.graviton.game.command.api.AbstractCommand);

commandRepository.register(JavaAdapter(AbstractCommand, {
    name: function () {
        return "reload";
    },

    description: function () {
        return "";
    },

    apply: function (player, data) {
        if (data.length > 1) {
            player.getEntityFactory().loadNpcData();
        } else
            commandRepository.load();
    }

}));